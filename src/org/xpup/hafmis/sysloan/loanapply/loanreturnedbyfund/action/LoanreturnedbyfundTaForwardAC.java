/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.xpup.hafmis.sysloan.loanapply.loanreturnedbyfund.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.xpup.hafmis.sysloan.loanapply.loanreturnedbyfund.form.LoanreturnedbyfundTaAF;

/** 
 * MyEclipse Struts
 * Creation date: 10-19-2007
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class LoanreturnedbyfundTaForwardAC extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
    LoanreturnedbyfundTaAF loanreturnedbyfundTaAF =new LoanreturnedbyfundTaAF();
    request.getSession().setAttribute("contractId", null);
    request.getSession().setAttribute("office", null);
    request.getSession().removeAttribute("empinfoDto");
    request.getSession().removeAttribute("empinfoDto_s");
    request.getSession().removeAttribute("empinfoDto_sa");
    request.getSession().removeAttribute("empinfoDto_sb");
     loanreturnedbyfundTaAF.reset();
    request.setAttribute("new", "1");
		return mapping.findForward("to_showloanreturnedbyfundTa");
	}
}