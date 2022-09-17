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
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/showMarkStyle.css" />
<h1> Show Mark </h1>
<h3>User : ${showMarkFormBean.frmUserName } </h3>
<html:form action="/showMarkPath">
<logic:notEmpty name="showMarkFormBean" property="frmSemList">
<html:select name="showMarkFormBean" property="frmSem">
<logic:iterate id="sid" collection="${showMarkFormBean.frmSemList}">
	<html:option value="${sid}"/>
</logic:iterate>
</html:select>
</logic:notEmpty>
<html:submit value="REFRESH"  styleId="refresh"/>
<logic:notEmpty name="showMarkFormBean" property="frmShowList">
<div class="container">
<table class="table table-striped">
	<thead>
	<tr><th>No</th>
		<th>Course Name</th>
		<th>Tutorial</th>
		<th>Assignment</th>
		<th>Lab/Practical</th>
		<th>Exam</th>
		<th>Total Mark</th>
		<th>Result</th>
	</tr>
	</thead>
	<logic:iterate id="shid"  collection="${showMarkFormBean.frmShowList}" indexId="i">
	<tbody>
		<tr>
			<td>${i+1}</td>
			<td>${shid.name}</td>
			<td>${shid.tutoMark}</td>
			<td>${shid.assignMark}</td>
			<td>${shid.labMark}</td>
			<td>${shid.examMark}</td>
			<td>${shid.totalMark}</td>
			<td>${shid.result}</td>
					
		</tr>
	</tbody>
	</logic:iterate>
</table>
</div>
</logic:notEmpty>
</html:form>
<html:link action="homePath" styleId="reback">Go To Home</html:link>