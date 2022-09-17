package com.dao;

import java.util.List;

import com.model.StudentmarkModel;

public interface StudentMarkDao {
	
	public void addStudentMark(StudentmarkModel studentMark);
	public StudentmarkModel selectMark(StudentmarkModel studentMark);
	public List<StudentmarkModel> selectStudentMarkByCourseName(String courseName);
	public List<String> selectRollNoByCourse(String courseName);
	public List<String> selectUserNameByCourse(String courseName);
	public void addTutoMark(StudentmarkModel studentMark);
	public void addAssignMark(StudentmarkModel studentMark);
	public void addLabMark(StudentmarkModel studentMark);
	public void addExamMark(StudentmarkModel studentMark);
	public void addTotalMark(StudentmarkModel studentMark);
	public void addResult(StudentmarkModel studentMark);
	public List<Integer> selectStudentNoByCourseName(String courseName);
	public List<String> selectSemByStudentNo(Integer studentNo);
	public List<Integer> selectTutoForShow(StudentmarkModel studentMark);
	public List<Integer> selectAssignForShow(StudentmarkModel studentMark);
	public List<Integer> selectLabForShow(StudentmarkModel studentMark);
	public List<Integer> selectExamForShow(StudentmarkModel studentMark);
	public List<Integer> selectTotalForShow(StudentmarkModel studentMark);
	public List<String> selectResultForShow(StudentmarkModel studentMark);
	public List<String> selectCourseNameForShow(StudentmarkModel studentMark);
	public Integer selectTutoMarkForResult(StudentmarkModel studentMark);
	public Integer selectAssignMarkForResult(StudentmarkModel studentMark);
	public Integer selectLabMarkForResult(StudentmarkModel studentMark);
	

}
