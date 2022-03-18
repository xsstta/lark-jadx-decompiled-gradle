package com.larksuite.framework.ui.dragger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;

/* renamed from: com.larksuite.framework.ui.dragger.j */
public class C26212j {
    /* renamed from: a */
    public static Bitmap m94807a(View view, int i) {
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth() + i, view.getHeight() + i, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        m94808a(view, canvas, i);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: a */
    private static void m94808a(View view, Canvas canvas, int i) {
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
