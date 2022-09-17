package com.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.form.ShowMarkForm;
import com.service.MarkService;

public class ShowMarkAction extends Action {
	
	MarkService markService;

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ShowMarkForm myForm=(ShowMarkForm) form;
		this.markService.selectSemester(myForm);
		this.markService.selectForShow(myForm);
		return mapping.findForward("gotoShowMark");
	}

	public void setMarkService(MarkService markService) {
		this.markService = markService;
	}
}
