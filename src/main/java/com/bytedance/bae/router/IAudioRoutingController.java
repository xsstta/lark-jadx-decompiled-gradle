package com.bytedance.bae.router;

import android.media.AudioManager;

public interface IAudioRoutingController {
    AudioManager getAudioManager();

    String getAudioRouteDesc(int i);

    RoutingInfo getRoutingInfo();

    boolean isBTHeadsetPlugged();

    boolean isWiredHeadsetPlugged();

    void notifyAudioRoutingChanged(int i, String str);

    int queryCurrentAudioRouting();

    void resetAudioRouting(boolean z);

    void setAudioRouting(int i);

    void stopBtSco();

    int updateBluetoothSco(int i);
}
