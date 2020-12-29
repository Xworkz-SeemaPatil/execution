package com.xworkz.xworkzapp.dto;

import com.xworkz.xworkzapp.constants.Location;

public class HotelDTO {
	private String name;
	private Location location;
	private String ownerName;
	private String type;
	private String service;
	private int foodItems;
	
	public void setName(String name) {
		this.name=name;
	}
		public String getName() {
			return name;
	}
		public void setLocation(Location location) {
			this.location=location;
		}
		public Location getLocation() {
			return location;
		}
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getService() {
			return service;
		}
		public void setService(String service) {
			this.service = service;
		}
		public int getFoodItems() {
			return foodItems;
		}
		public void setFoodItems(int foodItems) {
			this.foodItems = foodItems;
		}
		

}
