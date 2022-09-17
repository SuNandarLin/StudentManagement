package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.form.RegForm;
import com.service.RegService;

public class AdminAction extends Action{
	RegService regService;

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		RegForm myForm=(RegForm)form;
		this.regService.uploadAllTeacher(myForm);
		updateInfo(request,myForm);
		this.regService.uploadAllTeacher(myForm);
		
		return mapping.findForward("gotoAdmin");
	}
	public void updateInfo(HttpServletRequest request,RegForm myForm){
		int size=myForm.getFrmTeacherPermit().size();
		if(request.getParameter("frmUpBtn") !=null ||
				request.getParameter("frmUpBtn")=="Upload" ){
		for(int i=0;i<size;i++){
			if(request.getParameter((""+i))!=null)
			myForm.getFrmTeacherPermit().get(i).setPermitStuInfo(1);
			else
			myForm.getFrmTeacherPermit().get(i).setPermitStuInfo(0); 
		}
		}

		this.regService.updatePermit(myForm);
	}

	public void setRegService(RegService regService) {
		this.regService = regService;
	}

}

