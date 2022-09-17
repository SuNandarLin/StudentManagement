<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/custom.css" />
<h1>Student Management System</h1>

<body>
 <div class="loginbox">
 <img src="userphoto1.jpg" class="userPhoto">
 <h3>Login here</h3>
 <html:form action="homePath" method="post">
 	<p>User Name: </p>
 	<html:text property="frmUserName" value="" styleId="userName"/>
 	<p>Password: </p>
 	<html:password property="frmPassword" value="" styleId="password"/>		<br><br><br>
 	<html:submit value="Login"  styleId="submit"/>
 		
 </html:form> 
 <c:if test="${frmInvalidUser!=null}">
 		<font color="red">${frmInvalidUser}</font>
 </c:if>
 </div>
 </body>