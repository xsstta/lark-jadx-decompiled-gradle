package com.ss.android.vc.irtc.impl.audioroute.controllerState;

import android.media.AudioManager;
import com.ss.android.vc.irtc.impl.audioroute.AudioRouteLogger;
import com.ss.android.vc.irtc.impl.audioroute.IAudioRoutingController;

/* access modifiers changed from: package-private */
public class ControllerStopState extends ControllerBaseState {
    @Override // com.ss.android.vc.irtc.impl.audioroute.controllerState.ControllerBaseState, com.ss.android.vc.irtc.impl.audioroute.controllerState.ControllerState
    public int getState() {
        return 2;
    }

    ControllerStopState(IAudioRoutingController iAudioRoutingController) {
        super(iAudioRoutingController);
        try {
            AudioManager audioManager = this.mAudioRoutingController.getAudioManager();
            if (audioManager != null) {
                if (audioManager.isWiredHeadsetOn()) {
                    audioManager.setSpeakerphoneOn(false);
                }
                iAudioRoutingController.stopBtSco();
                audioManager.setMode(0);
            }
        } catch (Exception e) {
            AudioRouteLogger.m237437e("ControllerBaseState", "ControllerStopState: Exception " + e.getMessage());
        }
        iAudioRoutingController.getRoutingInfo().setForceSpeakerphone(-1);
        iAudioRoutingController.getRoutingInfo().setDefaultRouting(-1);
        AudioRouteLogger.m237438i("ControllerBaseState", "Monitor stopped");
    }

    @Override // com.ss.android.vc.irtc.impl.audioroute.controllerState.ControllerBaseState, com.ss.android.vc.irtc.impl.audioroute.controllerState.ControllerState
    public void onEvent(int i, int i2) {
        AudioRouteLogger.m237436d("ControllerBaseState", "StopState: onEvent: " + i + ", info: " + i2);
        try {
            AudioManager audioManager = this.mAudioRoutingController.getAudioManager();
            if (audioManager == null) {
                return;
            }
            if (i != 11) {
                super.onEvent(i, i2);
                return;
            }
            boolean z = true;
            if (i2 != 1) {
                z = false;
            }
            audioManager.setSpeakerphoneOn(z);
            this.mAudioRoutingController.getRoutingInfo().setForceSpeakerphone(i2);
            this.mAudioRoutingController.notifyAudioRoutingChanged(this.mAudioRoutingController.queryCurrentAudioRouting());
        } catch (Exception e) {
            AudioRouteLogger.m237437e("ControllerBaseState", "onEvent: Exception " + e.getMessage());
        }
    }
}
