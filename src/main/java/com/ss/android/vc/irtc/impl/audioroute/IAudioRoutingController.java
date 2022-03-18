package com.ss.android.vc.irtc.impl.audioroute;

import android.media.AudioManager;

public interface IAudioRoutingController {
    AudioManager getAudioManager();

    String getAudioRouteDesc(int i);

    RoutingInfo getRoutingInfo();

    boolean isBTHeadsetPlugged();

    boolean isWiredHeadsetPlugged();

    void notifyAudioRoutingChanged(int i);

    int queryCurrentAudioRouting();

    void resetAudioRouting();

    void setAudioRouting(int i);

    void stopBtSco();

    int updateBluetoothSco(int i);
}
