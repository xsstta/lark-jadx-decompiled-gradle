package com.scwang.smartrefresh.layout.header.bezierradar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.scwang.smartrefresh.layout.p1237d.C27144b;

/* renamed from: com.scwang.smartrefresh.layout.header.bezierradar.b */
public class C27158b extends View {

    /* renamed from: a */
    private int f67549a = 7;

    /* renamed from: b */
    private Paint f67550b;

    /* renamed from: c */
    private float f67551c;

    /* renamed from: d */
    private float f67552d;

    public void setFraction(float f) {
        this.f67552d = f;
    }

    public void setDotColor(int i) {
        this.f67550b.setColor(i);
    }

    public C27158b(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f67550b = paint;
        paint.setAntiAlias(true);
        this.f67550b.setColor(-1);
        this.f67551c = (float) C27144b.m98678a(7.0f);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int i = this.f67549a;
        float f2 = this.f67552d;
        float f3 = ((float) (width / i)) * f2;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (f2 > 1.0f) {
            f = ((f2 - 1.0f) * ((float) (width / i))) / f2;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        float f5 = f3 - f;
        float f6 = (float) height;
        float f7 = 2.0f;
        if (f2 > 1.0f) {
            f4 = (((f2 - 1.0f) * f6) / 2.0f) / f2;
        }
        float f8 = f6 - f4;
        int i2 = 0;
        while (true) {
            int i3 = this.f67549a;
            if (i2 < i3) {
                float f9 = (((float) i2) + 1.0f) - ((((float) i3) + 1.0f) / f7);
                float b = C27144b.m98679b(f6);
                this.f67550b.setAlpha((int) (((double) ((1.0f - ((Math.abs(f9) / ((float) this.f67549a)) * f7)) * 255.0f)) * (1.0d - (1.0d / Math.pow((((double) b) / 800.0d) + 1.0d, 15.0d)))));
                float f10 = this.f67551c * (1.0f - (1.0f / ((b / 10.0f) + 1.0f)));
                canvas.drawCircle((((float) (width / 2)) - (f10 / 2.0f)) + (f9 * f5), f8 / 2.0f, f10, this.f67550b);
                i2++;
                f5 = f5;
                f7 = 2.0f;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize(getSuggestedMinimumWidth(), i), resolveSize(getSuggestedMinimumHeight(), i2));
    }
}
