package com.ss.video.rtc.engine;

public class InternalRtcUser {
    public String metaData;
    public String userId;

    public String toString() {
        return "InternalRtcUser{userId='" + this.userId + '\'' + ", metaData='" + this.metaData + '\'' + '}';
    }

    public InternalRtcUser(String str, String str2) {
        this.userId = str;
        this.metaData = str2;
    }

    private static InternalRtcUser create(String str, String str2) {
        return new InternalRtcUser(str, str2);
    }
}
