package com.myleisure.demotddspring.model;


import java.util.Date;

public class Actor {
    private String id;
    private String firstName;
    private String lastName;
    private Date lastUpdate;

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
