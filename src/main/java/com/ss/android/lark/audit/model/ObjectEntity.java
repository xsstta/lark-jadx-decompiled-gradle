package com.ss.android.lark.audit.model;

import java.io.Serializable;

public class ObjectEntity implements Serializable {
    public ObjectDetail detail;
    public int entityType;
    public String value = "";

    public ObjectEntity() {
    }

    public ObjectEntity(int i, String str, ObjectDetail objectDetail) {
        this.entityType = i;
        this.value = str;
        this.detail = objectDetail;
    }
}
