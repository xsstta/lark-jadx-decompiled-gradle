package com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base;

import android.content.Context;
import android.media.AudioManager;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager;
import java.lang.ref.WeakReference;

public abstract class BaseAudioDeviceManager implements IAudioDeviceManager.INotHotPlugableDevice {
    private IAudioDeviceManager.OnNotHotPlugableDeviceCallback mCallback;
    private WeakReference<Context> mContext;

    /* access modifiers changed from: protected */
    public Context getContext() {
        return this.mContext.get();
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.INotHotPlugableDevice
    public boolean isActive() {
        if (getActiveState() == 1) {
            return true;
        }
        return false;
    }

    public AudioManager getAudioManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    /* access modifiers changed from: protected */
    public void onError(int i, String str) {
        this.mCallback.onError(i, str);
    }

    public BaseAudioDeviceManager(Context context, IAudioDeviceManager.OnNotHotPlugableDeviceCallback onNotHotPlugableDeviceCallback) {
        this.mContext = new WeakReference<>(context);
        this.mCallback = onNotHotPlugableDeviceCallback;
    }
}
