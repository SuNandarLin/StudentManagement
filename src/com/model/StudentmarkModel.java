package com.model;

import java.io.Serializable;

/**
 * Model class of studentmark.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class StudentmarkModel implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** student. */
	private StudentModel student;

	/** course. */
	private CourseModel course;

	/** semester. */
	private SemesterModel semester;
	
	private Integer studentNo;
	private String courseNo;
	private String semName;


	/** tuto_Mark. */
	private Integer tutoMark;

	/** assign_Mark. */
	private Integer assignMark;

	/** lab_Mark. */
	private Integer labMark;

	/** exam_Mark. */
	private Integer examMark;

	/** result. */
	private String result;

	/** re_Mark. */
	private Integer reMark;

	/** debt_Mark. */
	private Integer debtMark;

	/** total_Mark. */
	private Integer totalMark;

	/**
	 * Constructor.
	 */
	public StudentmarkModel() {
	}

	/**
	 * Set the student.
	 * 
	 * @param student
	 *            student
	 */
	public void setStudent(StudentModel student) {
		this.student = student;
	}

	/**
	 * Get the student.
	 * 
	 * @return student
	 */
	public StudentModel getStudent() {
		return this.student;
	}

	/**
	 * Set the course.
	 * 
	 * @param course
	 *            course
	 */
	public void setCourse(CourseModel course) {
		this.course = course;
	}

	/**
	 * Get the course.
	 * 
	 * @return course
	 */
	public CourseModel getCourse() {
		return this.course;
	}

	/**
	 * Set the semester.
	 * 
	 * @param semester
	 *            semester
	 */
	public void setSemester(SemesterModel semester) {
		this.semester = semester;
	}

	/**
	 * Get the semester.
	 * 
	 * @return semester
	 */
	public SemesterModel getSemester() {
		return this.semester;
	}

	public Integer getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(Integer studentNo) {
		this.studentNo = studentNo;
	}

	public String getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}

	public String getSemName() {
		return semName;
	}

	public void setSemName(String semName) {
		this.semName = semName;
	}

	/**
	 * Set the tuto_Mark.
	 * 
	 * @param tutoMark
	 *            tuto_Mark
	 */
	public void setTutoMark(Integer tutoMark) {
		this.tutoMark = tutoMark;
	}

	/**
	 * Get the tuto_Mark.
	 * 
	 * @return tuto_Mark
	 */
	public Integer getTutoMark() {
		return this.tutoMark;
	}

	/**
	 * Set the assign_Mark.
	 * 
	 * @param assignMark
	 *            assign_Mark
	 */
	public void setAssignMark(Integer assignMark) {
		this.assignMark = assignMark;
	}

	/**
	 * Get the assign_Mark.
	 * 
	 * @return assign_Mark
	 */
	public Integer getAssignMark() {
		return this.assignMark;
	}

	/**
	 * Set the lab_Mark.
	 * 
	 * @param labMark
	 *            lab_Mark
	 */
	public void setLabMark(Integer labMark) {
		this.labMark = labMark;
	}

	/**
	 * Get the lab_Mark.
	 * 
	 * @return lab_Mark
	 */
	public Integer getLabMark() {
		return this.labMark;
	}

	/**
	 * Set the exam_Mark.
	 * 
	 * @param examMark
	 *            exam_Mark
	 */
	public void setExamMark(Integer examMark) {
		this.examMark = examMark;
	}

	/**
	 * Get the exam_Mark.
	 * 
	 * @return exam_Mark
	 */
	public Integer getExamMark() {
		return this.examMark;
	}

	/**
	 * Set the result.
	 * 
	 * @param result
	 *            result
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * Get the result.
	 * 
	 * @return result
	 */
	public String getResult() {
		return this.result;
	}

	/**
	 * Set the re_Mark.
	 * 
	 * @param reMark
	 *            re_Mark
	 */
	public void setReMark(Integer reMark) {
		this.reMark = reMark;
	}

	/**
	 * Get the re_Mark.
	 * 
	 * @return re_Mark
	 */
	public Integer getReMark() {
		return this.reMark;
	}

	/**
	 * Set the debt_Mark.
	 * 
	 * @param debtMark
	 *            debt_Mark
	 */
	public void setDebtMark(Integer debtMark) {
		this.debtMark = debtMark;
	}

	/**
	 * Get the debt_Mark.
	 * 
	 * @return debt_Mark
	 */
	public Integer getDebtMark() {
		return this.debtMark;
	}

	/**
	 * Set the total_Mark.
	 * 
	 * @param totalMark
	 *            total_Mark
	 */
	public void setTotalMark(Integer totalMark) {
		this.totalMark = totalMark;
	}

	/**
	 * Get the total_Mark.
	 * 
	 * @return total_Mark
	 */
	public Integer getTotalMark() {
		return this.totalMark;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((student == null) ? 0 : student.hashCode());
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((semester == null) ? 0 : semester.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		StudentmarkModel other = (StudentmarkModel) obj;
		if (student == null) {
			if (other.student != null) {
				return false;
			}
		} else if (!student.equals(other.student)) {
			return false;
		}
		if (course == null) {
			if (other.course != null) {
				return false;
			}
		} else if (!course.equals(other.course)) {
			return false;
		}
		if (semester == null) {
			if (other.semester != null) {
				return false;
			}
		} else if (!semester.equals(other.semester)) {
			return false;
		}
		return true;
	}

}