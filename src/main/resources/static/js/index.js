function login(){ //登录方法
 		var name=$('#username').val();
 		var password=$('#password').val();
 		var entity=$("input[name='role']:checked").val();
 		//layer.msg('帐号'+name+'密码'+password);
 		$.ajax({
 			type:'post',
 			url:'login',
 			data:{'username':name,'password':password,'role':entity},
 			dataType:"text",
 			success:function(res){
 				if(res=="success"){
 					layer.msg("登录成功!");
 					window.location.href="main";
 				}else{
 					layer.msg("帐号密码有误!登录失败");
 				}
 				
 				if(res=="studentsuccess"){
 					layer.msg("登录成功!");
 					window.location.href="stdentsmain";
 				}else{
 					layer.msg("帐号密码有误!登录失败");
 				}
 			}
 		});
}