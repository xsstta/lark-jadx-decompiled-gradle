package com.ss.android.vc.irtc.impl.widget.webrtc;

import com.ss.android.vc.irtc.impl.RtcServiceImpl;
import org.webrtc.VideoFrame;

public class BvVideoFrame {
    public boolean flip;
    public int height;
    public VideoFrame originFrame;
    public int refCount = 0;
    public int rotation;
    private final long startRenderTime = System.currentTimeMillis();
    public long timestamp;

    /* renamed from: u */
    public byte[] f152919u;
    public int ustride;

    /* renamed from: v */
    public byte[] f152920v;
    public int vstride;
    public int width;

    /* renamed from: y */
    public byte[] f152921y;
    public int ystride;

    public int getHeight() {
        return this.height;
    }

    public int getRotation() {
        return this.rotation;
    }

    public int getWidth() {
        return this.width;
    }

    public long getRenderTime() {
        return System.currentTimeMillis() - this.startRenderTime;
    }

    public boolean isRtcVideoFrame() {
        if (this.originFrame != null) {
            return true;
        }
        return false;
    }

    public void retain() {
        VideoFrame videoFrame = this.originFrame;
        if (videoFrame != null) {
            videoFrame.retain();
        }
    }

    public int getRotatedHeight() {
        if (this.rotation % 180 == 0) {
            return this.height;
        }
        return this.width;
    }

    public int getRotatedWidth() {
        if (this.rotation % 180 == 0) {
            return this.width;
        }
        return this.height;
    }

    public boolean isTexture() {
        VideoFrame videoFrame = this.originFrame;
        if (videoFrame == null || !(videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer)) {
            return false;
        }
        return true;
    }

    public void release() {
        RtcServiceImpl.getInstance().getByteArrayPool().recycle(this.f152921y);
        RtcServiceImpl.getInstance().getByteArrayPool().recycle(this.f152919u);
        RtcServiceImpl.getInstance().getByteArrayPool().recycle(this.f152920v);
        VideoFrame videoFrame = this.originFrame;
        if (videoFrame != null) {
            videoFrame.release();
        }
    }

    public BvVideoFrame(VideoFrame videoFrame) {
        this.originFrame = videoFrame;
        this.width = videoFrame.getBuffer().getWidth();
        this.height = videoFrame.getBuffer().getHeight();
        this.rotation = videoFrame.getRotation();
        this.timestamp = videoFrame.getTimestampNs();
        this.flip = videoFrame.getFlipState();
    }

    public BvVideoFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z) {
        this.f152921y = bArr;
        this.f152919u = bArr2;
        this.f152920v = bArr3;
        this.ystride = i;
        this.ustride = i2;
        this.vstride = i3;
        this.width = i4;
        this.height = i5;
        this.rotation = i6;
        this.timestamp = j;
        this.flip = z;
    }
}
