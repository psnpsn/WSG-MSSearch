/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.service;

import com.psnpsn.MSSearch.dao.TownDAO;
import com.psnpsn.MSSearch.model.Town;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Guqnn
 */
@Service
public class TownService {
    @Autowired
    private TownDAO townDao;
    
    public List<Town> getAll(){
        return townDao.findAll();
    }
    
    public Town getOne(long id){
        return townDao.findById(id).get();
    }
    
    public Town add(Town entity){
        return townDao.save(entity);
    }
    
    public Town update(long id){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void delete(Town entity){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
