package com.xworkz.xworkzapp.dto;

import com.xworkz.xworkzapp.constants.WardName;

public class CityWardDTO {
	
	private int wardNo;
	private WardName wardName;
	private String corporator;
	private long population;
	private String areaInKiloMeters;

	public int getWardNo() {
		return wardNo;
	}
	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}
	public WardName getWardName() {
		return wardName;
	}
	public void setWardName(WardName wardName) {
		this.wardName = wardName;
	}
	public String getCorporator() {
		return corporator;
	}
	public void setCorporator(String corporator) {
		this.corporator = corporator;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public String getAreaInKiloMeters() {
		return areaInKiloMeters;
	}
	public void setAreaInKiloMeters(String areaInKiloMeters) {
		this.areaInKiloMeters = areaInKiloMeters;
	}
	
}
