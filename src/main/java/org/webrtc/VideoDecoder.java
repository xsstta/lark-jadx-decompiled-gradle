package org.webrtc;

public interface VideoDecoder {

    /* renamed from: org.webrtc.VideoDecoder$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static long $default$createNativeVideoDecoder(VideoDecoder videoDecoder) {
            return 0;
        }
    }

    public interface Callback {
        void onDecodedFrame(VideoFrame videoFrame);
    }

    long createNativeVideoDecoder();

    VideoCodecStatus decode(EncodedImage encodedImage);

    String getImplementationName();

    boolean getPrefersLateDecoding();

    VideoCodecStatus initDecode(Settings settings, Callback callback);

    VideoCodecStatus release();

    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z, long j) {
            this.isMissingFrames = z;
            this.renderTimeMs = j;
        }
    }

    public static class Settings {
        public final int height;
        public final int numberOfCores;
        public final boolean output_by_dts;
        public final int width;

        public Settings(int i, int i2, int i3, boolean z) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
            this.output_by_dts = z;
        }
    }
}
