
package com.airbar.mobile_user_client.android.domain_model.events;

import com.airbar.mobile_user_client.android.domain_model.UserIdentifier;
import com.airbar.mobile_user_client.android.domain_model.UserSession;

import java.util.Date;
import java.util.UUID;

/**
 * Event for Actions occuring to the contents within the AirBar Station Fridge.
 *
 * Events Are:
 *    - Adding (by stocking or returning), removing (by purchasing or replacing)
 *    - Content (Items for sale) within the AirBar Station.
 *
 * Created by brian on 12/11/2015.
 */
public class AirBarStationContentItemEvent extends Event {

    /**
     * Station Content Change/Modification Event....
     *    - ItemAdded
     *    - ItemRemoved
     */
    public enum ContentItemEventType {
        ContentItemAdded, // added-reason-type: restalking, returning, etc
        ContentItemRemoved
    }

    /**
     *
     */
    public interface ContentItemEventReasonType {}

    /**
     * Reason for content removal:
     *
     * They can be:
     *    - Item was purchased by the Guest.
     *    - Item was replaced by the Host.
     */
    public enum ContentItemAddedEventReasonType implements ContentItemEventReasonType {
        Restocking,
        Returning
    }

    /**
     * Reason for content removal:
     *
     * They can be:
     *    - Item was purchased by the Guest (Purchasing).
     *    - Item was replaced by the Host (ReplacingWithDifferantItem).
     */
    public enum ContentItemRemovedEventReasonType implements ContentItemEventReasonType {
        Purchasing,
        Replacing,
    }


    protected ContentItemEventType itemActionType;
    protected ContentItemEventReasonType itemReasonType;

    public AirBarStationContentItemEvent() {
        this(null, null, null);
    }

    /**
     * Creates a new Station Content Event.
     *
     * @param eventReasonType
     * @param initiatingUser
     */
    public AirBarStationContentItemEvent(ContentItemEventType itemActionType, ContentItemEventReasonType itemReasonType, UserIdentifier initiatingUser) {
        super(UUID.randomUUID(), new Date(), AirBarStationContentItemEvent.class, initiatingUser);

        this.setItemActionType(itemActionType);
        this.setItemReasonType(itemReasonType);
    }

    public AirBarStationContentItemEvent(UUID eventIdentifier, Date timestamp, UserIdentifier initiatingUser,
                                         ContentItemEventType itemActionType, ContentItemEventReasonType itemReasonType) {
        this.setEventIdentifier(eventIdentifier);
        this.setTimestamp(timestamp);
        this.setEventType(this.getClass());
        this.setInitiatingUser(initiatingUser);

        this.setItemActionType(itemActionType);
        this.setItemReasonType(itemReasonType);
    }


    public ContentItemEventType getItemActionType() {
        return this.itemActionType;
    }

    public void setItemActionType(ContentItemEventType itemActionType) {
        this.itemActionType = itemActionType;
    }

    public ContentItemEventReasonType getItemReasonType() {
        return this.itemReasonType;
    }

    public void setItemReasonType(ContentItemEventReasonType itemReasonType) {
        this.itemReasonType = itemReasonType;
    }
}
