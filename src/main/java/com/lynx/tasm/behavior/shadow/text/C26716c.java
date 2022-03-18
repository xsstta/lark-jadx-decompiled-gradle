package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: com.lynx.tasm.behavior.shadow.text.c */
public class C26716c implements LineHeightSpan {

    /* renamed from: a */
    private final int f66135a;

    public int hashCode() {
        return this.f66135a + 31;
    }

    public C26716c(float f) {
        this.f66135a = (int) Math.ceil((double) f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C26716c) || this.f66135a != ((C26716c) obj).f66135a) {
            return false;
        }
        return true;
    }

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = this.f66135a;
        if (i5 > i6) {
            int min = Math.min(i6, fontMetricsInt.descent);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.f66135a) {
            fontMetricsInt.bottom = fontMetricsInt.descent;
            int i7 = (-this.f66135a) + fontMetricsInt.descent;
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.f66135a) {
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.ascent + this.f66135a;
        } else {
            int i8 = (-fontMetricsInt.top) + fontMetricsInt.bottom;
            int i9 = this.f66135a;
            if (i8 > i9) {
                fontMetricsInt.top = fontMetricsInt.bottom - this.f66135a;
                return;
            }
            int round = Math.round(((float) (i9 - ((-fontMetricsInt.top) + fontMetricsInt.bottom))) / 2.0f);
            int round2 = Math.round(((float) (this.f66135a - (fontMetricsInt.descent - fontMetricsInt.ascent))) / 2.0f);
            fontMetricsInt.top -= round;
            fontMetricsInt.bottom += round;
            fontMetricsInt.ascent -= round2;
            fontMetricsInt.descent += round2;
        }
    }
}
