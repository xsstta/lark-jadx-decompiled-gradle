package com.ss.android.lark.widget.richtext2.span.p2974b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;

/* renamed from: com.ss.android.lark.widget.richtext2.span.b.a */
public class C59070a implements LeadingMarginSpan, LineHeightSpan {

    /* renamed from: a */
    private final C59071a f146450a;

    /* renamed from: b */
    private Paint f146451b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.richtext2.span.b.a$a */
    public static class C59071a {

        /* renamed from: a */
        public float f146452a;

        /* renamed from: b */
        public int f146453b;
    }

    public int getLeadingMargin(boolean z) {
        return 0;
    }

    /* renamed from: a */
    private void m229445a(Paint paint) {
        this.f146451b.reset();
        this.f146451b.set(paint);
        this.f146451b.setAntiAlias(true);
        this.f146451b.setStyle(Paint.Style.FILL);
    }

    /* renamed from: a */
    private void m229444a(Canvas canvas, int i, int i2, int i3) {
        this.f146451b.setColor(this.f146450a.f146453b);
        float f = ((float) (i2 + i3)) / 2.0f;
        canvas.drawRect((float) i, f - (this.f146450a.f146452a / 2.0f), (float) (i + canvas.getWidth()), f + (this.f146450a.f146452a / 2.0f), this.f146451b);
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        fontMetricsInt.ascent = fontMetricsInt.top;
        fontMetricsInt.descent = fontMetricsInt.top + ((int) (((double) this.f146450a.f146452a) + 0.5d));
        fontMetricsInt.bottom = fontMetricsInt.descent;
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        m229445a(paint);
        m229444a(canvas, i, i3, i5);
    }
}
