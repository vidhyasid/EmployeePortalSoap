package com.v2soft.training.model;
// Generated Nov 7, 2019 4:36:33 PM by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Securitycredentials generated by hbm2java
 */
@Entity
@Table(name = "securitycredentials", catalog = "employees")
public class Securitycredentials implements java.io.Serializable {

	private String deptId;
	private Department department;
	private String userName;
	private String password;

	public Securitycredentials() {
	}

	public Securitycredentials(Department department, String userName, String password) {
		this.department = department;
		this.userName = userName;
		this.password = password;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "department"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "deptId", unique = true, nullable = false, length = 10)
	public String getDeptId() {
		return this.deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Column(name = "userName", nullable = false, length = 20)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "password", nullable = false, length = 20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
