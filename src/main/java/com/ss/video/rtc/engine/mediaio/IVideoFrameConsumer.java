package com.ss.video.rtc.engine.mediaio;

public interface IVideoFrameConsumer {
    void consumeVideoFrame(RtcVideoFrame rtcVideoFrame);
}
