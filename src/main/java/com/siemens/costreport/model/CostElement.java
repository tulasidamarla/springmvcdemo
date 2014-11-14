package com.siemens.costreport.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "COST_ELEMENT")
public class CostElement {

	private long Id;
	private String costElement;
	private String vCPU;
	private String vRAM;
	private String vStorage;
	private String backUpCost;
	private String dRCost;

	@Id
	@GeneratedValue
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getCostElement() {
		return costElement;
	}

	public void setCostElement(String costElement) {
		this.costElement = costElement;
	}

	public String getvCPU() {
		return vCPU;
	}

	public void setvCPU(String vCPU) {
		this.vCPU = vCPU;
	}

	public String getvRAM() {
		return vRAM;
	}

	public void setvRAM(String vRAM) {
		this.vRAM = vRAM;
	}

	public String getvStorage() {
		return vStorage;
	}

	public void setvStorage(String vStorage) {
		this.vStorage = vStorage;
	}

	public String getBackUpCost() {
		return backUpCost;
	}

	public void setBackUpCost(String backUpCost) {
		this.backUpCost = backUpCost;
	}

	public String getdRCost() {
		return dRCost;
	}

	public void setdRCost(String dRCost) {
		this.dRCost = dRCost;
	}

}