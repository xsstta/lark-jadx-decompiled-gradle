package com.ss.android.lark.profile.entity;

import java.io.Serializable;

public class Position implements Serializable {
    private static final long serialVersionUID = 7031608951635821547L;
    private String mName;

    public String getName() {
        return this.mName;
    }

    public Position() {
        this.mName = "";
    }

    public void setName(String str) {
        this.mName = str;
    }

    public Position(String str) {
        this.mName = str;
    }
}
