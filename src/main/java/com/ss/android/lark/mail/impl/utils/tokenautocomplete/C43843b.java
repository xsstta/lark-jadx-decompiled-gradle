package com.ss.android.lark.mail.impl.utils.tokenautocomplete;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;

/* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.b */
public class C43843b implements LineHeightSpan {

    /* renamed from: b */
    static Paint.FontMetricsInt f111267b;

    /* renamed from: a */
    final int f111268a = 2;

    /* renamed from: c */
    private final int f111269c;

    public C43843b(int i) {
        this.f111269c = i;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = f111267b;
        if (fontMetricsInt2 == null) {
            Paint.FontMetricsInt fontMetricsInt3 = new Paint.FontMetricsInt();
            f111267b = fontMetricsInt3;
            fontMetricsInt3.top = fontMetricsInt.top;
            f111267b.ascent = fontMetricsInt.ascent;
            f111267b.descent = fontMetricsInt.descent;
            f111267b.bottom = fontMetricsInt.bottom;
            f111267b.leading = fontMetricsInt.leading;
        } else {
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.ascent = f111267b.ascent;
            fontMetricsInt.descent = f111267b.descent;
            fontMetricsInt.bottom = f111267b.bottom;
            fontMetricsInt.leading = f111267b.leading;
        }
        int i5 = this.f111269c - (((fontMetricsInt.descent + i4) - fontMetricsInt.ascent) - i3);
        if (i5 > 0) {
            int i6 = i5 / 2;
            fontMetricsInt.descent += i6;
            fontMetricsInt.ascent -= i6;
        }
        int i7 = this.f111269c - (((i4 + fontMetricsInt.bottom) - fontMetricsInt.top) - i3);
        if (i7 > 0) {
            int i8 = i7 / 2;
            fontMetricsInt.bottom += i8;
            fontMetricsInt.top -= i8;
        }
        if (i2 == ((Spanned) charSequence).getSpanEnd(this)) {
            f111267b = null;
        }
    }
}
