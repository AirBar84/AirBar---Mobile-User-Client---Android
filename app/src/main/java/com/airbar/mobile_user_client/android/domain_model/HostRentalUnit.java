package com.airbar.mobile_user_client.android.domain_model;

import java.util.List;
import java.util.UUID;

/**
 * Created by brian on 12/11/2015.
 */
public class HostRentalUnit {

    UUID identifier;

    /**
     * A name to give this rental unit. This will be displayed in Maps, on lists, etc.
     */
    String rentalUnitName;

    Address rentalUnitAddress;

    GeoLocation rentalUnitGeoLocation;


    /**
     * AirBar account of individual who rents the location, serving in the AirBnB Host Role.
     */
    Account rentalUnitHost;

    List<AirBarStation> airbarStations;
}
