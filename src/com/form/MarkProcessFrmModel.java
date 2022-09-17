package com.form;

import java.io.Serializable;

public class MarkProcessFrmModel implements Serializable{
	private String rollNo;
	private String name;
	private Integer tutoMark;
	private Integer assignMark;
	private Integer labMark;
	private Integer examMark;
	private Integer totalMark;
	private String tutoMarkSpin;
	private String assignMarkSpin;
	private String labMarkSpin;
	private String examMarkSpin;
	private String totalMarkSpin;
	private String result;
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTutoMark() {
		return tutoMark;
	}
	public void setTutoMark(Integer tutoMark) {
		this.tutoMark = tutoMark;
	}
	public Integer getAssignMark() {
		return assignMark;
	}
	public void setAssignMark(Integer assignMark) {
		this.assignMark = assignMark;
	}
	public Integer getLabMark() {
		return labMark;
	}
	public void setLabMark(Integer labMark) {
		this.labMark = labMark;
	}
	public Integer getExamMark() {
		return examMark;
	}
	public void setExamMark(Integer examMark) {
		this.examMark = examMark;
	}
	public Integer getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(Integer totalMark) {
		this.totalMark = totalMark;
	}
	public String getTutoMarkSpin() {
		return tutoMarkSpin;
	}
	public void setTutoMarkSpin(String tutoMarkSpin) {
		this.tutoMarkSpin = tutoMarkSpin;
	}
	public String getAssignMarkSpin() {
		return assignMarkSpin;
	}
	public void setAssignMarkSpin(String assignMarkSpin) {
		this.assignMarkSpin = assignMarkSpin;
	}
	public String getLabMarkSpin() {
		return labMarkSpin;
	}
	public void setLabMarkSpin(String labMarkSpin) {
		this.labMarkSpin = labMarkSpin;
	}
	public String getExamMarkSpin() {
		return examMarkSpin;
	}
	public void setExamMarkSpin(String examMarkSpin) {
		this.examMarkSpin = examMarkSpin;
	}
	public String getTotalMarkSpin() {
		return totalMarkSpin;
	}
	public void setTotalMarkSpin(String totalMarkSpin) {
		this.totalMarkSpin = totalMarkSpin;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
}
