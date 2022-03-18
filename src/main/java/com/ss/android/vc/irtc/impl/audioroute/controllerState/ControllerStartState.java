package com.ss.android.vc.irtc.impl.audioroute.controllerState;

import com.ss.android.vc.irtc.impl.audioroute.AudioRouteLogger;
import com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController;

/* access modifiers changed from: package-private */
public class ControllerStartState extends ControllerBaseState {
    @Override // com.ss.android.vc.irtc.impl.audioroute.controllerState.ControllerBaseState, com.ss.android.vc.irtc.impl.audioroute.controllerState.ControllerState
    public int getState() {
        return 1;
    }

    ControllerStartState(IAudioRoutingController iAudioRoutingController) {
        super(iAudioRoutingController);
        if (-1 != iAudioRoutingController.getRoutingInfo().getDefaultRouting()) {
            return;
        }
        if (isAudioOnlyCall()) {
            iAudioRoutingController.getRoutingInfo().setDefaultRouting(1);
        } else {
            iAudioRoutingController.getRoutingInfo().setDefaultRouting(3);
        }
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.controllerState.ControllerBaseState, com.ss.android.vc.irtc.impl.audioroute.controllerState.ControllerState
    public void onEvent(int i, int i2) {
        AudioRouteLogger.m237436d("ControllerBaseState", "StartState: onEvent: " + i + ", info: " + i2);
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i == 11) {
                    this.mAudioRoutingController.getRoutingInfo().setForceSpeakerphone(i2);
                    if (!sPhoneInCall) {
                        this.mAudioRoutingController.resetAudioRouting();
                    }
                } else if (i == 21) {
                    sEngineRole = i2;
                    if (!sPhoneInCall) {
                        this.mAudioRoutingController.updateBluetoothSco(this.mAudioRoutingController.queryCurrentAudioRouting());
                    }
                } else if (i != 22) {
                    super.onEvent(i, i2);
                } else {
                    AudioRouteLogger.m237438i("ControllerBaseState", "phone state changed: " + i2);
                    if (i2 <= 0) {
                        z = false;
                    }
                    sPhoneInCall = z;
                    if (i2 == 0) {
                        this.mAudioRoutingController.resetAudioRouting();
                    }
                }
            } else if ((i2 != 0 || this.mAudioRoutingController.isBTHeadsetPlugged()) && !sPhoneInCall) {
                this.mAudioRoutingController.resetAudioRouting();
            }
        } else if (!sPhoneInCall && !this.mAudioRoutingController.isBTHeadsetPlugged()) {
            this.mAudioRoutingController.resetAudioRouting();
        }
    }
}
