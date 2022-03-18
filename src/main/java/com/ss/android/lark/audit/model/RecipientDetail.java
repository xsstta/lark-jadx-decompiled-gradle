package com.ss.android.lark.audit.model;

import java.io.Serializable;

public class RecipientDetail implements Serializable {
    public int permissionActionType;

    public RecipientDetail() {
    }

    public RecipientDetail(int i) {
        this.permissionActionType = i;
    }
}
