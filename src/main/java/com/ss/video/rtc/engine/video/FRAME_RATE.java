package com.ss.video.rtc.engine.video;

public enum FRAME_RATE {
    FRAME_RATE_FPS_1(1),
    FRAME_RATE_FPS_7(7),
    FRAME_RATE_FPS_10(10),
    FRAME_RATE_FPS_15(15),
    FRAME_RATE_FPS_24(24),
    FRAME_RATE_FPS_30(30);
    
    private final int value;

    public int getValue() {
        return this.value;
    }

    private FRAME_RATE(int i) {
        this.value = i;
    }
}
