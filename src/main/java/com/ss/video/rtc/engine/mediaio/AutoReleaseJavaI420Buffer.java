package com.ss.video.rtc.engine.mediaio;

import java.nio.ByteBuffer;
import org.webrtc.JavaI420Buffer;
import org.webrtc.VideoFrame;

public class AutoReleaseJavaI420Buffer implements VideoFrame.I420Buffer {
    private JavaI420Buffer buffer;

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.buffer.getDataU();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.buffer.getDataV();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.buffer.getDataY();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.buffer.getHeight();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.buffer.getStrideU();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.buffer.getStrideV();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.buffer.getStrideY();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.buffer.getWidth();
    }

    @Override // org.webrtc.RefCounted, org.webrtc.VideoFrame.Buffer
    public void release() {
        this.buffer.release();
    }

    @Override // org.webrtc.RefCounted, org.webrtc.VideoFrame.Buffer
    public void retain() {
        this.buffer.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return this.buffer.toI420();
    }

    static /* synthetic */ void lambda$new$0(TextureEglRenderer textureEglRenderer, Runnable runnable) {
        Runnable onFrameCompleteRunnable;
        if (!(textureEglRenderer == null || (onFrameCompleteRunnable = textureEglRenderer.getOnFrameCompleteRunnable()) == null)) {
            onFrameCompleteRunnable.run();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        return this.buffer.scaleAndFill(i, i2, i3, i4);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.buffer.cropAndScale(i, i2, i3, i4, i5, i6);
    }

    private AutoReleaseJavaI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, TextureEglRenderer textureEglRenderer, Runnable runnable) {
        this.buffer = JavaI420Buffer.wrap(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, new Runnable(runnable) {
            /* class com.ss.video.rtc.engine.mediaio.$$Lambda$AutoReleaseJavaI420Buffer$4jjpHhqdwBjvkTSAxD_J4vL8g4 */
            public final /* synthetic */ Runnable f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                AutoReleaseJavaI420Buffer.lambda$new$0(TextureEglRenderer.this, this.f$1);
            }
        });
    }

    public static AutoReleaseJavaI420Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, TextureEglRenderer textureEglRenderer, Runnable runnable) {
        return new AutoReleaseJavaI420Buffer(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, textureEglRenderer, runnable);
    }
}
