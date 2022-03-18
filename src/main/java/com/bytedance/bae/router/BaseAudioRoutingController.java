package com.bytedance.bae.router;

public abstract class BaseAudioRoutingController implements IAudioRoutingController {
    private RoutingInfo mRoutingInfo = new RoutingInfo();

    @Override // com.bytedance.bae.router.IAudioRoutingController
    public RoutingInfo getRoutingInfo() {
        return this.mRoutingInfo;
    }
}
