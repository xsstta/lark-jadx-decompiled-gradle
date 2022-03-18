package com.github.ybq.android.spinkit.p968b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* renamed from: com.github.ybq.android.spinkit.b.e */
public abstract class AbstractC21311e extends AbstractC21312f {

    /* renamed from: m */
    private Paint f51853m;

    /* renamed from: n */
    private int f51854n;

    /* renamed from: o */
    private int f51855o;

    /* renamed from: a */
    public abstract void mo72409a(Canvas canvas, Paint paint);

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    /* renamed from: b */
    public int mo72412b() {
        return this.f51855o;
    }

    public AbstractC21311e() {
        mo72410a(-1);
        Paint paint = new Paint();
        this.f51853m = paint;
        paint.setAntiAlias(true);
        this.f51853m.setColor(this.f51854n);
    }

    /* renamed from: r */
    private void m77173r() {
        int alpha = getAlpha();
        int i = this.f51855o;
        this.f51854n = ((((i >>> 24) * (alpha + (alpha >> 7))) >> 8) << 24) | ((i << 8) >>> 8);
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    /* renamed from: a */
    public void mo72410a(int i) {
        this.f51855o = i;
        m77173r();
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public void setAlpha(int i) {
        super.setAlpha(i);
        m77173r();
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public void setColorFilter(ColorFilter colorFilter) {
        this.f51853m.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public final void a_(Canvas canvas) {
        this.f51853m.setColor(this.f51854n);
        mo72409a(canvas, this.f51853m);
    }
}
