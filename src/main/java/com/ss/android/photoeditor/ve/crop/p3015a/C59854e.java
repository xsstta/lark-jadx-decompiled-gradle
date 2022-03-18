package com.ss.android.photoeditor.ve.crop.p3015a;

import android.animation.ValueAnimator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.ss.android.photoeditor.ve.crop.view.VECropOverlayView;

/* renamed from: com.ss.android.photoeditor.ve.crop.a.e */
public class C59854e extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private VECropOverlayView f148851a;

    /* renamed from: a */
    public void mo203759a(int... iArr) {
        setIntValues(iArr);
    }

    public C59854e(VECropOverlayView vECropOverlayView) {
        this(vECropOverlayView, 300);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        VECropOverlayView vECropOverlayView = this.f148851a;
        if (vECropOverlayView != null) {
            vECropOverlayView.setBackgroundAlpha(intValue);
            this.f148851a.invalidate();
        }
    }

    public C59854e(VECropOverlayView vECropOverlayView, long j) {
        this.f148851a = vECropOverlayView;
        setDuration(j);
        addUpdateListener(this);
        setInterpolator(PathInterpolatorCompat.create(0.32f, 0.94f, 0.6f, 1.0f));
    }
}
