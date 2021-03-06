package com.jims.wx.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * SubjectOptions entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SUBJECT_OPTIONS", schema = "WX")
public class SubjectOptions implements java.io.Serializable {

	// Fields

	private String id;
	private Subject subject;
	private String optContent;
	private String optStatus;

	// Constructors

	/** default constructor */
	public SubjectOptions() {
	}

	/** full constructor */
	public SubjectOptions(Subject subject, String optContent, String optStatus) {
		this.subject = subject;
		this.optContent = optContent;
		this.optStatus = optStatus;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "ID", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUBJECT_ID")
	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Column(name = "OPT_CONTENT", length = 70)
	public String getOptContent() {
		return this.optContent;
	}

	public void setOptContent(String optContent) {
		this.optContent = optContent;
	}

	@Column(name = "OPT_STATUS", length = 2)
	public String getOptStatus() {
		return this.optStatus;
	}

	public void setOptStatus(String optStatus) {
		this.optStatus = optStatus;
	}

}