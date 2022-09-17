package com.form;

import org.apache.struts.action.ActionForm;

public class HomeForm extends ActionForm {
	private String frmUserName;
	private String frmPassword;
	private int frmUserNo;
	private String frmUserType;
	private int frmTeacherNo;
	private int frmStudentNo;
	private String frmInvalidUser;
	private Integer frmPermitInfo;
		
	public int getFrmTeacherNo() {
		return frmTeacherNo;
	}
	public void setFrmTeacherNo(int frmTeacherNo) {
		this.frmTeacherNo = frmTeacherNo;
	}
	public int getFrmStudentNo() {
		return frmStudentNo;
	}
	public void setFrmStudentNo(int frmStudentNo) {
		this.frmStudentNo = frmStudentNo;
	}
	public String getFrmUserType() {
		return frmUserType;
	}
	public void setFrmUserType(String frmUserType) {
		this.frmUserType = frmUserType;
	}	
	public String getFrmInvalidUser() {
		return frmInvalidUser;
	}
	public void setFrmInvalidUser(String frmInvalidUser) {
		this.frmInvalidUser = frmInvalidUser;
	}
	public int getFrmUserNo() {
		return frmUserNo;
	}
	public void setFrmUserNo(int frmUserNo) {
		this.frmUserNo = frmUserNo;
	}
	public String getFrmUserName() {
		return frmUserName;
	}
	public void setFrmUserName(String frmUserName) {
		this.frmUserName = frmUserName;
	}
	public String getFrmPassword() {
		return frmPassword;
	}
	public void setFrmPassword(String frmPassword) {
		this.frmPassword = frmPassword;
	}
	public Integer getFrmPermitInfo() {
		return frmPermitInfo;
	}
	public void setFrmPermitInfo(Integer frmPermitInfo) {
		this.frmPermitInfo = frmPermitInfo;
	}
	
}
