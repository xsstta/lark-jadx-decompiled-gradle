package com.ss.ttvideoengine;

public interface PlayerEventListener {
    void onAudioDecoderOpened(int i, long j, long j2);

    void onAudioInputFormatChanged(VideoFormatInfo videoFormatInfo);

    void onAudioRenderOpened(int i, long j, long j2);

    void onMediaOpened(VideoFormatInfo videoFormatInfo, long j, long j2);

    void onVideoDecodedFirstFrame(long j);

    void onVideoDecoderOpened(int i, long j, long j2);

    void onVideoInputFormatChanged(VideoFormatInfo videoFormatInfo);

    void onVideoRenderOpened(int i, long j, long j2);
}
