/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.service;

import com.psnpsn.MSSearch.dao.VehicleCategorieDAO;
import com.psnpsn.MSSearch.dao.VehicleDAO;
import com.psnpsn.MSSearch.model.SearchQ;
import com.psnpsn.MSSearch.model.Vehicle;
import com.psnpsn.MSSearch.model.VehicleCategorie;
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
    VehicleDAO vehicleDAO;
    
    @Autowired
    VehicleCategorieDAO categorieDAO;
    
    public List<VehicleCategorie> getAll(){
        return categorieDAO.findAll();
    }
    
    public int count(int id){
        int count = vehicleDAO.countVehiclesByCategorie(id);
        System.out.println("Count method: " + count);
        return vehicleDAO.countVehiclesByCategorie(id);
    }
    
    
    
}
