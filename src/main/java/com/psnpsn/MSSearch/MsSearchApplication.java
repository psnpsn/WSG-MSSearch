package com.psnpsn.MSSearch;

import com.psnpsn.MSSearch.dao.DirectionDAO;
import com.psnpsn.MSSearch.dao.VehicleCategorieDAO;
import com.psnpsn.MSSearch.service.VehicleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MsSearchApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MsSearchApplication.class, args);
                
                VehicleCategorieDAO vehicleCategorieDAO = context.getBean(VehicleCategorieDAO.class);
                VehicleService vehicleService = context.getBean(VehicleService.class);
                
	}
}
