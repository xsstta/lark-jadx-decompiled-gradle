package com.ss.video.rtc.engine;

import com.ss.video.rtc.engine.utils.ByteAudioFrame;

public interface IAudioFrameTestObserver {
    void onAudioRecordFrame(ByteAudioFrame byteAudioFrame);

    void onLocalAudioVolume(int i, int i2);

    boolean onPlayoutBufferSink(int i, ByteAudioFrame byteAudioFrame);
}
