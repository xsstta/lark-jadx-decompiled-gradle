package org.webrtc;

public interface VideoEncoder {

    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    public static class CodecSpecificInfo {
    }

    VideoCodecStatus encode(VideoFrame videoFrame, boolean z);

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    VideoCodecStatus release();

    VideoCodecStatus requestKeyFrame();

    VideoCodecStatus setRateAllocation(int i, int i2);

    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;
        public final boolean on;

        private ScalingSettings() {
        }

        public String toString() {
            if (!this.on) {
                return "OFF";
            }
            return "[ " + this.low + ", " + this.high + " ]";
        }

        public ScalingSettings(boolean z) {
            this.on = z;
        }

        public ScalingSettings(int i, int i2) {
            this.on = true;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        public ScalingSettings(boolean z, int i, int i2) {
            this.on = z;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }
    }

    public enum ScaleMode {
        AUTO(0),
        STRETCH(1),
        FIT_WITH_CROPPING(2),
        FIT_WITH_FILLING(3);
        
        private int value;

        static ScaleMode fromValue(int i) {
            if (i == 0) {
                return AUTO;
            }
            if (i == 1) {
                return STRETCH;
            }
            if (i == 2) {
                return FIT_WITH_CROPPING;
            }
            if (i != 3) {
                return AUTO;
            }
            return FIT_WITH_FILLING;
        }

        private ScaleMode(int i) {
            this.value = i;
        }
    }

    public static class Settings {
        public final int height;
        public final int matrixId;
        public final int maxQp;
        public final int minQp;
        public final int primaryId;
        public final int rangeId;
        public final ScaleMode scaleMode;
        public final int targetBps;
        public final int targetFps;
        public final int temporalLayerNum;
        public final int transferId;
        public final int width;

        public Settings(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            this.width = i;
            this.height = i2;
            this.scaleMode = ScaleMode.fromValue(i3);
            this.targetBps = i4;
            this.targetFps = i5;
            this.primaryId = i6;
            this.transferId = i7;
            this.matrixId = i8;
            this.rangeId = i9;
            this.maxQp = i10;
            this.minQp = i11;
            this.temporalLayerNum = i12;
        }
    }
}
