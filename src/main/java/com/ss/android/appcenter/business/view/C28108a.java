package com.ss.android.appcenter.business.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: com.ss.android.appcenter.business.view.a */
public class C28108a extends ImageSpan {
    public C28108a(Drawable drawable) {
        super(drawable);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = (float) i4;
        canvas.save();
        canvas.translate(f, (float) ((int) (((((fontMetrics.ascent + f2) + f2) + fontMetrics.descent) / 2.0f) - ((float) ((drawable.getBounds().bottom + drawable.getBounds().top) / 2)))));
        drawable.draw(canvas);
        canvas.restore();
    }
}
