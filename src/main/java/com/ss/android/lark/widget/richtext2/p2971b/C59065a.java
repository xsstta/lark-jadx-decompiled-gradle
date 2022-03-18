package com.ss.android.lark.widget.richtext2.p2971b;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: com.ss.android.lark.widget.richtext2.b.a */
public class C59065a extends MetricAffectingSpan {

    /* renamed from: a */
    private int f146415a;

    /* renamed from: b */
    private int f146416b;

    /* renamed from: c */
    private int f146417c;

    /* renamed from: d */
    private boolean f146418d;

    /* renamed from: e */
    private boolean f146419e;

    /* renamed from: f */
    private boolean f146420f;

    /* renamed from: g */
    private boolean f146421g;

    public void updateMeasureState(TextPaint textPaint) {
        int i = this.f146415a;
        if (i != -1) {
            textPaint.setTextSize((float) i);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        int i = this.f146415a;
        if (i != -1) {
            textPaint.setTextSize((float) i);
        }
        int i2 = this.f146416b;
        if (i2 != 0) {
            textPaint.setColor(i2);
        }
        int i3 = this.f146417c;
        if (i3 != 0) {
            textPaint.bgColor = i3;
        }
        if (this.f146419e) {
            textPaint.setTextSkewX(-0.25f);
        }
        textPaint.setFakeBoldText(this.f146418d);
        textPaint.setUnderlineText(this.f146420f);
        textPaint.setStrikeThruText(this.f146421g);
    }

    public C59065a(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f146415a = i;
        this.f146416b = i2;
        this.f146417c = i3;
        this.f146418d = z;
        this.f146419e = z2;
        this.f146420f = z3;
        this.f146421g = z4;
    }
}
