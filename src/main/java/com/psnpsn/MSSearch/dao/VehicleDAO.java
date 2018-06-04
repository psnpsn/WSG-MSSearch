/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.psnpsn.MSSearch.dao;
import com.psnpsn.MSSearch.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author barkouti
 */
@Repository
public interface VehicleDAO extends JpaRepository<Vehicle, Long>{
    
    public Vehicle findOneByImmatricule(int immatricule);
    
    @Query("SELECT COUNT(id_vehicle) FROM Vehicle WHERE id_categorie=:c")
    public int countVehiclesByCategorie(@Param("c") int c);
}
