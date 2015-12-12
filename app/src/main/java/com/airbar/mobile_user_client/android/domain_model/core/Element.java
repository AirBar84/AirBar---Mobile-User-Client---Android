package com.airbar.mobile_user_client.android.domain_model.core;

import java.util.List;
import java.util.UUID;

/**
 * Created by brian on 12/11/2015.
 */
public class Element {

    protected UUID identifier;
    protected String title;
    protected List<ElementModificationRecord> modificationRecords;

    /**
     *
     */
    public Element() {
        this(null, null, null);
    }

    /**
     *
     */
    public Element(UUID identifier, String title, List<ElementModificationRecord> modificationRecords) {
        this.identifier = identifier;
        this.title = title;
        this.modificationRecords = modificationRecords;
    }

    public UUID getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ElementModificationRecord> getModificationRecords() {
        return this.modificationRecords;
    }

    public void setModificationRecords(List<ElementModificationRecord> modificationRecords) {
        this.modificationRecords = modificationRecords;
    }
}