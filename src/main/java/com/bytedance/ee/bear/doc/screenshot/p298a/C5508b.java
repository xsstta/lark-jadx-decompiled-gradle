package com.bytedance.ee.bear.doc.screenshot.p298a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.doc.screenshot.a.b */
public class C5508b {
    /* renamed from: a */
    public static final Bitmap m22411a(View view) {
        if (view == null) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            C13479a.m54758a("ScreenshotUtils", "drawing cache is null!!!");
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return createBitmap;
    }

    /* renamed from: a */
    public static void m22412a(Bitmap bitmap, Bitmap bitmap2, int i, int i2, int i3) {
        Rect rect;
        RectF rectF;
        if (bitmap != null && bitmap2 != null) {
            try {
                Canvas canvas = new Canvas(bitmap);
                Paint paint = new Paint();
                int height = bitmap2.getHeight() * i2;
                if (i2 != i - 1 || i3 <= 0) {
                    rect = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                    rectF = new RectF(BitmapDescriptorFactory.HUE_RED, (float) height, (float) bitmap2.getWidth(), (float) (height + bitmap2.getHeight()));
                } else {
                    rect = new Rect(0, bitmap2.getHeight() - i3, bitmap2.getWidth(), bitmap2.getHeight());
                    rectF = new RectF(BitmapDescriptorFactory.HUE_RED, (float) height, (float) bitmap2.getWidth(), (float) (height + i3));
                }
                canvas.drawBitmap(bitmap2, rect, rectF, paint);
                if (!bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
            } catch (Throwable th) {
                C13479a.m54761a("ScreenshotUtils", th);
            }
        }
    }
}
