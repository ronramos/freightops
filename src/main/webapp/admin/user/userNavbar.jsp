<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s"%>

<table width="100%" border="0" cellspacing="1" cellpadding="3" align="center" class="box">
	<tr class="header">
	    <td><s:text name="ui.user.admin"/></td>
	</tr>
	<tr class="cell">
		<td>&nbsp;<img src="images/bullet_red.gif">&nbsp;<a href="<s:url action="userList.action"/>"><s:text name="ui.user.view"/></a></td>
	</tr>
	<tr class="cell">
	    <td>&nbsp;<img src="images/bullet_red.gif">&nbsp;<a href="<s:url action="userCreateLink"/>"><s:text name="ui.user.create"/></a></td>
	</tr>
	<tr class="cell">
	    <td>&nbsp;<img src="images/bullet_red.gif">&nbsp;<a href="<s:url action="groupListLink"/>"><s:text name="ui.group.view"/></a></td>
	</tr>
	<tr class="cell">
	    <td>&nbsp;<img src="images/bullet_red.gif">&nbsp;<a href="<s:url action="groupCreateLink"/>"><s:text name="ui.group.create"/></a></td>
	</tr>
</table>
