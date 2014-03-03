<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

	<br>
	<br>
	<table border="0" cellspacing="1" cellpadding="3"
		class="box" align="center">
		<div align="center">
			<s:actionerror cssClass="error_text" />
			<s:actionmessage cssClass="error_text" />
		</div>
		<tr class="header">
			<td>&nbsp;<s:text name="ui.user.login" />
			</td>
		</tr>
		<tr class="cell">
			<td>
				<table border="0" width="90%" cellspacing="5" cellpadding="5"
					align="center">


					<s:form action="login.action" method="post">
						<tr>
							<td nowrap><s:textfield name="username" key="label.username"
									size="20" cssClass="stdedit" cssErrorClass="error_text" />
							</td>
						</tr>
						<tr>
							<td nowrap><s:password name="password" key="label.password"
									size="20" cssClass="stdedit" cssErrorClass="error_text" />
							</td>
						</tr>
						<tr>
							<td><s:checkbox cssClass="stdedit" name="autoLogin" id="rem"
									key="ui.user.login.auto" />
							</td>
						</tr>
						<tr>
							<td><s:submit method="execute" key="label.login"
									align="left" cssClass="stdbutton" />
							</td>
						</tr>
						<tr>
							<td><a href="<s:url action="forgotPasswordLink"/>"><s:text
										name="ui.user.password.forgot" />
							</a>
							</td>
						</tr>
					</s:form>
				</table> <br>
				<!-- table align="center" border="0" width="90%" cellspacing="5"
					cellpadding="5">
					<tr>
						<td align="center" colspan="2"><s:text
								name="ui.user.not_member" /><a
							href="<s:url action="registerLink"/>"><s:text
									name="ui.user.register_now" />!</a><br></td>
					</tr>
				</table> -->
			</td>
		</tr>
	</table>
	<br>
	<br>
