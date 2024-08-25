package com.miniproject.CollegeNetwork.Entities;

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "internship")
public class Internship {
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int userid;

	@Column
	private int id;

	@Column
	private String name;
	@Column
	private int internshipId;
	@Column
	@Lob
	private Blob certificate;
	@Column
	private String description;
	@Column
	private Date startDate;
	@Column
	private Date endDate;
	@Column
	private String status;
	@Column
	private String nor;
	@Column
	private Timestamp timestamp;
	@Column
	@Lob
	private Blob inputStream;
	@Column
	private String encodeString;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInternshipId() {
		return internshipId;
	}

	public void setInternshipId(int internshipId) {
		this.internshipId = internshipId;
	}

	public Blob getCertificate() {
		return certificate;
	}

	public void setCertificate(Blob certificate) {
		this.certificate = certificate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNor() {
		return nor;
	}

	public void setNor(String nor) {
		this.nor = nor;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Blob getInputStream() {
		return inputStream;
	}

	public void setInputStream(Blob inputStream) {
		this.inputStream = inputStream;
	}

	public String getEncodeString() {
		return encodeString;
	}

	public void setEncodeString(String encodeString) {
		this.encodeString = encodeString;
	}

}