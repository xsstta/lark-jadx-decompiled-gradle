package com.ss.video.rtc.engine.video;

public class VideoEncoderConfiguration {
    public VideoDimensions dimensions;
    public FRAME_RATE frameRate;
    public int kBitrate;
    public ORIENTATION_MODE orienttationMode;

    public enum ORIENTATION_MODE {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        private ORIENTATION_MODE(int i) {
            this.value = i;
        }
    }

    public String toString() {
        return "VideoEncoderConfiguration{dimensions=" + this.dimensions + ", frameRate=" + this.frameRate + ", bitrate=" + this.kBitrate + ", orienttationMode=" + this.orienttationMode + '}';
    }

    public VideoEncoderConfiguration(VideoDimensions videoDimensions, FRAME_RATE frame_rate, int i, ORIENTATION_MODE orientation_mode) {
        this.dimensions = videoDimensions;
        this.frameRate = frame_rate;
        this.kBitrate = i;
        this.orienttationMode = orientation_mode;
    }
}
