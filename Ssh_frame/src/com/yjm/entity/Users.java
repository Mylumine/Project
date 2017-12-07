package com.yjm.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private String password;
     private String telphone;
     private String username;
     private String isadmin;
     private Set houses = new HashSet(0);


    // Constructors

    /** default constructor */
    public Users() {
    }

	/** minimal constructor */
    public Users(Integer id) {
        this.id = id;
    }
    
    /** full constructor */
    public Users(Integer id, String name, String password, String telphone, String username, String isadmin, Set houses) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.telphone = telphone;
        this.username = username;
        this.isadmin = isadmin;
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

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelphone() {
        return this.telphone;
    }
    
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getIsadmin() {
        return this.isadmin;
    }
    
    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin;
    }

    public Set getHouses() {
        return this.houses;
    }
    
    public void setHouses(Set houses) {
        this.houses = houses;
    }
   








}