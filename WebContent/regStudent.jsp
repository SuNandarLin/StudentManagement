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
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/registerStyle.css" />
<h3>User : ${regFormBean.frmUserName } </h3>
<h1>Register Student</h1> 

<html:form action="regStuPath" styleClass="registerForm">
	<p> Name 	   :&emsp;&emsp; <html:text property="frmStudentName" value=""  styleId="styleForm"/></p>
	<p>Password   :&nbsp;<html:password property="frmStudentPassword" value="" styleId="styleForm"/></p>
	<p>Roll No     : &nbsp;&nbsp;&nbsp;&nbsp;<html:text property="frmStudentRoll" value="" styleId="styleForm"/></p>
	<p>Batch	   : &emsp;&emsp;<html:text property="frmStudentBat" value="" styleId="styleForm"/></p>
	<p>Birth Date  : <html:text property="frmStudentBirth" value="" styleId="styleForm"/></p>
	<p>Address     : &nbsp;&nbsp;&nbsp;<html:text property="frmStudentAdd" value="" styleId="styleForm"/></p>
	<p>Phone No    : &nbsp;<html:text property="frmStudentPh" value="" styleId="styleForm"/></p>
	<p>Guardian    : &nbsp;&nbsp;<html:text property="frmStudentGau" value="" styleId="styleForm"/></p>
	
	<html:submit property="regBtn" value="Register" styleId="reback"/><br>	
</html:form>
<c:if test="${frmMsg!=null}">
		<font color='pink'>${frmMsg}</font>
	</c:if>
<html:link action="homePath" styleId="gotohome">Home</html:link>