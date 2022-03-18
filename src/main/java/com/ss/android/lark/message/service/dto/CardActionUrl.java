package com.ss.android.lark.message.service.dto;

import java.io.Serializable;

public class CardActionUrl implements Serializable {
    private static final long serialVersionUID = 2530852242548850205L;
    private String android_url;
    private String url;

    public String getAndroid_url() {
        return this.android_url;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i;
        String str = this.url;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.android_url;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public void setAndroid_url(String str) {
        this.android_url = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CardActionUrl cardActionUrl = (CardActionUrl) obj;
        String str = this.url;
        if (str == null ? cardActionUrl.url != null : !str.equals(cardActionUrl.url)) {
            return false;
        }
        String str2 = this.android_url;
        String str3 = cardActionUrl.android_url;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }
}
