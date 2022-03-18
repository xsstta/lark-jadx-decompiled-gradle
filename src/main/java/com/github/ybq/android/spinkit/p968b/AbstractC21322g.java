package com.github.ybq.android.spinkit.p968b;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.github.ybq.android.spinkit.p966a.C21294a;

/* renamed from: com.github.ybq.android.spinkit.b.g */
public abstract class AbstractC21322g extends AbstractC21312f {

    /* renamed from: m */
    private AbstractC21312f[] f51886m = mo72492s();

    /* renamed from: n */
    private int f51887n;

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    /* renamed from: a */
    public ValueAnimator mo72408a() {
        return null;
    }

    /* renamed from: a */
    public void mo72489a(AbstractC21312f... fVarArr) {
    }

    /* access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public void a_(Canvas canvas) {
    }

    /* renamed from: s */
    public abstract AbstractC21312f[] mo72492s();

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    /* renamed from: b */
    public int mo72412b() {
        return this.f51887n;
    }

    /* renamed from: r */
    public int mo72491r() {
        AbstractC21312f[] fVarArr = this.f51886m;
        if (fVarArr == null) {
            return 0;
        }
        return fVarArr.length;
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public void start() {
        super.start();
        C21294a.m77133a(this.f51886m);
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public void stop() {
        super.stop();
        C21294a.m77135b(this.f51886m);
    }

    public AbstractC21322g() {
        m77244t();
        mo72489a(this.f51886m);
    }

    /* renamed from: t */
    private void m77244t() {
        AbstractC21312f[] fVarArr = this.f51886m;
        if (fVarArr != null) {
            for (AbstractC21312f fVar : fVarArr) {
                fVar.setCallback(this);
            }
        }
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public boolean isRunning() {
        if (C21294a.m77137c(this.f51886m) || super.isRunning()) {
            return true;
        }
        return false;
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public void draw(Canvas canvas) {
        super.draw(canvas);
        mo72406a(canvas);
    }

    /* renamed from: h */
    public AbstractC21312f mo72490h(int i) {
        AbstractC21312f[] fVarArr = this.f51886m;
        if (fVarArr == null) {
            return null;
        }
        return fVarArr[i];
    }

    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    /* renamed from: a */
    public void mo72410a(int i) {
        this.f51887n = i;
        for (int i2 = 0; i2 < mo72491r(); i2++) {
            mo72490h(i2).mo72410a(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.github.ybq.android.spinkit.p968b.AbstractC21312f
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (AbstractC21312f fVar : this.f51886m) {
            fVar.setBounds(rect);
        }
    }

    /* renamed from: a */
    public void mo72406a(Canvas canvas) {
        AbstractC21312f[] fVarArr = this.f51886m;
        if (fVarArr != null) {
            for (AbstractC21312f fVar : fVarArr) {
                int save = canvas.save();
                fVar.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
    }
}
