package com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.BaseHotplugAudioDeviceManager;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager;
import com.ss.android.vc.irtc.impl.audioroute.receiver.WiredHeadsetBroadcastReceiver;
import com.ss.android.vc.irtc.impl.audioroute.receiver.base.BaseAudioDeviceBroadcastReceiver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class WiredHeadsetDeviceManager extends BaseHotplugAudioDeviceManager {

    public interface OnDeviceCallback extends IAudioDeviceManager.OnHotPlugDeviceCallback {
        void reportHeadsetType(int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface WiredHeadsetType {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.BaseHotplugAudioDeviceManager
    public void onStickyIntentFoundWhenRegister(Intent intent) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.BaseHotplugAudioDeviceManager
    public IntentFilter getBroadcastIntentFilter() {
        return new IntentFilter("android.intent.action.HEADSET_PLUG");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.BaseHotplugAudioDeviceManager
    public BaseAudioDeviceBroadcastReceiver getBroadcastReceiver() {
        return new WiredHeadsetBroadcastReceiver(this);
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.INotHotPlugableDevice
    public void inactiveDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.setWiredHeadsetOn(false);
        }
    }

    public boolean isDevicePlugged() {
        if (2 == getOnlineState()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.INotHotPlugableDevice
    public void activeDevice() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            audioManager.setBluetoothScoOn(false);
            audioManager.setSpeakerphoneOn(false);
            audioManager.setWiredHeadsetOn(true);
        }
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.INotHotPlugableDevice
    public int getActiveState() {
        AudioManager audioManager;
        if (getOnlineState() == 2 && (audioManager = getAudioManager()) != null && audioManager.isWiredHeadsetOn()) {
            return 1;
        }
        return 2;
    }

    public void reportHeadsetType(int i) {
        if (this.mCallback instanceof OnDeviceCallback) {
            ((OnDeviceCallback) this.mCallback).reportHeadsetType(i);
        }
    }

    public WiredHeadsetDeviceManager(Context context, OnDeviceCallback onDeviceCallback) {
        super(context, onDeviceCallback, true);
    }
}
