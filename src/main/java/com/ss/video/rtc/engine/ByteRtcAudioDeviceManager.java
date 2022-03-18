package com.ss.video.rtc.engine;

import com.ss.video.rtc.engine.handler.ByteRtcAudioDeviceEventHandler;

public class ByteRtcAudioDeviceManager implements IRtcAudioDeviceManager {
    private long mAudioDeviceManager = -1;

    @Override // com.ss.video.rtc.engine.IRtcAudioDeviceManager
    public int stopAudioRecordingDeviceTest() {
        return NativeFunctions.nativeStopAudioRecordingDeviceTest(this.mAudioDeviceManager);
    }

    @Override // com.ss.video.rtc.engine.IRtcAudioDeviceManager
    public int stopPlaybackDeviceTest() {
        return NativeFunctions.nativeStopPlaybackDeviceTest(this.mAudioDeviceManager);
    }

    @Override // com.ss.video.rtc.engine.IRtcAudioDeviceManager
    public void setEnableSpeakerphone(boolean z) {
        NativeFunctions.nativeSetEnableSpeakerphoneForTest(this.mAudioDeviceManager, z);
    }

    @Override // com.ss.video.rtc.engine.IRtcAudioDeviceManager
    public int startAudioRecordingDeviceTest(int i) {
        return NativeFunctions.nativeStartAudioRecordingDeviceTest(this.mAudioDeviceManager, i);
    }

    @Override // com.ss.video.rtc.engine.IRtcAudioDeviceManager
    public int startPlaybackDeviceTest(String str) {
        return NativeFunctions.nativeStartPlaybackDeviceTest(this.mAudioDeviceManager, str);
    }

    public ByteRtcAudioDeviceManager(ByteRtcAudioDeviceEventHandler byteRtcAudioDeviceEventHandler) {
        this.mAudioDeviceManager = NativeFunctions.nativeCreateAudioDeviceManager(byteRtcAudioDeviceEventHandler);
    }
}
