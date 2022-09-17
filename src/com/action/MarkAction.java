package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.form.MarkForm;
import com.service.MarkService;

public class MarkAction extends Action {
	
	MarkService markService;

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		MarkForm myForm=(MarkForm) form;
		this.markService.showCoursesOfTeacher(myForm);
		
		if(myForm.getFrmSelectCourse()!=null){
			System.out.println("Line 25 ");
		this.markService.selectMarkByCourse(myForm);
		}
		request.setAttribute("frmSelectCourse", myForm.getFrmSelectCourse());
		request.setAttribute("frmCourseList", myForm.getFrmCourseList());
		return mapping.findForward("gotoMark");
	}

	public void setMarkService(MarkService markService) {
		this.markService = markService;
	}
}
