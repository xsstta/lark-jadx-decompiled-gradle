package com.ss.ttvideoengine.utils;

import android.content.Context;
import com.ss.ttvideoengine.log.HeadsetStateMonitor;

public class PlayDurationManager {
    private final HeadsetStateMonitor mHeadsetMonitor;
    private final HeadsetStateMonitor.HeadsetStateChangedListener mHeadsetStateChangedListener;
    public volatile boolean mIsPlaying;
    private final PlayDuration mTotalPlayDuration = new PlayDuration();
    public final PlayDuration mWiredPlayDuration = new PlayDuration();
    public final PlayDuration mWirelessPlayDuration = new PlayDuration();

    public int getPlayedDuration() {
        return this.mTotalPlayDuration.getPlayedDuration();
    }

    public long getWiredPlayedDuration() {
        return (long) this.mWiredPlayDuration.getPlayedDuration();
    }

    public void clear() {
        this.mTotalPlayDuration.clear();
        this.mWiredPlayDuration.clear();
        this.mWirelessPlayDuration.clear();
    }

    public void reset() {
        this.mTotalPlayDuration.reset();
        this.mWiredPlayDuration.reset();
        this.mWirelessPlayDuration.reset();
    }

    public void start() {
        if (this.mIsPlaying) {
            TTVideoEngineLog.m256505i("PlayDurationManager", "Already started");
            return;
        }
        this.mIsPlaying = true;
        this.mTotalPlayDuration.start();
        if (this.mHeadsetMonitor.isWiredConnected()) {
            this.mWiredPlayDuration.start();
        } else if (this.mHeadsetMonitor.isWirelessConnected()) {
            this.mWirelessPlayDuration.start();
        }
        TTVideoEngineLog.m256500d("PlayDurationManager", "start play");
    }

    public void stop() {
        if (!this.mIsPlaying) {
            TTVideoEngineLog.m256505i("PlayDurationManager", "Already stopped");
            return;
        }
        this.mIsPlaying = false;
        this.mTotalPlayDuration.stop();
        if (this.mHeadsetMonitor.isWiredConnected()) {
            this.mWiredPlayDuration.stop();
        }
        if (this.mHeadsetMonitor.isWirelessConnected()) {
            this.mWirelessPlayDuration.stop();
        }
        TTVideoEngineLog.m256500d("PlayDurationManager", String.format("stop: play duration: %s, wiredDuration: %s, wirelessDuration: %s", Integer.valueOf(this.mTotalPlayDuration.getPlayedDuration()), Integer.valueOf(this.mWiredPlayDuration.getPlayedDuration()), Integer.valueOf(this.mWirelessPlayDuration.getPlayedDuration())));
    }

    private boolean hasBluetoothPermission(Context context) {
        if (context != null && context.getPackageManager().checkPermission("android.permission.BLUETOOTH", context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public long getWirelessPlayedDuration(Context context) {
        if (hasBluetoothPermission(context)) {
            return (long) this.mWirelessPlayDuration.getPlayedDuration();
        }
        return 0;
    }

    public PlayDurationManager(HeadsetStateMonitor headsetStateMonitor) {
        C654851 r0 = new HeadsetStateMonitor.HeadsetStateChangedListener() {
            /* class com.ss.ttvideoengine.utils.PlayDurationManager.C654851 */

            @Override // com.ss.ttvideoengine.log.HeadsetStateMonitor.HeadsetStateChangedListener
            public void onHeadsetStateChanged(boolean z, boolean z2) {
                TTVideoEngineLog.m256500d("PlayDurationManager", "onHeadsetStateChanged: " + z + ", " + z2);
                if (!z) {
                    PlayDurationManager.this.mWiredPlayDuration.stop();
                    PlayDurationManager.this.mWirelessPlayDuration.stop();
                } else if (z2 && PlayDurationManager.this.mIsPlaying) {
                    PlayDurationManager.this.mWirelessPlayDuration.start();
                    PlayDurationManager.this.mWiredPlayDuration.stop();
                } else if (!z2 && PlayDurationManager.this.mIsPlaying) {
                    PlayDurationManager.this.mWiredPlayDuration.start();
                    PlayDurationManager.this.mWirelessPlayDuration.stop();
                }
                TTVideoEngineLog.m256500d("PlayDurationManager", String.format("wiredDuration: %s, wirelessDuration: %s", Integer.valueOf(PlayDurationManager.this.mWiredPlayDuration.getPlayedDuration()), Integer.valueOf(PlayDurationManager.this.mWirelessPlayDuration.getPlayedDuration())));
            }
        };
        this.mHeadsetStateChangedListener = r0;
        this.mHeadsetMonitor = headsetStateMonitor;
        headsetStateMonitor.setStateChangedListener(r0);
    }
}
