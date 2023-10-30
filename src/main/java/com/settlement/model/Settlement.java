package com.settlement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "settlement")
public class Settlement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Date;
	private String Amount;
	private String claimId;
	private String status;
	private String settlementid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSettlementid() {
		return settlementid;
	}
	public void setSettlementid(String settlementid) {
		this.settlementid = settlementid;
	}
	@Override
	public String toString() {
		return "Settlement [id=" + id + ", Date=" + Date + ", Amount=" + Amount + ", claimId=" + claimId + ", status="
				+ status + ", settlementid=" + settlementid + "]";
	}

}
