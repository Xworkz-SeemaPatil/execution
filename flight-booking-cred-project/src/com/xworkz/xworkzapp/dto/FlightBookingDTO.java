package com.xworkz.xworkzapp.dto;

public class FlightBookingDTO {
	
	private String airplaneCode;
	private String airplaneCompany;
	private String startPoint;
	private String destination;
	private int totalSeats;
	private double businessClassPrice;
	private double economyClassPrice;
	
	public String getAirplaneCode() {
		return airplaneCode;
	}
	public void setAirplaneCode(String airplaneCode) {
		this.airplaneCode = airplaneCode;
	}
	public String getAirplaneCompany() {
		return airplaneCompany;
	}
	public void setAirplaneCompany(String airplaneCompany) {
		this.airplaneCompany = airplaneCompany;
	}
	public String getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public double getBusinessClassPrice() {
		return businessClassPrice;
	}
	public void setBusinessClassPrice(double businessClassPrice) {
		this.businessClassPrice = businessClassPrice;
	}
	public double getEconomyClassPrice() {
		return economyClassPrice;
	}
	public void setEconomyClassPrice(double economyClassPrice) {
		this.economyClassPrice = economyClassPrice;
	}
	

}
