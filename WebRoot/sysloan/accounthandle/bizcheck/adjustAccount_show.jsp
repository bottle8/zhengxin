<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/WEB-INF/taglib/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/taglib/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/taglib/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/taglib/struts-nested.tld" prefix="nested"%>
<%@ taglib uri="/WEB-INF/taglib/xpup-security.tld" prefix="security"%>
<%@ include file="/checkUrl.jsp"%>
<%
String path = request.getContextPath();
%>

<html:html>
<head>
	<title>个贷管理</title>
	<link rel="stylesheet" href="<%=path%>/css/index.css" type="text/css">
	<script language="javascript" src="<%=path%>/js/common.js">	
</head>
<script language="javascript"></script>
<script language="javascript" src="<%=path%>/js/common.js"></script>
<script language="javascript">
function gotos(){
	window.location.href='adjustAccountWindowPrinAC.do';
}
</script>
<body bgcolor="#FFFFFF" text="#000000" 
	onContextmenu="return false">
	<table width="95%" border="0" cellspacing="0" cellpadding="0"
		align="center">
		<tr>
			<td>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="7">
							<img src="/hafmis/img/table_left.gif" width="7" height="37">
						</td>
						<td background="/hafmis/img/table_bg_line.gif" width="55">
							&nbsp;
						</td>
						<td background="/hafmis/img/table_bg_line.gif">
							<table border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td width="112" height="37" align="center" valign="top"
										style="PADDING-top: 7px"></td>
									<td width="112" height="37" align="center"
										style="PADDING-top: 7px" valign="top"></td>
								</tr>
							</table>
						</td>
						<td background="/hafmis/img/table_bg_line.gif" align="right">
							<table width="300" border="0" cellspacing="0" cellpadding="0">
							</table>
						</td>
						<td width="9">
							<img src="/hafmis/img/table_right.gif" width="9" height="37">
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td class=td3>
				<table width="95%" border="0" cellspacing="0" cellpadding="3"
					align="center">
					<tr valign="bottom">
						<td height="35">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td height="22" bgcolor="#CCCCCC" align="center" width="197">
										<b class="font14">错账调整信息</b>
									</td>
									<td width="728" height="22" align="center"
										background="/hafmis/img/bg2.gif">
										&nbsp;
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="95%" border="0" cellspacing="0" cellpadding="3"
					align="center">
					<tr valign="bottom">
						<td colspan="7" bgcolor="#FFFFFF" align="center" height="30">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<logic:notEmpty name="adjustAccountDTO">
									<tr>
										<td width="17%" class="td1">
											错账凭证编号
										</td>
										<td width="33%" colspan="2">
											<html:text name="adjustAccountDTO" property="docNum"styleClass="input3" readonly="true"/></td>
										<td width="17%" class="td1">
											扣款账号
										</td>
										<td width="33%">
											<html:text name="adjustAccountDTO" property="loanKouAcc"styleClass="input3" readonly="true"/></td>
									</tr>
									<tr>
										<td width="17%" class="td1">
											业务类型
										</td>
										<td width="33%" colspan="2">
											<html:text name="adjustAccountDTO" property="bizType"styleClass="input3" readonly="true"/></td>
										<td width="17%" class="td1">
											发放金额
										</td>
										<td width="33%">
											<html:text name="adjustAccountDTO" property="occurMoney"styleClass="input3" readonly="true"/></td>
									</tr>
									<tr>
										<td width="17%" class="td1">
											回收本金
										</td>
										<td width="33%" colspan="2">
											<html:text name="adjustAccountDTO" property="reclaimCorpus"styleClass="input3" readonly="true"/></td>
										<td width="17%" class="td1">
											回收利息
										</td>
										<td width="33%">
											<html:text name="adjustAccountDTO" property="reclaimAccrual"styleClass="input3" readonly="true"/></td>
									</tr>
									<tr>
										<td width="17%" class="td1">
											逾期利息
										</td>
										<td width="33%" colspan="2">
											<html:text name="adjustAccountDTO" property="realPunishInterest"styleClass="input3" readonly="true"/></td>
										<td width="17%" class="td1">
											借款人姓名
										</td>
										<td width="33%">
											<html:text name="adjustAccountDTO" property="borrowerName"styleClass="input3" readonly="true"/></td>
									</tr>
								</logic:notEmpty>
								<logic:empty name="adjustAccountDTO">
									<tr>
										<td colspan="9" height="30" style="color:red">
											没有找到与条件相符合的结果！
										</td>
									</tr>
									<tr>
										<td colspan="9" class=td5></td>
									</tr>
								</logic:empty>
							</table>
									<table width="95%" border="0" cellspacing="0" cellpadding="3"
					align="center">
					<tr valign="bottom">
						<td colspan="7" bgcolor="#FFFFFF" align="center" height="30">
							<table border="0" cellspacing="0" cellpadding="0">
							<logic:notEmpty name="adjustAccountDTO" >
								<tr>
									<td width="69" align="right">
										<html:submit property="print" styleClass="buttona" onclick="gotos();">
											<bean:message key="button.print" />
										</html:submit>
									</td>
									<td>
									<input type="button" name="Submit2" value="关闭" class="buttona"
											onClick="window.close();">
									</td>
									
								</tr>
							</logic:notEmpty>
							 <logic:empty name="adjustAccountDTO" >
								<tr>
									<td width="69" align="right">
										<html:submit property="print" styleClass="buttona" disabled="true">
											<bean:message key="button.print" />
										</html:submit>
									</td>
									<td>
										<input type="button" name="Submit2" value="关闭" class="buttona"
											onClick="window.close();">
									</td>
									
								</tr>
							</logic:empty>
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</body>
</html:html>
