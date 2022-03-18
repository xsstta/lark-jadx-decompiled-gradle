package com.bytedance.ee.bear.bizwidget.banner.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class RoundLinesIndicator extends BaseIndicator {
    public RoundLinesIndicator(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bizwidget.banner.indicator.BaseIndicator
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f14345a.mo19098b() > 1) {
            this.f14346b.setColor(this.f14345a.mo19100c());
            canvas.drawRoundRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) this.f14345a.mo19117l()), (float) this.f14345a.mo19116k(), (float) this.f14345a.mo19116k(), this.f14346b);
            this.f14346b.setColor(this.f14345a.mo19102d());
            int f = this.f14345a.mo19106f() * this.f14345a.mo19110h();
            canvas.drawRoundRect(new RectF((float) f, BitmapDescriptorFactory.HUE_RED, (float) (f + this.f14345a.mo19110h()), (float) this.f14345a.mo19117l()), (float) this.f14345a.mo19116k(), (float) this.f14345a.mo19116k(), this.f14346b);
        }
    }

    public RoundLinesIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int b = this.f14345a.mo19098b();
        if (b > 1) {
            setMeasuredDimension(this.f14345a.mo19110h() * b, this.f14345a.mo19117l());
        }
    }

    public RoundLinesIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14346b.setStyle(Paint.Style.FILL);
    }
}
