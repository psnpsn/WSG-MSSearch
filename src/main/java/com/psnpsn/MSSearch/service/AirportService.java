/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.service;

import com.psnpsn.MSSearch.dao.AirportDAO;
import com.psnpsn.MSSearch.model.Airport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Guqnn
 */
@Service
public class AirportService {
    @Autowired
    private AirportDAO airDao;
    
    List<Airport> getAll(){
        return airDao.findAll();
    }
    
    Airport getOne(long id){
        return airDao.findById(id).get();
    }
    
    Airport add(Airport entity){
        return airDao.save(entity);
    }
    
    Airport update(long id){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    void delete(Airport entity){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
