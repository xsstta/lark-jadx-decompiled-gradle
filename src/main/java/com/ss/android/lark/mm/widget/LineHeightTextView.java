package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.style.LineHeightSpan;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.suite.R;

public class LineHeightTextView extends AppCompatTextView {

    /* renamed from: a */
    private static SparseIntArray f118683a = new SparseIntArray() {
        /* class com.ss.android.lark.mm.widget.LineHeightTextView.C471231 */

        {
            put(26, 34);
            put(24, 32);
            put(20, 28);
            put(17, 24);
            put(16, 22);
            put(14, 20);
            put(12, 18);
            put(10, 14);
        }
    };

    /* renamed from: b */
    private C47124a f118684b;

    /* renamed from: c */
    private float f118685c = -1.0f;

    /* renamed from: e */
    private TextView.BufferType f118686e = TextView.BufferType.NORMAL;

    private C47124a getBuilder() {
        if (this.f118684b == null) {
            this.f118684b = new C47124a();
        }
        return this.f118684b;
    }

    /* renamed from: com.ss.android.lark.mm.widget.LineHeightTextView$b */
    public static class C47125b implements LineHeightSpan {

        /* renamed from: a */
        private int f118688a;

        C47125b(float f) {
            this.f118688a = (int) Math.ceil((double) f);
        }

        /* renamed from: a */
        public void mo165554a(float f) {
            this.f118688a = (int) Math.ceil((double) f);
        }

        public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            int i5 = fontMetricsInt.descent;
            int i6 = this.f118688a;
            if (i5 > i6) {
                int min = Math.min(i6, fontMetricsInt.descent);
                fontMetricsInt.descent = min;
                fontMetricsInt.bottom = min;
                fontMetricsInt.ascent = 0;
                fontMetricsInt.top = 0;
            } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.f118688a) {
                fontMetricsInt.bottom = fontMetricsInt.descent;
                int i7 = (-this.f118688a) + fontMetricsInt.descent;
                fontMetricsInt.ascent = i7;
                fontMetricsInt.top = i7;
            } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.f118688a) {
                fontMetricsInt.top = fontMetricsInt.ascent;
                fontMetricsInt.bottom = fontMetricsInt.ascent + this.f118688a;
            } else {
                int i8 = (-fontMetricsInt.top) + fontMetricsInt.bottom;
                int i9 = this.f118688a;
                if (i8 > i9) {
                    fontMetricsInt.top = fontMetricsInt.bottom - this.f118688a;
                    return;
                }
                int i10 = i9 - ((-fontMetricsInt.top) + fontMetricsInt.bottom);
                double d = (double) (((float) i10) / 2.0f);
                fontMetricsInt.top = (int) (((double) fontMetricsInt.top) - Math.ceil(d));
                fontMetricsInt.bottom = (int) (((double) fontMetricsInt.bottom) + Math.floor(d));
                fontMetricsInt.ascent = fontMetricsInt.top;
                fontMetricsInt.descent = fontMetricsInt.bottom;
            }
        }
    }

    public LineHeightTextView(Context context) {
        super(context);
        m186611a(context, null);
    }

    public void setUXLineHeight(float f) {
        this.f118685c = f;
        setText(getText(), this.f118686e);
    }

    public void setUXLineHeightInDp(float f) {
        setUXLineHeight(getContext().getResources().getDisplayMetrics().density * f);
    }

    public LineHeightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m186611a(context, attributeSet);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.f118686e = bufferType;
        if (this.f118685c <= 1.0f) {
            super.setText(charSequence, bufferType);
            return;
        }
        C47124a builder = getBuilder();
        builder.mo165553a(charSequence, this.f118685c);
        super.setText(builder, bufferType);
    }

    /* renamed from: com.ss.android.lark.mm.widget.LineHeightTextView$a */
    public static class C47124a extends SpannableStringBuilder {

        /* renamed from: a */
        private C47125b f118687a;

        /* renamed from: a */
        public void mo165553a(CharSequence charSequence, float f) {
            clear();
            clearSpans();
            C47125b bVar = this.f118687a;
            if (bVar == null) {
                this.f118687a = new C47125b(f);
            } else {
                bVar.mo165554a(f);
            }
            append(charSequence);
            setSpan(this.f118687a, 0, charSequence.length(), 17);
        }
    }

    /* renamed from: a */
    private void m186611a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ux_line_height});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            if (dimensionPixelSize < 0) {
                float f = getResources().getDisplayMetrics().density;
                dimensionPixelSize = (int) (((float) f118683a.get((int) (getTextSize() / f), -1)) * f);
            }
            setUXLineHeight((float) dimensionPixelSize);
            obtainStyledAttributes.recycle();
        }
    }

    public LineHeightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m186611a(context, attributeSet);
    }
}
