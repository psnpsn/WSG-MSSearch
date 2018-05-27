/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.dao;

import com.psnpsn.MSSearch.model.Town;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Guqnn
 */
@Repository
public interface TownDAO extends JpaRepository<Town, Long> {
    
}
