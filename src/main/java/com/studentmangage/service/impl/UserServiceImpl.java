package com.studentmangage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.net.InetAddresses.TeredoInfo;
import com.studentmangage.mapper.UserMapper;
import com.studentmangage.pojo.Admin;
import com.studentmangage.pojo.Page;
import com.studentmangage.pojo.Student;
import com.studentmangage.pojo.Studentinfo;
import com.studentmangage.pojo.Teacher;
import com.studentmangage.pojo.Teacherinfo;
import com.studentmangage.pojo.Titleinfo;
import com.studentmangage.pojo.TitleinfoStdentVo;
import com.studentmangage.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public Admin selectAdminByAdmin(Admin admin) {
		return userMapper.selectAdminByAdmin(admin);
	}

	@Override
	public Student selectStudentByStudent(Student student) {
		return userMapper.selectStudentByStudent(student);
	}

	@Override
	public Teacher selectTeacherByTeacher(Teacher teacher) {
		return userMapper.selectTeacherByTeacher(teacher);
	}

	@Override
	public List<Object> selectAllTeacher(Page page) {
		Integer page2 = page.getPage();
		page.setPage((page2-1)*page.getLimit());
		return userMapper.selectAllTeacher(page);
	}

	@Override
	public int UpdateTeacherinfo(Teacherinfo teacherinfo) {
		try {
			userMapper.UpdateTeacherinfo(teacherinfo);
			return 1;
		} catch (Exception e) {
			return -1;
		}
	}

	@Override
	public int delTeacherinfo(String teacherId) {
		try {
			userMapper.delTeacherinfo(teacherId);
			return 1;
		} catch (Exception e) {
			return -1;
		}
	}

	@Override
	public Integer selectTeachercoun() {
		return userMapper.selectTeachercoun();
	}

	@Override
	public List<Object> selectAllStudent(Page page) {
		Integer page2 = page.getPage();
		page.setPage((page2-1)*page.getLimit());
		return userMapper.selectAllStudent(page);
	}

	@Override
	public Integer selectStduentcoun() {
		return userMapper.selectStduentcoun();
	}

	@Override
	public int UpdateStudentinfo(Studentinfo studentinfo) {
		try {
			userMapper.UpdateStudentinfo(studentinfo);
			return 1;
		} catch (Exception e) {
			return -1;
		}
	}

	@Override
	public int delStudentinfo(String studentId) {
		try {
			userMapper.delStudentinfo(studentId);
			return 1;
		} catch (Exception e) {
			return -1;
		}
	}
	/**
	 * 返回值 1 帐号不存在 -1 帐号存在
	 */
	@Override
	public int Checkname(String name,String entity) {
		try {
			if(entity.equals("2")) {
				String studentname = userMapper.CheckStudentname(name);
				return (studentname == null || studentname.length() == 0)==true?1:-1;
			}else {
				String teachername  = userMapper.CheckTeachername(name);
				return (teachername == null || teachername.length() == 0)==true?1:-1;
			}
		} catch (Exception e) {
			return -1;
		}
	}
	@Override
	public int registerstudent(String username, String password, String name, String studentId) {
		//System.out.println("注册帐号函数启动:"+studentId);
		try {
			userMapper.registerstudent(username,password,studentId);
			userMapper.registerstudentinfo(studentId,name);
			return 1;
		} catch (Exception e) {
			return -1;
		}
	}

	@Override
	public int registerteacher(String username, String password, 
			String tname, String tdept, String tsex,
			String teacherId, String tel, String professional) {
		try {
			userMapper.registerteracher(username,password,teacherId);
			userMapper.registerteracherinfo(teacherId,tname,tdept,tsex,
					tel,professional);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	@Override
	public List<Object> getTitleinfoAll(Page page) {
		Integer page2 = page.getPage();
		page.setPage((page2-1)*page.getLimit());
		return userMapper.getTitleinfoAll(page);
	}
	@Override
	public int selectTitleinfocoun() {
		return userMapper.selectTitleinfocoun();
	}

	@Override
	public List<Object> getTitleinfoAllLIKE(String seearch) {
		return userMapper.getTitleinfoAllLIKE(seearch);
	}

	@Override
	public int selectTitleinfocounforLIKE(String seearch) {
		return userMapper.selectTitleinfocounforLIKE(seearch);
	}

	@Override
	public int addTitleinfo(Titleinfo info) {
		try {
			userMapper.addTitleinfo(info);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public List<Object> getStudenttitleAll(Page page) {
		Integer page2 = page.getPage();
		page.setPage((page2-1)*page.getLimit());
		return userMapper.getStudenttitleAll(page);
	}

	@Override
	public int selectStudenttitleAllcoun() {
		return userMapper.selectStudenttitleAllcoun();
	}

	@Override
	public int studentselecttitle(String titleId, String teacherId, String studentid) {
		int titleid =userMapper.selectstdenttitleid(studentid);
		if(titleid>0) {
			return titleid;//已有选课
		}else {
			try {
				Studentinfo stdent = new Studentinfo();
				stdent.setStudentId(studentid);
				stdent.setTeacherId(teacherId);
				stdent.setTitleid(Integer.valueOf(titleId));
				userMapper.UpdateStudentinfoBystdenttitleid(stdent);
				return 0;
			} catch (Exception e) {
				e.printStackTrace();
				return -1;
			}
		}

	}

	@Override
	public int studentdeltitle(String studentid, String titleId) {
		try {
			userMapper.studentdeltitle(studentid);
			return 1;
		}catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	@Override
	public String loadStdentTitleName(String studentid) {
		try {
			String titleName = userMapper.loadStdentTitleName(studentid);
			if(!titleName.equals("")) {
				return titleName;
			}
		}catch (Exception e) {
			e.printStackTrace();

		}
		return "";
	}

	@Override
	public int sduentaddtitledata(String fileName,String stdentid) {
		try {
			userMapper.sduentaddtitledata(fileName,stdentid);
			return 1;
		}catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public int adminaddstudent(String username, String password, String studentid, String name, String tsex,
			String age,
			String clazz, String grade) {
		try {
			userMapper.adds_student(username,password,studentid);
			userMapper.addStudent(studentid,name,tsex,age,clazz,Integer.valueOf(grade));
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}	
		
	}

	@Override
	public int adminaddteacher(String username, String password, 
			String teacherId, String name, String tsex,
			String tage, String tdept, String tel, 
			String qq, String professional) {
		try {
			userMapper.registerteracher(username, password, teacherId);
			Teacherinfo teacherinfo = new Teacherinfo();
			teacherinfo.setProfessional(professional);
			teacherinfo.setQq(qq);
			teacherinfo.setTage(Integer.valueOf(tage));
			teacherinfo.setTdept(tdept);
			teacherinfo.setTeacherId(teacherId);
			teacherinfo.setTel(tel);
			teacherinfo.setTname(name);
			teacherinfo.setTsex(tsex);
			userMapper.addTeacher(teacherinfo);
			return 1;
		}catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
		
	}

	@Override
	public int CheckTeachername(String name) {
		try {
			String teachername = userMapper.CheckTeachername(name);
			return (teachername == null || teachername.length() == 0)==true?1:-1;
		}catch (Exception e) {
			e.printStackTrace();		
			return -2;
		}

	}

	@Override
	public int CheckStdentname(String name) {
		try {
			String stdentname = userMapper.CheckStudentname(name);
			return (stdentname == null || stdentname.length() == 0)==true?1:-1;
		}catch (Exception e) {
			e.printStackTrace();		
			return -2;
		}
	}

}
