/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.util;

import com.psnpsn.MSSearch.model.Direction;
import com.psnpsn.MSSearch.model.SearchQ;
import com.psnpsn.MSSearch.model.VehicleCategorie;

/**
 *
 * @author Guqnn
 */
public class SearchResult {
    
    private SearchQ searchq;
    private VehicleCategorie categorie;
    private long prix = 0;
    private int passengers = 0;
    private int luggage = 0;

    public SearchResult() {
    }

    public SearchResult(SearchQ searchq, VehicleCategorie categorie, long prix, int passengers, int luggage) {
        this.searchq = searchq;
        this.categorie = categorie;
        this.prix = prix;
        this.passengers = passengers;
        this.luggage = luggage;
    }

    public SearchQ getSearchq() {
        return searchq;
    }

    public void setSearchq(SearchQ searchq) {
        this.searchq = searchq;
    }

    
    public VehicleCategorie getCategorie() {
        return categorie;
    }

    public void setCategorie(VehicleCategorie categorie) {
        this.categorie = categorie;
    }

    public long getPrix() {
        return prix;
    }

    public void setPrix(long prix) {
        this.prix = prix;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getLuggage() {
        return luggage;
    }

    public void setLuggage(int luggage) {
        this.luggage = luggage;
    }
    
    
    
    public void setPrice(Direction d){
        System.out.println(d.getPrixAdult());
        long prix = this.searchq.getAdult()*d.getPrixAdult() + this.searchq.getChildren()*d.getPrixEnfant() + this.searchq.getInfant()*+d.getPrixBebe();
        this.setPrix(prix);
    }
    
    public void setPassengers(){
        if (this.categorie.getMin_passengers() == 1){
            this.passengers = this.searchq.persons();
        }
        else {
            this.passengers = this.categorie.getMax_passengers();
        }
    }
    
    public void setLuggage(){
        if (this.categorie.getMax_luggage() == 1){
            this.luggage = this.searchq.persons();
        }
        else {
            this.luggage = this.categorie.getMax_luggage();
        }
    }
    
}
