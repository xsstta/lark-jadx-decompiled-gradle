package com.bytedance.bae.router.controller;

import com.bytedance.bae.router.IAudioRoutingController;

/* access modifiers changed from: package-private */
public class ControllerErrorState extends ControllerBaseState {
    @Override // com.bytedance.bae.router.controller.ControllerState, com.bytedance.bae.router.controller.ControllerBaseState
    public int getState() {
        return 4;
    }

    ControllerErrorState(IAudioRoutingController iAudioRoutingController) {
        super(iAudioRoutingController);
    }
}
