package com.ss.video.rtc.engine.handler;

public interface IRtcEngineAudioDeviceEventHandler {
    void onAudioDevicePlayoutStart();

    void onAudioDevicePlayoutStop();

    void onAudioDeviceRecordStart();

    void onAudioDeviceRecordStop();
}
