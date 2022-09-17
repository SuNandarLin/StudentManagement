package com.dao;

import java.util.List;

import com.model.RollnoModel;
import com.model.StudentModel;

public interface StudentDao {

	public void registerStudent(StudentModel student);
	public StudentModel selectStudent();
	public Integer selectStudentNo(Integer userNo);
	public List<Integer> selectStudentNoByBatch(Integer batch);
	public String selectStudentName(Integer userNo);
	public String selectStudentNameByStudentNo(Integer studentNo);
	public void registerRollNo(RollnoModel rollNo);
	public List<String> selectRoll();
	public StudentModel selectStudentByRollNo(String rollNo);
	public String selectPhoneByRollNo(String rollNo);
	public String selectUserNameByRollNo(String rollNo);
}
