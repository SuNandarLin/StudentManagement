package com.action;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.form.RegForm;
import com.service.RegService;

public class AdminRegAction extends Action{
	RegService regService;

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		RegForm myForm=(RegForm)form;
		this.regService.registerTeacher(myForm);
	//	this.regService.loadAdminUserName(myForm);
		return mapping.findForward("gotoAdmin");
	}
	

	public void setRegService(RegService regService) {
		this.regService = regService;
	}

}

