package com.studentmangage.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.studentmangage.mapper.UserMapper;
import com.studentmangage.pojo.Page;
import com.studentmangage.pojo.Result;
import com.studentmangage.pojo.Student;
import com.studentmangage.pojo.Studentinfo;
import com.studentmangage.pojo.Teacherinfo;
import com.studentmangage.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("getTeacherinfoAll")
	@ResponseBody
	public Result getTeacherinfoAll(Page page){
		//System.out.println(page);
		List<Object> list = userService.selectAllTeacher(page);
		Result result= new Result();
		if(list.size()>0) {
			result.setCode(0);
			result.setCount(userService.selectTeachercoun());
			result.setMsg("success");
			result.setData(list);
		}else {
			result.setCode(400);
			result.setCount(0);
			result.setMsg("list is null");
			result.setData(null);
		}
		return result;
	}
	
	@RequestMapping("getStudentinfoAll")
	@ResponseBody
	public Result getStudentinfoAll(Page page){
		List<Object> list = userService.selectAllStudent(page);
		Result result= new Result();
		if(list.size()>0) {
			result.setCode(0);
			result.setCount(userService.selectStduentcoun());
			result.setMsg("success");
			result.setData(list);
		}else {
			result.setCode(400);
			result.setCount(0);
			result.setMsg("list is null");
			result.setData(null);
		}
		return result;
	}
	
	@RequestMapping("UpdateTeacherinfoAll")
	@ResponseBody
	public String UpdateTeacherinfoAll(Teacherinfo teacherinfo){
		return userService.UpdateTeacherinfo(teacherinfo)>0?"success":"fail";
	}
	
	@RequestMapping("UpdateStudentinfoAll")
	@ResponseBody
	public String UpdateStudentinfoAll(Studentinfo studentinfo){
		return userService.UpdateStudentinfo(studentinfo)>0?"success":"fail";
	}
	
	@RequestMapping("delStudentinfo")
	@ResponseBody
	public String delStudentinfo(String studentId){
		System.out.println("studentId:"+studentId);
		return userService.delStudentinfo(studentId)>0?"success":"fail";
	}
	
	@RequestMapping("delTeacherinfo")
	@ResponseBody
	public String delTeacherinfo(String studentId){
		System.out.println("delTeacherinfo:"+studentId);
		return userService.delTeacherinfo( studentId)>0?"success":"fail";
	}
	
	@RequestMapping("getTitleinfoAll")
	@ResponseBody
	public Result getTitleinfoAll(Page page){
		System.out.println(page);
		List<Object> list = userService.getTitleinfoAll(page);
		Result result= new Result();
		if(list.size()>0) {
			result.setCode(0);
			result.setCount(userService.selectTitleinfocoun());
			result.setMsg("success");
			result.setData(list);
		}else {
			result.setCode(400);
			result.setCount(0);
			result.setMsg("list is null");
			result.setData(null);
		}
		return result;
	}
	//
	@RequestMapping("titlesearch")
	@ResponseBody
	public Result titlesearch(String searchtext){
		System.out.println("titlesearch:"+searchtext);
		List<Object> list = userService.getTitleinfoAllLIKE(searchtext);
		Result result= new Result();
		if(list.size()>0) {
			result.setCode(0);
			result.setCount(userService.selectTitleinfocounforLIKE(searchtext));
			result.setMsg("success");
			result.setData(list);
		}else {
			result.setCode(0);
			result.setCount(0);
			result.setMsg("list is null");
			result.setData(null);
		}
		return result;
	}
	@RequestMapping("getStudenttitleAll")
	@ResponseBody
	public Result getStudenttitleAll(Page page){
		System.out.println(page);
		if(page.getPage()==null && page.getLimit()==null) {
			page.setPage(1);
			page.setLimit(10);
		}
		List<Object> list = userService.getStudenttitleAll(page);
		Result result= new Result();
		if(list.size()>0) {
			result.setCode(0);
			result.setCount(userService.selectStudenttitleAllcoun());
			result.setMsg("success");
			result.setData(list);
		}else {
			result.setCode(400);
			result.setCount(0);
			result.setMsg("list is null");
			result.setData(null);
		}
		return result;
	}
	
	@RequestMapping("studentselecttitle")
	@ResponseBody
	public int studentselecttitle(String titleId,String teacherId,HttpServletRequest request,HttpServletResponse response) {
		Student student = (Student) request.getSession().getAttribute("student");
		return userService.studentselecttitle(titleId,teacherId,student.getStudentid());
	}
	@RequestMapping("studentdeltitle")
	@ResponseBody
	public int studentdeltitle(String titleId,HttpServletRequest request,HttpServletResponse response) {
		Student student = (Student) request.getSession().getAttribute("student");
		return userService.studentdeltitle(student.getStudentid(),titleId);
	}
	
	@RequestMapping("loadStdentTitleName")
	@ResponseBody
	public String loadStdentTitleName(HttpServletRequest request,HttpServletResponse response) {
		Student student = (Student) request.getSession().getAttribute("student");
		String stdentTitleName = userService.loadStdentTitleName(student.getStudentid());
		request.getSession().setAttribute("stdenttitlename", stdentTitleName);
		return stdentTitleName;
	}
	@RequestMapping("logout")
	public String logout(HttpServletRequest request) {
		request.getSession().setAttribute("student", null);
		return "redirect:/index"; 
	}
	@RequestMapping("adminaddStudent")
	@ResponseBody
	public String adminaddstudent(String username,String password
			,String studentid,String name,String tsex,String age,
			String clazz,String grade) {
		System.out.println(tsex);
		return userService.adminaddstudent(username,password,studentid,name,tsex,age,clazz,grade)>0?"success":"fail";
	}
	
	@RequestMapping("adminaddTeacher")
	@ResponseBody
	public String adminaddteacher(String username,String password
			,String teacherId,String name,String tsex,String tage,
			String tdept,String tel,String qq,String professional) {
		return userService.adminaddteacher(username,password,teacherId,name,tsex,tage,
				tdept,tel,qq,professional)>0?"success":"fail";
	}
	@RequestMapping("checkstdentname") 
	@ResponseBody
	public String checkstdentname(String name) {
		return userService.CheckStdentname(name)>0?"success":"fail";
	}
	
	@RequestMapping("checkteachername")
	@ResponseBody
	public String checkteachername(String name) {
		return userService.CheckTeachername(name)>0?"success":"fail";
	}
}
