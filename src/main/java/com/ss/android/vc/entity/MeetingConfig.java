package com.ss.android.vc.entity;

import java.io.Serializable;

public class MeetingConfig implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean isAudioOn;
    public boolean isCameraOn;
    public boolean isFrontCamera;
    public boolean isPlaybackDigitalMute;
    public boolean isSpeakerOn;

    public String toString() {
        return "MeetingConfig{isAudioOn=" + this.isAudioOn + ", isCameraOn=" + this.isCameraOn + ", isFrontCamera=" + this.isFrontCamera + ", isSpeakerOn=" + this.isSpeakerOn + ", isPlaybackDigitalMute=" + this.isPlaybackDigitalMute + '}';
    }
}
