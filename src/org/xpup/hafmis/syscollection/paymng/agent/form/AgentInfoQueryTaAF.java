/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.xpup.hafmis.syscollection.paymng.agent.form;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 12-19-2007
 * 
 * XDoclet definition:
 * @struts.form name="agentInfoQueryTaAF"
 */
public class AgentInfoQueryTaAF extends ActionForm {
	/*
	 * Generated fields
	 */
  private static final long serialVersionUID = 1L;

  /** payMonth property */
	private String payMonth = "";

	/** payId property */
	private String payId = "";
  
  private List list = new ArrayList();

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the payMonth.
	 * @return String
	 */
	public String getPayMonth() {
		return payMonth;
	}

	/** 
	 * Set the payMonth.
	 * @param payMonth The payMonth to set
	 */
	public void setPayMonth(String payMonth) {
		this.payMonth = payMonth;
	}

	/** 
	 * Returns the payId.
	 * @return String
	 */
	public String getPayId() {
		return payId;
	}

	/** 
	 * Set the payId.
	 * @param payId The payId to set
	 */
	public void setPayId(String payId) {
		this.payId = payId;
	}

  public List getList() {
    return list;
  }

  public void setList(List list) {
    this.list = list;
  }
}