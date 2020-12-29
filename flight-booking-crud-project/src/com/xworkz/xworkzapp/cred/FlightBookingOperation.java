package com.xworkz.xworkzapp.cred;

import com.xworkz.xworkzapp.dto.FlightBookingDTO;

public class FlightBookingOperation {
	
	public FlightBookingDTO[] flightDTO;
	public int index;
	
	public FlightBookingOperation(int size) {
		flightDTO = new FlightBookingDTO[size];
	}
	

	public void addFlightDetails(FlightBookingDTO flight) {
	
		if(flight.getAirplaneCode() != null && flight.getCompany() != null && flight.getStartPoint() !=null && flight.getBusinessClassPrice() != 0)
		{
			if( flight.getBusinessClassPrice()>=1000) {
				System.out.println("flight deatils are coreect");
		flightDTO[index++] = flight;
			System.out.println("flight details are added");
			
		}
			else {
			System.out.println("the price should be greater than 1000");
			}
		}
		else{
			System.out.println("the company ,air code, business code cant be empty");
		}
		
	}
	
	public void showAllFightDetails() {
		for (FlightBookingDTO fligtDTO : flightDTO) {
			if (flightDTO != null) {
				System.out.println(fligtDTO.getAirplaneCode()+"   "+fligtDTO.getStartPoint()+"   "+fligtDTO.getDestination()+"   "+
						fligtDTO.getDestination()+"   "+fligtDTO.getTotalSeats()+"   "+fligtDTO.getBusinessClassPrice()+"   "+
						fligtDTO.getEconomyClassPrice());
				System.out.println("showAll method ended");
			} 
			}
		}
	public FlightBookingDTO searchStartingPoint(String startPoint) {
		FlightBookingDTO fdto = null;
		for(int i=0;i<flightDTO.length;i++) {
			if (flightDTO[i].getStartPoint().equals(startPoint)) {
				fdto = flightDTO[i];
				System.out.println(flightDTO[i].getAirplaneCode()+"   "+flightDTO[i].getStartPoint()+"   "+flightDTO[i].getDestination()+"   "+
						flightDTO[i].getDestination()+"   "+flightDTO[i].getTotalSeats()+"   "+flightDTO[i].getBusinessClassPrice()+"   "+
						flightDTO[i].getEconomyClassPrice());
				}
			else {
				System.out.println("starting point not found");
			}
		}
		return fdto;
		
	}

	
}