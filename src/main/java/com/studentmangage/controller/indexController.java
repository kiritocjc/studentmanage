package com.studentmangage.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.studentmangage.pojo.Admin;
import com.studentmangage.pojo.Student;
import com.studentmangage.pojo.Teacher;
import com.studentmangage.service.UserService;

/*
 * index.html页面的Controller
 */

@Controller
public class indexController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("login")
	@ResponseBody
	public String logig(String username,String password,String role ,HttpServletRequest request,HttpServletResponse response) {
		if(role.equals("0")) { //管理员
			Admin admin = new Admin();
			admin.setName(username);
			admin.setPassword(password);
			Admin byAdmin = userService.selectAdminByAdmin(admin);
			if(byAdmin!=null) {
				return "success";
			}else {
				return "failed";
			}
		}else if(role.equals("1")) { //教师
			Teacher teacher = new Teacher();
			teacher.setName(username);
			teacher.setPassword(password);
			Teacher byTeacher = userService.selectTeacherByTeacher(teacher);
			if(byTeacher!=null) {
				return "success";
			}else {
				return "failed";
			}
		}else if(role.equals("2")) { //学生
			Student student = new Student();
			student.setName(username);
			student.setPassword(password);
			Student byStudent = userService.selectStudentByStudent(student);
			request.getSession().setAttribute("student", byStudent);
			
			if(byStudent!=null) {	
				return "studentsuccess";
			}else {
				return "failed";
			}
		}
		
		return "failed";
		
	}

}
