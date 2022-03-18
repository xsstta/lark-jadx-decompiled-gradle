package com.bytedance.bae.router.controller;

import com.bytedance.bae.base.RXLogging;
import com.bytedance.bae.router.IAudioRoutingController;
import com.huawei.hms.android.HwBuildEx;

/* access modifiers changed from: package-private */
public abstract class ControllerBaseState implements ControllerState {
    private static int sChannelProfile = 0;
    static int sEngineRole = -1;
    private static boolean sMuteLocal = false;
    private static boolean sMuteRemotes = false;
    static boolean sPhoneInCall = false;
    private static boolean sVideoDisabled = true;
    IAudioRoutingController mAudioRoutingController;

    @Override // com.bytedance.bae.router.controller.ControllerState
    public int getState() {
        return 0;
    }

    static void init() {
        sVideoDisabled = true;
        sMuteLocal = false;
        sMuteRemotes = false;
        sEngineRole = -1;
        sPhoneInCall = false;
        sChannelProfile = 0;
    }

    /* access modifiers changed from: package-private */
    public boolean isAudioOnlyCall() {
        if (sChannelProfile == 1) {
            return false;
        }
        if (sVideoDisabled || (sMuteLocal && sMuteRemotes)) {
            return true;
        }
        return false;
    }

    ControllerBaseState(IAudioRoutingController iAudioRoutingController) {
        this.mAudioRoutingController = iAudioRoutingController;
        RXLogging.m14765w("ControllerBaseState", "Monitor base ctor");
    }

    @Override // com.bytedance.bae.router.controller.ControllerState
    public void onEvent(int i, int i2) {
        RXLogging.m14765w("ControllerBaseState", "Monitor baseState: onEvent: " + i + ", info: " + i2);
        boolean z = true;
        switch (i) {
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                if (i2 <= 0) {
                    z = false;
                }
                sMuteLocal = z;
                return;
            case 13:
                if (i2 <= 0) {
                    z = false;
                }
                sMuteRemotes = z;
                return;
            case 14:
                if (i2 <= 0) {
                    z = false;
                }
                sVideoDisabled = z;
                return;
            default:
                switch (i) {
                    case 20:
                        sChannelProfile = i2;
                        return;
                    case 21:
                        sEngineRole = i2;
                        return;
                    case 22:
                        if (i2 <= 0) {
                            z = false;
                        }
                        sPhoneInCall = z;
                        return;
                    default:
                        return;
                }
        }
    }
}
