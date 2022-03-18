package com.ss.android.lark.profile.entity;

import java.io.Serializable;

public class OrgUnit implements Serializable {
    private static final long serialVersionUID = 3281645349962246767L;
    private String mName;

    public String getName() {
        return this.mName;
    }

    public OrgUnit() {
        this.mName = "";
    }

    public void setName(String str) {
        this.mName = str;
    }

    public OrgUnit(String str) {
        this.mName = str;
    }
}
