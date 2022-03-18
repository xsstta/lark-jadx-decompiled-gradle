package com.ss.android.lark.widget.richtext2.span.code;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.style.ReplacementSpan;

public class CodeSpan extends ReplacementSpan {

    /* renamed from: a */
    private C59078a f146464a;

    /* renamed from: b */
    private int f146465b;

    /* renamed from: c */
    private int f146466c;

    /* renamed from: d */
    private GradientDrawable f146467d;

    /* renamed from: e */
    private Paint f146468e;

    public enum Type {
        FIRST,
        LAST
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.richtext2.span.code.CodeSpan$a */
    public static class C59078a {

        /* renamed from: a */
        public Type f146469a;

        /* renamed from: b */
        public int f146470b;
    }

    /* renamed from: a */
    private float m229461a(float f) {
        if (this.f146464a.f146469a == Type.FIRST) {
            return f + ((float) this.f146465b);
        }
        return f;
    }

    /* renamed from: a */
    private void m229462a(Paint paint) {
        this.f146468e.set(paint);
        this.f146468e.setAntiAlias(true);
        this.f146468e.setStyle(Paint.Style.FILL);
        this.f146468e.setColor(this.f146464a.f146470b);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int measureText = (int) (paint.measureText(charSequence, i, i2) + ((float) this.f146465b));
        this.f146466c = measureText;
        return measureText;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        m229462a(paint);
        int i6 = (int) f;
        this.f146467d.setBounds(i6, i3, this.f146466c + i6, i5);
        this.f146467d.draw(canvas);
        canvas.drawText(charSequence, i, i2, m229461a(f), (float) i4, paint);
    }
}
