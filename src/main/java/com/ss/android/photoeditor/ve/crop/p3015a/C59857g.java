package com.ss.android.photoeditor.ve.crop.p3015a;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.ve.crop.view.VECropOverlayView;
import com.ss.android.photoeditor.ve.crop.view.VEImageViewDelegate;

/* renamed from: com.ss.android.photoeditor.ve.crop.a.g */
public class C59857g extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private VECropOverlayView f148863a;

    /* renamed from: b */
    private RectF f148864b;

    /* renamed from: c */
    private RectF f148865c;

    /* renamed from: d */
    private RectF f148866d;

    /* renamed from: e */
    private Matrix f148867e;

    /* renamed from: f */
    private float f148868f;

    /* renamed from: g */
    private float f148869g;

    /* renamed from: h */
    private float f148870h;

    /* renamed from: i */
    private float f148871i;

    /* renamed from: j */
    private float f148872j;

    /* renamed from: k */
    private float f148873k;

    /* renamed from: l */
    private float f148874l;

    /* renamed from: m */
    private VEAnimateChangeListener f148875m;

    /* renamed from: n */
    private VEImageViewDelegate f148876n;

    /* renamed from: o */
    private float f148877o;

    /* renamed from: p */
    private float f148878p;

    /* renamed from: q */
    private float f148879q;

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        VEAnimateChangeListener dVar;
        RectF rectF;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.f148863a != null) {
            this.f148867e.reset();
            this.f148866d.set(this.f148864b);
            this.f148867e.postTranslate(this.f148870h * floatValue, this.f148871i * floatValue);
            this.f148867e.postScale(((this.f148868f - 1.0f) * floatValue) + 1.0f, ((this.f148869g - 1.0f) * floatValue) + 1.0f, this.f148864b.centerX(), this.f148864b.centerY());
            this.f148867e.mapRect(this.f148866d);
            this.f148863a.setCropWindowRect(this.f148866d);
            this.f148863a.invalidate();
            VEAnimateChangeListener dVar2 = this.f148875m;
            if (dVar2 != null) {
                float f = ((this.f148872j - 1.0f) * floatValue) + 1.0f;
                float f2 = this.f148873k;
                float f3 = (floatValue * f2) - this.f148878p;
                float f4 = this.f148874l;
                float f5 = (floatValue * f4) - this.f148879q;
                this.f148877o = f;
                this.f148878p = f2 * floatValue;
                this.f148879q = f4 * floatValue;
                dVar2.mo203734a(f / this.f148877o, f3, -f5);
            }
            if (floatValue == 1.0f && (dVar = this.f148875m) != null && (rectF = this.f148866d) != null) {
                dVar.mo203737a(rectF);
            }
        }
    }

    public C59857g(VECropOverlayView vECropOverlayView, VEAnimateChangeListener dVar, VEImageViewDelegate cVar, RectF rectF, RectF rectF2) {
        this(vECropOverlayView, dVar, cVar, rectF, rectF2, 300);
    }

    public C59857g(VECropOverlayView vECropOverlayView, VEAnimateChangeListener dVar, VEImageViewDelegate cVar, RectF rectF, RectF rectF2, long j) {
        RectF h;
        this.f148864b = new RectF();
        this.f148865c = new RectF();
        this.f148866d = new RectF();
        this.f148867e = new Matrix();
        this.f148872j = 1.0f;
        this.f148873k = BitmapDescriptorFactory.HUE_RED;
        this.f148874l = BitmapDescriptorFactory.HUE_RED;
        this.f148877o = 1.0f;
        this.f148878p = BitmapDescriptorFactory.HUE_RED;
        this.f148879q = BitmapDescriptorFactory.HUE_RED;
        this.f148863a = vECropOverlayView;
        this.f148864b.set(rectF);
        this.f148865c.set(rectF2);
        this.f148875m = dVar;
        this.f148876n = cVar;
        setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        setDuration(j);
        addUpdateListener(this);
        setInterpolator(PathInterpolatorCompat.create(0.32f, 0.94f, 0.6f, 1.0f));
        if (rectF.width() == BitmapDescriptorFactory.HUE_RED) {
            this.f148868f = rectF2.width() / 0.01f;
        } else {
            this.f148868f = rectF2.width() / rectF.width();
        }
        if (rectF.height() == BitmapDescriptorFactory.HUE_RED) {
            this.f148869g = rectF2.height() / 0.01f;
        } else {
            this.f148869g = rectF2.height() / rectF.height();
        }
        this.f148870h = rectF2.centerX() - rectF.centerX();
        this.f148871i = rectF2.centerY() - rectF.centerY();
        VEImageViewDelegate cVar2 = this.f148876n;
        if (cVar2 != null && (h = cVar2.mo203746h()) != null) {
            float f = this.f148868f;
            float f2 = this.f148869g;
            if (f > f2) {
                this.f148872j = Math.max(rectF2.width() / h.width(), 1.0f);
            } else if (f2 > f) {
                this.f148872j = Math.max(rectF2.height() / ((float) this.f148876n.mo203744f()), 1.0f);
            }
            if (this.f148872j != 1.0f) {
                h.inset((h.width() * (1.0f - this.f148872j)) / 2.0f, (h.height() * (1.0f - this.f148872j)) / 2.0f);
            }
            if (h.top > rectF2.top) {
                this.f148874l = rectF2.top - h.top;
            } else if (h.bottom < rectF2.bottom) {
                this.f148874l = rectF2.bottom - h.bottom;
            }
            if (h.left > rectF2.left) {
                this.f148873k = rectF2.left - h.left;
            } else if (h.right < rectF2.right) {
                this.f148873k = rectF2.right - h.right;
            }
        }
    }
}
