package com.ss.android.vc.irtc.impl.audioroute;

import android.content.Context;

public class AudioRoutingWrapper {
    private AudioRoutingController mAudioRoutingController;
    private Context mContext;

    public synchronized void disableVideo() {
        AudioRouteLogger.m237438i("AudioRoutingWrapper", "disableVideo");
        AudioRoutingController audioRoutingController = this.mAudioRoutingController;
        if (audioRoutingController != null) {
            audioRoutingController.sendEvent(14, 1);
        }
    }

    public synchronized void enableVideo() {
        AudioRouteLogger.m237438i("AudioRoutingWrapper", "enableVideo");
        AudioRoutingController audioRoutingController = this.mAudioRoutingController;
        if (audioRoutingController != null) {
            audioRoutingController.sendEvent(14, 0);
        }
    }

    public synchronized void uninitialize() {
        AudioRouteLogger.m237438i("AudioRoutingWrapper", "uninitialize");
        AudioRoutingController audioRoutingController = this.mAudioRoutingController;
        if (audioRoutingController != null) {
            audioRoutingController.stopMonitoring();
            this.mAudioRoutingController.uninitialize();
            this.mAudioRoutingController = null;
        }
    }

    public synchronized void initialize() {
        AudioRouteLogger.m237438i("AudioRoutingWrapper", "initialize");
        if (this.mAudioRoutingController != null || this.mContext == null) {
            AudioRouteLogger.m237438i("AudioRoutingWrapper", "AudioRoutingController already init");
        } else {
            AudioRouteLogger.m237438i("AudioRoutingWrapper", "create AudioRoutingController");
            AudioRoutingController audioRoutingController = new AudioRoutingController(this.mContext, null);
            this.mAudioRoutingController = audioRoutingController;
            if (audioRoutingController.initialize() != 0) {
                AudioRouteLogger.m237437e("AudioRoutingWrapper", "failed to init audio routing controller");
            }
        }
    }

    public synchronized void initInMainProcess(Context context) {
        this.mContext = context;
    }

    public synchronized void muteAllRemoteVideoStreams(boolean z) {
        int i;
        AudioRouteLogger.m237438i("AudioRoutingWrapper", "muteAllRemoteVideoStreams() called with: muted = [" + z + "]");
        AudioRoutingController audioRoutingController = this.mAudioRoutingController;
        if (audioRoutingController != null) {
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            audioRoutingController.sendEvent(13, i);
        }
    }

    public synchronized void muteLocalVideoStream(boolean z) {
        int i;
        AudioRouteLogger.m237438i("AudioRoutingWrapper", "muteLocalVideoStream() called with: muted = [" + z + "]");
        AudioRoutingController audioRoutingController = this.mAudioRoutingController;
        if (audioRoutingController != null) {
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            audioRoutingController.sendEvent(12, i);
        }
    }

    public synchronized void setChannelProfile(int i) {
        AudioRouteLogger.m237438i("AudioRoutingWrapper", "setChannelProfile profile = " + i);
        AudioRoutingController audioRoutingController = this.mAudioRoutingController;
        if (audioRoutingController != null) {
            audioRoutingController.sendEvent(20, i);
        }
    }

    public synchronized void setDefaultAudioRouteToSpeakerPhone(boolean z) {
        int i;
        AudioRouteLogger.m237438i("AudioRoutingWrapper", "setDefaultAudioRouteToSpeakerPhone() called with: defaultToSpeaker = [" + z + "]");
        AudioRoutingController audioRoutingController = this.mAudioRoutingController;
        if (audioRoutingController != null) {
            if (z) {
                i = 3;
            } else {
                i = 1;
            }
            audioRoutingController.sendEvent(10, i);
        }
    }

    public synchronized void setEnableSpeakerphone(boolean z) {
        int i;
        AudioRouteLogger.m237438i("AudioRoutingWrapper", "setEnableSpeakerphone() called with: enable = [" + z + "]");
        AudioRoutingController audioRoutingController = this.mAudioRoutingController;
        if (audioRoutingController != null) {
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            audioRoutingController.sendEvent(11, i);
        }
    }
}
