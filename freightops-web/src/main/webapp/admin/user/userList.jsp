
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<script type="text/javascript">
function checkAllElements(form, isChecked) { 
	for(var i = 0; i < form.length; i++){
        if(form[i].type == 'checkbox')
        	form[i].checked = isChecked;
    }
}
</script>
<s:form id="userList" action="userList.action">
<table width="100%" border="0">
	<tr>
		<td align="left" valign="top" width="240">
			 <s:include value="userNavbar.jsp" />
		</td>		
		<td valign="top">
		
			<table width="100%" border="0" cellspacing="1" cellpadding="3" align="center" class="box">
				<tr class="header">
				    <td colspan="6">Search</td>
				</tr>
				<tr class="cell">
				    <td><s:textfield theme="simple" key="Search" name="userName"/></td>
				    <td align="right" width="60">Filter by:</td>
				    <td><s:select theme="simple" name="criteria1" list="{'--Select--','--User Type--','--Group--','--Name--','--Status--'}"/></td>
				    <td><s:select theme="simple" name="criteria2" list="{'--Select--','--User Type--','--Group--','--Name--','--Status--'}"/></td>
				    <td><s:select theme="simple" name="criteria3" list="{'--Select--','--User Type--','--Group--','--Name--','--Status--'}"/></td>
				    <td><s:select theme="simple" name="criteria4" list="{'--Select--','--User Type--','--Group--','--Name--','--Status--'}"/></td>
				</tr>
			</table>	
			<br/>
			<table width="100%" border="1" cellspacing="1" cellpadding="3" align="center" class="box">
				<tr class="header">
					<td>User List</td>
				</tr>
				<tr class="cell"> <td>
			<table width="100%" border="1" cellspacing="1" cellpadding="3" align="center" class="box">
				<tr class="header">
				    <td><s:checkbox theme="simple" id ="checkAll" name="checkAll" onchange="checkAllElements(document.forms.userList,this.checked)"/></td>
				    <td>User Type</td>
				    <td>Company Name</td>
				    <td>Name</td>
				    <td><s:text name="ui.user.name"/></td>
				    <td align="center"><s:text name="ui.user.email"/></td>
					<td>Group</td>
					<td>Status</td>
				</tr>
				<tr class="cell">				
					<s:if test="users == null">					
						    <td><s:text name="ui.user.empty"/></td>
						    <td>&nbsp;</td>
						    <td>&nbsp;</td>
						    <td>&nbsp;</td>
						    <td>&nbsp;</td>
						    <td>&nbsp;</td>
						    <td>&nbsp;</td>
						    <td>&nbsp;</td>
					</s:if>
					<s:else>
						<s:iterator value="users">						
							    <td><s:checkbox theme="simple" id ="checkbox" name="checkbox" fieldValue="%{id}"/></td>
							    <td><s:property value="type"/></td>
							    <td><s:property value="customer.companyName"/></td>
							    <td><s:property value="name"/></td>
							    <td><s:property value="username"/></td>
							    <td><a href="mailto:<s:property value="email"/>"><s:property value="email"/></a></td>
							    <td><s:property value="group.groupName"/></td>
							    <td><s:property value="status"/></td>
						</s:iterator>
					</s:else>
				</tr>		
			</table>
					
			<table align="center">
				<tr>
					<s:submit theme="simple" method="addUser" key="Add" cssClass="stdbutton" />
					<s:submit theme="simple" method="editUser" key="Edit" cssClass="stdbutton" />
					<s:submit theme="simple" method="deleteUser" key="Delete" cssClass="stdbutton" />
				</tr>
			</table>
			</td></tr>		
		</td>
	</tr>
</table>
</s:form>
