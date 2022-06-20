
function checkteachername(){
	var username=$('#LAY-user-login-username').val();
	$.ajax({
			type:'post',
			url:'checkteachername',
			data:{'name':username},
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

function adminaddteacher(){
	var username=$('#LAY-user-login-username').val();
	var password=$('#LAY-user-login-password').val();
	var teacherId=$('#LAY-user-login-teacherId').val()
	var name=$('#LAY-user-login-tname').val();
	var tsex=$("input[name='tsex']:checked").val();
	var tage=$('#LAY-user-login-tage').val();
	var tdept=$('#LAY-user-login-tdept').val();
	var tel=$('#LAY-user-login-tel').val();
	var qq=$('#LAY-user-login-qq').val();
	var professional=$('#LAY-user-login-professional').val();
	layer.msg(teacherId);
	$.ajax({
			type:'post',
			url:'adminaddTeacher',
			data:{'username':username,'password':password,
				 'teacherId':teacherId,'name':name,
				 'tsex':tsex,'tage':tage,
				 'tdept':tdept,'tel':tel,
				 'qq':qq,'professional':professional},
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
