package com.airbar.mobile_user_client.android.domain_model.events;

import com.airbar.mobile_user_client.android.domain_model.AirBarStation;
import com.airbar.mobile_user_client.android.domain_model.HostRentalUnit;
import com.airbar.mobile_user_client.android.domain_model.UserIdentifier;

import java.util.Date;
import java.util.UUID;

/**
 * Event generated when a User is paired with an AirBar Station. Components of this object are:
 *
 *   - User
 *   - Where they are staying or a Stay-Duration/Checkin.
 *   - The Station itself.
 *
 * Created by brian on 12/11/2015.
 */
public class AirBarStationPairingEvent extends Event {

    /**
     * The Type of Pairing, weather it is a connection event or a disconnection event.
     */
    public enum AirBarStationPairingType {
        UserPairedWithStation,
        UserUnpairedWithStation
    }


    protected HostRentalUnit rentalUnit;
    protected AirBarStation station;
    protected AirBarStationPairingType pairingType;

    public AirBarStationPairingEvent() {
        this(null, null, null, null);
    }

    public AirBarStationPairingEvent(UserIdentifier userIdentifier, HostRentalUnit rentalUnit, AirBarStation station, AirBarStationPairingType pairingType) {
        super(UUID.randomUUID(), new Date(), AirBarStationPairingEvent.class, userIdentifier);

        this.rentalUnit = rentalUnit;
        this.station = station;
        this.eventType = eventType;
    }

    public HostRentalUnit getRentalUnit() {
        return this.rentalUnit;
    }

    public void setRentalUnit(HostRentalUnit rentalUnit) {
        this.rentalUnit = rentalUnit;
    }

    public AirBarStation getStation() {
        return this.station;
    }

    public void setStation(AirBarStation station) {
        this.station = station;
    }
}
