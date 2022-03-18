package com.ss.android.ttve.audio;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.ss.android.ttve.model.VEAudioDeviceType;
import com.ss.android.vesdk.runtime.VERuntime;

/* renamed from: com.ss.android.ttve.audio.a */
public class C60178a {
    /* renamed from: b */
    public AudioDeviceInfo mo205504b() {
        AudioDeviceInfo[] devices = ((AudioManager) VERuntime.m251382a().mo221784e().getSystemService("audio")).getDevices(1);
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (audioDeviceInfo.getType() == 15) {
                return audioDeviceInfo;
            }
        }
        return null;
    }

    /* renamed from: a */
    public VEAudioDeviceType mo205503a() {
        boolean[] zArr = new boolean[VEAudioDeviceType.values().length];
        int ordinal = VEAudioDeviceType.BLUETOOTH.ordinal();
        int ordinal2 = VEAudioDeviceType.WIRED.ordinal();
        AudioDeviceInfo[] devices = ((AudioManager) VERuntime.m251382a().mo221784e().getSystemService("audio")).getDevices(2);
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 8) {
                zArr[ordinal] = true;
            } else if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                zArr[ordinal2] = true;
            }
        }
        if (zArr[ordinal2]) {
            return VEAudioDeviceType.WIRED;
        }
        if (zArr[ordinal]) {
            return VEAudioDeviceType.BLUETOOTH;
        }
        return VEAudioDeviceType.DEFAULT;
    }
}
