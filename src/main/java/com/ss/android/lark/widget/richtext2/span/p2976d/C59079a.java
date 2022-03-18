package com.ss.android.lark.widget.richtext2.span.p2976d;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;

/* renamed from: com.ss.android.lark.widget.richtext2.span.d.a */
public class C59079a implements LineHeightSpan {

    /* renamed from: a */
    private final C59080a f146471a;

    /* renamed from: com.ss.android.lark.widget.richtext2.span.d.a$a */
    private static class C59080a {

        /* renamed from: a */
        public float f146472a;
    }

    /* renamed from: a */
    private static boolean m229463a(int i, CharSequence charSequence, Object obj) {
        int spanEnd = ((Spanned) charSequence).getSpanEnd(obj);
        if (spanEnd == i || spanEnd == i - 1) {
            return true;
        }
        return false;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (m229463a(i2, charSequence, this)) {
            int i5 = (int) (((double) (this.f146471a.f146472a - ((float) (fontMetricsInt.bottom - fontMetricsInt.top)))) + 0.5d);
            fontMetricsInt.descent += i5;
            fontMetricsInt.bottom += i5;
        }
    }
}
