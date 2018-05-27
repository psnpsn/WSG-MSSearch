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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Guqnn
 */
@Entity
public class Direction {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long idDirection;
    
    @ManyToOne
    @JoinColumn(name="idA")
    private Airport pointA;
    
    @ManyToOne
    @JoinColumn(name="idB")
    private Town pointB;
    
    private int distance;
    private int prixAdult;
    private int prixEnfant;
    private int prixBebe;

    public Direction() {
    }

    public Direction(Airport pointA, Town pointB, int distance, int prixAdult, int prixEnfant, int prixBebe) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.distance = distance;
        this.prixAdult = prixAdult;
        this.prixEnfant = prixEnfant;
        this.prixBebe = prixBebe;
    }

    public long getIdDirection() {
        return idDirection;
    }

    public void setIdDirection(long idDirection) {
        this.idDirection = idDirection;
    }

    public Airport getPointA() {
        return pointA;
    }

    public void setPointA(Airport pointA) {
        this.pointA = pointA;
    }

    public Town getPointB() {
        return pointB;
    }

    public void setPointB(Town pointB) {
        this.pointB = pointB;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPrixAdult() {
        return prixAdult;
    }

    public void setPrixAdult(int prixAdult) {
        this.prixAdult = prixAdult;
    }

    public int getPrixEnfant() {
        return prixEnfant;
    }

    public void setPrixEnfant(int prixEnfant) {
        this.prixEnfant = prixEnfant;
    }

    public int getPrixBebe() {
        return prixBebe;
    }

    public void setPrixBebe(int prixBebe) {
        this.prixBebe = prixBebe;
    }

    
   
}
