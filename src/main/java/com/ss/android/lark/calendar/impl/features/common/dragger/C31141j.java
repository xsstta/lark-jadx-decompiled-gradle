package com.ss.android.lark.calendar.impl.features.common.dragger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.dragger.j */
public class C31141j {
    /* renamed from: a */
    public static Bitmap m116253a(View view, int i) {
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth() + i, view.getHeight() + i, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        m116254a(view, canvas, i);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: a */
    private static void m116254a(View view, Canvas canvas, int i) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        canvas.save();
        int i2 = i / 2;
        canvas.translate((float) ((-view.getScrollX()) + i2), (float) ((-view.getScrollY()) + i2));
        if (Build.VERSION.SDK_INT >= 28) {
            canvas.clipRect(rect);
        } else {
            canvas.clipRect(rect, Region.Op.REPLACE);
        }
        view.draw(canvas);
        canvas.restore();
    }
}
