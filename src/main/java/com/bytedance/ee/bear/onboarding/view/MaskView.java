package com.bytedance.ee.bear.onboarding.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;

public class MaskView extends View {

    /* renamed from: a */
    private Paint f28016a;

    /* renamed from: b */
    private PorterDuffXfermode f28017b;

    /* renamed from: c */
    private RectF f28018c;

    /* renamed from: d */
    private int f28019d;

    /* renamed from: e */
    private int f28020e;

    /* renamed from: f */
    private int f28021f;

    /* renamed from: a */
    private void m43353a() {
        this.f28018c = new RectF();
        this.f28020e = C25653b.m91893a(getResources().getColor(R.color.space_kit_n1000), 0.1f);
        this.f28021f = getResources().getColor(R.color.space_kit_trans);
        this.f28019d = (int) (getResources().getDisplayMetrics().density * 8.0f);
        Paint paint = new Paint();
        this.f28016a = paint;
        paint.setAntiAlias(true);
        this.f28016a.setDither(true);
        this.f28016a.setStyle(Paint.Style.FILL);
        this.f28017b = new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP);
        setLayerType(1, null);
    }

    public void setHighlightRectRadius(int i) {
        this.f28019d = i;
    }

    public void setMaskColor(int i) {
        this.f28020e = i;
    }

    public MaskView(Context context) {
        this(context, null);
    }

    public void setHighRect(RectF rectF) {
        if (rectF != null) {
            this.f28018c = rectF;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f28016a.setXfermode(null);
        this.f28016a.setColor(this.f28020e);
        canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getMeasuredWidth(), (float) getMeasuredHeight(), this.f28016a);
        this.f28016a.setXfermode(this.f28017b);
        this.f28016a.setColor(this.f28021f);
        RectF rectF = this.f28018c;
        int i = this.f28019d;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f28016a);
    }

    public MaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m43353a();
    }
}
