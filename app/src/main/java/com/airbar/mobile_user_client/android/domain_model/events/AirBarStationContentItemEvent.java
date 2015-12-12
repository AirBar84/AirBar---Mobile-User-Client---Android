
package com.airbar.mobile_user_client.android.domain_model.events;

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
        ReplacingWithDifferantItem
    }


    protected ContentItemEventReasonType eventReasonType;

    public AirBarStationContentItemEvent() {
        super(UUID.randomUUID(), new Date(), AirBarStationContentItemEvent.class, null);
    }


    public AirBarStationContentItemEvent(ContentItemEventReasonType eventReasonType,
                                         Date timestamp, UserSession initiatingUser) {
        this.setEventIdentifier(UUID.randomUUID());
        this.setTimestamp(timestamp);
        this.setEventType(this.getClass());
        this.initiatingUser = initiatingUser;

        this.eventReasonType = eventReasonType;
    }


    public ContentItemEventReasonType getEventReasonType() {
        return this.eventReasonType;
    }

    public void setEventReasonType(ContentItemEventReasonType eventReasonType) {
        this.eventReasonType = eventReasonType;
    }

}
