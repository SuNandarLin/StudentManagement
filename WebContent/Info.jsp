<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/infoStyle.css" />
<h1> Student Information </h1> 
<p> User: ${homeFormBean.frmUserName } </p>
<html:form action="viewInfoPath">
<logic:notEmpty name="regFormBean" property="frmRollList">
<html:select name="regFormBean" property="frmRollNo">
<logic:iterate id="rollid" collection="${regFormBean.frmRollList}">
	<html:option value="${rollid}"/>
</logic:iterate>
</html:select>
</logic:notEmpty>
<html:submit value="REFRESH" styleId="submit"/><br>
<c:if test="${regFormBean.frmRollNo!=null }">
<center>
<p> Name 	: ${regFormBean.frmStudentName}</p>
<p>Roll No : ${regFormBean.frmStudentRoll} </p>
<p>Batch	: ${regFormBean.frmStudentBat} </p>
<p>Guardian: ${regFormBean.frmStudentGau} </p>
<p>Birth Date:${regFormBean.frmStudentBirth} </p>
<p>Address : ${regFormBean.frmStudentAdd} </p>
<p>Phone No.  : ${regFormBean.frmStudentPh}  </p>
</center>
</c:if>

</html:form>
<html:link action="homePath" styleId="reback">Go to Home</html:link>
