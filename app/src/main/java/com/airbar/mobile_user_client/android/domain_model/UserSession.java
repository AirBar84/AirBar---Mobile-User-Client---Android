package com.airbar.mobile_user_client.android.domain_model;

import java.util.Date;
import java.util.UUID;

/**
 * Created by brian on 12/11/2015.
 */
public class UserSession {

    UUID sessionIdentifier;
    String airbarUsername;
    Date sessionBeginTime;
    Date sessionEndTime;
    UserSessionState currentSessionState;

    public static UserSession currentUserSession() {
        throw new RuntimeException("Not implemented...");
    }
}
