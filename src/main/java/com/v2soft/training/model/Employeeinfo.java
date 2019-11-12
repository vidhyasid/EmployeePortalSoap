package com.v2soft.training.model;
// Generated Nov 7, 2019 4:36:33 PM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Employeeinfo generated by hbm2java
 */
@Entity
@Table(name = "employeeinfo", catalog = "employees")
public class Employeeinfo implements java.io.Serializable {

	private String employeeId;
	private Department department;
	private Profilepic profilepic;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Salaryinfo salaryinfo;

	public Employeeinfo() {
	}

	public Employeeinfo(String employeeId, Department department, Profilepic profilepic, String firstName,
			String lastName, Date dateOfBirth) {
		this.employeeId = employeeId;
		this.department = department;
		this.profilepic = profilepic;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public Employeeinfo(String employeeId, Department department, Profilepic profilepic, String firstName,
			String lastName, Date dateOfBirth, Salaryinfo salaryinfo) {
		this.employeeId = employeeId;
		this.department = department;
		this.profilepic = profilepic;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.salaryinfo = salaryinfo;
	}

	@Id

	@Column(name = "employeeId", unique = true, nullable = false, length = 50)
	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deptId", nullable = false)
	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pictureId", nullable = false)
	public Profilepic getProfilepic() {
		return this.profilepic;
	}

	public void setProfilepic(Profilepic profilepic) {
		this.profilepic = profilepic;
	}

	@Column(name = "firstName", nullable = false, length = 20)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "lastName", nullable = false, length = 20)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateOfBirth", nullable = false, length = 10)
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "employeeinfo")
	public Salaryinfo getSalaryinfo() {
		return this.salaryinfo;
	}

	public void setSalaryinfo(Salaryinfo salaryinfo) {
		this.salaryinfo = salaryinfo;
	}

}
