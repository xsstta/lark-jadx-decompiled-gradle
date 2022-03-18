package com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager;

import android.content.Context;
import android.media.AudioManager;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.BaseAudioDeviceManager;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager;

public class EarpieceDeviceManager extends BaseAudioDeviceManager {
    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.INotHotPlugableDevice
    public void inactiveDevice() {
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.INotHotPlugableDevice
    public void activeDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.setSpeakerphoneOn(false);
            audioManager.setBluetoothScoOn(false);
            audioManager.setWiredHeadsetOn(false);
        }
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.INotHotPlugableDevice
    public int getActiveState() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && !audioManager.isSpeakerphoneOn() && !audioManager.isBluetoothScoOn() && !audioManager.isBluetoothA2dpOn() && !audioManager.isWiredHeadsetOn()) {
            return 1;
        }
        return 2;
    }

    public EarpieceDeviceManager(Context context, IAudioDeviceManager.OnNotHotPlugableDeviceCallback onNotHotPlugableDeviceCallback) {
        super(context, onNotHotPlugableDeviceCallback);
    }
}
