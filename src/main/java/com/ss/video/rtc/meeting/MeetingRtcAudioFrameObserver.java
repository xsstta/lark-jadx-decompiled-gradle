package com.ss.video.rtc.meeting;

import com.ss.video.rtc.engine.IAudioFrameObserver;
import com.ss.video.rtc.engine.utils.ByteAudioFrame;
import java.lang.ref.WeakReference;

public class MeetingRtcAudioFrameObserver {
    private WeakReference<MeetingRtcEngineImpl> mRtcEngineImpl;

    public MeetingRtcAudioFrameObserver(MeetingRtcEngineImpl meetingRtcEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(meetingRtcEngineImpl);
    }

    /* access modifiers changed from: package-private */
    public void onMixedAudioFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver;
        if (this.mRtcEngineImpl.get() != null && (audioFrameObserver = MeetingRtcEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onMixedAudioFrame(new ByteAudioFrame(bArr, i, i2, i3, i4));
        }
    }

    /* access modifiers changed from: package-private */
    public void onPlaybackAudioFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver;
        if (this.mRtcEngineImpl.get() != null && (audioFrameObserver = MeetingRtcEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onPlaybackAudioFrame(new ByteAudioFrame(bArr, i, i2, i3, i4));
        }
    }

    /* access modifiers changed from: package-private */
    public void onRecordAudioFrame(byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver;
        if (this.mRtcEngineImpl.get() != null && (audioFrameObserver = MeetingRtcEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onRecordAudioFrame(new ByteAudioFrame(bArr, i, i2, i3, i4));
        }
    }

    /* access modifiers changed from: package-private */
    public void onPlaybackAudioFrameBeforeMixing(String str, byte[] bArr, int i, int i2, int i3, int i4) {
        IAudioFrameObserver audioFrameObserver;
        if (this.mRtcEngineImpl.get() != null && (audioFrameObserver = MeetingRtcEngineImpl.getAudioFrameObserver()) != null) {
            audioFrameObserver.onPlaybackAudioFrameBeforeMixing(str, new ByteAudioFrame(bArr, i, i2, i3, i4));
        }
    }
}
