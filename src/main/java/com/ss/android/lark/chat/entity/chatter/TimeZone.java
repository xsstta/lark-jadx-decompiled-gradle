package com.ss.android.lark.chat.entity.chatter;

import java.io.Serializable;

public class TimeZone implements Serializable {
    private String timeZoneId;

    public String getTimeZoneId() {
        return this.timeZoneId;
    }

    public void setTimeZoneId(String str) {
        this.timeZoneId = str;
    }
}
