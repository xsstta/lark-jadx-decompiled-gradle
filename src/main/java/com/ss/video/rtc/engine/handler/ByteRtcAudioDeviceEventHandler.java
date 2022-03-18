package com.ss.video.rtc.engine.handler;

import com.ss.video.rtc.engine.IRtcAudioDeviceManager;
import com.ss.video.rtc.engine.RtcEngineImpl.C65562RtcEngineImpl;

public class ByteRtcAudioDeviceEventHandler {
    /* access modifiers changed from: package-private */
    public void OnLoopbackAudioVolumeIndication(int i) {
    }

    /* access modifiers changed from: package-private */
    public void onRecordingAudioVolumeIndication(int i) {
        IRtcAudioDeviceManager.IRtcAudioDeviceEventHandler audioDeviceManagerEvent = C65562RtcEngineImpl.getAudioDeviceManagerEvent();
        if (audioDeviceManagerEvent != null) {
            audioDeviceManagerEvent.onRecordingAudioVolumeIndication(i);
        }
    }
}
