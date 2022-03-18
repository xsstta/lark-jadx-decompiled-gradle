package com.ss.android.vc.entity.tab;

import java.io.Serializable;

public class VCParamFromCalendar implements Serializable {
    private String calendar_id;
    private String key;
    private int original_time;
    private int start_time;

    public String getCalendar_id() {
        return this.calendar_id;
    }

    public String getKey() {
        return this.key;
    }

    public int getOriginal_time() {
        return this.original_time;
    }

    public int getStart_time() {
        return this.start_time;
    }

    public void setCalendar_id(String str) {
        this.calendar_id = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setOriginal_time(int i) {
        this.original_time = i;
    }

    public void setStart_time(int i) {
        this.start_time = i;
    }
}
