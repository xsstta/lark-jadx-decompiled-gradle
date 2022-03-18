package com.bytedance.ee.bear.bizwidget.banner.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class RectangleIndicator extends BaseIndicator {

    /* renamed from: d */
    RectF f14351d;

    public RectangleIndicator(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bizwidget.banner.indicator.BaseIndicator
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        super.onDraw(canvas);
        int b = this.f14345a.mo19098b();
        if (b > 1) {
            float f = BitmapDescriptorFactory.HUE_RED;
            for (int i3 = 0; i3 < b; i3++) {
                Paint paint = this.f14346b;
                if (this.f14345a.mo19106f() == i3) {
                    i = this.f14345a.mo19102d();
                } else {
                    i = this.f14345a.mo19100c();
                }
                paint.setColor(i);
                if (this.f14345a.mo19106f() == i3) {
                    i2 = this.f14345a.mo19110h();
                } else {
                    i2 = this.f14345a.mo19108g();
                }
                this.f14351d.set(f, BitmapDescriptorFactory.HUE_RED, ((float) i2) + f, (float) this.f14345a.mo19117l());
                if (this.f14345a.mo19106f() == i3) {
                    canvas.drawRoundRect(this.f14351d, (float) this.f14345a.mo19116k(), (float) this.f14345a.mo19116k(), this.f14346b);
                } else {
                    canvas.drawCircle(((float) (this.f14345a.mo19108g() / 2)) + f, (float) (this.f14345a.mo19117l() / 2), (float) (this.f14345a.mo19108g() / 2), this.f14346b);
                }
                f += (float) (i2 + this.f14345a.mo19104e());
            }
        }
    }

    public RectangleIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int b = this.f14345a.mo19098b();
        if (b > 1) {
            int i3 = b - 1;
            setMeasuredDimension((this.f14345a.mo19104e() * i3) + (this.f14345a.mo19108g() * i3) + this.f14345a.mo19110h(), this.f14345a.mo19117l());
        }
    }

    public RectangleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14351d = new RectF();
    }
}
