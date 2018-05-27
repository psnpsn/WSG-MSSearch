/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.service;

import com.psnpsn.MSSearch.dao.VehicleCategorieDAO;
import com.psnpsn.MSSearch.model.VehicleCategorie;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author barkouti
 */
@Service
public class VehicleCategorieService {
        @Autowired
        VehicleCategorieDAO vehicleCategorieRepository ;
    
        
  public VehicleCategorie save(VehicleCategorie vehicleCategoreie)
    { 
      return vehicleCategorieRepository.saveAndFlush(vehicleCategoreie);
    }
  public VehicleCategorie update(VehicleCategorie vehicleCategoreie)
  
  {
     return vehicleCategorieRepository.save(vehicleCategoreie);
  }
  
 
  public VehicleCategorie find(Long id_categorie) {
		return vehicleCategorieRepository.findById(id_categorie).get();
	}
  
  public List<VehicleCategorie> findAll ()
  {
      return vehicleCategorieRepository.findAll();
  }
  
  
        
}
