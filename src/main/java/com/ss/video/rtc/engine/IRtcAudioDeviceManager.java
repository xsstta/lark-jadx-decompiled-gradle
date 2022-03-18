package com.ss.video.rtc.engine;

public interface IRtcAudioDeviceManager {

    public interface IRtcAudioDeviceEventHandler {
        void onRecordingAudioVolumeIndication(int i);
    }

    void setEnableSpeakerphone(boolean z);

    int startAudioRecordingDeviceTest(int i);

    int startPlaybackDeviceTest(String str);

    int stopAudioRecordingDeviceTest();

    int stopPlaybackDeviceTest();
}
