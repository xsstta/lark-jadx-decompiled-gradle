package com.ss.android.vc.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.style.LineHeightSpan;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;

public class LineHeightTextView extends AppCompatTextView {

    /* renamed from: a */
    private static SparseIntArray f152047a = new SparseIntArray() {
        /* class com.ss.android.vc.common.widget.LineHeightTextView.C608041 */

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
    private Paint.FontMetricsInt f152048b;

    /* renamed from: c */
    private C60805a f152049c;

    /* renamed from: e */
    private float f152050e;

    /* renamed from: f */
    private TextView.BufferType f152051f;

    private C60805a getBuilder() {
        if (this.f152049c == null) {
            this.f152049c = new C60805a();
        }
        return this.f152049c;
    }

    public LineHeightTextView(Context context) {
        this(context, null);
    }

    /* renamed from: com.ss.android.vc.common.widget.LineHeightTextView$b */
    public static class C60806b implements LineHeightSpan {

        /* renamed from: a */
        private int f152053a;

        C60806b(float f) {
            this.f152053a = (int) Math.ceil((double) f);
        }

        /* renamed from: a */
        public void mo208458a(float f) {
            this.f152053a = (int) Math.ceil((double) f);
        }

        public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
            int i5 = fontMetricsInt.descent;
            int i6 = this.f152053a;
            if (i5 > i6) {
                int min = Math.min(i6, fontMetricsInt.descent);
                fontMetricsInt.descent = min;
                fontMetricsInt.bottom = min;
                fontMetricsInt.ascent = 0;
                fontMetricsInt.top = 0;
            } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.f152053a) {
                fontMetricsInt.bottom = fontMetricsInt.descent;
                int i7 = (-this.f152053a) + fontMetricsInt.descent;
                fontMetricsInt.ascent = i7;
                fontMetricsInt.top = i7;
            } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.f152053a) {
                fontMetricsInt.top = fontMetricsInt.ascent;
                fontMetricsInt.bottom = fontMetricsInt.ascent + this.f152053a;
            } else {
                int i8 = (-fontMetricsInt.top) + fontMetricsInt.bottom;
                int i9 = this.f152053a;
                if (i8 > i9) {
                    fontMetricsInt.top = fontMetricsInt.bottom - this.f152053a;
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

    public void setUXLineHeight(float f) {
        this.f152050e = f;
        setText(getText(), this.f152051f);
    }

    /* renamed from: a */
    private static Context m236329a(Context context) {
        if (context != null) {
            return context;
        }
        C60700b.m235851b("LineHeightTextView", "checkContext", "param context is null");
        Context c = ar.m236698c();
        if (c == null) {
            C60700b.m235851b("LineHeightTextView", "checkContext2", "getActivityContext is null");
        }
        return c;
    }

    public void setUXLineHeightInDp(float f) {
        setUXLineHeight(getContext().getResources().getDisplayMetrics().density * f);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f152048b == null) {
            this.f152048b = new Paint.FontMetricsInt();
            getPaint().getFontMetricsInt(this.f152048b);
        }
        canvas.translate(BitmapDescriptorFactory.HUE_RED, ((float) ((this.f152048b.top - this.f152048b.ascent) + (this.f152048b.descent - this.f152048b.bottom))) / 2.0f);
        super.onDraw(canvas);
    }

    public LineHeightTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.f152051f = bufferType;
        if (this.f152050e <= 1.0f) {
            super.setText(charSequence, bufferType);
            return;
        }
        C60805a builder = getBuilder();
        builder.mo208457a(charSequence, this.f152050e);
        super.setText(builder, bufferType);
    }

    /* renamed from: com.ss.android.vc.common.widget.LineHeightTextView$a */
    public static class C60805a extends SpannableStringBuilder {

        /* renamed from: a */
        private C60806b f152052a;

        /* renamed from: a */
        public void mo208457a(CharSequence charSequence, float f) {
            clear();
            clearSpans();
            C60806b bVar = this.f152052a;
            if (bVar == null) {
                this.f152052a = new C60806b(f);
            } else {
                bVar.mo208458a(f);
            }
            append(charSequence);
            setSpan(this.f152052a, 0, charSequence.length(), 17);
        }
    }

    /* renamed from: a */
    private void m236330a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ux_line_height});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            if (dimensionPixelSize < 0) {
                float f = getResources().getDisplayMetrics().density;
                dimensionPixelSize = (int) (((float) f152047a.get((int) (getTextSize() / f), -1)) * f);
            }
            setUXLineHeight((float) dimensionPixelSize);
            obtainStyledAttributes.recycle();
        }
    }

    public LineHeightTextView(Context context, AttributeSet attributeSet, int i) {
        super(m236329a(context), attributeSet, i);
        this.f152050e = -1.0f;
        this.f152051f = TextView.BufferType.NORMAL;
        m236330a(getContext(), attributeSet);
    }
}
