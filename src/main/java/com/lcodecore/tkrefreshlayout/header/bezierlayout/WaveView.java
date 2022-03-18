package com.lcodecore.tkrefreshlayout.header.bezierlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class WaveView extends View {

    /* renamed from: a */
    Path f65199a;

    /* renamed from: b */
    Paint f65200b;

    /* renamed from: c */
    private int f65201c;

    /* renamed from: d */
    private int f65202d;

    public int getHeadHeight() {
        return this.f65202d;
    }

    public int getWaveHeight() {
        return this.f65201c;
    }

    /* renamed from: a */
    private void m95672a() {
        this.f65199a = new Path();
        Paint paint = new Paint();
        this.f65200b = paint;
        paint.setColor(-14736346);
        this.f65200b.setAntiAlias(true);
    }

    public void setHeadHeight(int i) {
        this.f65202d = i;
    }

    public void setWaveHeight(int i) {
        this.f65201c = i;
    }

    public WaveView(Context context) {
        this(context, null, 0);
    }

    public void setWaveColor(int i) {
        Paint paint = this.f65200b;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f65199a.reset();
        this.f65199a.lineTo(BitmapDescriptorFactory.HUE_RED, (float) this.f65202d);
        this.f65199a.quadTo((float) (getMeasuredWidth() / 2), (float) (this.f65202d + this.f65201c), (float) getMeasuredWidth(), (float) this.f65202d);
        this.f65199a.lineTo((float) getMeasuredWidth(), BitmapDescriptorFactory.HUE_RED);
        canvas.drawPath(this.f65199a, this.f65200b);
    }

    public WaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m95672a();
    }
}
