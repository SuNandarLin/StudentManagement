package com.dao;

import java.util.List;

import com.model.CourseModel;

public interface CourseDao {
	
	public void registerCourse(CourseModel c);
	public void updatePercentage(CourseModel c);
	public List<String> selectCourseByTeacher(int teacherNo);
	public String selectSemByCourseName(String courseName);
	public CourseModel selectCourse(String courseName);
	public void selectAll(String courseName);
	public String selectCourseNoByName(String courseName);
	public Integer selectTutoPForCalMark(String courseNo);
	public Integer selectAssignPForCalMark(String courseNo);
	public Integer selectLabPForCalMark(String courseNo);
	public Integer selectExamPForCalMark(String courseNo);
	public Integer selectTutoGForCalMark(String courseNo);
	public Integer selectAssignGForCalMark(String courseNo);
	public Integer selectLabGForCalMark(String courseNo);
	public Integer selectExamGForCalMark(String courseNo);
	
	

}
