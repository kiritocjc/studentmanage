package com.studentmangage.service;

import java.util.List;

import com.studentmangage.pojo.Admin;
import com.studentmangage.pojo.Page;
import com.studentmangage.pojo.Student;
import com.studentmangage.pojo.Studentinfo;
import com.studentmangage.pojo.Teacher;
import com.studentmangage.pojo.Teacherinfo;
import com.studentmangage.pojo.Titleinfo;

public interface UserService {
	public Admin selectAdminByAdmin(Admin admin);
	public Student selectStudentByStudent(Student student);
	public Teacher selectTeacherByTeacher(Teacher teacher);
	public List<Object> selectAllTeacher(Page page);
	public List<Object> selectAllStudent(Page page);
	public Integer selectTeachercoun();
	public int UpdateTeacherinfo(Teacherinfo teacherinfo);
	public int delTeacherinfo(String teacherId);
	public Integer selectStduentcoun();
	public int UpdateStudentinfo(Studentinfo studentinfo);
	public int delStudentinfo(String studentId);
	public int Checkname(String name,String entity);
	public int registerstudent(String username, String password, String name, String studentId);
	public int registerteacher(String username, String password, String tname, String tdept, String tsex,
			String teacherId, String tel, String professional);
	public List<Object> getTitleinfoAll(Page page);
	public List<Object> getTitleinfoAllLIKE(String seearch);
	public int selectTitleinfocoun();
	public int selectTitleinfocounforLIKE(String seearch);
	public int addTitleinfo(Titleinfo info);
	public List<Object> getStudenttitleAll(Page page);
	public int selectStudenttitleAllcoun();
	public int studentselecttitle(String titleId, String teacherId, String studentid);
	public int studentdeltitle(String studentid, String titleId);
	public String loadStdentTitleName(String studentid);
	public int sduentaddtitledata(String fileName,String studentid);
	public int adminaddstudent(String username, String password, String studentid, String name, String tsex, String age,
			String clazz, String grade);
	public int adminaddteacher(String username, String password, String teacherId, String name, String tsex,
			String tage, String tdept, String tel, String qq, String professional);
	public int CheckTeachername(String name);
	public int CheckStdentname(String name);
}
