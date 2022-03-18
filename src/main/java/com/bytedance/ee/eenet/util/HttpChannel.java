package com.bytedance.ee.eenet.util;

public enum HttpChannel {
    RustChannel("rustChannel"),
    OkHttpChannel("okHttp3Channel");
    
    private String channel;

    public String toString() {
        return this.channel;
    }

    private HttpChannel(String str) {
        this.channel = str;
    }
}
