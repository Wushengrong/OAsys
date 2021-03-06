package com.entity;
// Generated 2017-3-27 12:11:26 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Notice generated by hbm2java
 */
@Entity
@Table(name = "notice", catalog = "oasys")
public class Notice implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer noteId;
	private Employees employees;
	private String noteName;
	private String noteInfo;
	private String noteTime;

	public Notice() {
	}

	public Notice(Employees employees, String noteName, String noteInfo, String noteTime) {
		this.employees = employees;
		this.noteName = noteName;
		this.noteInfo = noteInfo;
		this.noteTime = noteTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "noteID", unique = true, nullable = false)
	public Integer getNoteId() {
		return this.noteId;
	}

	public void setNoteId(Integer noteId) {
		this.noteId = noteId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employeeID")
	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	@Column(name = "noteName", length = 50)
	public String getNoteName() {
		return this.noteName;
	}

	public void setNoteName(String noteName) {
		this.noteName = noteName;
	}

	@Column(name = "noteInfo", length = 65535)
	public String getNoteInfo() {
		return this.noteInfo;
	}

	public void setNoteInfo(String noteInfo) {
		this.noteInfo = noteInfo;
	}

	@Column(name = "noteTime", length = 50)
	public String getNoteTime() {
		return this.noteTime;
	}

	public void setNoteTime(String noteTime) {
		this.noteTime = noteTime;
	}

}
