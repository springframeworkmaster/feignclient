
package com.springframeworkmater.cloud.feignclient.domains;

import java.io.Serializable;

public class Address implements Serializable
{

    private Long id;
    private String streetName;
    private String city;
    private String state;
    private String pincode;
    private final static long serialVersionUID = 8274351798459223571L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

}
