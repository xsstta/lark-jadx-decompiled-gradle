package com.ss.android.vc.irtc.impl.audioroute.receiver;

import android.content.Context;
import android.content.Intent;
import com.ss.android.vc.irtc.impl.audioroute.AudioRouteLogger;
import com.ss.android.vc.irtc.impl.audioroute.audioDeviceManager.WiredHeadsetDeviceManager;
import com.ss.android.vc.irtc.impl.audioroute.receiver.base.BaseAudioDeviceBroadcastReceiver;

public class WiredHeadsetBroadcastReceiver extends BaseAudioDeviceBroadcastReceiver {
    private WiredHeadsetDeviceManager mDeviceManager;

    public /* synthetic */ void lambda$onReceive$1$WiredHeadsetBroadcastReceiver() {
        this.mDeviceManager.onDeviceOffline();
    }

    public WiredHeadsetBroadcastReceiver(WiredHeadsetDeviceManager wiredHeadsetDeviceManager) {
        this.mDeviceManager = wiredHeadsetDeviceManager;
    }

    public /* synthetic */ void lambda$onReceive$0$WiredHeadsetBroadcastReceiver(int i) {
        if (i == 1) {
            AudioRouteLogger.m237438i("WiredHeadsetBroadcastReceiver", "Headset w/ mic connected");
            this.mDeviceManager.onDeviceOnline();
            this.mDeviceManager.reportHeadsetType(0);
            return;
        }
        this.mDeviceManager.onDeviceOnline();
        this.mDeviceManager.reportHeadsetType(1);
        AudioRouteLogger.m237438i("WiredHeadsetBroadcastReceiver", "Headset w/o mic connected");
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction()) && intent.hasExtra("state")) {
            int intExtra = intent.getIntExtra("state", -1);
            if (intExtra == 1) {
                run(new Runnable(intent.getIntExtra("microphone", -1)) {
                    /* class com.ss.android.vc.irtc.impl.audioroute.receiver.$$Lambda$WiredHeadsetBroadcastReceiver$cbimeCLp31hStpY99nX1MNCQUzY */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        WiredHeadsetBroadcastReceiver.this.lambda$onReceive$0$WiredHeadsetBroadcastReceiver(this.f$1);
                    }
                });
            } else if (intExtra == 0) {
                AudioRouteLogger.m237438i("WiredHeadsetBroadcastReceiver", "Headset disconnected");
                run(new Runnable() {
                    /* class com.ss.android.vc.irtc.impl.audioroute.receiver.$$Lambda$WiredHeadsetBroadcastReceiver$3PzGiy6IvTc_i6CXbOV59VUlaM */

                    public final void run() {
                        WiredHeadsetBroadcastReceiver.this.lambda$onReceive$1$WiredHeadsetBroadcastReceiver();
                    }
                });
            } else {
                AudioRouteLogger.m237438i("WiredHeadsetBroadcastReceiver", "Headset unknown event detected, state=" + intExtra);
            }
        }
    }
}
