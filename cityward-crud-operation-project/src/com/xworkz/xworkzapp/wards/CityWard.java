package com.xworkz.xworkzapp.wards;

import com.xworkz.xworkzapp.dto.CityWardDTO;


public class CityWard {
	public CityWardDTO[] cityDTO= new CityWardDTO[2] ;
	public int index;
	
	

	public void addCityWardtDetails(CityWardDTO ward) {
	
		if( ward.getPopulation() != 0 && ward.getWardName() !=null && ward.getWardNo() != 0)
		{
			if( ward.getPopulation()>=5000) {
				System.out.println("city wards deatils are coreect");
				cityDTO[index++] = ward;
				System.out.println("city ward details are added");
			
		}
			else {
			System.out.println("the population should be greater than 5000");
			}
		}
		else{
			System.out.println("the ward no ,ward name, population cant be empty");
		}
		
	}
	
	public void showAllWardDetails() {
		for(int i=0;i<cityDTO.length;i++)   {
			if (cityDTO[i] != null) {
				System.out.println("showAll method started");
				System.out.println(cityDTO[i].getWardName()+" "+cityDTO[i].getWardNo()+" "+cityDTO[i].getCorporator()+" "+cityDTO[i].getPopulation()+" "+cityDTO[i].getAreaInKiloMeters());
			
				System.out.println("showAll method ended");
				}
			} 
			}
		
	

	public void searchCityByWardNo(int wardNo) {
		for(int i=0;i<cityDTO.length;i++) {
			if(cityDTO!=null) {
				if(cityDTO[i].getWardName().equals(wardNo)) {
					System.out.println(cityDTO[i].getWardName()+" "+cityDTO[i].getWardNo()+" "+cityDTO[i].getCorporator()+" "+cityDTO[i].getPopulation()+" "+cityDTO[i].getAreaInKiloMeters());
				}
			}
		}
	}
		public CityWardDTO returnCorporatorByWardNo(int wardNo) {
			CityWardDTO dto=null;
			for(int i=0;i<cityDTO.length;i++) {
				 if(cityDTO != null) {
					 dto = cityDTO[i];
					 if(cityDTO[i].getWardNo()==wardNo)
					 System.out.println(cityDTO[i].getCorporator());
				 }
		}
			return dto;
	}
}
