<%@ taglib uri="/struts-tags" prefix="s"%>

<table width="540" border="0" align="center">
	<tr>
		<td align="left" valign="top">
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
		</td>
		<td align="left" valign="top" rowspan="2">
			<table width="100%" border="0" cellspacing="1" cellpadding="3" align="center" class="box">
				<tr class="header">
				    <td><s:text name="ui.setting.admin"/></td>
				</tr>
				<tr class="cell">
				    <td>&nbsp;<img src="images/bullet_red.gif">&nbsp;<a href="<s:url action="generalSettingViewLink"/>"><s:text name="ui.setting.general"/></a></td>
				</tr>			
				<tr class="cell">
				    <td>&nbsp;<img src="images/bullet_red.gif">&nbsp;<a href="<s:url action="skinSettingViewLink"/>"><s:text name="ui.setting.skin"/></a></td>
				</tr>
				<tr class="cell">
				    <td>&nbsp;<img src="images/bullet_red.gif">&nbsp;<a href="<s:url action="mailSettingViewLink"/>"><s:text name="ui.setting.email"/></a></td>
				</tr>
				<tr class="cell">
				    <td>&nbsp;<img src="images/bullet_red.gif">&nbsp;<a href="<s:url action="databaseSettingViewLink"/>"><s:text name="ui.setting.database"/></a></td>
				</tr>
			</table>
		</td>
	</tr>

</table>