package com.entity;
// Generated 2017-3-27 12:11:26 by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * Job generated by hbm2java
 */
@Entity
@Table(name = "job", catalog = "oasys")
public class Job implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer jobId;
	@JsonIgnoreProperties("jobs")
	private Dept dept;
	private String jobName;
	private String jobText;
	private Set<Employees> employeeses = new HashSet<Employees>(0);

	public Job() {
	}

	public Job(Dept dept, String jobName, String jobText, Set<Employees> employeeses) {
		this.dept = dept;
		this.jobName = jobName;
		this.jobText = jobText;
		this.employeeses = employeeses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "jobID", unique = true, nullable = false)
	public Integer getJobId() {
		return this.jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "deptID")
	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Column(name = "jobName", length = 50)
	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	@Column(name = "jobText", length = 65535)
	public String getJobText() {
		return this.jobText;
	}

	public void setJobText(String jobText) {
		this.jobText = jobText;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "job",cascade=CascadeType.ALL)
	public Set<Employees> getEmployeeses() {
		return this.employeeses;
	}

	public void setEmployeeses(Set<Employees> employeeses) {
		this.employeeses = employeeses;
	}

}