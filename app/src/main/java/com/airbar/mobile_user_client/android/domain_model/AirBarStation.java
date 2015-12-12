package com.airbar.mobile_user_client.android.domain_model;

import java.util.List;
import java.util.UUID;

/**
 * Represents the AirBar Station at the Host Location.
 *
 * Created by brian on 12/11/2015.
 */
public class AirBarStation {

    protected UUID stationIdentifier;
    protected String stationTitle;
    protected HostRentalUnit hostUnitOfStation;
    protected List<UserIdentifier> currentlyPairedUsers;
    protected List<AirBarStationContentItem> currentContents;
    protected List<AirBarStationTransaction> transactionsForCurrentlyPaired;

    public UUID getStationIdentifier() {
        return this.stationIdentifier;
    }

    public void setStationIdentifier(UUID stationIdentifier) {
        this.stationIdentifier = stationIdentifier;
    }

    public String getStationTitle() {
        return this.stationTitle;
    }

    public void setStationTitle(String stationTitle) {
        this.stationTitle = stationTitle;
    }

    /**
     * The rental unit operated by the Host User.
     *
     * @return
     */
    public HostRentalUnit getHostUnitOfStation() {
        return this.hostUnitOfStation;
    }

    /**
     * Setter for the hostUnitOfStation -- Host Rental Unit to which this station is currently placed in or resides at.
     *
     * @param hostUnitOfStation
     */
    public void setHostUnitOfStation(HostRentalUnit hostUnitOfStation) {
        this.hostUnitOfStation = hostUnitOfStation;
    }

    /**
     * List of Users currently "paired to" or setup with accounts on this Station.
     * @return
     */
    public List<UserIdentifier> getCurrentlyPairedUsers() {
        return this.currentlyPairedUsers;
    }

    public void setCurrentlyPairedUsers(List<UserIdentifier> currentlyPairedUsers) {
        this.currentlyPairedUsers = currentlyPairedUsers;
    }

    public List<AirBarStationContentItem> getCurrentContents() {
        return this.currentContents;
    }

    public void setCurrentContents(List<AirBarStationContentItem> currentContents) {
        this.currentContents = currentContents;
    }

    public List<AirBarStationTransaction> getTransactionsForCurrentlyPaired() {
        return this.transactionsForCurrentlyPaired;
    }

    public void setTransactionsForCurrentlyPaired(List<AirBarStationTransaction> transactionsForCurrentlyPaired) {
        this.transactionsForCurrentlyPaired = transactionsForCurrentlyPaired;
    }
}
