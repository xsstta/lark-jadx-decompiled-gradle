package com.ss.android.lark.widget.linked_emojicon;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import java.util.Objects;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.b */
public class C58498b extends ReplacementSpan {

    /* renamed from: a */
    private int f144295a;

    /* renamed from: b */
    private boolean f144296b;

    /* renamed from: c */
    private int f144297c;

    /* renamed from: d */
    private int f144298d;

    /* renamed from: e */
    private int f144299e;

    /* renamed from: a */
    public int mo198239a() {
        return this.f144297c;
    }

    /* renamed from: b */
    public int mo198240b() {
        return this.f144298d;
    }

    /* renamed from: c */
    public int mo198241c() {
        return this.f144299e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f144295a), Boolean.valueOf(this.f144296b), Integer.valueOf(this.f144297c), Integer.valueOf(this.f144298d), Integer.valueOf(this.f144299e));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58498b)) {
            return false;
        }
        C58498b bVar = (C58498b) obj;
        if (this.f144295a == bVar.f144295a && this.f144296b == bVar.f144296b && this.f144297c == bVar.f144297c && this.f144298d == bVar.f144298d && this.f144299e == bVar.f144299e) {
            return true;
        }
        return false;
    }

    public C58498b(Context context, int i, int i2, int i3, boolean z) {
        this.f144296b = z;
        this.f144297c = i;
        this.f144298d = i2;
        this.f144299e = i3;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3 = this.f144299e;
        if (i3 != 0) {
            paint.setTextSize((float) i3);
        }
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        int measureText = (int) (((float) ((fontMetricsInt2.bottom - fontMetricsInt2.top) / 2)) + paint.measureText(charSequence, i, i2));
        this.f144295a = measureText;
        return measureText;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = this.f144299e;
        if (i6 != 0) {
            paint.setTextSize((float) i6);
        }
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i7 = fontMetricsInt.bottom - fontMetricsInt.top;
        if (this.f144296b) {
            paint.setColor(this.f144297c);
            float measureText = paint.measureText(charSequence, i, i2);
            RectF rectF = new RectF();
            float f2 = (float) ((int) (((float) this.f144295a) + f));
            float f3 = f2 - measureText;
            rectF.left = f3;
            float f4 = (float) i3;
            rectF.top = f4;
            rectF.right = f2;
            float f5 = (float) i5;
            rectF.bottom = f5;
            canvas.drawRect(rectF, paint);
            paint.setColor(this.f144298d);
            canvas.drawText(charSequence, i, i2, f3, (float) i4, paint);
            paint.setColor(this.f144297c);
            float f6 = (float) (i7 / 2);
            canvas.drawArc(new RectF(rectF.left - f6, f4, rectF.left + f6, f5), 90.0f, 180.0f, false, paint);
            return;
        }
        paint.setColor(this.f144297c);
        float measureText2 = paint.measureText(charSequence, i, i2);
        RectF rectF2 = new RectF();
        rectF2.left = f;
        float f7 = (float) i3;
        rectF2.top = f7;
        rectF2.right = rectF2.left + measureText2;
        float f8 = (float) i5;
        rectF2.bottom = f8;
        canvas.drawRect(rectF2, paint);
        paint.setColor(this.f144298d);
        canvas.drawText(charSequence, i, i2, f, (float) i4, paint);
        paint.setColor(this.f144297c);
        float f9 = f + measureText2;
        float f10 = (float) (i7 / 2);
        canvas.drawArc(new RectF(f9 - f10, f7, f9 + f10, f8), 270.0f, 180.0f, false, paint);
    }
}
