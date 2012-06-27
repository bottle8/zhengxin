package org.xpup.hafmis.sysloan.loancallback.loancallback.action; 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
 
public class LoancallbackTbForwardURLWindowAC extends Action {
  
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

    String contractId = request.getParameter("contractId");
    String type = request.getParameter("type");
    String headId = request.getParameter("headId");
    request.setAttribute("contractId", contractId);
    request.setAttribute("type", type);
    request.setAttribute("headId", headId);
    request.getSession().setAttribute(LoancallbackTbShowWindowAC.PAGINATION_KEY, null);
    return mapping.findForward("loancallbackTbShowWindowAC");
  }
}
 