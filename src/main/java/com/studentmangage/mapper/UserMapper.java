package com.studentmangage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.studentmangage.pojo.Admin;
import com.studentmangage.pojo.Page;
import com.studentmangage.pojo.Student;
import com.studentmangage.pojo.Studentinfo;
import com.studentmangage.pojo.Teacher;
import com.studentmangage.pojo.Teacherinfo;
import com.studentmangage.pojo.Titleinfo;
import com.studentmangage.pojo.TitleinfoStdentVo;

@Mapper
public interface UserMapper {
	public Admin selectAdminByAdmin(Admin admin);
	public Student selectStudentByStudent(Student student);
	public Teacher selectTeacherByTeacher(Teacher teacher);
	public List<Object> selectAllTeacher(Page page);
	public Integer selectTeachercoun();
	public void UpdateTeacherinfo(Teacherinfo teacherinfo);
	public void delTeacherinfo(String teacherId);
	public List<Object> selectAllStudent(Page page);
	public Integer selectStduentcoun();
	public void UpdateStudentinfo(Studentinfo studentinfo);
	public void delStudentinfo(String studentId);
	public String CheckStudentname(String name); //验证用户名
	public String CheckTeachername(String name);
	public void registerstudent(String username, String password,String studentId);
	public void registerstudentinfo(String studentId, String name);
	public void registerteracher(String username, String password, String teacherId);
	public void registerteracherinfo(String teacherId, String tname, String tdept, String tsex, String tel,
			String professional);
	public List<Object> getTitleinfoAll(Page page); 
	public Integer selectTitleinfocoun();
	public List<Object> getTitleinfoAllLIKE(String seearch);
	public int selectTitleinfocounforLIKE(String seearch);
	public void addTitleDate();
	public void addTitleinfo(Titleinfo info);
	public List<Object> getStudenttitleAll(Page page);
	public int selectStudenttitleAllcoun();
	public int selectstdenttitleid(String studentid);
	public void UpdateStudentinfoBystdenttitleid(Studentinfo stdent);
	public void studentdeltitle(String studentid);
	public String loadStdentTitleName(String studentid);
	public void sduentaddtitledata(String fileName,String studentid);
	public void adds_student(String username, String password, String studentid);
	public void addStudent(String studentid, String name, String tsex, String age, String clazz, Integer grade);
	public void add_teacher(String username, String password, String teacherId);
	public void addTeacher(Teacherinfo teacherinfo);
}
