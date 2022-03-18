package org.webrtc;

import org.webrtc.VideoDecoder;

class VideoDecoderWrapper {
    static long nativeVideoDecoder;

    /* access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame);

    private static native void nativeSetDecoderInitCostTime(long j, long j2);

    VideoDecoderWrapper() {
    }

    static VideoDecoder.Callback createDecoderCallback(long j) {
        nativeVideoDecoder = j;
        return new VideoDecoder.Callback(j) {
            /* class org.webrtc.$$Lambda$VideoDecoderWrapper$jLIYARzMqNULWBSnr1RQxpNYXEI */
            public final /* synthetic */ long f$0;

            {
                this.f$0 = r1;
            }

            @Override // org.webrtc.VideoDecoder.Callback
            public final void onDecodedFrame(VideoFrame videoFrame) {
                VideoDecoderWrapper.nativeOnDecodedFrame(this.f$0, videoFrame);
            }
        };
    }

    public static void SetDecoderInitCostTime(long j) {
        long j2 = nativeVideoDecoder;
        if (j2 != 0) {
            nativeSetDecoderInitCostTime(j2, j);
        }
    }
}
