package com.ss.android.lark.audit.model;

import java.io.Serializable;

public class RecipientEntity implements Serializable {
    public RecipientDetail detail;
    public int entityType;
    public String value = "";

    public RecipientEntity() {
    }

    public RecipientEntity(int i, String str, RecipientDetail recipientDetail) {
        this.entityType = i;
        this.value = str;
        this.detail = recipientDetail;
    }
}
