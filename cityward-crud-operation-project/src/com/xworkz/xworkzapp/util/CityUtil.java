package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.constants.WardName;
import com.xworkz.xworkzapp.dto.CityWardDTO;
import com.xworkz.xworkzapp.wards.CityWard;

public class CityUtil {
	public static void main(String[] args) {
		CityWard city=new CityWard();
		
		CityWardDTO cw=new CityWardDTO();
		cw.setWardName(WardName.BASAVESHWARA);
		cw.setWardNo(2);
		cw.setPopulation(5000);
		cw.setCorporator("nagaraj");
		cw.setAreaInKiloMeters("25 sqmeters");
		
		CityWardDTO cw1=new CityWardDTO();
		cw1.setWardName(WardName.RAJAJINAGAR);
		cw1.setWardNo(3);
		cw1.setPopulation(6000);
		cw1.setCorporator("maharaj");
		cw1.setAreaInKiloMeters("246 sqmeters");
		
		city.addCityWardtDetails(cw);
		city.addCityWardtDetails(cw1);
		city.showAllWardDetails();
		city.searchCityByWardNo(3);
		city.returnCorporatorByWardNo(2);


	}

}