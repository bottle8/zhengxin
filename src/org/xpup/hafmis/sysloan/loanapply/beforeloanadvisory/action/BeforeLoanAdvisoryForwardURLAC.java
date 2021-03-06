package org.xpup.hafmis.sysloan.loanapply.beforeloanadvisory.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.xpup.hafmis.sysloan.loanapply.beforeloanadvisory.form.BeforeLoanAdvisoryShowAF;

public class BeforeLoanAdvisoryForwardURLAC extends Action {
  public static final String PAGINATION_KEY = "org.xpup.hafmis.sysloan.loanapply.beforeloanadvisory.action.BeforeLoanAdvisoryShowAC";
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
    
    request.getSession().setAttribute("type", "");
    request.getSession().setAttribute(PAGINATION_KEY, null);
    return  mapping.findForward("to_beforeLoanAdvisoryShow");
    
    
  }
  
}
