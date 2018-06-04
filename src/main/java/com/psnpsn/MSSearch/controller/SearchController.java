/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.controller;

import com.psnpsn.MSSearch.model.Airport;
import com.psnpsn.MSSearch.model.Direction;
import com.psnpsn.MSSearch.model.SearchQ;
import com.psnpsn.MSSearch.util.SearchResult;
import com.psnpsn.MSSearch.model.Town;
import com.psnpsn.MSSearch.model.VehicleCategorie;
import com.psnpsn.MSSearch.service.DirectionService;
import com.psnpsn.MSSearch.service.VehicleService;
import java.security.Principal;
import java.util.ArrayList;
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
    public List<SearchResult> getResult(@RequestBody SearchQ search){
        directionService.saveSearchQ(search);
        List<VehicleCategorie> listCategorie = vehicleService.getAll();
        List<SearchResult> listResult = new ArrayList<>();
        
        Direction direction = new Direction();
        direction = directionService.getDirection(search.getFrom(),search.getTo());
        
        if ( direction != null ) {
            for (VehicleCategorie vc : listCategorie){
                if ( vehicleService.count((int) vc.getIdCategorie()) > 0 ){
                    if (search.persons() < vc.getMax_passengers()){
                        SearchResult result = new SearchResult();
                        result.setCategorie(vc);
                        result.setSearchq(search);
                        result.setPrice(direction);
                        result.setPassengers();
                        result.setLuggage();
                        listResult.add(result);
                    }
                }
            }
        }
        return listResult;
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
