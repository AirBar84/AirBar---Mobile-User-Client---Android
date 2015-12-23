package com.airbar.mobile_user_client.android.domain_model.airbnb_events;

import com.airbar.mobile_user_client.android.domain_model.HostRentalUnit;
import com.airbar.mobile_user_client.android.domain_model.events.Event;

import java.util.Date;

/**
 *
 *
 * Created by brian on 12/11/2015.
 */
public class AirBnBCheckInEvent extends Event {

    // TODO: We're going to have to capture both checkin and checkout events... If they have checked out from AirBNB we should/it would be cool to unpair them from the station at that point.
    // TODO: Or, show them a list of Stations at that location and let them select which stations to pair with...
    // TODO: How to handle multiple people interacting with a Station (many individuals are staying at a house... they want to each have their own payment plan with the Station...

    protected String airBnbGuestAccountUsername;
    protected HostRentalUnit hostLocation;
    protected Date checkInTime;

    public AirBnBCheckInEvent() {
        this(null, null, null);
    }

    public AirBnBCheckInEvent(String airBnbGuestAccountUsername, HostRentalUnit hostLocation, Date checkInTime) {
        this.airBnbGuestAccountUsername = airBnbGuestAccountUsername;
        this.hostLocation = hostLocation;
        this.checkInTime = checkInTime;
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

    public Date getCheckInTime() {
        return this.checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }
}
