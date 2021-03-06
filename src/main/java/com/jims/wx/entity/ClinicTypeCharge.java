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
 * ClinicTypeCharge entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "CLINIC_TYPE_CHARGE", schema = "WX")
public class ClinicTypeCharge implements java.io.Serializable {

	// Fields

	private String id;
	private ClinicTypeSetting clinicTypeSetting;
	private String clinicTypeName;
	private String clinicTypeCode;
	private String chargeItem;
	private String priceItem;
	private BigDecimal price;

	// Constructors

	/** default constructor */
	public ClinicTypeCharge() {
	}

	/** full constructor */
	public ClinicTypeCharge(ClinicTypeSetting clinicTypeSetting,
			String clinicTypeName, String clinicTypeCode, String chargeItem,
			String priceItem, BigDecimal price) {
		this.clinicTypeSetting = clinicTypeSetting;
		this.clinicTypeName = clinicTypeName;
		this.clinicTypeCode = clinicTypeCode;
		this.chargeItem = chargeItem;
		this.priceItem = priceItem;
		this.price = price;
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
	@JoinColumn(name = "CLINIC_TYPE_ID")
	public ClinicTypeSetting getClinicTypeSetting() {
		return this.clinicTypeSetting;
	}

	public void setClinicTypeSetting(ClinicTypeSetting clinicTypeSetting) {
		this.clinicTypeSetting = clinicTypeSetting;
	}

	@Column(name = "CLINIC_TYPE_NAME", length = 100)
	public String getClinicTypeName() {
		return this.clinicTypeName;
	}

	public void setClinicTypeName(String clinicTypeName) {
		this.clinicTypeName = clinicTypeName;
	}

	@Column(name = "CLINIC_TYPE_CODE", length = 10)
	public String getClinicTypeCode() {
		return this.clinicTypeCode;
	}

	public void setClinicTypeCode(String clinicTypeCode) {
		this.clinicTypeCode = clinicTypeCode;
	}

	@Column(name = "CHARGE_ITEM", length = 20)
	public String getChargeItem() {
		return this.chargeItem;
	}

	public void setChargeItem(String chargeItem) {
		this.chargeItem = chargeItem;
	}

	@Column(name = "PRICE_ITEM", length = 20)
	public String getPriceItem() {
		return this.priceItem;
	}

	public void setPriceItem(String priceItem) {
		this.priceItem = priceItem;
	}

	@Column(name = "PRICE", precision = 22, scale = 0)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}