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
        url: "getStudenttitleAll",
        //渲染数据
        method:'get',
        page: true,
        cols: [[
          { field: 'aa', type: "checkbox" }, // 表头
          { field: 'titleId', title: 'titleId', width: 80, sort: true }
          , { field: 'type', title: '类型', width: 80 }
          , { field: 'name', title: '课题名字', width: 80}
          , { field: 'teacherId', title: '教师编号', width: 80}
          , { field: 'tname', title: '教师名称', width: 80 }
          , { title: '操作', toolbar: '#barDemo' } // // 绑定表头⼯具栏
        ]]
      //  toolbar: "#toolbarDemo"//开启头部工具栏
        
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
        if (eventName == 'del') { //退选
          //确认框
        	$.ajax({
    			type:'post',
    			url:'studentdeltitle',
    			data:{'titleId':data.titleId},
    			dataType:"text",
    			success:function(res){
    				//console
    				if(res>0){
    					layer.msg('退选成功！');
    				}else{
    					layer.msg('选题失败!');
    				}
    			}
    		});//ajax结束
        // layer.msg(data.titleId);
          
          //编辑功能
        } else if(eventName == 'edit'){
        	//layer.msg(JSON.stringify(data));
        	
        	$.ajax({
    			type:'post',
    			url:'studentselecttitle',
    			data:{'titleId':data.titleId,'teacherId':data.teacherId},
    			dataType:"text",
    			success:function(res){
    				//console
    				if(res!=0){
    					layer.msg('请先退选选题序号为:'+res);
    				}else{
    					layer.msg('选题成功!');
    				}
    			}
    		});//ajax结束
        }

      });
      //保存数据
      form.on("submit(doSubmit)",function(obj){
          //序列化表单数据
          var params=$("#dataFrm").serialize();
          $.post('UpdateStudentinfoAll',params,function(obj){
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