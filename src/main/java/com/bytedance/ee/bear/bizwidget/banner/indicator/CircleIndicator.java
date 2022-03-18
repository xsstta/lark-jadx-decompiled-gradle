package com.bytedance.ee.bear.bizwidget.banner.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class CircleIndicator extends BaseIndicator {

    /* renamed from: d */
    private int f14348d;

    /* renamed from: e */
    private int f14349e;

    /* renamed from: f */
    private int f14350f;

    public CircleIndicator(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bizwidget.banner.indicator.BaseIndicator
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        int b = this.f14345a.mo19098b();
        if (b > 1) {
            float f = BitmapDescriptorFactory.HUE_RED;
            for (int i4 = 0; i4 < b; i4++) {
                Paint paint = this.f14346b;
                if (this.f14345a.mo19106f() == i4) {
                    i = this.f14345a.mo19102d();
                } else {
                    i = this.f14345a.mo19100c();
                }
                paint.setColor(i);
                if (this.f14345a.mo19106f() == i4) {
                    i2 = this.f14345a.mo19110h();
                } else {
                    i2 = this.f14345a.mo19108g();
                }
                if (this.f14345a.mo19106f() == i4) {
                    i3 = this.f14349e;
                } else {
                    i3 = this.f14348d;
                }
                float f2 = (float) i3;
                canvas.drawCircle(f + f2, (float) this.f14350f, f2, this.f14346b);
                f += (float) (i2 + this.f14345a.mo19104e());
            }
        }
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int b = this.f14345a.mo19098b();
        if (b > 1) {
            this.f14348d = this.f14345a.mo19108g() / 2;
            int h = this.f14345a.mo19110h() / 2;
            this.f14349e = h;
            this.f14350f = Math.max(h, this.f14348d);
            int i3 = b - 1;
            setMeasuredDimension((this.f14345a.mo19104e() * i3) + this.f14345a.mo19110h() + (this.f14345a.mo19108g() * i3), Math.max(this.f14345a.mo19108g(), this.f14345a.mo19110h()));
        }
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14348d = this.f14345a.mo19108g() / 2;
        this.f14349e = this.f14345a.mo19110h() / 2;
    }
}
