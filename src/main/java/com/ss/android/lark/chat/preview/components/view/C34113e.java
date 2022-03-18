package com.ss.android.lark.chat.preview.components.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

/* renamed from: com.ss.android.lark.chat.preview.components.view.e */
public class C34113e extends ReplacementSpan {

    /* renamed from: a */
    protected Paint f88281a = new Paint();

    /* renamed from: b */
    protected Drawable f88282b;

    /* renamed from: c */
    private float f88283c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Rect mo126349a() {
        return this.f88282b.getBounds();
    }

    public C34113e(Drawable drawable) {
        this.f88282b = drawable;
    }

    /* renamed from: a */
    private void m132460a(Paint.FontMetricsInt fontMetricsInt, Paint paint) {
        this.f88281a.set(paint);
        if (fontMetricsInt != null) {
            this.f88281a.getFontMetricsInt(fontMetricsInt);
            Rect a = mo126349a();
            int i = fontMetricsInt.descent - fontMetricsInt.ascent;
            int i2 = ((int) this.f88283c) / 2;
            fontMetricsInt.ascent = Math.min(fontMetricsInt.top, fontMetricsInt.top + ((i - a.bottom) / 2)) - i2;
            fontMetricsInt.descent = Math.max(fontMetricsInt.bottom, fontMetricsInt.bottom + ((a.bottom - i) / 2)) + i2;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.descent;
        }
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        m132460a(fontMetricsInt, paint);
        return mo126349a().right;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(f, (float) (((i5 - this.f88282b.getBounds().bottom) + i3) / 2));
        this.f88282b.draw(canvas);
        canvas.restore();
    }
}
