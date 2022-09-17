package com.dao;

import java.util.List;


public interface TeacherDao {
	
	public void setPermissionTimetable(int teacherNo);
	public void setPermissionStuInfo(int teacherNo);
	public int selectTeacherNoByUserNo(int userNo);
	public String selectTeacherNameByUserNo(int userNo);
	public List<String> selectAllTeacherName();
	public Integer selectPermitStuInfo(String userName);
	public void setPermissionStuInfoTrue(String userName);
	public void setPermissionStuInfoFalse(String userName);
	public void registerTeacher(int userNo);
	public String selectTeacherNameByTeacherNo(int teacherNo);
	public Integer selectPermissionStuInfo(int teacherNo);
	
}
