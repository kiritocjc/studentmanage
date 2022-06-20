package com.studentmangage.pojo;

public class Studentinfo {
	/**`studentId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `age` int DEFAULT NULL,
  `teacherId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `grade` int DEFAULT NULL,
  `clazz` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `titleId` int DEFAULT NULL,
  */
	private String  studentId;
	private String  name;
	private String  sex;
	private Integer age;
	private String  teacherId;
	private Integer grade;
	private String  clazz;
	private Integer titleid;
	public Studentinfo() {
	}
	public Studentinfo(String studentId, String name, String sex, Integer age, String teacherId, Integer grade,
			String clazz, Integer titleid) {
		this.studentId = studentId;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.teacherId = teacherId;
		this.grade = grade;
		this.clazz = clazz;
		this.titleid = titleid;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public Integer getTitleid() {
		return titleid;
	}
	public void setTitleid(Integer titleid) {
		this.titleid = titleid;
	}
	@Override
	public String toString() {
		return "Studentinfo [studentId=" + studentId + ", name=" + name + ", sex=" + sex + ", age=" + age
				+ ", teacherId=" + teacherId + ", grade=" + grade + ", clazz=" + clazz + ", titleid=" + titleid + "]";
	}
	
}
