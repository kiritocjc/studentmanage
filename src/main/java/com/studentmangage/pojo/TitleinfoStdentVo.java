package com.studentmangage.pojo;

public class TitleinfoStdentVo {
	/**
	 * `titleId` int NOT NULL AUTO_INCREMENT,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `teacherId` varchar(255) 
	 */
	private Integer titleId;
	private String  type;
	private String  name;
	private String  teacherId;
	private String  tname;
	public TitleinfoStdentVo() {
	}

	public TitleinfoStdentVo(Integer titleId, String type, String name, String teacherId, String tname) {
		this.titleId = titleId;
		this.type = type;
		this.name = name;
		this.teacherId = teacherId;
		this.tname = tname;
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

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "TitleinfoStdentVo [titleId=" + titleId + ", type=" + type + ", name=" + name + ", teacherId="
				+ teacherId + ", tname=" + tname + "]";
	}
	
}