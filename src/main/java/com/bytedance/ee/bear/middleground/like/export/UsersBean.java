package com.bytedance.ee.bear.middleground.like.export;

import java.io.Serializable;

public class UsersBean implements Serializable {
    private String avatar_url;
    private String en_name;
    private String id;
    private String name;

    public String getAvatar_url() {
        return this.avatar_url;
    }

    public String getEn_name() {
        return this.en_name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "UsersBean{avatar_url='" + this.avatar_url + '\'' + ", en_name='" + this.en_name + '\'' + ", id='" + this.id + '\'' + ", name='" + this.name + '\'' + '}';
    }

    public void setAvatar_url(String str) {
        this.avatar_url = str;
    }

    public void setEn_name(String str) {
        this.en_name = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
