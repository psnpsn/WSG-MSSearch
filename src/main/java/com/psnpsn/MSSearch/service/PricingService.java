/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.service;

import com.psnpsn.MSSearch.dao.DirectionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Guqnn
 */
@Service
public class PricingService {
    
    @Autowired
    private DirectionDAO directionDao;
}
