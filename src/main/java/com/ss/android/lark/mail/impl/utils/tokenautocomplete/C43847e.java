package com.ss.android.lark.mail.impl.utils.tokenautocomplete;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.e */
public class C43847e extends ReplacementSpan {

    /* renamed from: a */
    private AbstractC43848a f111274a;

    /* renamed from: b */
    private int f111275b = -1;

    /* renamed from: c */
    private int f111276c;

    /* renamed from: d */
    private int f111277d;

    /* renamed from: e */
    private int f111278e;

    /* renamed from: f */
    protected View f111279f;

    /* renamed from: g */
    protected int f111280g;

    /* renamed from: h */
    protected int f111281h;

    /* renamed from: i */
    protected int f111282i;

    /* renamed from: j */
    protected int f111283j;

    /* renamed from: com.ss.android.lark.mail.impl.utils.tokenautocomplete.e$a */
    public interface AbstractC43848a {
        /* renamed from: a */
        int mo156108a(boolean z, Paint paint);
    }

    /* renamed from: a */
    private void m173819a(Paint paint) {
        boolean z;
        int i = this.f111277d;
        if (i < 40) {
            z = true;
        } else {
            z = false;
        }
        if (this.f111276c == i) {
            int a = this.f111274a.mo156108a(z, paint);
            this.f111278e = a;
            if (a == this.f111275b) {
                return;
            }
        }
        int i2 = this.f111278e;
        this.f111275b = i2;
        this.f111276c = this.f111277d;
        int i3 = Integer.MIN_VALUE;
        if (i2 == 0) {
            i3 = 0;
        }
        this.f111279f.measure(View.MeasureSpec.makeMeasureSpec(i2, i3), View.MeasureSpec.makeMeasureSpec(UIHelper.getDimens(R.dimen.mail_compose_recipient_tag_height), 1073741824));
        View view = this.f111279f;
        view.layout(0, 0, view.getMeasuredWidth(), this.f111279f.getMeasuredHeight());
    }

    public C43847e(View view, AbstractC43848a aVar) {
        this.f111274a = aVar;
        this.f111279f = view;
        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        m173819a(paint);
        if (fontMetricsInt != null) {
            int measuredHeight = this.f111279f.getMeasuredHeight();
            int baseline = this.f111279f.getBaseline();
            if (baseline == -1) {
                baseline = measuredHeight;
            }
            int i3 = -baseline;
            fontMetricsInt.top = i3;
            fontMetricsInt.ascent = i3;
            int i4 = measuredHeight - baseline;
            fontMetricsInt.bottom = i4;
            fontMetricsInt.descent = i4;
        }
        return this.f111279f.getRight();
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        this.f111277d = i3;
        m173819a(paint);
        canvas.save();
        canvas.translate(f, (float) i3);
        this.f111280g = (int) f;
        this.f111281h = i3;
        this.f111282i = i4;
        this.f111283j = i5;
        this.f111279f.draw(canvas);
        canvas.restore();
    }
}
