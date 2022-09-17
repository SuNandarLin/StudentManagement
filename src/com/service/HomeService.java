package com.service;

import java.util.HashMap;

import com.dao.StudentDao;
import com.dao.TeacherDao;
import com.dao.UserDao;
import com.form.HomeForm;
import com.model.UserModel;

public class HomeService {

private UserDao userDao;
private TeacherDao teacherDao;
private StudentDao studentDao;
	
	
	public void loginCheck(HomeForm myForm){
		
		try{
		UserModel userOfFrm=new UserModel();
		userOfFrm.setUserName(myForm.getFrmUserName());
		userOfFrm.setUserPassword(myForm.getFrmPassword());
		UserModel userDB=this.userDao.selectUser(userOfFrm);
		
				
		if(userDB!=null ){
			int userNo=userDB.getUserNo();
			String userType=userDB.getUserType();
			myForm.setFrmUserNo(userNo);
			myForm.setFrmUserType(userType);
			myForm.setFrmUserName(userDB.getUserName());
			if(userType=="T" || userType.equals("T")){
				myForm.setFrmTeacherNo(this.teacherDao.selectTeacherNoByUserNo(userNo));
			}else if(userType=="S" || userType.equals("S")){
				myForm.setFrmStudentNo(this.studentDao.selectStudentNo(userNo));
			}else if(userType=="A" || userType.equals("A")){
				myForm.setFrmStudentNo(userNo);
			} 
			myForm.setFrmInvalidUser(null);
			
		}else{
			myForm.setFrmInvalidUser("Invalid user name and password !");
		}
		}catch(NumberFormatException e){
		}		
	}
	public void uploadPermitInfo(HomeForm myForm){
		myForm.setFrmPermitInfo(
		this.teacherDao.selectPermissionStuInfo(myForm.getFrmTeacherNo()));
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
}
