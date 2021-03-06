package com.jims.wx.entity;

import java.math.BigDecimal;
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
 * ClinicSchedule entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "CLINIC_SCHEDULE", schema = "WX")
public class ClinicSchedule implements java.io.Serializable {

	// Fields

	private String id;
	private ClinicIndex clinicIndex;
	private String dayOfWeek;
	private BigDecimal registrationLimits;

	// Constructors

	/** default constructor */
	public ClinicSchedule() {
	}

	/** full constructor */
	public ClinicSchedule(ClinicIndex clinicIndex, String dayOfWeek,
			BigDecimal registrationLimits) {
		this.clinicIndex = clinicIndex;
		this.dayOfWeek = dayOfWeek;
		this.registrationLimits = registrationLimits;
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
	@JoinColumn(name = "CLINIC_INDEX_ID")
	public ClinicIndex getClinicIndex() {
		return this.clinicIndex;
	}

	public void setClinicIndex(ClinicIndex clinicIndex) {
		this.clinicIndex = clinicIndex;
	}

	@Column(name = "DAY_OF_WEEK", length = 10)
	public String getDayOfWeek() {
		return this.dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Column(name = "REGISTRATION_LIMITS", precision = 22, scale = 0)
	public BigDecimal getRegistrationLimits() {
		return this.registrationLimits;
	}

	public void setRegistrationLimits(BigDecimal registrationLimits) {
		this.registrationLimits = registrationLimits;
	}

}