layui.use(['table', 'layer','form'], function () {
      var table = layui.table;
      var layer = layui.layer;
      var form = layui.form;
      var tableIns;//表格数据
      var mainIndex;//弹出层
      //layer.alert("shshsh");
      //执行表格渲染
      tableIns=table.render({
        elem: "#testtable",
        //请求地址
        url: "getTeacherinfoAll",
        //渲染数据
        method:'get',
        page: true,
        cols: [[
          { field: 'aa', type: "checkbox" }, // 表头
          { field: 'teacherId', title: 'teacherId', width: 80, sort: true }
          , { field: 'tname', title: 'name', width: 80 }
          , { field: 'tage', title: '年龄', width: 80, sort: true }
          , { field: 'tsex', title: '性别', width: 80 }
          , { field: 'tdept', title: '部门', width: 177 }
          , { field: 'tel', title: '电话', width: 80 }
          , { field: 'qq', title: 'QQ', width: 80 }
          , { field: 'professional', title: '职称', width: 80 }
          , { title: '操作', toolbar: '#barDemo' } // // 绑定表头⼯具栏
        ]],
        toolbar: "#toolbarDemo"//开启头部工具栏
        
      });

      //头部工具栏事件
      //table.on('toolbar(demo)',function(obj){
      table.on('toolbar(demo)', function (obj) {
        //console.log(obj);
        var checkStatus = table.checkStatus(obj.config.id);
        switch (obj.event) {
          case 'getCheckData':
            // 获取被选中的记录的数组
            var data = checkStatus.data;
            // // 将数组数据解析成字符串
            layer.msg(JSON.stringify(data));
            console.log(JSON.stringify(data));
            // layer.alert();
            break;

          case 'getCheckLength':
            var data = checkStatus.data;
            layer.msg("已选择" + data.length + "条数据");
            break;

          case 'isAll':
            var flge = checkStatus.isAll;
            layer.msg(flge ? "全选" : "未全选");
            break;
        }

      });
      //编辑工具栏事件
      table.on('tool(demo)', function (obj) {
        var eventName = obj.event;
        var data=obj.data
        //取出当前数据
        var trdata = obj.data;
        if (eventName == 'del') {
          //确认框
          layer.confirm('您确定要删除么?', function (index) {
            obj.del();
            layer.close(index);
            $.ajax({
            	type:'post',
     			url:'delTeacherinfo',
     			data:{'teacherId':trdata.teacherId},
     			dataType:"text",
     			success:function(res){
     				if(res=="success"){
     					layer.msg("删除成功!");
     				}else{
     					layer.msg("删除失败!");
     				}
     				
     			}
            });
            
          })
          //编辑功能
        } else if(eventName == 'edit'){
        	//layer.msg(JSON.stringify(data));
        	mainIndex=layer.open({
	        	type: 1,
	            title: '修改用户',
	            content: $("#saveOrUpdateDiv"),//展示修改编辑框
	            area: ['400px', '400px'],
	            success:function(index){
	            	$("#dataFrm")[0].reset();//清空数据
	            	form.val("dataFrm",data); //赋值
	             //提交修改方法
	            }
	        });
	        
        }

      });
      //保存数据
      form.on("submit(doSubmit)",function(obj){
          //序列化表单数据
          var params=$("#dataFrm").serialize();
          $.post('UpdateTeacherinfoAll',params,function(obj){
        	  if(obj=="success"){
					layer.msg("修改成功!");
					//关闭弹出层
		              layer.close(mainIndex)
		              //刷新数据 表格
		              tableIns.reload();
				}else{
					layer.msg("修改失败!");
				}
              
          })
      });

  })