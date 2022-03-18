package com.ss.video.rtc.engine.mediaio;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

public class RtcVideoFrame extends RefObject {
    public ByteBuffer buffer;
    public int buffer_type;
    public int cropBottom;
    public int cropLeft;
    public int cropRight;
    public int cropTop;
    public EGLContext eglContext11;
    public android.opengl.EGLContext eglContext14;
    public ByteBuffer extend_data;
    public int format;
    public int glTarget;
    public int height;
    public int rotation;
    public int stride;
    public ByteBuffer supplementary_info;
    public int textureId;
    public long timestamp;
    public float[] transform;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BufferType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PixelFormat {
    }

    public RtcVideoFrame() {
        super(null);
    }

    public RtcVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, long j, Runnable runnable) {
        super(runnable);
        this.stride = i;
        this.height = i2;
        this.format = 1;
        this.rotation = i3;
        this.timestamp = j;
        this.extend_data = byteBuffer2;
        this.supplementary_info = byteBuffer3;
        this.buffer = byteBuffer;
    }

    public RtcVideoFrame(int i, int i2, float[] fArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i3, int i4, int i5, long j, Runnable runnable) {
        super(runnable);
        this.stride = i3;
        this.height = i4;
        this.buffer_type = 1;
        this.format = i2;
        this.rotation = i5;
        this.timestamp = j;
        this.extend_data = byteBuffer;
        this.supplementary_info = byteBuffer2;
        this.textureId = i;
        this.transform = fArr;
    }
}
