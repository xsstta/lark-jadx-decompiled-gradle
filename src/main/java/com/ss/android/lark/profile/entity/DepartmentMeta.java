package com.ss.android.lark.profile.entity;

import java.io.Serializable;

public class DepartmentMeta implements Serializable {
    private static final long serialVersionUID = 5756135315854813874L;
    private String mId;
    private String mName;

    public String getId() {
        return this.mId;
    }

    public String getName() {
        return this.mName;
    }

    public DepartmentMeta() {
        this.mId = "";
        this.mName = "";
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public DepartmentMeta(String str, String str2) {
        this.mId = str;
        this.mName = str2;
    }
}
