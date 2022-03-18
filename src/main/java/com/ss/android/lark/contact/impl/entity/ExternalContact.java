package com.ss.android.lark.contact.impl.entity;

import java.io.Serializable;

public class ExternalContact implements Serializable {
    private static final long serialVersionUID = -1576990577080993273L;
    private String chatterId;
    private String id;
    private boolean isDeleted;

    public String getChatterId() {
        return this.chatterId;
    }

    public String getId() {
        return this.id;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    public void setChatterId(String str) {
        this.chatterId = str;
    }

    public void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public void setId(String str) {
        this.id = str;
    }
}
