package com.ss.android.lark.chat.entity.location;

import java.io.Serializable;

public class LocationDescription implements Serializable {
    private static final long serialVersionUID = 8695143798508814510L;
    private String description;
    private String name;

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
