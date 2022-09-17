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
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/courseStyle.css" />
<h1>Course % Edition</h1>
<body>

<h1>Course : ${frmSelectCourse} </h1>
<p>User : ${courseFormBean.frmUserName }	</p>
<html:form action="courseEditPath">
<logic:notEmpty name="courseFormBean" property="frmCourseList">
<html:select name="courseFormBean" property="frmSelectCourse">
<logic:iterate id="cid" collection="${courseFormBean.frmCourseList}">
	<html:option value="${cid}"/>
</logic:iterate>
</html:select>
</logic:notEmpty>
<html:submit value="Select Course" styleId="submit"/><br>
<logic:notEmpty name="courseFormBean">

<h3>Percentage</h3>
<center>
<p> Tutorial Percentage:
<input type="number" name="tutoPercentSpin" 
	min="0" max="100" step="5" value="${courseFormBean.frmTutoPercentage }" style="width: 3em"/> </p>
<p>Assignment Percentage :
<input type="number" name="assignPercentSpin" 
min="0" max="100" step="5" value="${courseFormBean.frmAssignPercentage }" style="width: 3em"/> </p>
<p>Lab Percentage 		:
<input type="number" name="labPercentSpin" 
	min="0" max="100" step="5" value="${courseFormBean.frmLabPercentage }" style="width: 3em"/> </p>
<p>Exam Percentage 	:
<input type="number" name="examPercentSpin" 
	min="0" max="100" step="5" value="${courseFormBean.frmExamPercentage }" style="width: 3em"/> </p>
<h3>Given Mark</h3>
<p>Tutorial Given Mark  :
<input type="number" name="tutoGivenSpin" 
	min="0" max="100" step="5" value="${courseFormBean.frmTutoGiven }" style="width: 3em"/> </p>
<p>Assignment Given Mark  :
<input type="number" name="assignGivenSpin" 
min="0" max="100" step="5" value="${courseFormBean.frmAssignGiven }" style="width: 3em"/> </p>
<p>Lab Given Mark  :
<input type="number" name="labGivenSpin" 
	min="0" max="100" step="5" value="${courseFormBean.frmLabGiven }" style="width: 3em"/> </p>
<p>Exam Given Mark  :
<input type="number" name="examGivenSpin" 
	min="0" max="100" step="5" value="${courseFormBean.frmExamGiven }" style="width: 3em"/> </p>
</center>
<br><html:submit property="frmBtn" value="Update" styleId="submit"/><br>
<c:if test="${courseFormBean.frmErrorMsg!=null}">
	<b><font color='red' size="5px">${courseFormBean.frmErrorMsg}</font> </b>
</c:if>
</logic:notEmpty>
<html:link action="homePath" styleId="rebackhome">Go To Home</html:link>
</html:form>

</body>