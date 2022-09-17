<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/homeStyle.css" />
<h1>My Home</h1>
 <logic:notEmpty name="homeFormBean" property="frmUserType">
<c:if test="${fn:contains(homeFormBean.frmUserType , 'T')}">
<h2>Account Name : ${homeFormBean.frmUserName }</h2>
<ul>
<li><html:link action="markPath?frmTeacherNo=${homeFormBean.frmTeacherNo }" styleId="submit">
														Mark show</html:link></li>

<li><html:link action="markFillPath?frmTeacherNo=${homeFormBean.frmTeacherNo }" styleId="markFillStyle">
														Mark fill</html:link></li>
<li><html:link action="courseEditPath?frmTeacherNo=${homeFormBean.frmTeacherNo }" styleId="course">
														Course % Edit</html:link></li>
<html:link action="viewInfoPath?frmUserNo=${homeFormBean.frmUserNo}" styleId="view">
											View Student Information</html:link>

<c:if test="${homeFormBean.frmPermitInfo==1}">
<li>
<html:link action="regStuPath?frmUserNo=${homeFormBean.frmUserNo }" styleId="register">
														Register Student</html:link>
</li>
</c:if>
</c:if>

<c:if test="${fn:contains(homeFormBean.frmUserType , 'S')}">
<h3>Account Name : ${homeFormBean.frmUserName }</h3>

<li>
<html:link action="showMarkPath?frmStudentNo=${homeFormBean.frmStudentNo}" styleId="showMark">
Show Mark
</html:link>
</li>

</c:if>
<c:if test="${fn:contains(homeFormBean.frmUserType , 'A')}">
<h3>Account Name : ${homeFormBean.frmUserName }</h3>
<html:link action="adminPath?frmUserNo=${homeFormBean.frmUserNo}">
											Edit Permission</html:link><br>
<html:link action="viewInfoPath?frmUserNo=${homeFormBean.frmUserNo}">
											View Student Information</html:link>											
</c:if>
</logic:notEmpty>

 <li><html:link action="loginActionPath" styleId="logOut">Log Out</html:link></li>
</ul>





