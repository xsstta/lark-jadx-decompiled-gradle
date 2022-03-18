package com.ss.android.vc.irtc.impl.audioroute.controllerState;

import com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController;

/* access modifiers changed from: package-private */
public class ControllerErrorState extends ControllerBaseState {
    @Override // com.ss.android.vc.irtc.impl.audioroute.controllerState.ControllerBaseState, com.ss.android.vc.irtc.impl.audioroute.controllerState.ControllerState
    public int getState() {
        return 4;
    }

    ControllerErrorState(IAudioRoutingController iAudioRoutingController) {
        super(iAudioRoutingController);
    }
}
