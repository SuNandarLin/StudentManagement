package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.form.HomeForm;
import com.service.HomeService;

public class HomeAction extends Action {
	HomeService homeService;
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HomeForm myForm=(HomeForm)form;
		if(request.getMethod().toUpperCase().equals("GET")){
			
			System.out.println("Home Action .. . . ");
			return mapping.findForward("gotoHome");
		}else if(request.getMethod().toUpperCase().equals("POST")){
			System.out.println("Home Action .. . .Post ");
			this.homeService.loginCheck(myForm);

		if(myForm.getFrmInvalidUser()==null || myForm.getFrmInvalidUser().isEmpty()){
			System.out.println("Empty ..no error ");
			this.homeService.uploadPermitInfo(myForm);
			return mapping.findForward("gotoHome");
		}else{
			request.setAttribute("frmInvalidUser", myForm.getFrmInvalidUser());
			System.out.println("Not Empty . .");
			return mapping.findForward("gotoLogin");
		}
		}
		return null;
		
	}
	public void setHomeService(HomeService homeService) {
		this.homeService = homeService;
	}

}
