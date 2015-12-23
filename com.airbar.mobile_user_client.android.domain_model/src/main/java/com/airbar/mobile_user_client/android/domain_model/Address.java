package com.airbar.mobile_user_client.android.domain_model;

import com.airbar.mobile_user_client.android.domain_model.core.Element;

/**
 * Created by brian on 12/11/2015.
 */
public class Address extends Element {

    protected String street;
    protected String city;
    protected String state;
    protected String zip;

    public Address()
    {
        this(null, null, null, null);
    }

    public Address(String street, String city, String state, String zip)
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
