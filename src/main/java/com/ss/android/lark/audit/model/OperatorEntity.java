package com.ss.android.lark.audit.model;

import java.io.Serializable;

public class OperatorEntity implements Serializable {
    public OperatorDetail detail;
    public int entityType;
    public String value = "";

    public OperatorEntity() {
    }

    public OperatorEntity(int i, String str, OperatorDetail operatorDetail) {
        this.entityType = i;
        this.value = str;
        this.detail = operatorDetail;
    }
}
