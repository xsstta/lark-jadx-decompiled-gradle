package com.ss.android.lark.widget.span;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.widget.span.a */
public class C59151a extends ReplacementSpan {

    /* renamed from: a */
    private String f146817a;

    /* renamed from: b */
    private Context f146818b;

    /* renamed from: c */
    private boolean f146819c;

    /* renamed from: d */
    private boolean f146820d;

    /* renamed from: e */
    private int f146821e;

    /* renamed from: a */
    public String mo201076a() {
        return this.f146817a;
    }

    /* renamed from: a */
    public void mo201077a(int i) {
        this.f146821e = i;
    }

    public C59151a(Context context, String str) {
        this.f146817a = str;
        this.f146818b = context;
    }

    public C59151a(Context context, String str, boolean z) {
        this(context, str);
        this.f146819c = z;
    }

    public C59151a(Context context, String str, boolean z, boolean z2) {
        this(context, str, z);
        this.f146820d = z2;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(this.f146817a);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = this.f146821e;
        if (i6 != 0) {
            paint.setColor(i6);
        } else if (this.f146819c || this.f146820d) {
            paint.setColor(this.f146818b.getResources().getColor(R.color.text_title));
        } else {
            paint.setColor(this.f146818b.getResources().getColor(R.color.text_link_normal));
        }
        canvas.drawText(this.f146817a, f, (float) i4, paint);
    }
}
