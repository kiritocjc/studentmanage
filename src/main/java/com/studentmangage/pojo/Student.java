package com.studentmangage.pojo;

public class Student {
	/**
	 * `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `studentId` varchar(255) CHARACTER SE
	 */
	private Integer id;
	private String name;
	private String password;
	private String studentid;
	public Student() {
	}
	public Student(Integer id, String name, String studentid) {
		this.id = id;
		this.name = name;
		this.studentid = studentid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password+ ", studentid=" + studentid + "]";
	}
	
	
}
