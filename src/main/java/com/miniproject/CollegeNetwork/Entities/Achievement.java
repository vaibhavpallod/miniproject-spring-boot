package com.miniproject.CollegeNetwork.Entities;

import java.io.File;
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
@Table(name = "achievement")
public class Achievement {
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int userid;

	@Column
	private int id;

	@Column
	private int achievementId;

	@Column
	@Lob
	private Blob certificate;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private Date date;
	@Column
	private Timestamp timestamp;
	@Column
	@Lob
	private Blob inputStream;
	@Column
	private File file;
	@Column
	private String encodedString;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAchievementId() {
		return achievementId;
	}

	public void setAchievementId(int achievementId) {
		this.achievementId = achievementId;
	}

	public Blob getCertificate() {
		return certificate;
	}

	public void setCertificate(Blob certificate) {
		this.certificate = certificate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getEncodedString() {
		return encodedString;
	}

	public void setEncodedString(String encodedString) {
		this.encodedString = encodedString;
	}

}