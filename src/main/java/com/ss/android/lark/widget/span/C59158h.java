package com.ss.android.lark.widget.span;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.widget.span.h */
public class C59158h extends ReplacementSpan {

    /* renamed from: a */
    private String f146839a;

    /* renamed from: b */
    private Context f146840b;

    /* renamed from: c */
    private boolean f146841c;

    /* renamed from: d */
    private int f146842d;

    /* renamed from: a */
    public String mo201092a() {
        return this.f146839a;
    }

    /* renamed from: a */
    public void mo201093a(int i) {
        this.f146842d = i;
    }

    public C59158h(Context context, String str) {
        this.f146839a = str;
        this.f146840b = context;
    }

    public C59158h(Context context, String str, boolean z) {
        this(context, str);
        this.f146841c = z;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(this.f146839a);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = this.f146842d;
        if (i6 != 0) {
            paint.setColor(i6);
        } else if (this.f146841c) {
            paint.setColor(this.f146840b.getResources().getColor(R.color.imtoken_message_text_bubbles_blue));
        } else {
            paint.setColor(this.f146840b.getResources().getColor(R.color.ud_N650));
        }
        canvas.drawText(this.f146839a, f, (float) i4, paint);
    }
}
