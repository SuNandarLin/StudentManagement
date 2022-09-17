<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*" %>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="bootstrap.min.css">
<script src="jquery.min.js"></script>
<script src="bootstrap.min.js"></script>
<link type="text/css" rel="stylesheet" 
	href="${pageContext.request.contextPath}/markFillStyle.css" />
<h1>Mark Fill</h1>
<body>
<p>User : ${markFormBean.frmUserName } </p>
<html:form action="markFillPath">
<% System.out.println("Action =markFillPath"); %>
<logic:notEmpty name="markFormBean" property="frmCourseList">
<html:select name="markFormBean" property="frmSelectCourse">
<logic:iterate id="cid" collection="${markFormBean.frmCourseList}">
	<html:option value="${cid}"/>
</logic:iterate>
</html:select>
<% System.out.println("frmSelectCourse selecting"); %>
</logic:notEmpty>
<html:submit value="REFRESH" styleId="reback"/>
<c:if test="${frmSelectCourse!=NULL}">
<br> <p>Course   :  ${frmSelectCourse}	</p>
<br> <p>Semester : ${markFormBean.frmSemName}	</p>

 <logic:notEmpty name="markFormBean" property="frmMarkProcessFrmList">
 <div class="container">
 <table class="table table-striped">
	<thead>
		<tr>
			<th>No</th>
			<th>Roll No</th>
			<th>Name</th>
			<th>Tutorial </th>
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
			
			<td><c:if test="${mid.tutoMarkSpin==null}">
			${mid.tutoMark}
			<c:set var="frmBtnTuto" value="Disappear"/>
			</c:if>
			<c:if test="${mid.tutoMarkSpin!=null}">
			<input type="number" name="${mid.tutoMarkSpin}" 
			min="0" max="${markFormBean.frmTutoGiven}" step="1" value="0" style="width: 3em"/>
			<c:set var="frmBtnTuto" value="Add Tutorial"/>			
			</c:if></td>
			
			<td><c:if test="${mid.assignMarkSpin==null}">
			${mid.assignMark}
			<c:set var="frmBtnAssign" value="Disappear"/>
			</c:if>
			<c:if test="${mid.assignMarkSpin!=null}">
			<input type="number" name="${mid.assignMarkSpin}" 
			min="0" max="${markFormBean.frmAssignGiven}" step="1" value="0" style="width: 3em"/>	
			<c:set var="frmBtnAssign" value="Add Assignment"/>		
			</c:if></td>
			
			<td><c:if test="${mid.labMarkSpin==null}">
			${mid.labMark}
			<c:set var="frmBtnLab" value="Disappear"/>
			</c:if>
			<c:if test="${mid.labMarkSpin!=null}">
			<input type="number" name="${mid.labMarkSpin}" 
			min="0" max="${markFormBean.frmLabGiven}" step="1" value="0" style="width: 3em"/>					
			<c:set var="frmBtnLab" value="Add Lab"/>
			</c:if></td>
			
			<td><c:if test="${mid.examMarkSpin==null}">
			${mid.examMark}
			<c:set var="frmBtnExam" value="Disappear"/>
			</c:if>
			<c:if test="${mid.examMarkSpin!=null}">
			<input type="number" name="${mid.examMarkSpin}" 
			min="0" max="${markFormBean.frmExamGiven}" step="1" value="0" style="width: 3em"/>	
			<c:set var="frmBtnExam" value="Add Exam"/>
			</c:if></td>
			
			<td>${mid.totalMark}</td>
			<td>${mid.result}</td>
		</tr>
	</logic:iterate>
	<tr>
	<td></td><td></td><td></td>
	
	<td><c:if test='${frmBtnTuto!="Disappear"}'>
	<html:submit property='frmBtn' value='${frmBtnTuto}'  />
	</c:if></td>
	<td><c:if test='${frmBtnAssign!="Disappear"}'>
	<html:submit property='frmBtn' value='${frmBtnAssign}'  />
	</c:if></td>
	<td><c:if test='${frmBtnLab!="Disappear"}'>
	<html:submit property='frmBtn' value='${frmBtnLab}'  />
	</c:if></td>
	<td><c:if test='${frmBtnExam!="Disappear"}'>
	<html:submit property='frmBtn' value='${frmBtnExam}'  />
	</c:if>	</td>
	<td></td>
	</tr>
	</tbody>
</table>
</div>
</logic:notEmpty>
</c:if>
</html:form> 
</body>
<html:link action="homePath"  styleId="reback">Go To Home</html:link>
