package com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.vc.irtc.impl.audioroute.AudioRouteLogger;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager;
import com.ss.android.vc.irtc.impl.audioroute.receiver.base.BaseAudioDeviceBroadcastReceiver;
import me.ele.lancet.base.annotations.Skip;

public abstract class BaseHotplugAudioDeviceManager extends BaseAudioDeviceManager implements IAudioDeviceManager.IHotplugDevice {
    private BaseAudioDeviceBroadcastReceiver mBroadcastReceiver;
    protected IAudioDeviceManager.OnHotPlugDeviceCallback mCallback;
    protected int mOnlineState;

    private void setDeviceOffline() {
        this.mOnlineState = 1;
    }

    private void setDeviceOnline() {
        this.mOnlineState = 2;
    }

    /* access modifiers changed from: protected */
    public abstract IntentFilter getBroadcastIntentFilter();

    /* access modifiers changed from: protected */
    public abstract BaseAudioDeviceBroadcastReceiver getBroadcastReceiver();

    /* access modifiers changed from: protected */
    public abstract void onStickyIntentFoundWhenRegister(Intent intent);

    public void destory() {
        onDestroy();
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.IHotplugDevice
    public int getOnlineState() {
        return this.mOnlineState;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        unRegisterReceiver();
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.HotplugDeviceListener
    public void onDeviceOffline() {
        setDeviceOffline();
        this.mCallback.onDeviceOffline();
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.base.IAudioDeviceManager.HotplugDeviceListener
    public void onDeviceOnline() {
        setDeviceOnline();
        this.mCallback.onDeviceOnline();
    }

    private void unRegisterReceiver() {
        BaseAudioDeviceBroadcastReceiver baseAudioDeviceBroadcastReceiver;
        AudioRouteLogger.m237438i("BaseHotplugAudioDeviceManager", "in unRegisterReceiver");
        Context context = getContext();
        if (context != null && (baseAudioDeviceBroadcastReceiver = this.mBroadcastReceiver) != null && baseAudioDeviceBroadcastReceiver.getRegistered()) {
            context.unregisterReceiver(this.mBroadcastReceiver);
            AudioRouteLogger.m237438i("BaseHotplugAudioDeviceManager", "after unregisterReceiver(mBroadcastReceiver)");
            this.mBroadcastReceiver.setRegistered(false);
        }
    }

    public void registerReceiver() {
        Context context = getContext();
        if (context != null && !this.mBroadcastReceiver.getRegistered()) {
            Intent INVOKEVIRTUAL_com_ss_android_vc_irtc_impl_audioroute_audioDeviceManager_base_BaseHotplugAudioDeviceManager_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver = INVOKEVIRTUAL_com_ss_android_vc_irtc_impl_audioroute_audioDeviceManager_base_BaseHotplugAudioDeviceManager_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(context, this.mBroadcastReceiver, getBroadcastIntentFilter());
            this.mBroadcastReceiver.setRegistered(true);
            if (INVOKEVIRTUAL_com_ss_android_vc_irtc_impl_audioroute_audioDeviceManager_base_BaseHotplugAudioDeviceManager_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver != null) {
                onStickyIntentFoundWhenRegister(INVOKEVIRTUAL_com_ss_android_vc_irtc_impl_audioroute_audioDeviceManager_base_BaseHotplugAudioDeviceManager_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver);
            }
        }
    }

    public BaseHotplugAudioDeviceManager(Context context, IAudioDeviceManager.OnHotPlugDeviceCallback onHotPlugDeviceCallback) {
        this(context, onHotPlugDeviceCallback, false);
    }

    public BaseHotplugAudioDeviceManager(Context context, IAudioDeviceManager.OnHotPlugDeviceCallback onHotPlugDeviceCallback, boolean z) {
        super(context, onHotPlugDeviceCallback);
        this.mCallback = onHotPlugDeviceCallback;
        this.mBroadcastReceiver = getBroadcastReceiver();
        if (z) {
            registerReceiver();
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_ss_android_vc_irtc_impl_audioroute_audioDeviceManager_base_BaseHotplugAudioDeviceManager_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
