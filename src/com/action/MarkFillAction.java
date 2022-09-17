package com.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.form.MarkForm;
import com.service.MarkService;

public class MarkFillAction extends Action {
	
	MarkService markService;

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		MarkForm myForm=(MarkForm) form;
		this.markService.showCoursesOfTeacher(myForm);
		if(myForm.getFrmSelectCourse()!=null){
		this.markService.selectMarkByCourse(myForm);
				
		}
		
		
		request.setAttribute("frmSelectCourse", myForm.getFrmSelectCourse());
		System.out.println("frmCourseList : "+myForm.getFrmCourseList().size());
		request.setAttribute("frmCourseList", myForm.getFrmCourseList());
		for(int i=0;i<myForm.getFrmNum().size();i++){ 
			System.out.println("Num : "+request.getParameter(myForm.getFrmNum().get(i)));		//System.out.println("frmNum :"+request.getParameter(myForm.getFrmNum().get(i)));
			
		}
		System.out.println("btn :"+ request.getParameter("btn"));
		MarkProcess(myForm, request);
		this.markService.selectMarkByCourse(myForm);
		
		return mapping.findForward("gotoMarkFill");
	}
	public void MarkProcess(MarkForm myForm,HttpServletRequest request){
		String type=request.getParameter("frmBtn");
		System.out.println("type : "+type);
	if(type!=null){
		switch(type){
		case "Add Tutorial" :{ 
			int j=0;
	for(int i=0;i<myForm.getFrmNum().size();i=i+5){
	List<Integer> studentNoList=new ArrayList<Integer>();
	studentNoList=this.markService.selectStudentForMarkFill(myForm.getFrmSelectCourse());
	Integer mark=Integer.parseInt(request.getParameter(""+myForm.getFrmNum().get(i)));
	this.markService.addMark(mark,studentNoList.get(j),myForm.getFrmSelectCourse(),"Tuto");
				
				j++;
			}
			
		} break;
		case "Update Tutorial" :{ } break;
		case "Add Assignment" :{
			int j=0;
	for(int i=1;i<myForm.getFrmNum().size();i=i+5){
	List<Integer> studentNoList=new ArrayList<Integer>();
	studentNoList=this.markService.selectStudentForMarkFill(myForm.getFrmSelectCourse());
	Integer mark=Integer.parseInt(request.getParameter(""+myForm.getFrmNum().get(i)));
	this.markService.addMark(mark,studentNoList.get(j),myForm.getFrmSelectCourse()
			,"Assign");
						
						j++;
			}		} break;
		case "Update Assignment" :{ } break;
		case "Add Lab" :{ 
			int j=0;
	for(int i=2;i<myForm.getFrmNum().size();i=i+5){
	List<Integer> studentNoList=new ArrayList<Integer>();
	studentNoList=this.markService.selectStudentForMarkFill(myForm.getFrmSelectCourse());
	Integer mark=Integer.parseInt(request.getParameter(""+myForm.getFrmNum().get(i)));
	this.markService.addMark(mark,studentNoList.get(j),myForm.getFrmSelectCourse()
				,"Lab");							
							j++;
		}	} break;
		case "Update Lab" :{ } break;
		case "Add Exam" :{
			int j=0;
	for(int i=3;i<myForm.getFrmNum().size();i=i+5){
	List<Integer> studentNoList=new ArrayList<Integer>();
	studentNoList=this.markService.selectStudentForMarkFill(myForm.getFrmSelectCourse());
	Integer mark=Integer.parseInt(request.getParameter(""+myForm.getFrmNum().get(i)));
	this.markService.addMark(mark,studentNoList.get(j),myForm.getFrmSelectCourse()
				,"Exam");							
										j++;
		}} break;
		case "Update Exam" :{ } break;
		case "Add Total" :{
			int j=0;
	for(int i=4;i<myForm.getFrmNum().size();i=i+5){
	List<Integer> studentNoList=new ArrayList<Integer>();
	studentNoList=this.markService.selectStudentForMarkFill(myForm.getFrmSelectCourse());
	Integer mark=Integer.parseInt(request.getParameter(""+myForm.getFrmNum().get(i)));
				this.markService.addMark(mark,studentNoList.get(j),myForm.getFrmSelectCourse()
							,"Total");							
										j++;
					
			}} break;
		case "Update Total" :{ } break;
		}
		}
	}

	public void setMarkService(MarkService markService) {
		this.markService = markService;
	}
}
