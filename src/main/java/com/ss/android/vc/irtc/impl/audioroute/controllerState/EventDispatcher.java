package com.ss.android.vc.irtc.impl.audioroute.controllerState;

import com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController;

public class EventDispatcher {
    private IAudioRoutingController mAudioRoutingController;
    private ControllerBaseState mRoutingState;

    private void errorRoutingControl() {
        this.mRoutingState = new ControllerErrorState(this.mAudioRoutingController);
    }

    private void startRoutingControl() {
        this.mRoutingState = new ControllerStartState(this.mAudioRoutingController);
    }

    private void stopRoutingControl() {
        this.mRoutingState = new ControllerStopState(this.mAudioRoutingController);
    }

    public EventDispatcher(IAudioRoutingController iAudioRoutingController) {
        ControllerBaseState.init();
        this.mAudioRoutingController = iAudioRoutingController;
        this.mRoutingState = new ControllerStartState(iAudioRoutingController);
    }

    public void changeRouteState(int i) {
        if (i != this.mRoutingState.getState()) {
            if (i == 1) {
                startRoutingControl();
            } else if (i != 2) {
                errorRoutingControl();
            } else {
                stopRoutingControl();
            }
        }
    }

    public void onEvent(int i, int i2) {
        this.mRoutingState.onEvent(i, i2);
    }
}
