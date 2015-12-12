package com.airbar.mobile_user_client.android.domain_model;

import java.util.List;

/**
 * Object representing a
 *
 * Created by brian on 12/11/2015.
 */
public class AirBarStationTransaction {


    List<AirBarStationContentItem> contentsOfPurchase;
    float purchasePriceInUSD;
    UserIdentifier purchaser;
    PaymentMethod paymentMethod;

    /**
     * Enumerated Object holding the value of the current status of the transaction.
     */
    AirBarStationTransactionStatusType currentTransactionStatus;
}
