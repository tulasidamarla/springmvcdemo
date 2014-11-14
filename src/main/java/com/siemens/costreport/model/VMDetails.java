package com.siemens.costreport.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VM_DETAILS")
public class VMDetails {
	
	private long uniqueID;
	private String vMName;
	private String bluePrint;
	private String dateProvisioned;
	private String dateDeComissioned;
	private String owner;
	private String reportingManager;
	private String costCenter;
	private String department;
	private String bU;
	private String network;
	private String site;
	
	@Id
	@GeneratedValue
	public long getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
	}
	public String getvMName() {
		return vMName;
	}
	public void setvMName(String vMName) {
		this.vMName = vMName;
	}
	public String getBluePrint() {
		return bluePrint;
	}
	public void setBluePrint(String bluePrint) {
		this.bluePrint = bluePrint;
	}
	public String getDateProvisioned() {
		return dateProvisioned;
	}
	public void setDateProvisioned(String dateProvisioned) {
		this.dateProvisioned = dateProvisioned;
	}
	public String getDateDeComissioned() {
		return dateDeComissioned;
	}
	public void setDateDeComissioned(String dateDeComissioned) {
		this.dateDeComissioned = dateDeComissioned;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getReportingManager() {
		return reportingManager;
	}
	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}
	public String getCostCenter() {
		return costCenter;
	}
	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getbU() {
		return bU;
	}
	public void setbU(String bU) {
		this.bU = bU;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	

}
