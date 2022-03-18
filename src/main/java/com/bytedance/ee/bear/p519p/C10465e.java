package com.bytedance.ee.bear.p519p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.bytedance.ee.bear.p519p.AbstractC10466g;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.p.e */
public class C10465e extends ReplacementSpan implements AbstractC10466g {

    /* renamed from: a */
    RectF f28145a = new RectF();

    /* renamed from: b */
    private int f28146b;

    /* renamed from: c */
    private int f28147c;

    /* renamed from: d */
    private int f28148d;

    /* renamed from: e */
    private int f28149e = 11;

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: e */
    public boolean mo39745e() {
        return false;
    }

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: f */
    public boolean mo39746f() {
        return false;
    }

    @Override // com.bytedance.ee.bear.p519p.AbstractC10466g
    /* renamed from: o */
    public /* synthetic */ int mo39738o() {
        return AbstractC10466g.CC.$default$o(this);
    }

    public C10465e(Context context) {
        this.f28147c = context.getResources().getColor(R.color.primary_pri_500);
        this.f28148d = context.getResources().getColor(R.color.static_white);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int measureText = ((int) paint.measureText(charSequence, i, i2)) + C13749l.m55738a(this.f28149e);
        this.f28146b = measureText;
        return measureText;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int color = paint.getColor();
        paint.setColor(this.f28147c);
        paint.setAntiAlias(true);
        this.f28145a.left = f;
        float f2 = (float) i4;
        this.f28145a.top = paint.ascent() + f2;
        this.f28145a.right = ((float) this.f28146b) + f;
        this.f28145a.bottom = paint.descent() + f2;
        canvas.drawRoundRect(this.f28145a, (float) C13749l.m55738a(this.f28149e), (float) C13749l.m55738a(this.f28149e), paint);
        paint.setColor(this.f28148d);
        float measureText = paint.measureText("@");
        canvas.drawText("@", 0, 1, f + ((float) C13749l.m55738a(this.f28149e / 2)), (float) (i4 - C13749l.m55738a(1)), paint);
        canvas.drawText(charSequence.subSequence(i + 1, i2).toString(), 0, (i2 - i) - 1, f + measureText + ((float) C13749l.m55738a(this.f28149e / 2)), f2, paint);
        paint.setColor(color);
    }
}
