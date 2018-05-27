/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Guqnn
 */
@Entity
public class Airport {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String code;
    private String nom;

    public Airport() {
    }

    public Airport(String code, String nom) {
        this.code = code;
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    

   
    
    
}
