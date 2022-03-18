package com.ss.android.vc.irtc.impl.widget.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

class RendererCommon {

    public interface GlDrawer {
        void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7);

        void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7);

        void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6);

        void release();
    }

    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i, int i2, int i3);
    }

    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    RendererCommon() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon$1 */
    public static /* synthetic */ class C610511 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$android$vc$irtc$impl$widget$webrtc$RendererCommon$ScalingType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon$ScalingType[] r0 = com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.ScalingType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.C610511.$SwitchMap$com$ss$android$vc$irtc$impl$widget$webrtc$RendererCommon$ScalingType = r0
                com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon$ScalingType r1 = com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.C610511.$SwitchMap$com$ss$android$vc$irtc$impl$widget$webrtc$RendererCommon$ScalingType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon$ScalingType r1 = com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_FILL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.C610511.$SwitchMap$com$ss$android$vc$irtc$impl$widget$webrtc$RendererCommon$ScalingType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon$ScalingType r1 = com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.ScalingType.SCALE_ASPECT_BALANCED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.impl.widget.webrtc.RendererCommon.C610511.<clinit>():void");
        }
    }

    public static class VideoLayoutMeasure {
        private ScalingType scalingTypeMatchOrientation = ScalingType.SCALE_ASPECT_BALANCED;
        private ScalingType scalingTypeMismatchOrientation = ScalingType.SCALE_ASPECT_BALANCED;

        public void setScalingType(ScalingType scalingType) {
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType2;
        }

        public Point measure(int i, int i2, int i3, int i4) {
            boolean z;
            ScalingType scalingType;
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i2);
            if (i3 == 0 || i4 == 0 || defaultSize == 0 || defaultSize2 == 0) {
                return new Point(defaultSize, defaultSize2);
            }
            float f = ((float) i3) / ((float) i4);
            float f2 = ((float) defaultSize) / ((float) defaultSize2);
            boolean z2 = true;
            if (f > 1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (f2 <= 1.0f) {
                z2 = false;
            }
            if (z == z2) {
                scalingType = this.scalingTypeMatchOrientation;
            } else {
                scalingType = this.scalingTypeMismatchOrientation;
            }
            Point displaySize = RendererCommon.getDisplaySize(scalingType, f, defaultSize, defaultSize2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                displaySize.x = defaultSize;
            }
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                displaySize.y = defaultSize2;
            }
            return displaySize;
        }
    }

    private static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int i = C610511.$SwitchMap$com$ss$android$vc$irtc$impl$widget$webrtc$RendererCommon$ScalingType[scalingType.ordinal()];
        if (i == 1) {
            return 1.0f;
        }
        if (i == 2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (i == 3) {
            return 0.5625f;
        }
        throw new IllegalArgumentException();
    }

    private static void adjustOrigin(float[] fArr) {
        fArr[12] = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[13] = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[12] = fArr[12] + 0.5f;
        fArr[13] = fArr[13] + 0.5f;
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    public static float[] getLayoutMatrix(boolean z, float f, float f2) {
        float f3;
        float f4;
        if (f2 > f) {
            f4 = f / f2;
            f3 = 1.0f;
        } else {
            f3 = f2 / f;
            f4 = 1.0f;
        }
        if (z) {
            f3 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f3, f4, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static Point getDisplaySize(ScalingType scalingType, float f, int i, int i2) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f, i, i2);
    }

    private static Point getDisplaySize(float f, float f2, int i, int i2) {
        if (f == BitmapDescriptorFactory.HUE_RED || f2 == BitmapDescriptorFactory.HUE_RED) {
            return new Point(i, i2);
        }
        return new Point(Math.min(i, Math.round((((float) i2) / f) * f2)), Math.min(i2, Math.round((((float) i) / f) / f2)));
    }
}
