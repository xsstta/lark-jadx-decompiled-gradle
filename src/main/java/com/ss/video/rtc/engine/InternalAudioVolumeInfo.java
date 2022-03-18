package com.ss.video.rtc.engine;

public class InternalAudioVolumeInfo {
    public int smooth_volume;
    public String uid;
    public int volume;

    private static InternalAudioVolumeInfo create(String str, int i, int i2) {
        return new InternalAudioVolumeInfo(str, i, i2);
    }

    public InternalAudioVolumeInfo(String str, int i, int i2) {
        this.uid = str;
        this.volume = i;
        this.smooth_volume = i2;
    }
}
