/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package org.xpup.hafmis.sysfinance.bookmng.credencemodle.action;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * MyEclipse Struts Creation date: 10-20-2007 XDoclet definition:
 * 
 * @struts.action validate="true"
 */
public class CredencemodleFindAAC extends Action {
  /*
   * Generated Methods
   */

  /**
   * Method execute
   * 
   * @param mapping
   * @param form
   * @param request
   * @param response
   * @return ActionForward
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form,
      HttpServletRequest request, HttpServletResponse response) {
    try {
      response.setContentType("text/xml; charset=utf-8");
      PrintWriter out = response.getWriter();
      out.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
      out.println("<options>");
      String bizType = (String) request.getParameter("bizType");
      if ("1".equals(bizType)) {
        out.println("<value>" + "1" + "</value>");
        out.println("<text>" + "������_�ɴ���" + "</text>");
      }
      if ("2".equals(bizType)) {
        out.println("<value>" + "2" + "</value>");
        out.println("<text>" + "������_��ȡ���" + "</text>");
      }
      if ("3".equals(bizType)) {
        out.println("<value>" + "2" + "</value>");
        out.println("<text>" + "������_��ȡ���" + "</text>");
        out.println("<value>" + "3" + "</value>");
        out.println("<text>" + "������_������Ϣ" + "</text>");
      }
      if ("4".equals(bizType)) {
        out.println("<value>" + "4" + "</value>");
        out.println("<text>" + "������_ת�����" + "</text>");
        out.println("<value>" + "6" + "</value>");
        out.println("<text>" + "������_ת����Ϣ" + "</text>");
      }
      if ("5".equals(bizType)) {
        out.println("<value>" + "5" + "</value>");
        out.println("<text>" + "������_ת����" + "</text>");
      }
      if ("6".equals(bizType)) {
        out.println("<value>" + "4" + "</value>");
        out.println("<text>" + "������_ת�����" + "</text>");
      }
      if ("7".equals(bizType)) {
        out.println("<value>" + "5" + "</value>");
        out.println("<text>" + "������_ת����" + "</text>");
      }
      if ("8".equals(bizType)) {
        out.println("<value>" + "4" + "</value>");
        out.println("<text>" + "������_ת�����" + "</text>");
        out.println("<value>" + "5" + "</value>");
        out.println("<text>" + "������_ת����" + "</text>");
      }
      if ("9".equals(bizType)) {
        out.println("<value>" + "8" + "</value>");
        out.println("<text>" + "������_���˽��" + "</text>");
      }
      if ("10".equals(bizType)) {
        out.println("<value>" + "8" + "</value>");
        out.println("<text>" + "������_���˽��" + "</text>");
      }
      if ("11".equals(bizType)) {
        out.println("<value>" + "7" + "</value>");
        out.println("<text>" + "������_��Ϣ��Ϣ" + "</text>");
      }
      if ("12".equals(bizType)) {
        out.println("<value>" + "1" + "</value>");
        out.println("<text>" + "������_�ɴ���" + "</text>");
      }
      if ("13".equals(bizType)) {
        out.println("<value>" + "1" + "</value>");
        out.println("<text>" + "������_�ɴ���" + "</text>");
      }
      // �����𻹴�
      if ("23".equals(bizType)) {
        out.println("<value>" + "12" + "</value>");
        out.println("<text>" + "����_������������" + "</text>");
        out.println("<value>" + "13" + "</value>");
        out.println("<text>" + "����_�������ڱ���" + "</text>");
        out.println("<value>" + "14" + "</value>");
        out.println("<text>" + "����_������Ϣ" + "</text>");
        out.println("<value>" + "20" + "</value>");
        out.println("<text>" + "����_���շ�Ϣ" + "</text>");
        out.println("<value>" + "16" + "</value>");
        out.println("<text>" + "����_���˽��" + "</text>");
        out.println("<value>" + "19" + "</value>");
        out.println("<text>" + "ʵ�ս��" + "</text>");
        out.println("<value>" + "21" + "</value>");
        out.println("<text>" + "��ȡ���" + "</text>");
      }
      if ("21".equals(bizType)) {
        out.println("<value>" + "11" + "</value>");
        out.println("<text>" + "����_���Ž��" + "</text>");
      }
      if ("22".equals(bizType)) {
        out.println("<value>" + "12" + "</value>");
        out.println("<text>" + "����_������������" + "</text>");
        out.println("<value>" + "13" + "</value>");
        out.println("<text>" + "����_�������ڱ���" + "</text>");
        out.println("<value>" + "14" + "</value>");
        out.println("<text>" + "����_������Ϣ" + "</text>");
        out.println("<value>" + "20" + "</value>");
        out.println("<text>" + "����_���շ�Ϣ" + "</text>");
        out.println("<value>" + "16" + "</value>");
        out.println("<text>" + "����_���˽��" + "</text>");
        out.println("<value>" + "19" + "</value>");
        out.println("<text>" + "ʵ�ս��" + "</text>");
      }
      out.println("</options>");
      out.flush();
      out.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}