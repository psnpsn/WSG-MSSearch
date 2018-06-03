/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.service;

import com.psnpsn.MSSearch.dao.AirportDAO;
import com.psnpsn.MSSearch.dao.DirectionDAO;
import com.psnpsn.MSSearch.dao.SearchQDAO;
import com.psnpsn.MSSearch.dao.TownDAO;
import com.psnpsn.MSSearch.dao.VehicleDAO;
import com.psnpsn.MSSearch.model.Airport;
import com.psnpsn.MSSearch.model.Direction;
import com.psnpsn.MSSearch.model.SearchQ;
import com.psnpsn.MSSearch.model.Town;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Guqnn
 */
@Service
public class DirectionService {
    
    @Autowired
    private DirectionDAO directionDAO;
    
    @Autowired
    private TownDAO townDAO;
    
    @Autowired
    private AirportDAO airportDAO;
    
    @Autowired
    private SearchQDAO searchDAO;
    
    public List<Airport> getAirports(){
        return airportDAO.findAll();
    }
    
    public List<Town> getTowns(){
        return townDAO.findAll();
    }
    
    public Direction getDirection(Airport air, Town town){
        return directionDAO.findByAirportAndTown(air, town);
    }
    
    public SearchQ saveSearchQ(SearchQ search){
        return searchDAO.save(search);
    }
    
    
    
}
