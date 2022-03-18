package com.ss.android.lark.widget.linked_emojicon;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.ss.android.lark.utils.UIHelper;
import java.util.Objects;

/* renamed from: com.ss.android.lark.widget.linked_emojicon.a */
public class C58496a extends ReplacementSpan {

    /* renamed from: a */
    private static final int f144264a = UIHelper.dp2px(4.0f);

    /* renamed from: b */
    private float f144265b;

    /* renamed from: c */
    private boolean f144266c;

    /* renamed from: d */
    private int f144267d;

    /* renamed from: a */
    public float mo198228a() {
        return this.f144265b;
    }

    /* renamed from: b */
    public int mo198229b() {
        return this.f144267d;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.f144265b), Boolean.valueOf(this.f144266c), Integer.valueOf(this.f144267d));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58496a)) {
            return false;
        }
        C58496a aVar = (C58496a) obj;
        if (Float.compare(aVar.f144265b, this.f144265b) == 0 && this.f144266c == aVar.f144266c && this.f144267d == aVar.f144267d) {
            return true;
        }
        return false;
    }

    public C58496a(float f, boolean z, int i) {
        this.f144265b = f;
        this.f144266c = z;
        this.f144267d = i;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.setFakeBoldText(true);
        paint.setTextSize(this.f144265b);
        int measureText = (int) paint.measureText(charSequence, i, i2);
        if (this.f144266c) {
            return f144264a + measureText;
        }
        return measureText;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        paint.setFakeBoldText(true);
        paint.setTextSize(this.f144265b);
        paint.setColor(this.f144267d);
        if (this.f144266c) {
            f2 = ((float) f144264a) + f;
        } else {
            f2 = f;
        }
        canvas.drawText(charSequence, i, i2, f2, (float) i4, paint);
    }
}
