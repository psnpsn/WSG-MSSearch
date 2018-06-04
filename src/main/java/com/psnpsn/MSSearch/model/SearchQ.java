/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psnpsn.MSSearch.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
public class SearchQ {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private LocalDateTime dateQuery;
    private int adult;
    private int children;
    private int infant;
    @ManyToOne
    @JoinColumn
    private Airport from;
    @ManyToOne
    @JoinColumn
    private Town to;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate searchedDate;
    private String searchedTime;
    private String clientUsername;

    public SearchQ() {
    }

    public SearchQ(LocalDateTime dateQuery, int adult, int children, int infant, Airport from, Town to, LocalDate searchedDate, String clientUsername) {
        this.dateQuery = dateQuery;
        this.adult = adult;
        this.children = children;
        this.infant = infant;
        this.from = from;
        this.to = to;
        this.searchedDate = searchedDate;
        this.clientUsername = clientUsername;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDateQuery() {
        return dateQuery;
    }

    public void setDateQuery(LocalDateTime dateQuery) {
        this.dateQuery = dateQuery;
    }

    public int getAdult() {
        return adult;
    }

    public void setAdult(int adult) {
        this.adult = adult;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getInfant() {
        return infant;
    }

    public void setInfant(int infant) {
        this.infant = infant;
    }

    public Airport getFrom() {
        return from;
    }

    public void setFrom(Airport from) {
        this.from = from;
    }

    public Town getTo() {
        return to;
    }

    public void setTo(Town to) {
        this.to = to;
    }

    public LocalDate getSearchedDate() {
        return searchedDate;
    }

    public void setSearchedDate(LocalDate searchedDate) {
        this.searchedDate = searchedDate;
    }

    public String getClientUsername() {
        return clientUsername;
    }

    public void setClientUsername(String clientUsername) {
        this.clientUsername = clientUsername;
    }
    
    public int persons(){
        return this.adult+this.children+this.infant;
    }
    
    
}
