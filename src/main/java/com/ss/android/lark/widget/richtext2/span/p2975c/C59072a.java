package com.ss.android.lark.widget.richtext2.span.p2975c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.ss.android.lark.widget.richtext2.p2972c.AbstractC59066a;

/* renamed from: com.ss.android.lark.widget.richtext2.span.c.a */
public class C59072a implements LeadingMarginSpan {

    /* renamed from: a */
    private final C59075b f146454a;

    /* renamed from: b */
    private Paint f146455b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.richtext2.span.c.a$b */
    public static class C59075b {

        /* renamed from: a */
        public String f146457a;

        /* renamed from: b */
        public float f146458b;

        /* renamed from: c */
        public float f146459c;

        /* renamed from: d */
        public int f146460d;

        private C59075b() {
        }

        private C59075b(String str, float f, float f2, int i) {
            this.f146457a = str;
            this.f146458b = f;
            this.f146459c = f2;
            this.f146460d = i;
        }
    }

    /* renamed from: com.ss.android.lark.widget.richtext2.span.c.a$a */
    public static class C59074a {

        /* renamed from: a */
        private C59075b f146456a = new C59075b();

        /* renamed from: a */
        public C59072a mo200709a() {
            return new C59072a(new C59075b(this.f146456a.f146457a, this.f146456a.f146458b, this.f146456a.f146459c, this.f146456a.f146460d));
        }

        /* renamed from: a */
        public C59074a mo200706a(float f) {
            this.f146456a.f146458b = f;
            return this;
        }

        /* renamed from: b */
        public C59074a mo200710b(float f) {
            this.f146456a.f146459c = f;
            return this;
        }

        /* renamed from: a */
        public C59074a mo200707a(int i) {
            this.f146456a.f146460d = i;
            return this;
        }

        /* renamed from: a */
        public C59074a mo200708a(String str) {
            this.f146456a.f146457a = str;
            return this;
        }
    }

    private C59072a(C59075b bVar) {
        this.f146455b = AbstractC59066a.m229437a();
        this.f146454a = bVar;
    }

    public int getLeadingMargin(boolean z) {
        return (int) (this.f146454a.f146458b + this.f146454a.f146459c + 0.5f);
    }

    /* renamed from: a */
    private void m229447a(Paint paint) {
        this.f146455b.reset();
        this.f146455b.set(paint);
        this.f146455b.setAntiAlias(true);
    }

    /* renamed from: a */
    private void m229446a(Canvas canvas, int i) {
        float measureText = this.f146454a.f146458b - this.f146455b.measureText(this.f146454a.f146457a);
        this.f146455b.setColor(this.f146454a.f146460d);
        canvas.drawText(this.f146454a.f146457a, measureText, (float) i, this.f146455b);
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        m229447a(paint);
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            m229446a(canvas, i4);
        }
    }
}
