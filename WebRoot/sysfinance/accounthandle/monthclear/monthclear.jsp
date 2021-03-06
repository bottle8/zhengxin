<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/taglib/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/taglib/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/taglib/struts-logic.tld" prefix="logic"%>
<%@ include file="/checkUrl.jsp"%>
<%
String path = request.getContextPath();
%>
<html:html>

<head>
	<title>月结</title>
	<link href="<%=path%>/css/index.css" type="text/css" rel="stylesheet" />
	<SCRIPT language="JAVASCRIPT"
		src="<%=path%>/syscommon/calendar/oa_Popup.js"></SCRIPT>
	<SCRIPT language="JAVASCRIPT">
function isSure(){
	var currentDate = new Date();
	var year = currentDate.getYear();
	var month = currentDate.getMonth() + 1 + "";
	var day = currentDate.getDate();
	if(month.length<2)
		month = "0" + month;
	var date = year + month + day;
  	var credenceDate = "<bean:write name='monthclearAF' property='date' />".substring(0,6);
  	if(date>credenceDate+"26")
  		return confirm("您确认要进行月结?");
  	else{
  		alert("每月26号后才能做月结!");
  		return false;
  	}
}

function reportErrors() {
	<logic:messagesPresent>
	var message = "<html:messages id="error"><bean:write name="error"/></html:messages>"
    if(message=="0"){
    	alert("月结成功！即将重新登录系统！");
    	parent.window.location="<%=path%>/login.jsp";
    }else if(message=="1"){
    	alert("月结失败！");
    }else{
     	alert(message);
    }
	</logic:messagesPresent>
}
</SCRIPT>
</head>

<body topmargin=0 leftmargin=0 onload="reportErrors();">
	<html:form action="/monthclearDoAC.do">
		<div align="center">
			<br>
			<br>
			<br>
			<table width=641 border=0 cellpadding=0 cellspacing=0>
				<tr>
					<td colspan=4 height="32" class="font14"
						background="<%=path%>/img/search_1.jpg" style="PADDING-top: 8px">
						<b>月结</b>
					</td>
				</tr>
				<tr>
					<td rowspan=3>
						<img src="<%=path%>/img/search_2.jpg" width=26 height=325 alt="">
					</td>
					<td colspan=3>
						<img src="<%=path%>/img/search_3.jpg" width=615 height=39 alt="">
					</td>
				</tr>
				<tr>
					<td rowspan=2>
						<img src="<%=path%>/img/search_4.jpg" width=40 height=286 alt="">
					</td>
					<td background="<%=path%>/img/search_5.jpg" height="225"
						valign="top">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<br />
								<br />
								<br />
								<br />
								<td align="center" valign="top"
									style="border-bottom-style: solid; border-bottom-width: 1;border-left-style: solid; border-left-width: 1;border-right-style: solid; border-right-width: 1"
									bordercolor="#2D7DC6">
									<table width="100%" border="0" cellspacing="0" cellpadding="2">
										<tr>
											<td height="1" background="<%=path%>/img/bg_line.gif"
												colspan="7"></td>
										</tr>
										<tr valign=middle>
											<td></td>
											<td></td>
										</tr>
										<tr valign=middle>
											<td></td>
											<td></td>
										</tr>
										<tr valign=middle>
											<td class="td1" align="center">
												<strong><font size="3">业务日期:&nbsp;&nbsp;<bean:write
															name="monthclearAF" property="date"></bean:write>
												</font>
												</strong>
											</td>
										</tr>
										<html:hidden name="monthclearAF" property="date"></html:hidden>
										<tr>
										</tr>
									</table>
									<table width="100%" border="0" cellspacing="1" cellpadding="3"
										bgcolor="66BEE3">
										<tr align="center">
											<td colspan="4" class="td1" height="24">
												<html:submit onclick="return isSure()">月结</html:submit>
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</td>
					<td rowspan=2>
						<img src="<%=path%>/img/search_6.jpg" width=42 height=286 alt="">
					</td>
				</tr>
				<tr>
					<td>
						<img src="<%=path%>/img/search_7.jpg" width=533 height=61 alt="">
					</td>
				</tr>
			</table>
		</div>
	</html:form>
</body>

</html:html>
