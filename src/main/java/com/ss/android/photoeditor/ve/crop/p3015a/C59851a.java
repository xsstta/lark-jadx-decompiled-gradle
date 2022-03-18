package com.ss.android.photoeditor.ve.crop.p3015a;

import android.animation.ValueAnimator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.ss.android.photoeditor.ve.crop.view.CropOverlayView;

/* renamed from: com.ss.android.photoeditor.ve.crop.a.a */
public class C59851a extends ValueAnimator implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private CropOverlayView f148836a;

    /* renamed from: a */
    public void mo203749a(int... iArr) {
        setIntValues(iArr);
    }

    public C59851a(CropOverlayView cropOverlayView) {
        this(cropOverlayView, 300);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        CropOverlayView cropOverlayView = this.f148836a;
        if (cropOverlayView != null) {
            cropOverlayView.setBackgroundAlpha(intValue);
            this.f148836a.invalidate();
        }
    }

    public C59851a(CropOverlayView cropOverlayView, long j) {
        this.f148836a = cropOverlayView;
        setDuration(j);
        addUpdateListener(this);
        setInterpolator(PathInterpolatorCompat.create(0.32f, 0.94f, 0.6f, 1.0f));
    }
}
