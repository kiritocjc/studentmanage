package com.studentmangage.pojo;

public class Teacher {
	
	/**
	 * `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `teacherId` varchar(255) CHARACTER SET 
	 */
	private Integer id;
	private String name;
    private String password;
    private String teacherId;
	public Teacher() { }
	public Teacher(Integer id, String name, String password, String teacherId) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.teacherId = teacherId;
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
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", password=" + password + ", teacherId=" + teacherId + "]";
	}
	
      
      
}
      