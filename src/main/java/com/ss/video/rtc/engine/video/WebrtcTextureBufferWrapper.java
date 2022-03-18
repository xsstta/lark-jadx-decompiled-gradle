package com.ss.video.rtc.engine.video;

import android.graphics.Matrix;
import org.webrtc.FilterType;
import org.webrtc.RendererCommon;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;

public class WebrtcTextureBufferWrapper implements ITextureBuffer, VideoFrame.TextureBuffer {
    TextureBufferImpl webrtcTextureBuffer;

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public FilterType getScaleFilter() {
        return FilterType.Origin;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getHeight();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer, com.ss.video.rtc.engine.video.ITextureBuffer
    public int getTextureId() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getTextureId();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return new Matrix();
        }
        return textureBufferImpl.getTransformMatrix();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return VideoFrame.TextureBuffer.Type.OES;
        }
        return textureBufferImpl.getType();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer, com.ss.video.rtc.engine.video.ITextureBuffer
    public int getTypeGlTarget() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getType().getGlTarget();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
        if (this.webrtcTextureBuffer == null) {
            return 0;
        }
        return getUnscaledHeight();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        if (this.webrtcTextureBuffer == null) {
            return 0;
        }
        return getUnscaledWidth();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return 0;
        }
        return textureBufferImpl.getWidth();
    }

    @Override // org.webrtc.RefCounted, com.ss.video.rtc.engine.video.ITextureBuffer, org.webrtc.VideoFrame.Buffer
    public void release() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl != null) {
            textureBufferImpl.release();
        }
    }

    @Override // org.webrtc.RefCounted, com.ss.video.rtc.engine.video.ITextureBuffer, org.webrtc.VideoFrame.Buffer
    public void retain() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl != null) {
            textureBufferImpl.retain();
        }
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.toI420();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer, com.ss.video.rtc.engine.video.ITextureBuffer
    public float[] nativeGetTransFormMatrix() {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl != null) {
            return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBufferImpl.getTransformMatrix());
        }
        return new float[]{0.0f};
    }

    public WebrtcTextureBufferWrapper(TextureBufferImpl textureBufferImpl) {
        this.webrtcTextureBuffer = textureBufferImpl;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.scaleAndFill(i, i2, i3, i4);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.cropAndScale(i, i2, i3, i4, i5, i6);
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public VideoFrame.Buffer cropAndScaleWithFilter(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        TextureBufferImpl textureBufferImpl = this.webrtcTextureBuffer;
        if (textureBufferImpl == null) {
            return null;
        }
        return textureBufferImpl.cropAndScale(i, i2, i3, i4, i5, i6);
    }
}
