package com.ss.video.rtc.engine.handler;

import com.ss.video.rtc.engine.IAudioFrameObserver;
import com.ss.video.rtc.engine.RtcEngineImpl.C65562RtcEngineImpl;
import com.ss.video.rtc.engine.utils.ByteAudioFrame;
import java.lang.ref.WeakReference;

public class ByteRtcAudioFrameObserver {
    private WeakReference<C65562RtcEngineImpl> mRtcEngineImpl;

    public ByteRtcAudioFrameObserver(C65562RtcEngineImpl rtcEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rtcEngineImpl);
    }

    /* access modifiers changed from: package-private */
    public void onMixedAudioFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver;
        C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
        if (rtcEngineImpl != null && (audioFrameObserver = rtcEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onMixedAudioFrame(new ByteAudioFrame(bArr, i, i2, i3, i4));
        }
    }

    /* access modifiers changed from: package-private */
    public void onPlaybackAudioFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver;
        C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
        if (rtcEngineImpl != null && (audioFrameObserver = rtcEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onPlaybackAudioFrame(new ByteAudioFrame(bArr, i, i2, i3, i4));
        }
    }

    /* access modifiers changed from: package-private */
    public void onRecordAudioFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver;
        C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
        if (rtcEngineImpl != null && (audioFrameObserver = rtcEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onRecordAudioFrame(new ByteAudioFrame(bArr, i, i2, i3, i4));
        }
    }

    /* access modifiers changed from: package-private */
    public void onPlaybackAudioFrameBeforeMixing(String str, byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver;
        C65562RtcEngineImpl rtcEngineImpl = this.mRtcEngineImpl.get();
        if (rtcEngineImpl != null && (audioFrameObserver = rtcEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onPlaybackAudioFrameBeforeMixing(str, new ByteAudioFrame(bArr, i, i2, i3, i4));
        }
    }
}
