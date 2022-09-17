<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="bootstrap.min.css">
<script src="jquery.min.js"></script>
<script src="bootstrap.min.js"></script>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/adminPermit.css" />
<p> User: ${homeFormBean.frmUserName } </p>
<h1>Register Teacher</h1>
 <html:form action="adminPath1">
 	<p> User Name : &nbsp;&nbsp;<html:text property="frmTeacherUserName" value=""  styleId="userName"/></p>
 	<p>Password  : &nbsp;&nbsp;&nbsp;&nbsp;<html:password property="frmTeacherPassword" value="" styleId="password"/></p>
 <html:submit value="Register" />
 </html:form>
 <h3 align="center">Admin Permit</h3>
 <html:form action="adminPath">
<div class="container">
<table class="table table-striped">
	<thead>
	<tr>
		<th>No</th>
		<th>Teacher Name</th>
		<th>Permission for student info</th>
	</tr>
	</thead>
	<logic:iterate id="tid"  collection="${regFormBean.frmTeacherPermit}" indexId="i">
	<tbody>
		<tr>
		<td>${i+1}</td>
		<td>${tid.teacherName }</td>
		<td> <c:if test="${tid.permitStuInfo==0}">
		<input type="checkbox"  name="${i }" />
		</c:if>
		<c:if test="${tid.permitStuInfo==1}">
		<% System.out.println("One"); %>
		<input type="checkbox" name="${i }" checked="checked"/>
		</c:if>  </td>
		</tr>
		</tbody>
		</logic:iterate>
		</table>
		<html:submit property='frmUpBtn' value='Upload' styleId="refresh"/>
</div>
</html:form>
<html:link action="homePath" styleId="reback">Go To Home</html:link>
