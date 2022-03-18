package com.bytedance.bae;

public interface AudioDeviceObserver {
    void onAudioDevicePlayoutStart();

    void onAudioDevicePlayoutStop();

    void onAudioDeviceRecordStart();

    void onAudioDeviceRecordStop();
}
