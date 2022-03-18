package com.bytedance.ee.bear.document.event;

import java.io.Serializable;

public class EventModel implements Serializable {
    private String event;
    private String token;
    private String type;

    public String getEvent() {
        return this.event;
    }

    public String getToken() {
        return this.token;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "EventModel{event='" + this.event + '\'' + ", type='" + this.type + '\'' + '}';
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
