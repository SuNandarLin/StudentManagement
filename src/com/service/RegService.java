package com.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dao.StudentDao;
import com.dao.TeacherDao;
import com.dao.UserDao;
import com.form.RegForm;
import com.form.FormTeacherPermit;
import com.model.RollnoModel;
import com.model.StudentModel;
import com.model.UserModel;


public class RegService {
	
	private TeacherDao teacherDao;
	private UserDao userDao;
	private StudentDao studentDao;
	
	public void uploadAllTeacher(RegForm myForm){
		List<String> teacherNameList=new ArrayList<String>();
		List<Integer> permitStuInfoList=new ArrayList<Integer>();
		List<FormTeacherPermit> FrmPermitList=new ArrayList<FormTeacherPermit>();
		
		teacherNameList=this.teacherDao.selectAllTeacherName();
		for(int i=0;i<teacherNameList.size();i++){
			FormTeacherPermit p=new FormTeacherPermit();
			p.setTeacherName(teacherNameList.get(i));
			p.setPermitStuInfo(this.teacherDao.selectPermitStuInfo(teacherNameList.get(i)));
			System.out.println("uploadall"+
					this.teacherDao.selectPermitStuInfo(teacherNameList.get(i)));
			FrmPermitList.add(p);		
		}
		
		myForm.setFrmTeacherPermit(FrmPermitList);		
	}
	public void updatePermit(RegForm myForm){
		int size=myForm.getFrmTeacherPermit().size();
		for(int i=0;i<size;i++){
			if(myForm.getFrmTeacherPermit().get(i).getPermitStuInfo()==1){
				this.teacherDao.setPermissionStuInfoTrue(
						myForm.getFrmTeacherPermit().get(i).getTeacherName());
			}else{
				this.teacherDao.setPermissionStuInfoFalse(
						myForm.getFrmTeacherPermit().get(i).getTeacherName());
			}
		}
	}
	public void registerTeacher(RegForm myForm){
		UserModel user=new UserModel();
		user.setUserNo(null);
		user.setUserName(myForm.getFrmTeacherUserName());
		user.setUserPassword(myForm.getFrmTeacherPassword());
		user.setUserType("T");
		this.userDao.registerUser(user);
		this.teacherDao.registerTeacher(this.userDao.selectUserNo(user));
	}
	public void loadTeacherUserName(RegForm myForm){
		myForm.setFrmUserName(
				this.teacherDao.selectTeacherNameByUserNo(myForm.getFrmUserNo()));
	}
	public void registerStudent(RegForm myForm){
		 String FORMAT="YYYY-MM-DD";
			SimpleDateFormat SDF=new SimpleDateFormat(FORMAT);
		UserModel user=new UserModel();
		user.setUserNo(null);
		user.setUserName(myForm.getFrmStudentName());
		user.setUserPassword(myForm.getFrmStudentPassword());
		user.setUserType("S");
		this.userDao.registerUser(user);
		StudentModel student=new StudentModel();
		student.setStudentNo(null);
		student.setUserNo(this.userDao.selectUserNo(user));
		student.setAddress(myForm.getFrmStudentAdd());
		try {
			student.setBirthDate(SDF.parse((myForm.getFrmStudentBirth())));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		student.setGuardian(myForm.getFrmStudentGau());
		student.setBatch(myForm.getFrmStudentBat());
		student.setPhNo(myForm.getFrmStudentPh());
		this.studentDao.registerStudent(student);
		RollnoModel rollNo=new RollnoModel();
		rollNo.setStudentNo(this.studentDao.selectStudentNo(this.userDao.selectUserNo(user)));
		rollNo.setBatch(myForm.getFrmStudentBat());
		rollNo.setRollNo(myForm.getFrmStudentRoll());
		this.studentDao.registerRollNo(rollNo);
		myForm.setFrmMsg("Register Success!");
		clearFrm(myForm);
		
	}
	public void clearFrm(RegForm myForm){
		myForm.setFrmStudentName(null);
		myForm.setFrmStudentPassword(null);
		myForm.setFrmStudentRoll(null);
		myForm.setFrmStudentAdd(null);
		myForm.setFrmStudentPh(null);
		myForm.setFrmStudentBat(null);
		myForm.setFrmStudentBirth(null);
		myForm.setFrmStudentGau(null);
	}
	public void uploadRollList(RegForm myForm){
		myForm.setFrmRollList(this.studentDao.selectRoll());
	}
	public void showStudentInfo(RegForm myForm){
		 
		String rollNo=myForm.getFrmRollNo();
		StudentModel student=this.studentDao.selectStudentByRollNo(rollNo);
		myForm.setFrmStudentRoll(rollNo);
		myForm.setFrmStudentAdd(student.getAddress());
		myForm.setFrmStudentBat(student.getBatch());
		myForm.setFrmStudentBirth(String.valueOf(student.getBirthDate()));
		myForm.setFrmStudentGau(student.getGuardian());
		System.out.println(student.getPhNo());
		myForm.setFrmStudentPh(this.studentDao.selectPhoneByRollNo(rollNo));
		myForm.setFrmStudentName(this.studentDao.selectUserNameByRollNo(rollNo));
	}
	public void loadAdminUserName(RegForm myForm){
		myForm.setFrmUserName(this.userDao.selectUserNameByNo(myForm.getFrmUserNo()));
	}
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
