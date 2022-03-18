package com.ss.android.photoeditor.ve.crop.p3015a;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.ss.android.photoeditor.ve.crop.view.CropImageView;
import com.ss.android.photoeditor.ve.crop.view.CropOverlayView;

/* renamed from: com.ss.android.photoeditor.ve.crop.a.b  reason: invalid class name */
public final class animationAnimation$AnimationListenerC59852b extends Animation implements Animation.AnimationListener {

    /* renamed from: a */
    private final ImageView f148837a;

    /* renamed from: b */
    private final CropOverlayView f148838b;

    /* renamed from: c */
    private final CropImageView f148839c;

    /* renamed from: d */
    private final float[] f148840d = new float[8];

    /* renamed from: e */
    private final float[] f148841e = new float[8];

    /* renamed from: f */
    private final RectF f148842f = new RectF();

    /* renamed from: g */
    private final RectF f148843g = new RectF();

    /* renamed from: h */
    private final float[] f148844h = new float[9];

    /* renamed from: i */
    private final float[] f148845i = new float[9];

    /* renamed from: j */
    private final RectF f148846j = new RectF();

    /* renamed from: k */
    private final float[] f148847k = new float[8];

    /* renamed from: l */
    private final float[] f148848l = new float[9];

    /* renamed from: m */
    private boolean f148849m = true;

    public void onAnimationRepeat(Animation animation) {
    }

    /* renamed from: a */
    public void mo203751a(boolean z) {
        this.f148849m = z;
    }

    public void onAnimationStart(Animation animation) {
        CropImageView cropImageView = this.f148839c;
        if (cropImageView != null) {
            cropImageView.mo203800b();
        }
    }

    public void onAnimationEnd(Animation animation) {
        CropImageView cropImageView;
        ImageView imageView = this.f148837a;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        if (this.f148849m && (cropImageView = this.f148839c) != null) {
            cropImageView.mo203802c();
            this.f148839c.mo203801b(true);
        }
    }

    /* renamed from: a */
    public void mo203752a(float[] fArr, Matrix matrix) {
        reset();
        System.arraycopy(fArr, 0, this.f148840d, 0, 8);
        CropOverlayView cropOverlayView = this.f148838b;
        if (cropOverlayView != null) {
            this.f148842f.set(cropOverlayView.getCropWindowRect());
        }
        matrix.getValues(this.f148844h);
    }

    /* renamed from: b */
    public void mo203754b(float[] fArr, Matrix matrix) {
        System.arraycopy(fArr, 0, this.f148841e, 0, 8);
        CropOverlayView cropOverlayView = this.f148838b;
        if (cropOverlayView != null) {
            this.f148843g.set(cropOverlayView.getCropWindowRect());
        }
        matrix.getValues(this.f148845i);
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        float[] fArr;
        this.f148846j.left = this.f148842f.left + ((this.f148843g.left - this.f148842f.left) * f);
        this.f148846j.top = this.f148842f.top + ((this.f148843g.top - this.f148842f.top) * f);
        this.f148846j.right = this.f148842f.right + ((this.f148843g.right - this.f148842f.right) * f);
        this.f148846j.bottom = this.f148842f.bottom + ((this.f148843g.bottom - this.f148842f.bottom) * f);
        CropOverlayView cropOverlayView = this.f148838b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropWindowRect(this.f148846j);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            fArr = this.f148847k;
            if (i2 >= fArr.length) {
                break;
            }
            float[] fArr2 = this.f148840d;
            fArr[i2] = fArr2[i2] + ((this.f148841e[i2] - fArr2[i2]) * f);
            i2++;
        }
        CropOverlayView cropOverlayView2 = this.f148838b;
        if (cropOverlayView2 != null) {
            cropOverlayView2.mo203846a(fArr, this.f148837a.getWidth(), this.f148837a.getHeight());
        }
        while (true) {
            float[] fArr3 = this.f148848l;
            if (i >= fArr3.length) {
                break;
            }
            float[] fArr4 = this.f148844h;
            fArr3[i] = fArr4[i] + ((this.f148845i[i] - fArr4[i]) * f);
            i++;
        }
        ImageView imageView = this.f148837a;
        if (imageView != null) {
            Matrix imageMatrix = imageView.getImageMatrix();
            imageMatrix.setValues(this.f148848l);
            this.f148837a.setImageMatrix(imageMatrix);
            this.f148837a.invalidate();
        }
        CropOverlayView cropOverlayView3 = this.f148838b;
        if (cropOverlayView3 != null) {
            cropOverlayView3.invalidate();
        }
    }

    public animationAnimation$AnimationListenerC59852b(ImageView imageView, CropOverlayView cropOverlayView, CropImageView cropImageView) {
        this.f148837a = imageView;
        this.f148838b = cropOverlayView;
        this.f148839c = cropImageView;
        setDuration(300);
        setFillAfter(true);
        setAnimationListener(this);
    }
}
