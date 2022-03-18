package com.ss.video.rtc.engine.utils;

import android.graphics.Matrix;
import android.graphics.YuvImage;
import com.ss.video.rtc.engine.video.ITextureBuffer;
import org.webrtc.EglBase;
import org.webrtc.FilterType;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;

public class TextureBufferImpl implements EglContextCarrier, ITextureBuffer, VideoFrame.TextureBuffer {
    private final int height;
    private final int id;
    private EglBase.Context mEglBaseContext;
    private int refCount;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;
    private FilterType scaleFilter;
    private final TextureHelper textureHelper;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int width;
    private YuvImage yuvImage;

    @Override // com.ss.video.rtc.engine.utils.EglContextCarrier
    public EglBase.Context getEglBaseContext() {
        return this.mEglBaseContext;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public FilterType getScaleFilter() {
        return FilterType.Origin;
    }

    public TextureHelper getTextureHelper() {
        return this.textureHelper;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer, com.ss.video.rtc.engine.video.ITextureBuffer
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

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer, com.ss.video.rtc.engine.video.ITextureBuffer
    public int getTypeGlTarget() {
        return this.type.getGlTarget();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
        return getUnscaledHeight();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        return getUnscaledWidth();
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer, com.ss.video.rtc.engine.video.ITextureBuffer
    public float[] nativeGetTransFormMatrix() {
        return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.transformMatrix);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return this.textureHelper.textureToYuv(this);
    }

    public long getNativeEglContext() {
        TextureHelper textureHelper2 = this.textureHelper;
        if (textureHelper2 != null) {
            return textureHelper2.getNativeEglContext();
        }
        return 0;
    }

    @Override // org.webrtc.RefCounted, com.ss.video.rtc.engine.video.ITextureBuffer, org.webrtc.VideoFrame.Buffer
    public void retain() {
        synchronized (this.refCountLock) {
            this.refCount++;
        }
    }

    @Override // org.webrtc.RefCounted, com.ss.video.rtc.engine.video.ITextureBuffer, org.webrtc.VideoFrame.Buffer
    public void release() {
        Runnable runnable;
        synchronized (this.refCountLock) {
            int i = this.refCount - 1;
            this.refCount = i;
            if (i == 0 && (runnable = this.releaseCallback) != null) {
                runnable.run();
            }
        }
    }

    @Override // com.ss.video.rtc.engine.utils.EglContextCarrier
    public void setEglBaseContext(EglBase.Context context) {
        this.mEglBaseContext = context;
    }

    public void setTransFormMatrix(float[] fArr) {
        RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|5|6|7|10|11|12|13|14|17|18|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r8.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void saveMyBitmap(java.lang.String r7, byte[] r8, int r9, int r10) {
        /*
            r6 = this;
            java.lang.String r9 = "texturebuffer"
            java.lang.String r10 = "saveMyBitmap"
            com.ss.video.rtc.engine.utils.LogUtil.m257132i(r9, r10)
            java.io.File r9 = new java.io.File
            r9.<init>(r7)
            r9.createNewFile()     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            r7 = 0
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0017 }
            r10.<init>(r9)     // Catch:{ FileNotFoundException -> 0x0017 }
            r7 = r10
            goto L_0x001b
        L_0x0017:
            r9 = move-exception
            r9.printStackTrace()
        L_0x001b:
            android.graphics.YuvImage r9 = new android.graphics.YuvImage
            r2 = 17
            int r3 = r6.width
            int r4 = r6.height
            r5 = 0
            r0 = r9
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            android.graphics.Rect r8 = new android.graphics.Rect     // Catch:{ Exception -> 0x0038 }
            int r10 = r6.width     // Catch:{ Exception -> 0x0038 }
            int r0 = r6.height     // Catch:{ Exception -> 0x0038 }
            r1 = 0
            r8.<init>(r1, r1, r10, r0)     // Catch:{ Exception -> 0x0038 }
            r10 = 50
            r9.compressToJpeg(r8, r10, r7)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r7.flush()     // Catch:{ IOException -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0040:
            r7.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.engine.utils.TextureBufferImpl.saveMyBitmap(java.lang.String, byte[], int, int):void");
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        Matrix matrix = new Matrix();
        int min = Math.min(i, (getWidth() * i2) / getHeight());
        int min2 = Math.min(i2, (getHeight() * i) / getWidth());
        matrix.preScale(((float) min) / ((float) getWidth()), ((float) min2) / ((float) getHeight()));
        matrix.preTranslate((float) (i3 / i), (float) ((i2 - (i4 + min2)) / i2));
        return new TextureBufferImpl(i, i2, this.type, this.id, matrix, this.textureHelper, new Runnable() {
            /* class com.ss.video.rtc.engine.utils.TextureBufferImpl.RunnableC655934 */

            public void run() {
                TextureBufferImpl.this.release();
            }
        });
    }

    public TextureBufferImpl(int i, int i2, int i3, final int i4, final TextureHelper textureHelper2) {
        this.width = i;
        this.height = i2;
        if (i3 == VideoFrame.TextureBuffer.Type.OES.getGlTarget()) {
            this.type = VideoFrame.TextureBuffer.Type.OES;
        } else {
            this.type = VideoFrame.TextureBuffer.Type.RGB;
        }
        this.id = i4;
        Matrix matrix = new Matrix();
        this.transformMatrix = matrix;
        matrix.reset();
        this.textureHelper = textureHelper2;
        this.releaseCallback = new Runnable() {
            /* class com.ss.video.rtc.engine.utils.TextureBufferImpl.RunnableC655901 */

            public void run() {
                textureHelper2.releaseTextureID(i4);
            }
        };
        this.refCount = 1;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        retain();
        Matrix matrix = new Matrix();
        int i7 = this.height;
        matrix.preTranslate(((float) i) / ((float) this.width), ((float) (i7 - (i2 + i4))) / ((float) i7));
        matrix.preScale(((float) i3) / ((float) this.width), ((float) i4) / ((float) this.height));
        this.scaleFilter = null;
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        return new TextureBufferImpl(i5, i6, this.type, this.id, matrix2, this.textureHelper, new Runnable() {
            /* class com.ss.video.rtc.engine.utils.TextureBufferImpl.RunnableC655912 */

            public void run() {
                TextureBufferImpl.this.release();
            }
        });
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type2, int i3, Matrix matrix, TextureHelper textureHelper2, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.type = type2;
        this.id = i3;
        this.transformMatrix = matrix;
        this.textureHelper = textureHelper2;
        this.releaseCallback = runnable;
        this.refCount = 1;
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public VideoFrame.Buffer cropAndScaleWithFilter(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        Matrix matrix = new Matrix();
        int i8 = this.height;
        matrix.preTranslate(((float) i) / ((float) this.width), ((float) (i8 - (i2 + i4))) / ((float) i8));
        matrix.preScale(((float) i3) / ((float) this.width), ((float) i4) / ((float) this.height));
        this.scaleFilter = FilterType.fromValue(i7);
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        return new TextureBufferImpl(i5, i6, this.type, this.id, matrix2, this.textureHelper, new Runnable() {
            /* class com.ss.video.rtc.engine.utils.TextureBufferImpl.RunnableC655923 */

            public void run() {
                TextureBufferImpl.this.release();
            }
        });
    }
}
