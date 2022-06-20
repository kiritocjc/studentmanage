package com.studentmangage.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.studentmangage.pojo.Result;
import com.studentmangage.pojo.Student;
import com.studentmangage.pojo.Titleinfo;
import com.studentmangage.service.UserService;

@Controller
public class TitleController {
	
	private String FileName;
	
	@Autowired
	private UserService userService;

	@RequestMapping("uploadpsot")
	@ResponseBody
	public Result uploadFile(MultipartFile file,HttpServletRequest request,HttpServletResponse response) {

		Result result = new Result();
		if(!file.isEmpty() && file!=null) {
			try {
				FileName=file.getOriginalFilename();
				file.transferTo(new File("g:/upload/"+file.getOriginalFilename()));
				result.setCode(0);
				result.setMsg("上传成功");

			} catch (IOException  e) {
				result.setCode(-1);
				result.setMsg("上传文件出错");
				e.printStackTrace();
			}
		}else {
			result.setCode(-1);
            result.setMsg("未获取到有效的文件信息，请重新上传!");

		}
		return result;
	}
	@RequestMapping("addTitleData")
	@ResponseBody
	public String addTitleData(Titleinfo info) {
		info.setSrc(FileName);
		return userService.addTitleinfo(info)>0?"success":"fail";
	}
	@RequestMapping("sduentaddtitledata")
	@ResponseBody
	public String sduentaddtitledata(String fileName,HttpServletRequest request) {
		Student student = (Student) request.getSession().getAttribute("student");
		return userService.sduentaddtitledata(fileName,student.getStudentid())>0?"success":"fail";
	}
	
}

