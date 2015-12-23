package com.airbar.mobile_user_client.android.domain_model.airbnb_events;

import com.airbar.mobile_user_client.android.domain_model.HostRentalUnit;
import com.airbar.mobile_user_client.android.domain_model.events.Event;

import java.util.Date;

/**
 * Created by brian on 12/11/2015.
 */
public class AirBnBCheckOutEvent extends Event {

    protected String airBnbGuestAccountUsername;
    protected HostRentalUnit hostLocation;
    protected Date checkOutTime;

    public AirBnBCheckOutEvent() {
        this(null, null, null);
    }

    public AirBnBCheckOutEvent(String airBnbGuestAccountUsername, HostRentalUnit hostLocation, Date checkOutTime) {
        this.airBnbGuestAccountUsername = airBnbGuestAccountUsername;
        this.hostLocation = hostLocation;
        this.checkOutTime = checkOutTime;
    }

    public String getAirBnbGuestAccountUsername() {
        return this.airBnbGuestAccountUsername;
    }

    public void setAirBnbGuestAccountUsername(String airBnbGuestAccountUsername) {
        this.airBnbGuestAccountUsername = airBnbGuestAccountUsername;
    }

    public HostRentalUnit getHostLocation() {
        return this.hostLocation;
    }

    public void setHostLocation(HostRentalUnit hostLocation) {
        this.hostLocation = hostLocation;
    }

    public Date getCheckOutTime() {
        return this.checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }
}