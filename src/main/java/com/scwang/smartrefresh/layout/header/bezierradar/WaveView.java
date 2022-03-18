package com.scwang.smartrefresh.layout.header.bezierradar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class WaveView extends View {

    /* renamed from: a */
    private int f67539a;

    /* renamed from: b */
    private int f67540b;

    /* renamed from: c */
    private Path f67541c;

    /* renamed from: d */
    private Paint f67542d;

    /* renamed from: e */
    private int f67543e;

    public int getHeadHeight() {
        return this.f67540b;
    }

    public int getWaveHeight() {
        return this.f67539a;
    }

    /* renamed from: a */
    private void m98748a() {
        this.f67541c = new Path();
        Paint paint = new Paint();
        this.f67542d = paint;
        paint.setColor(-14736346);
        this.f67542d.setAntiAlias(true);
    }

    public void setHeadHeight(int i) {
        this.f67540b = i;
    }

    public void setWaveHeight(int i) {
        this.f67539a = i;
    }

    public void setWaveOffsetX(int i) {
        this.f67543e = i;
    }

    public WaveView(Context context) {
        this(context, null, 0);
    }

    public void setWaveColor(int i) {
        this.f67542d.setColor(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        this.f67541c.reset();
        this.f67541c.lineTo(BitmapDescriptorFactory.HUE_RED, (float) this.f67540b);
        Path path = this.f67541c;
        int i = this.f67543e;
        if (i < 0) {
            i = width / 2;
        }
        int i2 = this.f67540b;
        float f = (float) width;
        path.quadTo((float) i, (float) (this.f67539a + i2), f, (float) i2);
        this.f67541c.lineTo(f, BitmapDescriptorFactory.HUE_RED);
        canvas.drawPath(this.f67541c, this.f67542d);
    }

    public WaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize(getSuggestedMinimumWidth(), i), resolveSize(getSuggestedMinimumHeight(), i2));
    }

    public WaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f67543e = -1;
        m98748a();
    }
}
