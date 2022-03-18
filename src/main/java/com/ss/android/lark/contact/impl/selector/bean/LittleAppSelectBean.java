package com.ss.android.lark.contact.impl.selector.bean;

import java.io.Serializable;

public class LittleAppSelectBean implements Serializable {
    private String id;
    private boolean isUser;
    private String name;

    public LittleAppSelectBean() {
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isUser() {
        return this.isUser;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setUser(boolean z) {
        this.isUser = z;
    }

    public LittleAppSelectBean(String str, String str2, boolean z) {
        this.id = str;
        this.name = str2;
        this.isUser = z;
    }
}
