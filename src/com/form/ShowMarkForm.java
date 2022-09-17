package com.form;

import java.util.ArrayList;


import java.util.List;

import org.apache.struts.action.ActionForm;

import com.model.StudentmarkModel;

public class ShowMarkForm extends ActionForm{
	private Integer frmStudentNo;
	private List<String> frmSemList;
	private List<MarkProcessFrmModel> frmShowList;
	private String frmSem;
	private String frmUserName;
		
	public Integer getFrmStudentNo() {
		return frmStudentNo;
	}
	public void setFrmStudentNo(Integer frmStudentNo) {
		this.frmStudentNo = frmStudentNo;
	}
	public List<String> getFrmSemList() {
		return frmSemList;
	}
	public void setFrmSemList(List<String> frmSemList) {
		this.frmSemList = frmSemList;
	}
	public List<MarkProcessFrmModel> getFrmShowList() {
		return frmShowList;
	}
	public void setFrmShowList(List<MarkProcessFrmModel> frmShowList) {
		this.frmShowList = frmShowList;
	}
	public String getFrmSem() {
		return frmSem;
	}
	public void setFrmSem(String frmSem) {
		this.frmSem = frmSem;
	}
	public String getFrmUserName() {
		return frmUserName;
	}
	public void setFrmUserName(String frmUserName) {
		this.frmUserName = frmUserName;
	}
	
	
}
