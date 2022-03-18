package com.bytedance.bae.router.receiver;

import android.content.Context;
import android.content.Intent;
import com.bytedance.bae.base.RXLogging;
import com.bytedance.bae.router.device.WiredHeadsetDeviceManager;
import com.bytedance.bae.router.receiver.base.BaseAudioDeviceBroadcastReceiver;

public class WiredHeadsetBroadcastReceiver extends BaseAudioDeviceBroadcastReceiver {
    private WiredHeadsetDeviceManager mDeviceManager;

    public WiredHeadsetBroadcastReceiver(WiredHeadsetDeviceManager wiredHeadsetDeviceManager) {
        this.mDeviceManager = wiredHeadsetDeviceManager;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction()) && intent.hasExtra("state")) {
            int intExtra = intent.getIntExtra("state", -1);
            if (intExtra == 1) {
                if (intent.getIntExtra("microphone", -1) == 1) {
                    RXLogging.m14765w("WiredHeadsetBroadcastReceiver", "Headset w/ mic connected");
                    this.mDeviceManager.onDeviceOnline();
                    this.mDeviceManager.reportHeadsetType(0);
                    return;
                }
                this.mDeviceManager.onDeviceOnline();
                this.mDeviceManager.reportHeadsetType(1);
                RXLogging.m14765w("WiredHeadsetBroadcastReceiver", "Headset w/o mic connected");
            } else if (intExtra == 0) {
                RXLogging.m14765w("WiredHeadsetBroadcastReceiver", "Headset disconnected");
                this.mDeviceManager.onDeviceOffline();
            } else {
                RXLogging.m14765w("WiredHeadsetBroadcastReceiver", "Headset unknown event detected, state=" + intExtra);
            }
        }
    }
}
