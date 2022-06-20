package com.studentmangage.pojo;

public class Titleinfo {
	/**
	 * `titleId` int NOT NULL AUTO_INCREMENT,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `teacherId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `src` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
	 */
	private Integer titleId;
	private String  type;
	private String  name;
    private String teacherId;
    private String src;
	public Titleinfo() {
	}
	public Titleinfo(Integer titleId, String type, String name, String teacherId, String src) {
		this.titleId = titleId;
		this.type = type;
		this.name = name;
		this.teacherId = teacherId;
		this.src = src;
	}
	public Integer getTitleId() {
		return titleId;
	}
	public void setTitleId(Integer titleId) {
		this.titleId = titleId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	@Override
	public String toString() {
		return "Titleinfo [titleId=" + titleId + ", type=" + type + ", name=" + name + ", teacherId=" + teacherId
				+ ", src=" + src + "]";
	}
    
}