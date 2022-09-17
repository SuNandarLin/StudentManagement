package com.action;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.form.CourseEditForm;
import com.model.CourseModel;
import com.service.MarkService;

public class CourseEditAction extends Action{
	MarkService markService;
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		CourseEditForm myForm=(CourseEditForm) form;
		request.setAttribute("frmSelectCourse", myForm.getFrmSelectCourse());
		this.markService.selectCourseByName(myForm);
		String btnPress= request.getParameter("frmBtn");
		if(btnPress!=null || btnPress=="Update"){
			
			this.markService.updateCoursePercentage(myForm,
					request.getParameter("tutoPercentSpin"),
					request.getParameter("assignPercentSpin"),
					request.getParameter("labPercentSpin"),
					request.getParameter("examPercentSpin"),
					request.getParameter("tutoGivenSpin"),
					request.getParameter("assignGivenSpin"),
					request.getParameter("labGivenSpin"),
					request.getParameter("examGivenSpin"));
		}
		this.markService.selectAllFromCourse(myForm.getFrmSelectCourse());		
		this.markService.selectCourseByName(myForm);
		return mapping.findForward("gotoCourseEdit");
	}

	public void setMarkService(MarkService markService) {
		this.markService = markService;
	}
	

}
