/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.controller;

import com.psnpsn.MSSearch.service.PricingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Guqnn
 */
@RestController
public class SearchController {
    
   
    @Autowired
    private PricingService pricingService;
    
    @GetMapping("/search/{fromtype}/{fromcode}/{totype}/{tocode}/{date}/{adult}/{children}/{infant}")
    public List<?> getResult(@PathVariable String fromtype,@PathVariable String fromcode,@PathVariable String totype,@PathVariable String tocode
    ,@PathVariable String date,@PathVariable String adult,@PathVariable String children,@PathVariable String infant) {
        return null;
    }
}
