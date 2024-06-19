package com.example.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PG_MERCHANT_SETTLEMENTS")
public class PgMerchantSettlement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PG_MERCHANT_SETTLEMENT_ID")
	private long pgMerchantSettlementId;

	@Column(name = "MERCHANT_ID")
	private long merchantId;

	@Column(name = "SETTLEMENT_DATE")
	private Timestamp settlementDate;

	@Column(name = "SETTLEMENT_DETAILS", length = 200)
	private String settlementDetails;

	@Column(name = "MERCHANT_TRXN_REF_ID", length = 200)
	private String merchantTrxnRefId;

	@Column(name = "SETTLEMENT_FROM_DATE")
	private String settlementFromDate;

	@Column(name = "SETTLEMENT_TO_DATE")
	private String settlementToDate;

	@Column(name = "SETTLEMENT_GROSS_AMOUNT")
	private String settlementGrossAmount;

	@Column(name = "SETTLEMENT_TAX")
	private String settlementTax;

	@Column(name = "SETTLEMENT_NET_AMOUNT")
	private String settlementNetAmount;

	@Column(name = "SETTLEMENT_TOTAL_AMOUNT")
	private String settlementTotalAmount;

	@Column(name = "SETTLEMENT_TOTAL_TRXN")
	private String settlementTotalTrxn;

	@Column(name = "SETTLEMENT_CHARGE")
	private String settlementCharge;

	@Column(name = "MERCHANT_BUSSINESS_NAME", length = 300)
	private String merchantBussinessName;

	@Column(name = "SUBMERCHANT_BUSSINESS_NAME", length = 300)
	private String submerchantBussinessName;

	@Column(name = "BANK_DETAILS", length = 200)
	private String bankDetails;

	@Column(name = "SETTLEMENT_TYPE", length = 45)
	private String settlementtype;

	@Column(name = "SELLER_IDENTIFIER", length = 60)
	private String sellerIdentifier;

	@Column(name = "SETTLEMENT_STATUS", length = 45)
	private String settlementStatus;

	@Column(name = "SETTLEMENT_UTR", length = 45)
	private String settlementUtr;

	@Column(name = "PAYEE_EMAIL", length = 60)
	private String payeeEmail;

	public long getPgMerchantSettlementId() {
		return pgMerchantSettlementId;
	}

	public void setPgMerchantSettlementId(long pgMerchantSettlementId) {
		this.pgMerchantSettlementId = pgMerchantSettlementId;
	}

	public long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}

	public Timestamp getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(Timestamp settlementDate) {
		this.settlementDate = settlementDate;
	}

	public String getSettlementDetails() {
		return settlementDetails;
	}

	public void setSettlementDetails(String settlementDetails) {
		this.settlementDetails = settlementDetails;
	}

	public String getMerchantTrxnRefId() {
		return merchantTrxnRefId;
	}

	public void setMerchantTrxnRefId(String merchantTrxnRefId) {
		this.merchantTrxnRefId = merchantTrxnRefId;
	}

	public String getSettlementFromDate() {
		return settlementFromDate;
	}

	public void setSettlementFromDate(String settlementFromDate) {
		this.settlementFromDate = settlementFromDate;
	}

	public String getSettlementToDate() {
		return settlementToDate;
	}

	public void setSettlementToDate(String settlementToDate) {
		this.settlementToDate = settlementToDate;
	}

	public String getSettlementTotalTrxn() {
		return settlementTotalTrxn;
	}

	public void setSettlementTotalTrxn(String settlementTotalTrxn) {
		this.settlementTotalTrxn = settlementTotalTrxn;
	}

	public String getMerchantBussinessName() {
		return merchantBussinessName;
	}

	public void setMerchantBussinessName(String merchantBussinessName) {
		this.merchantBussinessName = merchantBussinessName;
	}

	public String getSubmerchantBussinessName() {
		return submerchantBussinessName;
	}

	public void setSubmerchantBussinessName(String submerchantBussinessName) {
		this.submerchantBussinessName = submerchantBussinessName;
	}

	public String getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(String bankDetails) {
		this.bankDetails = bankDetails;
	}

	public String getSettlementtype() {
		return settlementtype;
	}

	public void setSettlementtype(String settlementtype) {
		this.settlementtype = settlementtype;
	}

	public String getSellerIdentifier() {
		return sellerIdentifier;
	}

	public void setSellerIdentifier(String sellerIdentifier) {
		this.sellerIdentifier = sellerIdentifier;
	}

	public String getSettlementStatus() {
		return settlementStatus;
	}

	public void setSettlementStatus(String settlementStatus) {
		this.settlementStatus = settlementStatus;
	}

	public String getSettlementUtr() {
		return settlementUtr;
	}

	public void setSettlementUtr(String settlementUtr) {
		this.settlementUtr = settlementUtr;
	}

	public String getPayeeEmail() {
		return payeeEmail;
	}

	public void setPayeeEmail(String payeeEmail) {
		this.payeeEmail = payeeEmail;
	}

	public String getSettlementGrossAmount() {
		return settlementGrossAmount;
	}

	public void setSettlementGrossAmount(String settlementGrossAmount) {
		this.settlementGrossAmount = settlementGrossAmount;
	}

	public String getSettlementTax() {
		return settlementTax;
	}

	public void setSettlementTax(String settlementTax) {
		this.settlementTax = settlementTax;
	}

	public String getSettlementNetAmount() {
		return settlementNetAmount;
	}

	public void setSettlementNetAmount(String settlementNetAmount) {
		this.settlementNetAmount = settlementNetAmount;
	}

	public String getSettlementTotalAmount() {
		return settlementTotalAmount;
	}

	public void setSettlementTotalAmount(String settlementTotalAmount) {
		this.settlementTotalAmount = settlementTotalAmount;
	}

	public String getSettlementCharge() {
		return settlementCharge;
	}

	public void setSettlementCharge(String settlementCharge) {
		this.settlementCharge = settlementCharge;
	}
	
	

}
