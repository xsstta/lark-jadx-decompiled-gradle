package com.ss.android.vc.irtc.impl.audioroute;

public abstract class BaseAudioRoutingController implements IAudioRoutingController {
    private RoutingInfo mRoutingInfo = new RoutingInfo();

    @Override // com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController
    public RoutingInfo getRoutingInfo() {
        return this.mRoutingInfo;
    }
}
