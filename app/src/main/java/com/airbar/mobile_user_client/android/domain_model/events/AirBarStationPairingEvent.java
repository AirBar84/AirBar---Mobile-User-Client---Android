package com.airbar.mobile_user_client.android.domain_model.events;

/**
 * Created by brian on 12/11/2015.
 */
public class AirBarStationPairingEvent extends Event {

    /**
     *
     */
    public enum AirBarStationPairingEventType {
        UserPairedWithStation,
        UserUnpairedWithStation
    }

    AirBarStationPairingEventType eventType;

    public AirBarStationPairingEvent() {

    }
}
