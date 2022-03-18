package com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager;

import android.content.Context;
import android.media.AudioManager;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.BaseAudioDeviceManager;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager;

public class SpeakerphoneDeviceManager extends BaseAudioDeviceManager {
    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.INotHotPlugableDevice
    public void activeDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.stopBluetoothSco();
            audioManager.setSpeakerphoneOn(true);
        }
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.INotHotPlugableDevice
    public void inactiveDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.setSpeakerphoneOn(false);
        }
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.INotHotPlugableDevice
    public int getActiveState() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && audioManager.isSpeakerphoneOn()) {
            return 1;
        }
        return 2;
    }

    public SpeakerphoneDeviceManager(Context context, IAudioDeviceManager.OnNotHotPlugableDeviceCallback onNotHotPlugableDeviceCallback) {
        super(context, onNotHotPlugableDeviceCallback);
    }
}
