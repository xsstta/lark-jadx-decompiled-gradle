package com.lynx.tasm.behavior.ui.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.style.ReplacementSpan;

/* renamed from: com.lynx.tasm.behavior.ui.text.a */
public abstract class AbstractC26821a extends ReplacementSpan {

    /* renamed from: a */
    private int f66577a;

    /* renamed from: b */
    private int f66578b;

    /* renamed from: c */
    private int f66579c;

    /* renamed from: d */
    private int f66580d;

    /* renamed from: e */
    private int f66581e;

    /* renamed from: f */
    private int f66582f;

    /* renamed from: g */
    private int f66583g;

    /* renamed from: h */
    private float f66584h;

    /* renamed from: i */
    private Drawable.Callback f66585i;

    /* renamed from: a */
    public abstract Drawable mo67427a();

    /* renamed from: b */
    public abstract void mo67429b();

    /* renamed from: c */
    public abstract void mo67430c();

    /* renamed from: d */
    public abstract void mo67431d();

    /* renamed from: e */
    public abstract void mo67432e();

    /* renamed from: a */
    public void mo67428a(Drawable.Callback callback) {
        this.f66585i = callback;
    }

    /* renamed from: a */
    private int m97429a(Paint.FontMetricsInt fontMetricsInt) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i6 = this.f66577a + this.f66582f;
        switch (this.f66583g) {
            case 1:
                return -i6;
            case 2:
                i = fontMetricsInt.descent - i6;
                i2 = (int) (((float) i5) * 0.1f);
                return i - i2;
            case 3:
                i3 = fontMetricsInt.ascent;
                i4 = (int) (((float) i5) * 0.1f);
                return i3 + i4;
            case 4:
            case 5:
                return fontMetricsInt.ascent;
            case 6:
            default:
                i3 = fontMetricsInt.ascent;
                i4 = (i5 - i6) / 2;
                return i3 + i4;
            case 7:
            case 8:
                return fontMetricsInt.descent - i6;
            case 9:
                i = -i6;
                i2 = (int) (this.f66584h * ((float) i5));
                return i - i2;
        }
    }

    /* renamed from: a */
    public void mo95469a(int i, float f) {
        this.f66583g = i;
        this.f66584h = f;
    }

    /* renamed from: a */
    public static void m97430a(Spanned spanned, Drawable.Callback callback) {
        AbstractC26821a[] aVarArr = (AbstractC26821a[]) spanned.getSpans(0, spanned.length(), AbstractC26821a.class);
        for (AbstractC26821a aVar : aVarArr) {
            aVar.mo67431d();
            aVar.mo67428a(callback);
        }
    }

    public AbstractC26821a(int i, int i2, int[] iArr) {
        this.f66578b = i;
        this.f66577a = i2;
        this.f66579c = iArr[0];
        this.f66580d = iArr[1];
        this.f66581e = iArr[0] + iArr[2];
        this.f66582f = iArr[1] + iArr[3];
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            if (fontMetricsInt.descent == fontMetricsInt.ascent) {
                fontMetricsInt.ascent = paint.getFontMetricsInt().ascent;
                fontMetricsInt.descent = paint.getFontMetricsInt().descent;
            }
            int a = m97429a(fontMetricsInt);
            if (fontMetricsInt.ascent > a) {
                fontMetricsInt.ascent = a;
            }
            int i3 = fontMetricsInt.descent;
            int i4 = this.f66577a;
            int i5 = this.f66582f;
            if (i3 < a + i4 + i5) {
                fontMetricsInt.descent = a + i4 + i5;
            }
            if (fontMetricsInt.top > fontMetricsInt.ascent) {
                fontMetricsInt.top = fontMetricsInt.ascent;
            }
            if (fontMetricsInt.bottom < fontMetricsInt.descent) {
                fontMetricsInt.bottom = fontMetricsInt.descent;
            }
        }
        return this.f66578b + this.f66581e;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (mo67427a() != null) {
            Drawable a = mo67427a();
            canvas.save();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i6 = this.f66583g;
            if (i6 == 0) {
                i3 = i4 + ((((fontMetricsInt.ascent + fontMetricsInt.descent) - this.f66577a) - this.f66582f) / 2);
            } else if (i6 != 4) {
                if (i6 == 6) {
                    i3 = (((i5 + i3) - this.f66577a) - this.f66582f) / 2;
                } else if (i6 != 7) {
                    i3 = i4 + m97429a(fontMetricsInt);
                } else {
                    i3 = (i5 - this.f66577a) - this.f66582f;
                }
            }
            canvas.translate(f + ((float) this.f66579c), (float) (i3 + this.f66580d));
            a.draw(canvas);
            canvas.restore();
        }
    }
}
