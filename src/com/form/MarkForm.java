package com.form;

import java.util.ArrayList;


import java.util.HashMap;
import java.util.List;

import org.apache.struts.action.ActionForm;

import com.form.MarkProcessFrmModel;
import com.model.StudentmarkModel;

public class MarkForm extends ActionForm{
	private int frmTeacherNo;
	private List<String> frmCourseList;
	private String frmSelectCourse;
	private List<StudentmarkModel> frmMarkList;
	private List<String> frmRollNoList;
	private List<String> frmStudentNameList;	
	private List<MarkProcessFrmModel> frmMarkProcessFrmList;
	private String frmSemName;
	private HashMap<String, String> hmapNum;
	private List<String> frmNum=new ArrayList<String>();
	private String frmNum1;
	private String frmBtn;
	private String frmUserName;
	private Integer frmTutoGiven;
	private Integer frmAssignGiven;
	private Integer frmLabGiven;
	private Integer frmExamGiven;
	
	public List<StudentmarkModel> getFrmMarkList() {
		return frmMarkList;
	}

	public void setFrmMarkList(List<StudentmarkModel> frmMarkList) {
		this.frmMarkList = frmMarkList;
	}

	public String getFrmSelectCourse() {
		return frmSelectCourse;
	}

	public void setFrmSelectCourse(String frmSelectCourse) {
		this.frmSelectCourse = frmSelectCourse;
	}

	public List<String> getFrmCourseList() {
		return frmCourseList;
	}

	public void setFrmCourseList(List<String> frmCourseList) {
		this.frmCourseList = frmCourseList;
	}

	public int getFrmTeacherNo() {
		return frmTeacherNo;
	}

	public void setFrmTeacherNo(int frmTeacherNo) {
		this.frmTeacherNo = frmTeacherNo;
	}

	public List<String> getFrmRollNoList() {
		return frmRollNoList;
	}

	public void setFrmRollNoList(List<String> frmRollNoList) {
		this.frmRollNoList = frmRollNoList;
	}

	public List<String> getFrmStudentNameList() {
		return frmStudentNameList;
	}

	public void setFrmStudentNameList(List<String> frmStudentNameList) {
		this.frmStudentNameList = frmStudentNameList;
	}

	public List<MarkProcessFrmModel> getFrmMarkProcessFrmList() {
		return frmMarkProcessFrmList;
	}

	public void setFrmMarkProcessFrmList(List<MarkProcessFrmModel> frmMarkProcessFrmList) {
		this.frmMarkProcessFrmList = frmMarkProcessFrmList;
	}

	public String getFrmSemName() {
		return frmSemName;
	}

	public void setFrmSemName(String frmSemName) {
		this.frmSemName = frmSemName;
	}

	public HashMap<String, String> getHmapNum() {
		return hmapNum;
	}

	public void setHmapNum(HashMap<String, String> hmapNum) {
		this.hmapNum = hmapNum;
	}

	public List<String> getFrmNum() {
		return frmNum;
	}

	public void setFrmNum(int row,int col) {
		List<String> frmNumber=new ArrayList<>();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++)
				frmNumber.add(i+""+j);
		}
		this.frmNum=frmNumber;
	}

	public String getFrmNum1() {
		return frmNum1;
	}

	public void setFrmNum1(String frmNum1) {
		this.frmNum1 = frmNum1;
	}

	public String getFrmBtn() {
		return frmBtn;
	}

	public void setFrmBtn(String frmBtn) {
		this.frmBtn = frmBtn;
	}
	public void setFrmNum(List<String> frmNum) {
		this.frmNum = frmNum;
	}

	public String getFrmUserName() {
		return frmUserName;
	}

	public void setFrmUserName(String frmUserName) {
		this.frmUserName = frmUserName;
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
	
}
