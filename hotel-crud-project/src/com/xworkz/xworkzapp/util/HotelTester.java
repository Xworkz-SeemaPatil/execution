package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.constants.Location;
import com.xworkz.xworkzapp.dto.HotelDTO;
import com.xworkz.xworkzapp.hotel.Hotel;

public class HotelTester {
	public static void main(String[] args) {
		
		Hotel hotel=new Hotel();
		
		HotelDTO hdto=new HotelDTO();
		
		hdto.setName("hotel sagar");
		hdto.setLocation(Location.RAJAJINAGAR);
		hdto.setOwnerName("vidya");
		hdto.setService("9am to 4pm");
		hdto.setType("south Indian");
		hdto.setFoodItems(15);
		
		HotelDTO hdto1=new HotelDTO();
		
		hdto1.setName("new Sagar");
		hdto1.setLocation(Location.VVPURAM);
		hdto1.setOwnerName("rakshitha");
		hdto1.setService("9am to 5pm");
		hdto1.setType("north Indian");
		hdto1.setFoodItems(20);
		
		hotel.addHoteltDetails(hdto);
		hotel.addHoteltDetails(hdto1);
		
		hotel.searchHotelbyLocationAndName(Location.RAJAJINAGAR,"hotel");
		
		hotel.returnOwnerNameByName("Hotel Sagar");
		
		hotel.showAllHotelDetails();
	}

}
