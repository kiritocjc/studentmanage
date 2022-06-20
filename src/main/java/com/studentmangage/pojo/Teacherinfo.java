package com.studentmangage.pojo;

public class Teacherinfo {
	/**
	 * `teacherId` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `tname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `tage` int DEFAULT NULL,
  `tsex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `tdept` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `tel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `QQ` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `professional` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
	 */
	private String teacherId;
	private String tname;
	private Integer tage;
	private String tsex;
	private String tdept;
	private String tel;
	private String qq;
	private String professional;
	public Teacherinfo() {
	}
	public Teacherinfo(String teacherId, String tname, Integer tage, String tsex, String tdept, String tel, String qQ,
			String professional) {
		this.teacherId = teacherId;
		this.tname = tname;
		this.tage = tage;
		this.tsex = tsex;
		this.tdept = tdept;
		this.tel = tel;
		qq = qq;
		this.professional = professional;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getTage() {
		return tage;
	}
	public void setTage(Integer tage) {
		this.tage = tage;
	}
	public String getTsex() {
		return tsex;
	}
	public void setTsex(String tsex) {
		this.tsex = tsex;
	}
	public String getTdept() {
		return tdept;
	}
	public void setTdept(String tdept) {
		this.tdept = tdept;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	@Override
	public String toString() {
		return "Teacherinfo [teacherId=" + teacherId + ", tname=" + tname + ", tage=" + tage + ", tsex=" + tsex
				+ ", tdept=" + tdept + ", tel=" + tel + ", qq=" + qq + ", professional=" + professional + "]";
	}
	
}
