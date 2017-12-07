package com.yjm.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Types entity. @author MyEclipse Persistence Tools
 */

public class Types  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private Set houses = new HashSet(0);


    // Constructors

    /** default constructor */
    public Types() {
    }

	/** minimal constructor */
    public Types(Integer id) {
        this.id = id;
    }
    
    /** full constructor */
    public Types(Integer id, String name, Set houses) {
        this.id = id;
        this.name = name;
        this.houses = houses;
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

    public Set getHouses() {
        return this.houses;
    }
    
    public void setHouses(Set houses) {
        this.houses = houses;
    }
   








}