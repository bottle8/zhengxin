package org.xpup.hafmis.syscollection.querystatistics.baseinfosearch.empbaseexport.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.xpup.hafmis.syscollection.querystatistics.baseinfosearch.empbaseexport.form.EmpBaseExportsAF;

public class EmpBaseExportsForwardAC extends Action {
  public ActionForward execute(ActionMapping mapping, ActionForm form,
      HttpServletRequest request, HttpServletResponse response) {
    request.setAttribute("empBaseExportsAF", new EmpBaseExportsAF());
    return mapping.findForward("empbaseexport");
  }
}