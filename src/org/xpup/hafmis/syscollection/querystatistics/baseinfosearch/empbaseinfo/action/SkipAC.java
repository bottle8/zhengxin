/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.xpup.hafmis.syscollection.querystatistics.baseinfosearch.empbaseinfo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.xpup.hafmis.common.form.IdAF;
import org.xpup.hafmis.syscollection.common.domain.entity.Emp;

/** 
 * MyEclipse Struts
 * Creation date: 07-31-2007
 * XDoclet definition:
 * @struts.action path="/skipAC" name="idAF" scope="request" validate="true"
 */
public class SkipAC extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		IdAF idAF = (IdAF) form;
    //��������������� ����õ��ǽű�ֱ��������������
//    System.out.println("���ݹ�����ְ��Id"+idAF.getId());
		return null;
	}
}