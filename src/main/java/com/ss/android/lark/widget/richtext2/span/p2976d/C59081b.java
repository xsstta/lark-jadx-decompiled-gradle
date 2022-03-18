package com.ss.android.lark.widget.richtext2.span.p2976d;

import android.graphics.Paint;
import android.text.TextUtils;
import android.text.style.LineHeightSpan;
import com.ss.android.lark.widget.richtext.preprocess.p2966a.C59042d;

/* renamed from: com.ss.android.lark.widget.richtext2.span.d.b */
public class C59081b implements LineHeightSpan {

    /* renamed from: a */
    private final C59084b f146473a;

    /* renamed from: b */
    private boolean f146474b;

    /* renamed from: com.ss.android.lark.widget.richtext2.span.d.b$b */
    private static class C59084b {

        /* renamed from: a */
        public float f146476a;

        private C59084b() {
        }
    }

    /* renamed from: com.ss.android.lark.widget.richtext2.span.d.b$a */
    public static class C59083a {

        /* renamed from: a */
        private C59084b f146475a = new C59084b();

        /* renamed from: a */
        public C59081b mo200716a() {
            return new C59081b(this.f146475a);
        }

        /* renamed from: a */
        public C59083a mo200715a(float f) {
            this.f146475a.f146476a = f;
            return this;
        }
    }

    private C59081b(C59084b bVar) {
        this.f146474b = true;
        this.f146473a = bVar;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        if (!TextUtils.isEmpty(charSequence2)) {
            if (i != 0 || i2 != charSequence.length()) {
                boolean a = C59042d.m229248a(charSequence2);
                if (a || this.f146474b) {
                    this.f146474b = a;
                    float f = this.f146473a.f146476a / 2.0f;
                    fontMetricsInt.top = (int) (((float) fontMetricsInt.top) - f);
                    fontMetricsInt.ascent = (int) (((float) fontMetricsInt.ascent) - f);
                    fontMetricsInt.descent = (int) (((float) fontMetricsInt.descent) + f);
                    fontMetricsInt.bottom = (int) (((float) fontMetricsInt.bottom) + f);
                }
            }
        }
    }
}
