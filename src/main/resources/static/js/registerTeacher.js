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
	var tname=$('#LAY-user-login-tname').val();
	var tdept=$('#LAY-user-login-tdept').val();
	var tsex=$("input[name='tsex']:checked").val();
	var teacherId=$('#LAY-user-login-teacherId').val()
	var tel=$('#LAY-user-login-tel').val()
	var professional=$('#LAY-user-login-professional').val()
	if(password!=repass){
		layer.msg("两次密码不一致请从新输入",{icon:5});
	}else{
		$.ajax({
			type:'post',
			url:'registerteacher',
			data:{'username':username,'password':password,
				 'tname':tname,'tdept':tdept,
				 'tsex':tsex,'teacherId':teacherId,
				 'tel':tel,'professional':professional},
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
