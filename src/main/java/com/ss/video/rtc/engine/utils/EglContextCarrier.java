package com.ss.video.rtc.engine.utils;

import org.webrtc.EglBase;

public interface EglContextCarrier {
    EglBase.Context getEglBaseContext();

    void setEglBaseContext(EglBase.Context context);
}
