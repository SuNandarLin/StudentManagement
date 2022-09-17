package com.form;

import java.io.Serializable;

public class FormTeacherPermit implements Serializable{
	private String teacherName;
	private Integer permitStuInfo;
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public Integer getPermitStuInfo() {
		return permitStuInfo;
	}
	public void setPermitStuInfo(Integer permitStuInfo) {
		this.permitStuInfo = permitStuInfo;
	}
}
