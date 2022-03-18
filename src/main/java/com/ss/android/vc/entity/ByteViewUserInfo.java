package com.ss.android.vc.entity;

import java.io.Serializable;

public class ByteViewUserInfo implements Serializable {
    public String avatar_key;
    public String avatar_url_tpl;
    public String displayName;
    public String fullName;
    public ByteviewUser user;

    public String toString() {
        return "ByteViewUserInfo{user=" + this.user + ", avatar_key='" + this.avatar_key + '\'' + '}';
    }
}
