package com.ss.android.lark.mm.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;

/* renamed from: com.ss.android.lark.mm.utils.t */
public class C47119t extends ReplacementSpan {

    /* renamed from: a */
    private int f118660a;

    /* renamed from: b */
    private int f118661b = C45851c.m181648b(R.dimen.dp_4);

    /* renamed from: c */
    private int f118662c = C45851c.m181648b(R.dimen.dp_2);

    /* renamed from: d */
    private int f118663d;

    /* renamed from: e */
    private int f118664e;

    /* renamed from: f */
    private int f118665f;

    /* renamed from: g */
    private RectF f118666g;

    public C47119t(int i, int i2, int i3) {
        this.f118660a = i2;
        this.f118663d = i;
        this.f118664e = i3;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.setTextSize((float) this.f118660a);
        int measureText = ((int) paint.measureText(charSequence, i, i2)) + (this.f118661b * 2);
        this.f118665f = measureText;
        C45855f.m181664c("RoundBackgroundSpan", String.valueOf(measureText));
        return this.f118665f;
    }

    /* renamed from: a */
    private void m186588a(Canvas canvas, float f, int i, int i2, int i3, Paint paint) {
        paint.setColor(this.f118664e);
        RectF rectF = this.f118666g;
        int i4 = this.f118662c;
        canvas.drawRoundRect(rectF, (float) i4, (float) i4, paint);
    }

    /* renamed from: a */
    private void m186589a(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, Paint paint) {
        paint.setTextSize((float) this.f118660a);
        paint.setColor(this.f118663d);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.drawText(charSequence, i, i2, f + BitmapDescriptorFactory.HUE_RED + ((float) this.f118661b), ((this.f118666g.bottom - ((this.f118666g.bottom - this.f118666g.top) / 2.0f)) + (((float) (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2.0f)) - ((float) fontMetricsInt.descent), paint);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.setTextSize((float) UIUtils.dp2px(C45851c.m181646a(), 16.0f));
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        if (this.f118666g == null) {
            float f2 = BitmapDescriptorFactory.HUE_RED + f;
            this.f118666g = new RectF(f2, (float) (i4 + fontMetricsInt.ascent), ((float) this.f118665f) + f2, (float) (i4 + fontMetricsInt.descent));
        }
        m186588a(canvas, f, i3, i4, i5, paint);
        m186589a(canvas, charSequence, i, i2, f, i4, paint);
    }
}
