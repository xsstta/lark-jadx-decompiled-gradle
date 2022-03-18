package com.bytedance.ee.util.p718t;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.util.t.c */
public class C13736c {
    /* renamed from: a */
    public static int m55688a(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        if (Build.VERSION.SDK_INT >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    /* renamed from: a */
    public static Bitmap m55690a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            C13479a.m54761a("BitmapUtils", e);
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m55691a(View view) {
        Bitmap bitmap;
        if (view == null) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.buildDrawingCache();
            bitmap = Bitmap.createBitmap(view.getDrawingCache());
        } else {
            bitmap = Bitmap.createBitmap(drawingCache);
        }
        view.setDrawingCacheEnabled(false);
        return bitmap;
    }

    /* renamed from: a */
    public static Bitmap m55689a(Bitmap bitmap, int i) {
        float a = (((float) i) * 1024.0f) / ((float) m55688a(bitmap));
        Matrix matrix = new Matrix();
        matrix.setScale(a, a);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
