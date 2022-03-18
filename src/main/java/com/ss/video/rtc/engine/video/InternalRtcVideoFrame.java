package com.ss.video.rtc.engine.video;

import com.ss.video.rtc.engine.mediaio.RtcVideoFrame;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

public class InternalRtcVideoFrame extends RtcVideoFrame {
    public final VideoFrame.Buffer buffer;
    public final ByteBuffer extendedData;
    public boolean isFlip = false;
    public final int rotation;
    public final long timestampNs;

    public InternalRtcVideoFrame(VideoFrame.Buffer buffer2, ByteBuffer byteBuffer, int i, long j, boolean z) {
        super(null, byteBuffer, null, buffer2.getWidth(), buffer2.getHeight(), i, j, null);
        if (buffer2 == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (i % 90 == 0) {
            this.buffer_type = 2;
            this.buffer = buffer2;
            this.rotation = i;
            this.timestampNs = j;
            this.extendedData = byteBuffer;
            this.isFlip = z;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }
}
