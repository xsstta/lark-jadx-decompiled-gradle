package com.ss.android.photoeditor.p3010b;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.photoeditor.b.b */
public class C59610b {
    /* renamed from: a */
    public static void m231208a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    public static void m231209a(Matrix matrix, Bitmap bitmap, RectF rectF) {
        if (matrix != null && bitmap != null && rectF != null) {
            matrix.reset();
            float width = rectF.width() / ((float) bitmap.getWidth());
            float f = rectF.left;
            float f2 = rectF.top;
            matrix.postScale(width, width);
            matrix.postTranslate(f, f2);
        }
    }

    /* renamed from: a */
    public static void m231211a(RectF rectF, float f, float f2, float f3) {
        m231212a(rectF, f, f2, f3, f3);
    }

    /* renamed from: a */
    public static float m231205a(float f, float f2, float f3, float f4) {
        return (float) Math.sqrt(Math.pow((double) (f - f3), 2.0d) + Math.pow((double) (f2 - f4), 2.0d));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r5.y > r7.y) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009a, code lost:
        if (r6.y > r5.y) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r6.y > r7.y) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.RectF m231207a(android.graphics.PointF r4, android.graphics.PointF r5, android.graphics.PointF r6, android.graphics.PointF r7) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.photoeditor.p3010b.C59610b.m231207a(android.graphics.PointF, android.graphics.PointF, android.graphics.PointF, android.graphics.PointF):android.graphics.RectF");
    }

    /* renamed from: a */
    public static void m231210a(PointF pointF, float f, float f2, int i) {
        double d = (double) (((float) i) * 0.017453292f);
        pointF.x = (float) (((((double) (pointF.x - f)) * Math.cos(d)) - (((double) (pointF.y - f2)) * Math.sin(d))) + ((double) f));
        pointF.y = (float) ((((double) (pointF.x - f)) * Math.sin(d)) + (((double) (pointF.y - f2)) * Math.cos(d)) + ((double) f2));
    }

    /* renamed from: a */
    public static void m231213a(RectF rectF, int i, float f, float f2) {
        PointF pointF = new PointF(rectF.left, rectF.top);
        PointF pointF2 = new PointF(rectF.right, rectF.top);
        PointF pointF3 = new PointF(rectF.left, rectF.bottom);
        PointF pointF4 = new PointF(rectF.right, rectF.bottom);
        m231210a(pointF, f, f2, i);
        m231210a(pointF2, f, f2, i);
        m231210a(pointF3, f, f2, i);
        m231210a(pointF4, f, f2, i);
        rectF.set(m231207a(pointF, pointF2, pointF3, pointF4));
    }

    /* renamed from: a */
    public static void m231212a(RectF rectF, float f, float f2, float f3, float f4) {
        rectF.left = ((rectF.left - f) * f3) + f;
        rectF.right = ((rectF.right - f) * f3) + f;
        rectF.top = ((rectF.top - f2) * f4) + f2;
        rectF.bottom = ((rectF.bottom - f2) * f4) + f2;
    }

    /* renamed from: a */
    public static float m231206a(float f, float f2, float f3, float f4, float f5, float f6) {
        double atan2 = Math.atan2((double) (f2 - f6), (double) (f - f5));
        double atan22 = Math.atan2((double) (f4 - f6), (double) (f3 - f5));
        float f7 = (float) (((atan22 - atan2) / 3.141592653589793d) * 180.0d);
        Log.m165379d("PhotoEditorUtil", "start angle = " + ((atan2 / 3.141592653589793d) * 180.0d) + " , end angle = " + ((atan22 / 3.141592653589793d) * 180.0d));
        return f7;
    }
}
