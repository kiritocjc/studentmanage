
function checkstdentname(){
	var name=$('#LAY-user-login-username').val();
	var entity=$("input[name='role']:checked").val();
	$.ajax({
			type:'post',
			url:'checkstdentname',
			data:{'name':name},
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

function adminaddstudent(){
	var username=$('#LAY-user-login-username').val();
	var password=$('#LAY-user-login-password').val();
	var studentid=$('#LAY-user-login-studentid').val()
	var name=$('#LAY-user-login-name').val();
	var tsex=$("input[name='tsex']:checked").val();
	var age=$('#LAY-user-login-age').val();
	var clazz=$('#LAY-user-login-clazz').val();
	var grade=$('#LAY-user-login-grade').val();
	
	
	$.ajax({
			type:'post',
			url:'adminaddStudent',
			data:{'username':username,'password':password,
				 'studentid':studentid,'name':name,
				 'tsex':tsex,'age':age,
				 'clazz':clazz,'grade':grade},
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
