package com.form;

import java.util.Date;
import java.util.List;

import org.apache.struts.action.ActionForm;

import com.model.StudentModel;

public class RegForm extends ActionForm{

	private String frmTeacherUserName;
	private String frmTeacherPassword;
	private Integer frmUserNo;
	private String frmUserName;	
	private List<FormTeacherPermit> frmTeacherPermit;
	private String frmStudentName;
	private String frmStudentPassword;
	private String frmStudentRoll;
	private String frmStudentAdd;
	private String frmStudentPh;
	private String frmStudentGau;
	private Integer frmStudentBat;
	private String frmStudentBirth;
	private String frmMsg;
	private List<String> frmRollList;
	private String frmRollNo;
	private StudentModel frmStudent;
		
	public String getFrmTeacherUserName() {
		return frmTeacherUserName;
	}
	public StudentModel getFrmStudent() {
		return frmStudent;
	}
	public void setFrmStudent(StudentModel frmStudent) {
		this.frmStudent = frmStudent;
	}
	public void setFrmTeacherUserName(String frmTeacherUserName) {
		this.frmTeacherUserName = frmTeacherUserName;
	}
	public String getFrmTeacherPassword() {
		return frmTeacherPassword;
	}
	public void setFrmTeacherPassword(String frmTeacherPassword) {
		this.frmTeacherPassword = frmTeacherPassword;
	}
	public Integer getFrmUserNo() {
		return frmUserNo;
	}
	public void setFrmUserNo(Integer frmUserNo) {
		this.frmUserNo = frmUserNo;
	}
	public String getFrmUserName() {
		return frmUserName;
	}
	public void setFrmUserName(String frmUserName) {
		this.frmUserName = frmUserName;
	}
	
	public List<FormTeacherPermit> getFrmTeacherPermit() {
		return frmTeacherPermit;
	}
	public void setFrmTeacherPermit(List<FormTeacherPermit> frmTeacherPermit) {
		this.frmTeacherPermit = frmTeacherPermit;
	}
	public String getFrmStudentName() {
		return frmStudentName;
	}
	public void setFrmStudentName(String frmStudentName) {
		this.frmStudentName = frmStudentName;
	}
	public String getFrmStudentRoll() {
		return frmStudentRoll;
	}
	public void setFrmStudentRoll(String frmStudentRoll) {
		this.frmStudentRoll = frmStudentRoll;
	}
	public String getFrmStudentAdd() {
		return frmStudentAdd;
	}
	public void setFrmStudentAdd(String frmStudentAdd) {
		this.frmStudentAdd = frmStudentAdd;
	}
	public String getFrmStudentPh() {
		return frmStudentPh;
	}
	public void setFrmStudentPh(String frmStudentPh) {
		this.frmStudentPh = frmStudentPh;
	}
	public String getFrmStudentGau() {
		return frmStudentGau;
	}
	public void setFrmStudentGau(String frmStudentGau) {
		this.frmStudentGau = frmStudentGau;
	}
	public Integer getFrmStudentBat() {
		return frmStudentBat;
	}
	public void setFrmStudentBat(Integer frmStudentBat) {
		this.frmStudentBat = frmStudentBat;
	}
	public String getFrmStudentPassword() {
		return frmStudentPassword;
	}
	public void setFrmStudentPassword(String frmStudentPassword) {
		this.frmStudentPassword = frmStudentPassword;
	}
	public String getFrmStudentBirth() {
		return frmStudentBirth;
	}
	public void setFrmStudentBirth(String frmStudentBirth) {
		this.frmStudentBirth = frmStudentBirth;
	}
	public String getFrmMsg() {
		return frmMsg;
	}
	public void setFrmMsg(String frmMsg) {
		this.frmMsg = frmMsg;
	}
	public List<String> getFrmRollList() {
		return frmRollList;
	}
	public void setFrmRollList(List<String> frmRollList) {
		this.frmRollList = frmRollList;
	}
	public String getFrmRollNo() {
		return frmRollNo;
	}
	public void setFrmRollNo(String frmRollNo) {
		this.frmRollNo = frmRollNo;
	}

	
}
