package com.ss.android.lark.widget.linked_emojicon;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import com.ss.android.lark.utils.UIHelper;
import java.util.Objects;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.f */
public class C58512f extends ReplacementSpan {

    /* renamed from: a */
    private static float f144400a = 3.0f;

    /* renamed from: b */
    private static float f144401b = 3.0f;

    /* renamed from: c */
    private static float f144402c = 2.0f;

    /* renamed from: d */
    private static float f144403d = 1.0f;

    /* renamed from: e */
    private static float f144404e = 2.0f;

    /* renamed from: f */
    private Paint.Style f144405f;

    /* renamed from: g */
    private final int f144406g;

    /* renamed from: h */
    private final int f144407h;

    public int hashCode() {
        return Objects.hash(this.f144405f, Integer.valueOf(this.f144406g), Integer.valueOf(this.f144407h));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58512f)) {
            return false;
        }
        C58512f fVar = (C58512f) obj;
        if (this.f144406g == fVar.f144406g && this.f144407h == fVar.f144407h && this.f144405f == fVar.f144405f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private int m227000a(Paint paint, String str) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public C58512f(int i, int i2, Paint.Style style) {
        this.f144406g = i;
        this.f144407h = i2;
        this.f144405f = style;
    }

    /* renamed from: a */
    private void m227001a(Canvas canvas, float f, float f2, Paint paint) {
        if (this.f144405f == Paint.Style.STROKE) {
            paint.setStyle(Paint.Style.STROKE);
        } else {
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        paint.setStrokeWidth((float) UIHelper.dp2px(f144403d));
        paint.setColor(this.f144406g);
        canvas.drawCircle(f, f2, (float) UIHelper.dp2px(f144402c), paint);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return ((int) paint.measureText(charSequence, i, i2)) + (UIHelper.dp2px(f144402c) * 2) + UIHelper.dp2px(f144400a) + UIHelper.dp2px(f144404e);
    }

    /* renamed from: a */
    private void m227002a(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        paint.setColor(this.f144407h);
        canvas.drawText(charSequence, i, i2, f, f2, paint);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float measureText = paint.measureText(charSequence, i, i2);
        m227002a(canvas, charSequence, i, i2, f, (float) i4, paint);
        m227001a(canvas, (float) ((int) (f + measureText + ((float) UIHelper.dp2px(f144400a)) + ((float) UIHelper.dp2px(f144402c)))), (float) (i4 - m227000a(paint, "T")), paint);
    }
}
