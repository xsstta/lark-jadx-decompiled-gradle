package com.ss.video.rtc.engine;

public interface RtcHttpClient {

    public interface RtcHttpCallback {
        void run(int i, String str);
    }

    void GetAsync(String str, RtcHttpCallback rtcHttpCallback, int i);

    void PostAsync(String str, String str2, RtcHttpCallback rtcHttpCallback, int i);
}
