<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

<html>
<head>
<link rel="stylesheet" type="text/css" href="styles/style.css">
<link rel="stylesheet" type="text/css" href="styles/table.css">
</head>
<body leftMargin="0" topMargin="0" marginheight="0" marginwidth="0">

	<table width="100%" border="0" align="center">
		<tr class="logo">
			<td width="1%"><img src="images/ernest-logo_2.png"></td>
			<td align="right" valign="top">
				<table width="1%">
					<tr>
						<td nowrap align="right"><font class="welcomeItem"> 
							<s:text name="ui.welcome" />,&nbsp;<s:if test='%{#session.USER != null}'><s:property value="name" /></s:if><s:else>Guest</s:else>&nbsp;&nbsp;</a> 
							<s:if test='%{#session.USER == null}'><a href="<s:url action="loginLink"/>" class="welcomeItem"> <s:text name="ui.user.login" /> </a></s:if>
							<s:else><a href="<s:url action="logout.action"/>" class="welcomeItem"> <s:text name="ui.user.logout" /> </a></s:else>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</html>
