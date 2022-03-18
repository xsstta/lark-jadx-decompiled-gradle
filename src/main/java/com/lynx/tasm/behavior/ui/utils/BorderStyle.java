package com.lynx.tasm.behavior.ui.utils;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public enum BorderStyle {
    SOLID,
    DASHED,
    DOTTED,
    DOUBLE,
    GROOVE,
    RIDGE,
    INSET,
    OUTSET,
    HIDDEN,
    NONE;

    private static int brightColor(int i) {
        return i | 8421504;
    }

    private static int darkenColor(int i) {
        return (i & -16777216) | ((16711422 & i) >> 1);
    }

    private static boolean isDarkColor(int i) {
        return (i & 15790320) == 0;
    }

    public boolean isSolidDashedOrDotted() {
        int i = C268271.f66628a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.utils.BorderStyle$1 */
    public static /* synthetic */ class C268271 {

        /* renamed from: a */
        static final /* synthetic */ int[] f66628a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 121
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.BorderStyle.C268271.<clinit>():void");
        }
    }

    public static BorderStyle parse(int i) {
        if (i < 0 || i > NONE.ordinal()) {
            return null;
        }
        return values()[i];
    }

    public PathEffect getPathEffect(float f) {
        int i = C268271.f66628a[ordinal()];
        if (i == 1) {
            float f2 = f * 3.0f;
            return new DashPathEffect(new float[]{f2, f2, f2, f2}, BitmapDescriptorFactory.HUE_RED);
        } else if (i != 2) {
            return null;
        } else {
            return new DashPathEffect(new float[]{f, f, f, f}, BitmapDescriptorFactory.HUE_RED);
        }
    }

    public PathEffect getPathEffectAutoAdjust(float f, float f2) {
        int i;
        if (this != DASHED && this != DOTTED) {
            return null;
        }
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (this == DOTTED) {
            i = 2;
        } else {
            i = 6;
        }
        int i2 = (((int) (((f2 / ((f * ((float) i)) * 0.5f)) - 0.5f) * 0.5f)) * 2) + 1;
        if (i2 <= 1) {
            return null;
        }
        float f3 = f2 / ((float) i2);
        return new DashPathEffect(new float[]{f3, f3}, BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r9 == 1) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r9 == 1) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r9 == 1) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r0 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r9 == 1) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r0 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        r2 = r1;
        r1 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void strokeBorderMoreLines(android.graphics.Canvas r12, android.graphics.Paint r13, int r14, float r15, float r16, int r17, int r18, float r19, float r20, float r21, float r22) {
        /*
            r11 = this;
            r6 = r13
            r7 = r14
            r8 = r16
            r0 = 0
            r13.setPathEffect(r0)
            r0 = r15
            r13.setStrokeWidth(r15)
            r0 = -1
            r9 = -1
        L_0x000e:
            r0 = 1
            if (r9 > r0) goto L_0x005e
            r1 = 0
            r2 = 0
            if (r7 == 0) goto L_0x003b
            if (r7 == r0) goto L_0x002d
            r3 = 2
            if (r7 == r3) goto L_0x0026
            r3 = 3
            if (r7 == r3) goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0048
        L_0x001f:
            float r1 = -r8
            float r3 = (float) r9
            float r1 = r1 * r3
            if (r9 != r0) goto L_0x0032
            goto L_0x0035
        L_0x0026:
            float r1 = -r8
            float r3 = (float) r9
            float r1 = r1 * r3
            if (r9 != r0) goto L_0x0040
            goto L_0x0043
        L_0x002d:
            float r1 = (float) r9
            float r1 = r1 * r8
            if (r9 != r0) goto L_0x0035
        L_0x0032:
            r0 = r17
            goto L_0x0037
        L_0x0035:
            r0 = r18
        L_0x0037:
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x0048
        L_0x003b:
            float r1 = (float) r9
            float r1 = r1 * r8
            if (r9 != r0) goto L_0x0043
        L_0x0040:
            r0 = r17
            goto L_0x0045
        L_0x0043:
            r0 = r18
        L_0x0045:
            r2 = r1
            r1 = r0
            goto L_0x001d
        L_0x0048:
            r13.setColor(r1)
            float r1 = r19 + r2
            float r3 = r20 + r0
            float r4 = r21 + r2
            float r5 = r22 + r0
            r0 = r12
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r13
            r0.drawLine(r1, r2, r3, r4, r5)
            int r9 = r9 + 2
            goto L_0x000e
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.BorderStyle.strokeBorderMoreLines(android.graphics.Canvas, android.graphics.Paint, int, float, float, int, int, float, float, float, float):void");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public void strokeBorderLine(Canvas canvas, Paint paint, int i, float f, int i2, float f2, float f3, float f4, float f5, float f6, float f7) {
        PathEffect pathEffect;
        int i3;
        switch (C268271.f66628a[ordinal()]) {
            case 1:
            case 2:
                pathEffect = getPathEffectAutoAdjust(f7, f6);
                i3 = i2;
                break;
            case 3:
            default:
                i3 = i2;
                pathEffect = null;
                break;
            case 4:
            case 5:
                return;
            case 6:
                if (isDarkColor(i2)) {
                    if (i == 3 || i == 2) {
                        i3 = brightColor(i2);
                        pathEffect = null;
                        break;
                    }
                    i3 = i2;
                    pathEffect = null;
                } else {
                    if (i == 1 || i == 0) {
                        i3 = darkenColor(i2);
                        pathEffect = null;
                    }
                    i3 = i2;
                    pathEffect = null;
                }
            case 7:
                if (isDarkColor(i2)) {
                    if (i == 1 || i == 0) {
                        i3 = brightColor(i2);
                        pathEffect = null;
                        break;
                    }
                    i3 = i2;
                    pathEffect = null;
                } else {
                    if (i == 3 || i == 2) {
                        i3 = darkenColor(i2);
                        pathEffect = null;
                    }
                    i3 = i2;
                    pathEffect = null;
                }
            case 8:
                strokeBorderMoreLines(canvas, paint, i, f / 3.0f, f7 / 3.0f, i2, i2, f2, f3, f4, f5);
                return;
            case 9:
                if (isDarkColor(i2)) {
                    strokeBorderMoreLines(canvas, paint, i, f / 2.0f, f7 / 4.0f, brightColor(i2), i2, f2, f3, f4, f5);
                    return;
                } else {
                    strokeBorderMoreLines(canvas, paint, i, f / 2.0f, f7 / 4.0f, i2, darkenColor(i2), f2, f3, f4, f5);
                    return;
                }
            case 10:
                if (isDarkColor(i2)) {
                    strokeBorderMoreLines(canvas, paint, i, f / 2.0f, f7 / 4.0f, i2, brightColor(i2), f2, f3, f4, f5);
                    return;
                } else {
                    strokeBorderMoreLines(canvas, paint, i, f / 2.0f, f7 / 4.0f, darkenColor(i2), i2, f2, f3, f4, f5);
                    return;
                }
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i3);
        paint.setPathEffect(pathEffect);
        paint.setStrokeWidth(f);
        canvas.drawLine(f2, f3, f4, f5, paint);
        paint.setPathEffect(null);
    }
}
