package com.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

public class CourseEditForm extends ActionForm{

	private int frmTeacherNo;
	private List<String> frmCourseList;
	private String frmSelectCourse;
	private Integer frmTutoPercentage;
	private Integer frmAssignPercentage;
	private Integer frmLabPercentage;
	private Integer frmExamPercentage;
	private Integer frmTutoGiven;
	private Integer frmAssignGiven;
	private Integer frmLabGiven;
	private Integer frmExamGiven;
	private String frmBtn;
	private String frmErrorMsg;
	private String frmUserName;
	
	public int getFrmTeacherNo() {
		return frmTeacherNo;
	}
	public void setFrmTeacherNo(int frmTeacherNo) {
		this.frmTeacherNo = frmTeacherNo;
	}
	public List<String> getFrmCourseList() {
		return frmCourseList;
	}
	public void setFrmCourseList(List<String> frmCourseList) {
		this.frmCourseList = frmCourseList;
	}
	public String getFrmSelectCourse() {
		return frmSelectCourse;
	}
	public void setFrmSelectCourse(String frmSelectCourse) {
		this.frmSelectCourse = frmSelectCourse;
	}
	public Integer getFrmTutoPercentage() {
		return frmTutoPercentage;
	}
	public void setFrmTutoPercentage(Integer frmTutoPercentage) {
		this.frmTutoPercentage = frmTutoPercentage;
	}
	public Integer getFrmAssignPercentage() {
		return frmAssignPercentage;
	}
	public void setFrmAssignPercentage(Integer frmAssignPercentage) {
		this.frmAssignPercentage = frmAssignPercentage;
	}
	public Integer getFrmLabPercentage() {
		return frmLabPercentage;
	}
	public void setFrmLabPercentage(Integer frmLabPercentage) {
		this.frmLabPercentage = frmLabPercentage;
	}
	public Integer getFrmExamPercentage() {
		return frmExamPercentage;
	}
	public void setFrmExamPercentage(Integer frmExamPercentage) {
		this.frmExamPercentage = frmExamPercentage;
	}
	public Integer getFrmTutoGiven() {
		return frmTutoGiven;
	}
	public void setFrmTutoGiven(Integer frmTutoGiven) {
		this.frmTutoGiven = frmTutoGiven;
	}
	public Integer getFrmAssignGiven() {
		return frmAssignGiven;
	}
	public void setFrmAssignGiven(Integer frmAssignGiven) {
		this.frmAssignGiven = frmAssignGiven;
	}
	public Integer getFrmLabGiven() {
		return frmLabGiven;
	}
	public void setFrmLabGiven(Integer frmLabGiven) {
		this.frmLabGiven = frmLabGiven;
	}
	public Integer getFrmExamGiven() {
		return frmExamGiven;
	}
	public void setFrmExamGiven(Integer frmExamGiven) {
		this.frmExamGiven = frmExamGiven;
	}
	public String getFrmBtn() {
		return frmBtn;
	}
	public void setFrmBtn(String frmBtn) {
		this.frmBtn = frmBtn;
	}
	public String getFrmErrorMsg() {
		return frmErrorMsg;
	}
	public void setFrmErrorMsg(String frmErrorMsg) {
		this.frmErrorMsg = frmErrorMsg;
	}
	public String getFrmUserName() {
		return frmUserName;
	}
	public void setFrmUserName(String frmUserName) {
		this.frmUserName = frmUserName;
	}
	
	
}
