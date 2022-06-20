package com.studentmangage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	
	@RequestMapping({"/","index"})
	public String index() {
		return "index";
	}
	
	@RequestMapping({"main"})
	public String main() {
		return "main";
	}
	@RequestMapping({"teachertable"})
	public String mainteachertable() {
		return "teachertable";
	}
	@RequestMapping({"studenttable"})
	public String mainstudenttable() {
		return "studenttable";
	}
	@RequestMapping({"register"})
	public String register() {
		return "register";
	}
	@RequestMapping({"registerTeacher"})
	public String registerTeacher() {
		return "registerTeacher";
	}
	@RequestMapping({"titletable"})
	public String titletable() {
		return "titletable";
	}
	@RequestMapping({"addtitle"})
	public String addtitle() {
		return "addtitle";
	}
	@RequestMapping("stdentsmain")
	public String studentmain() {
		return "stdentsmain";
	}
	
	@RequestMapping("studenttabletitle")
	public String studenttabletitle() {
		return "studenttabletitle";
	}
	
	@RequestMapping("sduentaddtitle")
	public String sduentaddtitle() {
		return "sduentaddtitle";
	}
	@RequestMapping("adminaddstudent")
	public String adminaddstudent() {
		return "adminaddstudent";
	}
	@RequestMapping("adminaddteacher")
	public String adminaddteacher() {
		return "adminaddteacher";
	}
}
