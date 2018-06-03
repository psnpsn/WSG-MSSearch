/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.dao;

import com.psnpsn.MSSearch.model.Airport;
import com.psnpsn.MSSearch.model.Direction;
import com.psnpsn.MSSearch.model.Town;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Guqnn
 */
@Repository
public interface DirectionDAO extends JpaRepository<Direction, Long> {
    
    public Direction findByAirportAndTown(Airport air, Town town);
}
