package com.airbar.mobile_user_client.android.domain_model;

import com.airbar.mobile_user_client.android.domain_model.core.Element;
import com.airbar.mobile_user_client.android.domain_model.core.ElementModificationRecord;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * AirBar Account - Core Domain Model Component for Android Mobile Client.
 *
 * Created by brian on 12/11/2015.
 */
public class Account extends Element {

    public enum AccountType {
        /**
         * An Account for a Host, a user of AirBnB who is putting a room up for rent.
         */
        Host,

        /**
         * An Account for a Guest, a user of AirBnB who is staying at a rented room or building (i.e. house).
         */
        Guest
    }


    protected AccountType accountType;
    protected String airbarUsername;
    // TODO: airbarPassword (key? token? how to handle password storage in Android?)
    protected String emailAddress;
    protected String firstName;
    protected String lastName;
    protected Date birthdate;
    protected List<PaymentMethod> paymentMethods;

    public Account() {
        this(null, null, null, null, null, null, null, null, null);
    }

    /**
     * Properties constructor for Account Class.
     *
     * @param identifier - A unique identifier for this account. This should be a guid that is generated when the account is created the first time.
     * @param modificationRecords - A list of modifications that have been made to this account.
     * @param accountType - The type of account that this is. This can be one of Host or Guest currently.
     * @param airbarUsername - The username of this Account/User within the AirBar system. This will be used to login and track sessions with the server, process payments, etc.
     * @param emailAddress - The email address of this Account. This is also the suggested default username.
     * @param firstName - The first given name of this User.
     * @param lastName - the Last given name of this User.
     * @param birthdate - The date of birth for this user.
     * @param paymentMethods - Currently configured forms of Payment.
     */
    public Account(UUID identifier, List<ElementModificationRecord> modificationRecords,
                   AccountType accountType, String airbarUsername, String emailAddress,
                   String firstName, String lastName, Date birthdate,
                   List<PaymentMethod> paymentMethods)
    {
        super(identifier, "", modificationRecords);

        this.identifier = identifier;
        this.modificationRecords = modificationRecords;
        this.accountType = accountType;
        this.airbarUsername = airbarUsername;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.paymentMethods = paymentMethods;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getAirbarUsername() {
        return this.airbarUsername;
    }

    public void setAirbarUsername(String airbarUsername) {
        this.airbarUsername = airbarUsername;
    }

    // TODO: airbarPassword (key? token? how to handle password storage in Android?)
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
}
