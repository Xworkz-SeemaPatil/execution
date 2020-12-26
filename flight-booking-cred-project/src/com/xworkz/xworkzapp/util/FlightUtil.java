package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.cred.FlightBookingOperation;
import com.xworkz.xworkzapp.dto.FlightBookingDTO;

public class FlightUtil {
public static void main(String[] args) {
	
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the how many flights you want to add");
		int size = sc.nextInt();
		FlightBookingOperation flightoperation = new FlightBookingOperation (size);
		
		for (int i=0; i < size; i++) {
			FlightBookingDTO dto =new FlightBookingDTO();
			System.out.println("enter the "+" "+(i+1)+"  "+"flight details");
			System.out.println("enter the airplane code");
			String airplaneCode=sc.next();
			System.out.println("enter the pickup point");
			String startPoint=sc.next();
			System.out.println("enter the destination");
			String destination=sc.next();
			System.out.println("enter the total no of seats");
			int totalSeats=sc.nextInt();
			System.out.println("enter the price of BusinessClass");
			double businessClassPrice=sc.nextDouble();
			System.out.println("enter the price of economy Class");
			double economyClassPrice=sc.nextDouble();
			
			dto.setAirplaneCode(airplaneCode);
			dto.setStartPoint(startPoint);
			dto.setDestination(destination);
			dto.setTotalSeats(totalSeats);
			dto.setBusinessClassPrice(businessClassPrice);
			dto.setEconomyClassPrice(economyClassPrice);
	
			flightoperation.addFlightDetails(dto);
			
	}
		flightoperation.showAllFightDetails();
		
		
		
		System.out.println("enter the starting point to get flight details");
	    String start=	sc.next();
		FlightBookingDTO flightDTO = flightoperation.searchStartingPoint(start);
		System.out.println(flightDTO);
		
		sc.close();
}
}