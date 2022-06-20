package com.studentmangage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.studentmangage.pojo.Teacherinfo;
import com.studentmangage.service.UserService;

@Controller
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("Checkname")
	@ResponseBody
	public String Checkname(String name,String entity) {
		return userService.Checkname(name,entity)>0?"success":"fail";
	}
	
	@RequestMapping("registerstudent")
	@ResponseBody
	public String registerstudent(String username,String password,String name,String studentId) {
		return userService.registerstudent(username,password,name,studentId)>0?"success":"fail";
	}
	@RequestMapping("registerteacher")
	@ResponseBody
	public String registerteacher(String username,String password,String tname,
			String tdept,String tsex,String teacherId,String tel,String professional) {

		return userService.registerteacher(username,password,tname,
				tdept,tsex,teacherId, tel, professional)>0?"success":"fail";
	}
}
