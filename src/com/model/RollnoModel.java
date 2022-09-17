package com.model;

import java.io.Serializable;

/**
 * Model class of rollno.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class RollnoModel implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** student. */
	private StudentModel student;
	private Integer studentNo;

	/** batch. */
	private Integer batch;

	/** roll_No. */
	private String rollNo;

	/**
	 * Constructor.
	 */
	public RollnoModel() {
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

	public Integer getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(Integer studentNo) {
		this.studentNo = studentNo;
	}

	/**
	 * Set the batch.
	 * 
	 * @param batch
	 *            batch
	 */
	public void setBatch(Integer batch) {
		this.batch = batch;
	}

	/**
	 * Get the batch.
	 * 
	 * @return batch
	 */
	public Integer getBatch() {
		return this.batch;
	}

	/**
	 * Set the roll_No.
	 * 
	 * @param rollNo
	 *            roll_No
	 */
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	/**
	 * Get the roll_No.
	 * 
	 * @return roll_No
	 */
	public String getRollNo() {
		return this.rollNo;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((student == null) ? 0 : student.hashCode());
		result = prime * result + ((batch == null) ? 0 : batch.hashCode());
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
		RollnoModel other = (RollnoModel) obj;
		if (student == null) {
			if (other.student != null) {
				return false;
			}
		} else if (!student.equals(other.student)) {
			return false;
		}
		if (batch == null) {
			if (other.batch != null) {
				return false;
			}
		} else if (!batch.equals(other.batch)) {
			return false;
		}
		return true;
	}

}
