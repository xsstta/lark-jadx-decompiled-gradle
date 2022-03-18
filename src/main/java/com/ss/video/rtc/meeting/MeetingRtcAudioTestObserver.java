package com.ss.video.rtc.meeting;

import android.util.Log;
import com.ss.video.rtc.engine.IAudioFrameTestObserver;
import com.ss.video.rtc.engine.utils.ByteAudioFrame;
import com.ss.video.rtc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;

public class MeetingRtcAudioTestObserver {
    ByteAudioFrame audioFrame;
    private int bytesPerSample;
    private int channelsCount;
    private WeakReference<MeetingRtcEngineImpl> mRtcEngineImpl;
    private int sampleCount;

    public MeetingRtcAudioTestObserver(MeetingRtcEngineImpl meetingRtcEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(meetingRtcEngineImpl);
    }

    /* access modifiers changed from: package-private */
    public ByteAudioFrame onPlayoutBufferSink(int i) {
        if (this.mRtcEngineImpl.get() == null) {
            LogUtil.m257130e("MeetingRtcAudioTestObserver", "MeetingRtcEngineImpl handler is null, return!!!");
            return null;
        }
        if (this.sampleCount == 0) {
            this.sampleCount = 160;
            this.channelsCount = 1;
            this.bytesPerSample = 2;
        }
        int i2 = this.sampleCount * this.channelsCount * this.bytesPerSample;
        IAudioFrameTestObserver audioFrameTestHandler = MeetingRtcEngineImpl.getAudioFrameTestHandler();
        if (audioFrameTestHandler != null) {
            if (this.audioFrame == null) {
                int i3 = this.sampleCount;
                this.audioFrame = new ByteAudioFrame(new byte[i2], i3, this.bytesPerSample, this.channelsCount, i3 * 100);
            }
            audioFrameTestHandler.onPlayoutBufferSink(i, this.audioFrame);
            Log.i("MeetingRtcAudioTestObserver", "onPlayoutBufferSink: sample: " + this.audioFrame.samples + ", numOfSample: " + this.audioFrame.numOfSamples + ", bytes: " + this.audioFrame.bytesPerSample + ", channels: " + this.audioFrame.channels);
        } else {
            LogUtil.m257130e("MeetingRtcAudioTestObserver", "audio frame handler is null");
        }
        return this.audioFrame;
    }

    /* access modifiers changed from: package-private */
    public void onLocalAudioVolume(int i, int i2) {
        if (this.mRtcEngineImpl.get() == null) {
            LogUtil.m257130e("MeetingRtcAudioTestObserver", "MeetingRtcEngineImpl handler is null, return!!!");
            return;
        }
        IAudioFrameTestObserver audioFrameTestHandler = MeetingRtcEngineImpl.getAudioFrameTestHandler();
        if (audioFrameTestHandler != null) {
            audioFrameTestHandler.onLocalAudioVolume(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void onAudioRecordFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        if (this.mRtcEngineImpl.get() == null) {
            LogUtil.m257130e("MeetingRtcAudioTestObserver", "MeetingRtcEngineImpl handler is null, return!!!");
            return;
        }
        IAudioFrameTestObserver audioFrameTestHandler = MeetingRtcEngineImpl.getAudioFrameTestHandler();
        Log.i("MeetingRtcAudioTestObserver", "onAudioRecordFrame 1: sample: " + bArr + ", numOfSample: " + i + ", bytes: " + i2 + ", channels: " + i3);
        if (audioFrameTestHandler != null) {
            audioFrameTestHandler.onAudioRecordFrame(new ByteAudioFrame(bArr, i, i2, i3, i4));
            Log.i("MeetingRtcAudioTestObserver", "onAudioRecordFrame 2");
        }
        int i5 = this.sampleCount;
        if (i5 == 0 && i5 != i) {
            this.sampleCount = i;
            this.channelsCount = i3;
            this.bytesPerSample = i2;
            LogUtil.m257132i("MeetingRtcAudioTestObserver", "audio test parameter: sampleCount:" + this.sampleCount + ", channelCount: " + this.channelsCount + ", bytePerSample: " + this.bytesPerSample);
        }
    }
}
