package com.ss.android.photoeditor.ve.crop.p3015a;

import android.graphics.RectF;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.ve.crop.view.VECropOverlayView;
import com.ss.android.photoeditor.ve.crop.view.VEImageViewDelegate;

/* renamed from: com.ss.android.photoeditor.ve.crop.a.f  reason: invalid class name */
public final class animationAnimation$AnimationListenerC59855f extends Animation implements Animation.AnimationListener {

    /* renamed from: a */
    private final VECropOverlayView f148852a;

    /* renamed from: b */
    private final RectF f148853b = new RectF();

    /* renamed from: c */
    private final RectF f148854c = new RectF();

    /* renamed from: d */
    private final RectF f148855d = new RectF();

    /* renamed from: e */
    private VEImageViewDelegate f148856e;

    /* renamed from: f */
    private VEAnimateChangeListener f148857f;

    /* renamed from: g */
    private float f148858g = 1.0f;

    /* renamed from: h */
    private float f148859h = 1.0f;

    /* renamed from: i */
    private float f148860i = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: j */
    private float f148861j = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: k */
    private AbstractC59856a f148862k;

    /* renamed from: com.ss.android.photoeditor.ve.crop.a.f$a */
    public interface AbstractC59856a {
        /* renamed from: a */
        void mo203768a();
    }

    public void onAnimationRepeat(Animation animation) {
    }

    /* renamed from: a */
    public void mo203761a() {
        reset();
        VECropOverlayView vECropOverlayView = this.f148852a;
        if (vECropOverlayView != null) {
            this.f148853b.set(vECropOverlayView.getCropWindowRect());
        }
    }

    /* renamed from: a */
    public void mo203763a(AbstractC59856a aVar) {
        this.f148862k = aVar;
    }

    public void onAnimationStart(Animation animation) {
        VEAnimateChangeListener dVar = this.f148857f;
        if (dVar != null) {
            dVar.mo203738a(false);
        }
    }

    /* renamed from: a */
    public void mo203762a(float f) {
        VECropOverlayView vECropOverlayView = this.f148852a;
        if (vECropOverlayView != null) {
            this.f148854c.set(vECropOverlayView.getCropWindowRect());
        }
        this.f148860i = this.f148853b.centerX();
        this.f148861j = this.f148853b.centerY();
        this.f148858g = f;
        this.f148859h = 1.0f;
    }

    public void onAnimationEnd(Animation animation) {
        if (!(this.f148857f == null || this.f148852a.getCropWindowRect() == null)) {
            this.f148857f.mo203737a(this.f148852a.getCropWindowRect());
            this.f148857f.mo203738a(true);
        }
        AbstractC59856a aVar = this.f148862k;
        if (aVar != null) {
            aVar.mo203768a();
        }
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        this.f148855d.left = this.f148853b.left + ((this.f148854c.left - this.f148853b.left) * f);
        this.f148855d.top = this.f148853b.top + ((this.f148854c.top - this.f148853b.top) * f);
        this.f148855d.right = this.f148853b.right + ((this.f148854c.right - this.f148853b.right) * f);
        this.f148855d.bottom = this.f148853b.bottom + ((this.f148854c.bottom - this.f148853b.bottom) * f);
        VECropOverlayView vECropOverlayView = this.f148852a;
        if (vECropOverlayView != null) {
            vECropOverlayView.setCropWindowRect(this.f148855d);
        }
        VECropOverlayView vECropOverlayView2 = this.f148852a;
        if (vECropOverlayView2 != null) {
            vECropOverlayView2.mo203893a(this.f148856e.mo203745g(), this.f148856e.mo203739a(), this.f148856e.mo203740b());
        }
        if (this.f148857f != null) {
            float f2 = this.f148858g;
            float f3 = (((f2 - 1.0f) * f) + 1.0f) / this.f148859h;
            this.f148859h = (f * (f2 - 1.0f)) + 1.0f;
            float centerX = this.f148855d.centerX() - this.f148860i;
            this.f148860i = this.f148855d.centerX();
            float centerY = this.f148855d.centerY() - this.f148861j;
            this.f148861j = this.f148855d.centerY();
            this.f148857f.mo203735a(f3, this.f148855d.centerX(), this.f148855d.centerY(), centerX * f3, (-centerY) * f3);
        }
        VECropOverlayView vECropOverlayView3 = this.f148852a;
        if (vECropOverlayView3 != null) {
            vECropOverlayView3.invalidate();
        }
    }

    public animationAnimation$AnimationListenerC59855f(VECropOverlayView vECropOverlayView, VEImageViewDelegate cVar, VEAnimateChangeListener dVar) {
        this.f148852a = vECropOverlayView;
        this.f148856e = cVar;
        this.f148857f = dVar;
        setDuration(300);
        setFillAfter(true);
        setAnimationListener(this);
    }
}
