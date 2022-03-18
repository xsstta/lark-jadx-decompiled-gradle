package com.ss.android.lark.widget.linked_emojicon;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;
import com.ss.android.lark.utils.UIHelper;
import java.util.Objects;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.c */
public class C58506c extends ReplacementSpan implements LineHeightSpan {

    /* renamed from: a */
    private boolean f144366a;

    /* renamed from: b */
    private int f144367b;

    /* renamed from: c */
    private int f144368c;

    /* renamed from: d */
    private Paint.Style f144369d;

    /* renamed from: e */
    private int f144370e;

    /* renamed from: f */
    private int f144371f;

    /* renamed from: g */
    private boolean f144372g;

    /* renamed from: a */
    public int mo198311a() {
        return this.f144370e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f144366a), Integer.valueOf(this.f144367b), Integer.valueOf(this.f144368c), this.f144369d, Integer.valueOf(this.f144370e), Integer.valueOf(this.f144371f), Boolean.valueOf(this.f144372g));
    }

    public C58506c(int i) {
        this(false, i, i, Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void mo198312a(boolean z) {
        this.f144372g = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58506c)) {
            return false;
        }
        C58506c cVar = (C58506c) obj;
        if (this.f144366a == cVar.f144366a && this.f144367b == cVar.f144367b && this.f144368c == cVar.f144368c && this.f144370e == cVar.f144370e && this.f144371f == cVar.f144371f && this.f144372g == cVar.f144372g && this.f144369d == cVar.f144369d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m226978a(Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.top == 0 && fontMetricsInt.ascent == 0 && fontMetricsInt.leading == 0 && fontMetricsInt.descent == 0 && fontMetricsInt.bottom == 0) {
            float f = -m226975a(UIHelper.getContext(), 16.0f);
            fontMetricsInt.top = (int) ((2500.0f * f) / 2048.0f);
            fontMetricsInt.bottom = (int) ((-1000.0f * f) / 2048.0f);
            fontMetricsInt.ascent = (int) ((1900.0f * f) / 2048.0f);
            fontMetricsInt.descent = (int) ((f * -500.0f) / 2048.0f);
            fontMetricsInt.leading = 0;
        }
    }

    /* renamed from: a */
    private static float m226975a(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    public C58506c(boolean z, int i, int i2, Paint.Style style) {
        this.f144372g = true;
        this.f144366a = z;
        this.f144367b = UIHelper.dp2px(1.0f);
        this.f144368c = UIHelper.dp2px(6.0f);
        this.f144370e = i;
        this.f144371f = i2;
        this.f144369d = style;
    }

    /* renamed from: a */
    private void m226976a(Canvas canvas, float f, int i, float f2, Paint paint) {
        paint.setAntiAlias(true);
        paint.setColor(this.f144370e);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) this.f144367b);
        float dp2px = (float) UIHelper.dp2px(3.5f);
        for (float f3 = 2.0f + f; f3 < f + f2; f3 += dp2px) {
            canvas.drawPoint(f3, (float) (this.f144368c + i), paint);
        }
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int dp2px;
        int measureText = (int) paint.measureText(charSequence, i, i2);
        if (this.f144366a) {
            measureText += UIHelper.dp2px(2.0f);
            dp2px = UIHelper.dp2px(2.0f) * 2;
        } else if (!this.f144372g) {
            return measureText;
        } else {
            dp2px = UIHelper.dp2px(4.0f);
        }
        return measureText + dp2px;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        Spanned spanned = (Spanned) charSequence;
        int spanStart = spanned.getSpanStart(this);
        int spanEnd = spanned.getSpanEnd(this);
        if (i > spanStart || spanEnd > i2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m226978a(fontMetricsInt);
            int i5 = fontMetricsInt.bottom - fontMetricsInt.leading;
            int i6 = this.f144368c;
            if (i5 <= i6) {
                int dp2px = (i6 - (fontMetricsInt.bottom - fontMetricsInt.leading)) + UIHelper.dp2px(1.0f);
                fontMetricsInt.descent += dp2px;
                fontMetricsInt.bottom += dp2px;
                fontMetricsInt.top -= UIHelper.dp2px(1.0f);
                fontMetricsInt.ascent -= UIHelper.dp2px(1.0f);
            }
        }
    }

    /* renamed from: a */
    private void m226979a(boolean z, Canvas canvas, float f, int i, Paint paint, float f2) {
        if (z) {
            if (this.f144369d == Paint.Style.STROKE) {
                paint.setStyle(Paint.Style.STROKE);
            } else {
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
            }
            paint.setStrokeWidth((float) UIHelper.dp2px(1.0f));
            paint.setColor(this.f144371f);
            canvas.drawCircle(f + f2 + ((float) UIHelper.dp2px(2.0f)), (float) (i + UIHelper.dp2px(3.0f)), (float) UIHelper.dp2px(2.0f), paint);
        }
    }

    /* renamed from: a */
    private void m226977a(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, Paint paint) {
        paint.setColor(this.f144370e);
        canvas.drawText(charSequence, i, i2, f, (float) i3, paint);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float measureText = paint.measureText(charSequence, i, i2);
        m226977a(canvas, charSequence, i, i2, f, i4, paint);
        m226976a(canvas, f, i4, measureText, paint);
        m226979a(this.f144366a, canvas, f, i3, paint, measureText);
    }
}
