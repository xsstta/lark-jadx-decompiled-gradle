package com.bytedance.bae.router.controller;

import android.media.AudioManager;
import com.bytedance.bae.base.RXLogging;
import com.bytedance.bae.router.IAudioRoutingController;

/* access modifiers changed from: package-private */
public class ControllerStopState extends ControllerBaseState {
    @Override // com.bytedance.bae.router.controller.ControllerState, com.bytedance.bae.router.controller.ControllerBaseState
    public int getState() {
        return 2;
    }

    ControllerStopState(IAudioRoutingController iAudioRoutingController) {
        super(iAudioRoutingController);
        iAudioRoutingController.stopBtSco();
        iAudioRoutingController.getRoutingInfo().setForceSpeakerphone(-1);
        iAudioRoutingController.getRoutingInfo().setDefaultRouting(0);
        RXLogging.m14765w("ControllerBaseState", "Monitor stop ctor");
    }

    @Override // com.bytedance.bae.router.controller.ControllerState, com.bytedance.bae.router.controller.ControllerBaseState
    public void onEvent(int i, int i2) {
        RXLogging.m14765w("ControllerBaseState", "Monitor stopState: onEvent: " + i + ", info: " + i2);
        try {
            AudioManager audioManager = this.mAudioRoutingController.getAudioManager();
            if (audioManager != null) {
                boolean z = true;
                if (i == 1) {
                    this.mAudioRoutingController.notifyAudioRoutingChanged(this.mAudioRoutingController.queryCurrentAudioRouting(), "onHeadsetStop");
                } else if (i != 11) {
                    super.onEvent(i, i2);
                } else {
                    if (i2 != 1) {
                        z = false;
                    }
                    audioManager.setSpeakerphoneOn(z);
                    this.mAudioRoutingController.getRoutingInfo().setForceSpeakerphone(i2);
                    this.mAudioRoutingController.notifyAudioRoutingChanged(this.mAudioRoutingController.queryCurrentAudioRouting(), "onForceToSpeaker");
                }
            }
        } catch (Exception e) {
            RXLogging.m14763e("ControllerBaseState", "onEvent: Exception ", e);
        }
    }
}
