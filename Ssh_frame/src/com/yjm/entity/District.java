package com.yjm.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * District entity. @author MyEclipse Persistence Tools
 */

public class District  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private Set streets = new HashSet(0);


    // Constructors

    /** default constructor */
    public District() {
    }

	/** minimal constructor */
    public District(Integer id) {
        this.id = id;
    }
    
    /** full constructor */
    public District(Integer id, String name, Set streets) {
        this.id = id;
        this.name = name;
        this.streets = streets;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Set getStreets() {
        return this.streets;
    }
    
    public void setStreets(Set streets) {
        this.streets = streets;
    }
   








}