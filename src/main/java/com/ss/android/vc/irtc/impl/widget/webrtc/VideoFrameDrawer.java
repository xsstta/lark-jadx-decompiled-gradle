package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.irtc.C61064p;
import com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon;
import org.webrtc.VideoFrame;

/* access modifiers changed from: package-private */
public class VideoFrameDrawer {
    static final float[] srcPoints = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};
    private final float[] dstPoints = new float[6];
    private BvVideoFrame mLastVideoFrame;
    private int renderHeight;
    private final Matrix renderMatrix = new Matrix();
    private final Point renderSize = new Point();
    private int renderWidth;
    private final YuvUploader yuvUploader = new YuvUploader();

    public void release() {
        this.yuvUploader.release();
        this.mLastVideoFrame = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.irtc.impl.widget.webrtc.VideoFrameDrawer$1 */
    public static /* synthetic */ class C610561 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                org.webrtc.VideoFrame$TextureBuffer$Type[] r0 = org.webrtc.VideoFrame.TextureBuffer.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.irtc.impl.widget.webrtc.VideoFrameDrawer.C610561.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = r0
                org.webrtc.VideoFrame$TextureBuffer$Type r1 = org.webrtc.VideoFrame.TextureBuffer.Type.OES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.irtc.impl.widget.webrtc.VideoFrameDrawer.C610561.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                org.webrtc.VideoFrame$TextureBuffer$Type r1 = org.webrtc.VideoFrame.TextureBuffer.Type.RGB     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.impl.widget.webrtc.VideoFrameDrawer.C610561.<clinit>():void");
        }
    }

    VideoFrameDrawer() {
    }

    public void drawFrame(BvVideoFrame bvVideoFrame, RendererCommon.GlDrawer glDrawer) {
        drawFrame(bvVideoFrame, glDrawer, null);
    }

    public void drawFrame(BvVideoFrame bvVideoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(bvVideoFrame, glDrawer, matrix, 0, 0, bvVideoFrame.getRotatedWidth(), bvVideoFrame.getRotatedHeight());
    }

    private void calculateTransformedRenderSize(int i, int i2, Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i;
            this.renderHeight = i2;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        for (int i3 = 0; i3 < 3; i3++) {
            float[] fArr = this.dstPoints;
            int i4 = i3 * 2;
            int i5 = i4 + 0;
            fArr[i5] = fArr[i5] * ((float) i);
            int i6 = i4 + 1;
            fArr[i6] = fArr[i6] * ((float) i2);
        }
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.dstPoints;
        this.renderHeight = distance(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    private static int distance(float f, float f2, float f3, float f4) {
        return (int) Math.round(Math.hypot((double) (f3 - f), (double) (f4 - f2)));
    }

    public void drawFrame(BvVideoFrame bvVideoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i, int i2, int i3, int i4) {
        try {
            calculateTransformedRenderSize(bvVideoFrame.getRotatedWidth(), bvVideoFrame.getRotatedHeight(), matrix);
            boolean isTexture = bvVideoFrame.isTexture();
            this.renderMatrix.reset();
            this.renderMatrix.preTranslate(0.5f, 0.5f);
            if (!isTexture) {
                this.renderMatrix.preScale(1.0f, -1.0f);
            }
            this.renderMatrix.preRotate((float) bvVideoFrame.getRotation());
            this.renderMatrix.preTranslate(-0.5f, -0.5f);
            if (matrix != null) {
                this.renderMatrix.preConcat(matrix);
            }
            if (isTexture) {
                this.mLastVideoFrame = null;
                drawTexture(glDrawer, (VideoFrame.TextureBuffer) bvVideoFrame.originFrame.getBuffer(), this.renderMatrix, this.renderWidth, this.renderHeight, i, i2, i3, i4);
                return;
            }
            if (bvVideoFrame != this.mLastVideoFrame) {
                this.mLastVideoFrame = bvVideoFrame;
                if (bvVideoFrame.isRtcVideoFrame()) {
                    VideoFrame.I420Buffer i420 = bvVideoFrame.originFrame.getBuffer().toI420();
                    if (i420 != null) {
                        this.yuvUploader.uploadFromBuffer(i420);
                        i420.release();
                    } else {
                        return;
                    }
                }
            }
            glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i, i2, i3, i4);
        } catch (Exception e) {
            e.printStackTrace();
            C61064p.m237487c("VideoFrameDrawer", e.toString());
        }
    }

    static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        matrix2.preConcat(matrix);
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i7 = C610561.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type[textureBuffer.getType().ordinal()];
        if (i7 == 1) {
            glDrawer.drawOes(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6);
        } else if (i7 == 2) {
            glDrawer.drawRgb(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6);
        } else {
            throw new RuntimeException("Unknown texture type.");
        }
    }
}
