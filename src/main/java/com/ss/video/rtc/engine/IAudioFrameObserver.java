package com.ss.video.rtc.engine;

import com.ss.video.rtc.engine.utils.ByteAudioFrame;

public interface IAudioFrameObserver {
    void onMixedAudioFrame(ByteAudioFrame byteAudioFrame);

    void onPlaybackAudioFrame(ByteAudioFrame byteAudioFrame);

    void onPlaybackAudioFrameBeforeMixing(String str, ByteAudioFrame byteAudioFrame);

    void onRecordAudioFrame(ByteAudioFrame byteAudioFrame);
}
