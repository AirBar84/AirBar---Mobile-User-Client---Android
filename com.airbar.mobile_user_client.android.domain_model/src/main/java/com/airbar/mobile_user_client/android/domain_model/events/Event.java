package com.airbar.mobile_user_client.android.domain_model.events;

import com.airbar.mobile_user_client.android.domain_model.UserIdentifier;
import com.airbar.mobile_user_client.android.domain_model.UserSession;

import java.util.Date;
import java.util.UUID;

/**
 *  AirBar Base Event Type - Core Domain Model Component for Android Mobile Client.
 *
 * Created by brian on 12/11/2015.
 */
public class Event {

    protected UUID eventIdentifier;
    protected Date timestamp;
    protected Class<? extends Event> eventType;
    protected UserIdentifier initiatingUser;

    public Event() {
        this(UUID.randomUUID(), new Date(), null, null);
    }

    public Event(UUID eventIdentifier, Date timestamp, Class<? extends Event> eventType, UserIdentifier initiatingUser) {
        this.eventIdentifier = eventIdentifier;
        this.timestamp = timestamp;
        this.eventType = eventType;
        this.initiatingUser = initiatingUser;
    }

    public UUID getEventIdentifier() {
        return this.eventIdentifier;
    }

    public void setEventIdentifier(UUID eventIdentifier) {
        this.eventIdentifier = eventIdentifier;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Class<? extends Event> getEventType() {
        return this.eventType;
    }

    public void setEventType(Class<? extends Event> eventType) {
        this.eventType = eventType;
    }

    public UserIdentifier getInitiatingUser() {
        return this.initiatingUser;
    }

    public void setInitiatingUser(UserIdentifier initiatingUser) {
        this.initiatingUser = initiatingUser;
    }
}
