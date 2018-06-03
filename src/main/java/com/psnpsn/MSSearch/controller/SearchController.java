/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.controller;

import com.psnpsn.MSSearch.model.Airport;
import com.psnpsn.MSSearch.model.Direction;
import com.psnpsn.MSSearch.model.SearchQ;
import com.psnpsn.MSSearch.model.SearchResult;
import com.psnpsn.MSSearch.model.Town;
import com.psnpsn.MSSearch.service.DirectionService;
import com.psnpsn.MSSearch.service.VehicleService;
import java.security.Principal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Guqnn
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SearchController {
    
   
    @Autowired
    private DirectionService directionService;
    
    @Autowired
    private VehicleService vehicleService;
    
    @PostMapping("/searchq")
    public SearchResult getResult(@RequestBody SearchQ search){
        System.out.println(search);
        directionService.saveSearchQ(search);
        Direction direction = new Direction();
        direction = directionService.getDirection(search.getFrom(),search.getTo());
        
        return null;
    }
    
    @GetMapping("/airports")
    public List<Airport> getAirports() {
        
        return directionService.getAirports();
    }
    
    @GetMapping("/towns")
    public List<Town> getTowns() {
        return directionService.getTowns();
    }
    
    
    
    
}
