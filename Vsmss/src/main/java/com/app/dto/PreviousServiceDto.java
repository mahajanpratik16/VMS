package com.app.dto;

import java.time.LocalDate;

import com.app.pojos.ServiceType;

public class PreviousServiceDto {

	private String customerName;

	private String customerEmail;

	private String vehicleNo;

	private String chasisNo;

	private ServiceType serviceType;

	private boolean isActive;
	private double esitmatedBill;
	private LocalDate estimateDate;
	private String model;
	private String mechanicAssigned;
	
	public PreviousServiceDto() {
		// TODO Auto-generated constructor stub
	}

	public PreviousServiceDto(String customerName, String customerEmail, String vehicleNo, String chasisNo,
			ServiceType serviceType, boolean isActive,double esitmatedBill,LocalDate estimateDate,String model,String mechanicAssigned) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.vehicleNo = vehicleNo;
		this.chasisNo = chasisNo;
		this.serviceType = serviceType;
		this.isActive = isActive;
		this.esitmatedBill=esitmatedBill;
		this.estimateDate=estimateDate;
		this.model=model;
		this.mechanicAssigned=mechanicAssigned;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public ServiceType getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

	public boolean isActive() {
		return isActive;
	}

	public double getEsitmatedBill() {
		return esitmatedBill;
	}

	public void setEsitmatedBill(double esitmatedBill) {
		this.esitmatedBill = esitmatedBill;
	}

	public LocalDate getEstimateDate() {
		return estimateDate;
	}

	public void setEstimateDate(LocalDate estimateDate) {
		this.estimateDate = estimateDate;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "PreviousServiceDto [customerName=" + customerName + ", customerEmail=" + customerEmail + ", vehicleNo="
				+ vehicleNo + ", chasisNo=" + chasisNo + ", serviceType=" + serviceType + ", isActive=" + isActive
				+ ", esitmatedBill=" + esitmatedBill + ", estimateDate=" + estimateDate + ", model=" + model
				+ ", mechanicAssigned=" + mechanicAssigned + "]";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMechanicAssigned() {
		return mechanicAssigned;
	}

	public void setMechanicAssigned(String mechanicAssigned) {
		this.mechanicAssigned = mechanicAssigned;
	}

	
	
}
