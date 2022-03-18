package com.bytedance.ee.bear.net;

public class RawServerResult extends ServerResult {
    private String mJson;

    public String getJson() {
        return this.mJson;
    }

    public void setJson(String str) {
        this.mJson = str;
    }
}
