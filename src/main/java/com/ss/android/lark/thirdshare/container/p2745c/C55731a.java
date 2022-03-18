package com.ss.android.lark.thirdshare.container.p2745c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: com.ss.android.lark.thirdshare.container.c.a */
public class C55731a {
    /* renamed from: a */
    public static Bitmap m215909a(View view) {
        Bitmap bitmap;
        if (view == null) {
            return null;
        }
        boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
        boolean willNotCacheDrawing = view.willNotCacheDrawing();
        view.setDrawingCacheEnabled(true);
        view.setWillNotCacheDrawing(false);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null || drawingCache.isRecycled()) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.buildDrawingCache();
            Bitmap drawingCache2 = view.getDrawingCache();
            if (drawingCache2 == null || drawingCache2.isRecycled()) {
                bitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(bitmap));
            } else {
                bitmap = Bitmap.createBitmap(drawingCache2);
            }
        } else {
            bitmap = Bitmap.createBitmap(drawingCache);
        }
        view.setWillNotCacheDrawing(willNotCacheDrawing);
        view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        return bitmap;
    }
}
