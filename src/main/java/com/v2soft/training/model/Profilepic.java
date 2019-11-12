package com.v2soft.training.model;
// Generated Nov 7, 2019 4:36:33 PM by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Profilepic generated by hbm2java
 */
@Entity
@Table(name = "profilepic", catalog = "employees")
public class Profilepic implements java.io.Serializable {

	private String pictureId;
	private String fileName;
	private byte[] fileContent;
	private Set<Employeeinfo> employeeinfos = new HashSet<Employeeinfo>(0);

	public Profilepic() {
	}

	public Profilepic(String pictureId, String fileName, byte[] fileContent) {
		this.pictureId = pictureId;
		this.fileName = fileName;
		this.fileContent = fileContent;
	}

	public Profilepic(String pictureId, String fileName, byte[] fileContent, Set<Employeeinfo> employeeinfos) {
		this.pictureId = pictureId;
		this.fileName = fileName;
		this.fileContent = fileContent;
		this.employeeinfos = employeeinfos;
	}

	@Id

	@Column(name = "pictureId", unique = true, nullable = false, length = 10)
	public String getPictureId() {
		return this.pictureId;
	}

	public void setPictureId(String pictureId) {
		this.pictureId = pictureId;
	}

	@Column(name = "fileName", nullable = false, length = 50)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "fileContent", nullable = false)
	public byte[] getFileContent() {
		return this.fileContent;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profilepic")
	public Set<Employeeinfo> getEmployeeinfos() {
		return this.employeeinfos;
	}

	public void setEmployeeinfos(Set<Employeeinfo> employeeinfos) {
		this.employeeinfos = employeeinfos;
	}

}
