package com.airbar.mobile_user_client.android.domain_model.core;

import com.airbar.mobile_user_client.android.domain_model.UserSession;

import java.util.Date;
import java.util.List;

/**
 * Created by brian on 12/11/2015.
 */
public class ElementModificationRecord
{
    public class FieldModificationRecord {
        String fieldName;
        Object previousValue;
        Object currentValue;
    }

    protected Date timestamp;
    protected ElementModificationEventType modificationEventType;
    protected List<FieldModificationRecord> fieldChangesets;
    protected UserSession sessionModifiedBy;

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public ElementModificationEventType getModificationEventType() {
        return this.modificationEventType;
    }

    public void setModificationEventType(ElementModificationEventType modificationEventType) {
        this.modificationEventType = modificationEventType;
    }

    public List<FieldModificationRecord> getFieldChangesets() {
        return this.fieldChangesets;
    }

    public void setFieldChangesets(List<FieldModificationRecord> fieldChangesets) {
        this.fieldChangesets = fieldChangesets;
    }

    public UserSession getSessionModifiedBy() {
        return this.sessionModifiedBy;
    }

    public void setSessionModifiedBy(UserSession sessionModifiedBy) {
        this.sessionModifiedBy = sessionModifiedBy;
    }
}