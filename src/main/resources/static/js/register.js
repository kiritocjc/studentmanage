function checkname(){
	var name=$('#LAY-user-login-username').val();
	var entity=$("input[name='role']:checked").val();
	$.ajax({
			type:'post',
			url:'Checkname',
			data:{'name':name,'entity':entity},
			dataType:"text",
			success:function(res){
				if(res=="success"){
					layer.msg("可以注册!");
				}else{
					layer.msg("帐号已存在!请从新选择");
				}
			}
	});
}

function register(){
	var username=$('#LAY-user-login-username').val();
	var password=$('#LAY-user-login-password').val();
	var repass=$('#LAY-user-login-repass').val();
	var name=$('#LAY-user-login-name').val();
	var studentId=$('#LAY-user-login-studentId').val();
	if(password!=repass){
		layer.msg("两次密码不一致请从新输入",{icon:5});
	}else{
		$.ajax({
			type:'post',
			url:'registerstudent',
			data:{'username':username,'password':password,
				 'name':name,'studentId':studentId},
			dataType:"text",
			success:function(res){
				if(res=="success"){
					layer.msg("注册成功");
				}else{
					layer.msg("注册失败");
				}
			}
		});//ajax结束
	}
	
}
