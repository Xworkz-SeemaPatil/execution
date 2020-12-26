package com.xworkz.xworkzapp.cred;

import com.xworkz.xworkzapp.dto.FlightBookingDTO;

public class FlightBookingOperation {
	
	
	public FlightBookingDTO[] flightDTO;
	public int index;
	
	public FlightBookingOperation(int size) {
		flightDTO = new FlightBookingDTO[size];
	}
	
	public void addFlightDetails(FlightBookingDTO flight) {
	
		flightDTO[index++] = flight;
		
	}
	
	public void showAllFightDetails() {
		for (FlightBookingDTO fligtDTO : flightDTO) {
			if (flightDTO != null) {
				System.out.println(fligtDTO.getAirplaneCode()+"   "+fligtDTO.getStartPoint()+"   "+fligtDTO.getDestination()+"   "+
						fligtDTO.getDestination()+"   "+fligtDTO.getTotalSeats()+"   "+fligtDTO.getBusinessClassPrice()+"   "+
						fligtDTO.getEconomyClassPrice());
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
		}
		return fdto;
		
	}
}