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
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/markShowStyle.css" />
<h1>mark</h1>
<p>User : ${markFormBean.frmUserName } </p>
<html:form action="markPath">
<logic:notEmpty name="markFormBean" property="frmCourseList">
<html:select name="markFormBean" property="frmSelectCourse">
<logic:iterate id="cid" collection="${markFormBean.frmCourseList}">
	<html:option value="${cid}"/>
</logic:iterate>
</html:select>
</logic:notEmpty>
<html:submit value="Show Form" styleId="reback"/>
<c:if test="${frmSelectCourse!=NULL}">
<br> <p>Course   : ${frmSelectCourse} </p>
<br> <p>Semester : ${markFormBean.frmSemName} </p>

 <logic:notEmpty name="markFormBean" property="frmMarkProcessFrmList">
 <div class="container">
<table class="table table-striped">
	<thead>
		<tr>
			<th>No</th>
			<th>Roll No</th>
			<th>Name</th>
			<th>Tutorial</th>
			<th>Assignment</th>
			<th>Lab/Practical</th>
			<th>Exam</th>
			<th>Total Mark</th>
			<th>Result</th>
		</tr>
	</thead>
	<logic:iterate id="mid"  collection="${markFormBean.frmMarkProcessFrmList}" indexId="i">
		<tbody>
			<tr>
				<td>${i+1}</td>
				<td>${mid.rollNo}</td>	
				<td>${mid.name}</td>
				<td>${mid.tutoMark}</td>
				<td>${mid.assignMark}</td>
				<td>${mid.labMark}</td>
				<td>${mid.examMark}</td>
				<td>${mid.totalMark}</td>
				<td>${mid.result}</td>
			</tr>
		</tbody>
	</logic:iterate>
</table>
</div>
</logic:notEmpty>
 </c:if>
</html:form> 
 <html:link action="homePath" styleId="reback">Go To Home</html:link>





 
 