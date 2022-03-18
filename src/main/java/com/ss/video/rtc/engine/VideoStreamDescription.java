package com.ss.video.rtc.engine;

import android.util.Pair;

public class VideoStreamDescription {
    public EncoderPreference encodePreference = EncoderPreference.MaintainFramerate;
    public int frameRate;
    public int maxKbps;
    public ScaleMode scaleMode = ScaleMode.Auto;
    public Pair<Integer, Integer> videoSize;

    public enum CodecMode {
        AutoMode(0),
        HardwareMode(1),
        SoftwareMode(2);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static CodecMode convertFromInt(int i) {
            return values()[i];
        }

        private CodecMode(int i) {
            this.value = i;
        }
    }

    public enum EncoderPreference {
        Disabled(0),
        MaintainFramerate(1),
        MaintainQuality(2),
        Balance(3);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static EncoderPreference convertFromInt(int i) {
            return values()[i];
        }

        private EncoderPreference(int i) {
            this.value = i;
        }
    }

    public enum ScaleMode {
        Auto(0),
        Stretch(1),
        FitWithCropping(2),
        FitWithFilling(3);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static ScaleMode convertFromInt(int i) {
            return values()[i];
        }

        private ScaleMode(int i) {
            this.value = i;
        }
    }

    public enum VideoCodecType {
        AudoCodec(0),
        H264Codec(1),
        ByteVC1Codec(2);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static VideoCodecType convertFromInt(int i) {
            return values()[i];
        }

        private VideoCodecType(int i) {
            this.value = i;
        }
    }

    public VideoStreamDescription() {
    }

    public boolean isValid() {
        Pair<Integer, Integer> pair = this.videoSize;
        if (pair == null || ((Integer) pair.first).intValue() <= 0 || ((Integer) this.videoSize.second).intValue() <= 0 || this.frameRate <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "VideoStreamDescription{videoSize=" + this.videoSize + ", frameRate=" + this.frameRate + ", maxKbps=" + this.maxKbps + ", scaleMode=" + this.scaleMode + ", encodePreference=" + this.encodePreference + '}';
    }

    private static VideoStreamDescription create(int i, int i2, int i3, int i4, int i5) {
        return new VideoStreamDescription(i, i2, i3, i4, i5);
    }

    public VideoStreamDescription(int i, int i2, int i3, int i4, int i5) {
        this.videoSize = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.frameRate = i3;
        this.maxKbps = i4;
        this.scaleMode = ScaleMode.convertFromInt(i5);
    }

    public VideoStreamDescription(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.videoSize = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.frameRate = i3;
        this.maxKbps = i4;
        this.scaleMode = ScaleMode.convertFromInt(i5);
        this.encodePreference = EncoderPreference.convertFromInt(i8);
    }
}
