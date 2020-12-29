package com.xworkz.xworkzapp.hotel;

import com.xworkz.xworkzapp.constants.Location;
import com.xworkz.xworkzapp.dto.HotelDTO;

public class Hotel {
	public HotelDTO[] hotel= new HotelDTO[2];
	public int index;
	
		
			public void addCityWardtDetails(HotelDTO hot) {
			
			if( hot.getName() != null && hot.getLocation() !=null && hot.getFoodItems() != 0)
			{
				if( hot.getFoodItems() >= 10) {
					System.out.println("hotel deatils are coreect");
					hotel[index++] = hot;
					System.out.println("hotel details are added");
				
			}
				else {
				System.out.println("the food items should be greater than 5000");
				}
			}
			else{
				System.out.println("the food item ,location, name cant be empty");
			}
			
		}
			
			public void showAllHotelDetails() {
				for(int i=0;i<hotel.length;i++)
				if(hotel[i] !=null)
					System.out.println(hotel[i].getName()+" "+hotel[i].getFoodItems()+" "+hotel[i].getOwnerName()
							+" "+hotel[i].getService()+" "+hotel[i].getType()+" "+hotel[i].getLocation());
				else
					System.out.println("no deatils are added");
			}
			
			public void searchHotelbyLocationAndName(Location location , String name) {
				for(int i=0;i<hotel.length;i++)
					if(hotel[i]!=null)
						if(hotel[i].getLocation().equals(location) && hotel[i].getName().equals(name)) {
							System.out.println(hotel[i].getName());
						}
				}
			public HotelDTO returnOwnerNameByName(String name) {
				HotelDTO dto = null;
				for(int i=0;i<hotel.length;i++) {
					if(hotel[i]!=null)
						if(hotel[i].getName().equals(name)) {
							System.out.println(hotel[i].getOwnerName());
						}
					}
				return dto;
				}
	}
