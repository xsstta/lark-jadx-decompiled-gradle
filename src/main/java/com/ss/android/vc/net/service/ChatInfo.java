package com.ss.android.vc.net.service;

import java.io.Serializable;

public class ChatInfo implements Serializable {
    private String avatarKey;
    private String id;
    private String name;

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "{id = " + this.id + ", name = " + this.name + ", avatarKey = " + this.avatarKey + "}";
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
