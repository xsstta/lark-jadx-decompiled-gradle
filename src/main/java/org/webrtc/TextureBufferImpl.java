package org.webrtc;

import android.graphics.Matrix;
import android.os.Handler;
import java.util.concurrent.Callable;
import org.webrtc.VideoFrame;

public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private final int height;
    private final int id;
    private final RefCountDelegate refCountDelegate;
    private FilterType scaleFilter;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int unscaledHeight;
    private final int unscaledWidth;
    private final int width;
    private final YuvConverter yuvConverter;

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public FilterType getScaleFilter() {
        return this.scaleFilter;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.id;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getTypeGlTarget() {
        return this.type.getGlTarget();
    }

    public /* synthetic */ VideoFrame.I420Buffer lambda$toI420$0$TextureBufferImpl() throws Exception {
        return this.yuvConverter.convert(this);
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public float[] nativeGetTransFormMatrix() {
        return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.transformMatrix);
    }

    @Override // org.webrtc.RefCounted, org.webrtc.VideoFrame.Buffer
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.RefCounted, org.webrtc.VideoFrame.Buffer
    public void retain() {
        this.refCountDelegate.retain();
    }

    public /* synthetic */ VideoFrame.I420Buffer lambda$toI420$1$TextureBufferImpl() throws Exception {
        return this.yuvConverter.convert(this, this.scaleFilter, this.unscaledWidth, this.unscaledHeight);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        FilterType filterType = this.scaleFilter;
        if (filterType == null || filterType == FilterType.Origin) {
            return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() {
                /* class org.webrtc.$$Lambda$TextureBufferImpl$9sw8QZAslsRIhVf2G2KHWRK_loQ */

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TextureBufferImpl.this.lambda$toI420$0$TextureBufferImpl();
                }
            });
        }
        return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() {
            /* class org.webrtc.$$Lambda$TextureBufferImpl$hkykr63_Ils2AQhiWftKqkOZNTo */

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TextureBufferImpl.this.lambda$toI420$1$TextureBufferImpl();
            }
        });
    }

    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2) {
        return applyTransformMatrix(matrix, i, i2, i, i2);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        Matrix matrix = new Matrix();
        int min = Math.min(i, (getWidth() * i2) / getHeight());
        int min2 = Math.min(i2, (getHeight() * i) / getWidth());
        matrix.preScale(((float) min) / ((float) getWidth()), ((float) min2) / ((float) getHeight()));
        matrix.preTranslate((float) (i3 / i), (float) ((i2 - (i4 + min2)) / i2));
        return applyTransformMatrix(matrix, i, i2);
    }

    private TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2, int i3, int i4) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(i, i2, i3, i4, this.type, this.id, this.scaleFilter, matrix2, this.toI420Handler, this.yuvConverter, new Runnable() {
            /* class org.webrtc.$$Lambda$G7YdmtlwQiz6SvCjJznJyamQSRY */

            public final void run() {
                TextureBufferImpl.this.release();
            }
        });
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix = new Matrix();
        int i7 = this.height;
        matrix.preTranslate(((float) i) / ((float) this.width), ((float) (i7 - (i2 + i4))) / ((float) i7));
        matrix.preScale(((float) i3) / ((float) this.width), ((float) i4) / ((float) this.height));
        this.scaleFilter = FilterType.Origin;
        return applyTransformMatrix(matrix, Math.round(((float) (this.unscaledWidth * i3)) / ((float) this.width)), Math.round(((float) (this.unscaledHeight * i4)) / ((float) this.height)), i5, i6);
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public VideoFrame.Buffer cropAndScaleWithFilter(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        Matrix matrix = new Matrix();
        int i8 = this.height;
        matrix.preTranslate(((float) i) / ((float) this.width), ((float) (i8 - (i2 + i4))) / ((float) i8));
        matrix.preScale(((float) i3) / ((float) this.width), ((float) i4) / ((float) this.height));
        this.scaleFilter = FilterType.fromValue(i7);
        return applyTransformMatrix(matrix, Math.round(((float) (this.unscaledWidth * i3)) / ((float) this.width)), Math.round(((float) (this.unscaledHeight * i4)) / ((float) this.height)), i5, i6);
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type2, int i3, Matrix matrix, Handler handler, YuvConverter yuvConverter2, Runnable runnable) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i;
        this.height = i2;
        this.type = type2;
        this.id = i3;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter2;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private TextureBufferImpl(int i, int i2, int i3, int i4, VideoFrame.TextureBuffer.Type type2, int i5, FilterType filterType, Matrix matrix, Handler handler, YuvConverter yuvConverter2, Runnable runnable) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i3;
        this.height = i4;
        this.type = type2;
        this.id = i5;
        this.scaleFilter = filterType;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter2;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
