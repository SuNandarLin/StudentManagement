package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.CourseDao;
import com.dao.SemDao;
import com.dao.StudentDao;
import com.dao.StudentMarkDao;
import com.dao.TeacherDao;
import com.form.CourseEditForm;
import com.form.MarkForm;
import com.form.ShowMarkForm;
import com.model.CourseModel;
import com.form.MarkProcessFrmModel;
import com.model.StudentmarkModel;

public class MarkService {

	private TeacherDao teacherDao;
	private CourseDao courseDao;
	private SemDao semDao;	
	private StudentMarkDao studentMarkDao;
	private StudentDao studentDao;
	
public void showCoursesOfTeacher (MarkForm myForm){
		int teacherNo=myForm.getFrmTeacherNo();
		List<String> courseList=new ArrayList<String>();
		courseList=this.courseDao.selectCourseByTeacher(teacherNo);	
		myForm.setFrmUserName(this.teacherDao.selectTeacherNameByTeacherNo(teacherNo));
		myForm.setFrmCourseList(courseList);		
	}
	public int studentCount(String courseName){
		List<String> rollNoList=this.studentMarkDao.selectRollNoByCourse(courseName);
		return rollNoList.size();
	}
	public void selectMarkByCourse (MarkForm myForm){
		String courseName=myForm.getFrmSelectCourse();
		String courseNo=this.courseDao.selectCourseNoByName(courseName);
	List<StudentmarkModel> markList=this.studentMarkDao.selectStudentMarkByCourseName(courseName);
		List<String> rollNoList=this.studentMarkDao.selectRollNoByCourse(courseName);
		List<String> studentNameList=this.studentMarkDao.selectUserNameByCourse(courseName);
		List<MarkProcessFrmModel> MarkProcessFrmList=new ArrayList<MarkProcessFrmModel>();
		String semName=this.courseDao.selectSemByCourseName(courseName);		
		myForm.setFrmNum((rollNoList.size()),5);
		
		for(int i=0;i<rollNoList.size();i++){
			MarkProcessFrmModel frmModel=new MarkProcessFrmModel();
			frmModel.setRollNo(rollNoList.get(i));
			frmModel.setName(studentNameList.get(i));
			if(markList.get(i).getTutoMark()!=null){
				frmModel.setTutoMark(markList.get(i).getTutoMark());
				frmModel.setTutoMarkSpin(null);
			}else{
				frmModel.setTutoMarkSpin((i+1)+""+1);
			}
			if(markList.get(i).getAssignMark()!=null){
				frmModel.setAssignMark(markList.get(i).getAssignMark());
				frmModel.setAssignMarkSpin(null);
			}else{
				frmModel.setAssignMarkSpin((i+1)+""+2);
			}
			if(markList.get(i).getLabMark()!=null){
				frmModel.setLabMark(markList.get(i).getLabMark());
				frmModel.setLabMarkSpin(null);
			}else{
				frmModel.setLabMarkSpin((i+1)+""+3);
			}
			if(markList.get(i).getExamMark()!=null){
				frmModel.setExamMark(markList.get(i).getExamMark());
				frmModel.setExamMarkSpin(null);
			}else{
				frmModel.setExamMarkSpin((i+1)+""+4);
			}
			if(markList.get(i).getTotalMark()!=null){
				frmModel.setTotalMark(markList.get(i).getTotalMark());
				frmModel.setTotalMarkSpin(null);
			}else{
				frmModel.setTotalMarkSpin((i+1)+""+5);
			}
			if(markList.get(i).getResult()!=null){
				frmModel.setResult(markList.get(i).getResult());
			}else{
				frmModel.setResult("");
			}
			
			MarkProcessFrmList.add(frmModel);
		}
		
		System.out.println("process form :"+MarkProcessFrmList.size());
		myForm.setFrmMarkProcessFrmList(MarkProcessFrmList);
		myForm.setFrmSemName(semName);
		myForm.setFrmTutoGiven(this.courseDao.selectTutoGForCalMark(courseNo));
		myForm.setFrmAssignGiven(this.courseDao.selectAssignGForCalMark(courseNo));
		myForm.setFrmLabGiven(this.courseDao.selectLabGForCalMark(courseNo));
		myForm.setFrmExamGiven(this.courseDao.selectExamGForCalMark(courseNo));
	
	}
	public void selectCourseByName(CourseEditForm myForm){
		int teacherNo=myForm.getFrmTeacherNo();
		List<String> courseList=new ArrayList<String>();
		courseList=this.courseDao.selectCourseByTeacher(teacherNo);		
		myForm.setFrmCourseList(courseList);
		if(myForm.getFrmSelectCourse()!=null){
		CourseModel course=this.courseDao.selectCourse(myForm.getFrmSelectCourse());
		myForm.setFrmTutoPercentage(course.getTutoPercentage());
		myForm.setFrmAssignPercentage(course.getAssignPercentage());
		myForm.setFrmLabPercentage(course.getLabPercentage());
		myForm.setFrmExamPercentage(course.getExamPercentage());
		myForm.setFrmUserName(this.teacherDao.selectTeacherNameByTeacherNo(teacherNo));
		myForm.setFrmTutoGiven(course.getTutoGiven());
		myForm.setFrmAssignGiven(course.getAssignGiven());
		myForm.setFrmLabGiven(course.getLabGiven());
		myForm.setFrmExamGiven(course.getExamGiven());
		}
	}
	public void updateCoursePercentage(CourseEditForm myForm,
			String tutoPercent,String assignPercent,String labPercent,String examPercent,
			String tutoGiven,String assignGiven,String labGiven,String examGiven){
		CourseModel c=new CourseModel();
		int TutoP=Integer.parseInt(tutoPercent);
		int AssignP=Integer.parseInt(assignPercent);
		int LabP=Integer.parseInt(labPercent);
		int ExamP=Integer.parseInt(examPercent);
		int TotalP=TutoP+AssignP+LabP+ExamP;
		int TutoG=Integer.parseInt(tutoGiven);
		int AssignG=Integer.parseInt(assignGiven);
		int LabG=Integer.parseInt(labGiven);
		int ExamG=Integer.parseInt(examGiven);
		if(TotalP==100){
		c.setTutoPercentage(TutoP);
		c.setAssignPercentage(AssignP);
		c.setLabPercentage(LabP);
		c.setExamPercentage(ExamP);
		c.setTutoGiven(TutoG);
		c.setAssignGiven(AssignG);
		c.setLabGiven(LabG);
		c.setExamGiven(ExamG);
		c.setCourseName(myForm.getFrmSelectCourse());
		this.courseDao.updatePercentage(c);
			myForm.setFrmErrorMsg(null);
		}else{
			myForm.setFrmErrorMsg("Total Percentage must be 100%");

		}
	}
	public List<Integer> selectStudentForMarkFill(String courseName){
		List<Integer> studentNoList=new ArrayList<Integer>();
		studentNoList=this.studentMarkDao.selectStudentNoByCourseName(courseName);
		return studentNoList;
	}
	public void addMark(Integer mark , Integer studentNo,String courseName ,String type ){
		
		String courseNo=this.courseDao.selectCourseNoByName(courseName);
		StudentmarkModel sm=new StudentmarkModel();
		sm.setCourseNo(courseNo);
		sm.setStudentNo(studentNo);
		switch(type){
		case "Tuto" :{	
			Double temp=((double)(mark)/(double)(this.courseDao.selectTutoGForCalMark(courseNo)));
			mark=(int) (temp*(double)this.courseDao.selectTutoPForCalMark(courseNo));			
			sm.setTutoMark(mark);
			this.studentMarkDao.addTutoMark(sm);
			
		} break;
		case "Assign" :{
		Double temp=((double)(mark)/(double)(this.courseDao.selectAssignGForCalMark(courseNo)));
		mark=(int) (temp*(double)this.courseDao.selectAssignPForCalMark(courseNo));
			sm.setAssignMark(mark);
			this.studentMarkDao.addAssignMark(sm);
		} break;
		case "Lab" :{
			Double temp=((double)(mark)/(double)(this.courseDao.selectLabGForCalMark(courseNo)));
			mark=(int) (temp*(double)this.courseDao.selectLabPForCalMark(courseNo));
			sm.setLabMark(mark);
			this.studentMarkDao.addLabMark(sm);
		} break;
		case "Exam" :{
			Double temp=((double)(mark)/(double)(this.courseDao.selectExamGForCalMark(courseNo)));
			mark=(int) (temp*(double)this.courseDao.selectExamPForCalMark(courseNo));
			sm.setExamMark(mark);
			this.studentMarkDao.addExamMark(sm);
			int totalMark=this.studentMarkDao.selectTutoMarkForResult(sm)+
					this.studentMarkDao.selectAssignMarkForResult(sm)+
					this.studentMarkDao.selectLabMarkForResult(sm)+mark;
			sm.setTotalMark(totalMark);
			this.studentMarkDao.addTotalMark(sm);
			if(totalMark>=50){
				sm.setResult("pass");
			}else if(totalMark>=80){
				sm.setResult("excellent");
			}else{
				sm.setResult("fail");
			}
			this.studentMarkDao.addResult(sm);

		} break;
		
		}
	}
	public void selectSemester(ShowMarkForm myForm){
		List<String> semList=new ArrayList<String>();
		semList=this.studentMarkDao.selectSemByStudentNo(myForm.getFrmStudentNo());
		myForm.setFrmSemList(semList);
		myForm.setFrmUserName(this.studentDao.selectStudentNameByStudentNo(
				myForm.getFrmStudentNo()));
	}
	public void selectForShow(ShowMarkForm myForm){
		StudentmarkModel sm=new StudentmarkModel();
		System.out.println("SEmester : "+myForm.getFrmSem()+"//"+myForm.getFrmStudentNo());
		sm.setSemName(myForm.getFrmSem());
		sm.setStudentNo(myForm.getFrmStudentNo());
		List<Integer> tutoList=new ArrayList<Integer>();
		List<Integer> assignList=new ArrayList<Integer>();
		List<Integer> labList=new ArrayList<Integer>();
		List<Integer> examList=new ArrayList<Integer>();
		List<Integer> totalList=new ArrayList<Integer>();
		List<String> resultList=new ArrayList<String>();
		List<String> courseList=new ArrayList<String>();
		List<MarkProcessFrmModel> FrmList=new ArrayList<MarkProcessFrmModel>();
		
		tutoList=this.studentMarkDao.selectTutoForShow(sm);
		assignList=this.studentMarkDao.selectAssignForShow(sm);
		labList=this.studentMarkDao.selectLabForShow(sm);
		examList=this.studentMarkDao.selectExamForShow(sm);
		totalList=this.studentMarkDao.selectTotalForShow(sm);
		resultList=this.studentMarkDao.selectResultForShow(sm);
		courseList=this.studentMarkDao.selectCourseNameForShow(sm);
		
		for(int i=0;i<courseList.size();i++){
			MarkProcessFrmModel frm=new MarkProcessFrmModel();
			frm.setName(courseList.get(i));
			frm.setTutoMark(tutoList.get(i));
			frm.setAssignMark(assignList.get(i));
			frm.setLabMark(labList.get(i));
			frm.setExamMark(examList.get(i));
			frm.setTotalMark(totalList.get(i));
			frm.setResult(resultList.get(i));
			FrmList.add(frm);
		}
		
		//System.out.println("Size of Course :"+courseList.size()+" .."+courseList.get(0));
		//System.out.println("Size :"+studentList.size()+" .."+studentList.get(0)
															//+studentList.get(1));

		myForm.setFrmShowList(FrmList);
	}
	public void selectAllFromCourse(String courseName){
		this.courseDao.selectAll(courseName);
	}
	
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}
	public void setSemDao(SemDao semDao) {
		this.semDao = semDao;
	}
	public void setStudentMarkDao(StudentMarkDao studentMarkDao) {
		this.studentMarkDao = studentMarkDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
}
