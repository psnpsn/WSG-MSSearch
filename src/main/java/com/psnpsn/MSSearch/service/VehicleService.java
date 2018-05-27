/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.service;

import com.psnpsn.MSSearch.dao.VehicleDAO;
import com.psnpsn.MSSearch.model.Vehicle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author barkouti
 */
@Service 
public class VehicleService {
    @Autowired
    VehicleDAO vDao;
    

  public Vehicle save(Vehicle vehicle)
    { 
      return vDao.saveAndFlush(vehicle);
    }
  public Vehicle update(Vehicle vehicle)
  
  {
     return vDao.save(vehicle);
  }
  
  public Vehicle find(int immatricule) {
        return vDao.findOneByImmatricule(immatricule);
  
  }
  public Vehicle find(Long id_vehicle) {
	return vDao.findById(id_vehicle).get();
    }
  
  public List<Vehicle> findAll ()
  {
      return vDao.findAll();
  }
  
  public boolean delete(Long id_vehicle)
  {
    return true;
  }
}
