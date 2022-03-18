package com.ss.android.photoeditor.ve.crop.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.photoeditor.ve.crop.animate.VEAnimateChangeListener;
import com.ss.android.photoeditor.ve.crop.p3015a.C59857g;
import com.ss.android.photoeditor.ve.crop.p3015a.C59858h;
import com.ss.android.photoeditor.ve.crop.p3015a.animationAnimation$AnimationListenerC59855f;
import com.ss.android.photoeditor.ve.crop.view.CropImageView;
import com.ss.android.photoeditor.ve.crop.view.VECropOverlayView;

public class VECropView extends FrameLayout {

    /* renamed from: a */
    public VEImageViewDelegate f149143a;

    /* renamed from: b */
    public VEAnimateChangeListener f149144b;

    /* renamed from: c */
    public boolean f149145c;

    /* renamed from: d */
    private final VECropOverlayView f149146d;

    /* renamed from: e */
    private final float[] f149147e;

    /* renamed from: f */
    private animationAnimation$AnimationListenerC59855f f149148f;

    /* renamed from: g */
    private int f149149g;

    /* renamed from: h */
    private boolean f149150h;

    /* renamed from: i */
    private boolean f149151i;

    /* renamed from: j */
    private CropImageView.ScaleType f149152j;

    /* renamed from: k */
    private int f149153k;

    /* renamed from: l */
    private float f149154l;

    /* renamed from: m */
    private float f149155m;

    /* renamed from: n */
    private float f149156n;

    /* renamed from: o */
    private C59858h f149157o;

    /* renamed from: p */
    private boolean f149158p;

    /* renamed from: a */
    public boolean mo203937a() {
        return this.f149145c;
    }

    public CropImageView.ScaleType getScaleType() {
        return this.f149152j;
    }

    public RectF getCropRectResult() {
        return this.f149146d.getCropWindowRect();
    }

    private float getFrameCenterX() {
        return ((float) VECropOverlayView.f149096c) + (getMaxFrameWidth() / 2.0f);
    }

    private float getFrameCenterY() {
        return ((float) VECropOverlayView.f149094a) + (getMaxFrameHeight() / 2.0f);
    }

    private float getMaxFrameHeight() {
        return (float) ((getHeight() - VECropOverlayView.f149094a) - VECropOverlayView.f149095b);
    }

    private float getMaxFrameWidth() {
        return (float) (getWidth() - (VECropOverlayView.f149096c * 2));
    }

    private float getMaxFrameRatio() {
        return ((float) ((getHeight() - VECropOverlayView.f149094a) - VECropOverlayView.f149095b)) / ((float) (getWidth() - (VECropOverlayView.f149096c * 2)));
    }

    /* renamed from: c */
    private void m232364c() {
        this.f149146d.clearAnimation();
        this.f149146d.mo203891a();
        this.f149146d.mo203897c();
        this.f149146d.setFixedAspectRatio(false);
        this.f149146d.setLeftAndRightMargin(this.f149143a.mo203741c());
        this.f149146d.setMarginUp(this.f149143a.mo203742d());
        this.f149146d.setMarginBottom(this.f149143a.mo203743e());
        float[] fArr = this.f149147e;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 100.0f;
        fArr[3] = 0.0f;
        fArr[4] = 100.0f;
        fArr[5] = 100.0f;
        fArr[6] = 0.0f;
        fArr[7] = 100.0f;
    }

    /* renamed from: b */
    public void mo203938b() {
        float j = this.f149143a.mo203748j();
        float abs = Math.abs(((24.0f / ((float) this.f149143a.mo203739a())) * j) / this.f149143a.mo203747i());
        this.f149146d.mo203892a((float) getWidth(), (float) getHeight(), abs, abs);
        this.f149146d.mo203893a(this.f149143a.mo203745g(), this.f149143a.mo203739a(), this.f149143a.mo203740b());
    }

    public VECropView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo203935a(boolean z) {
        this.f149146d.mo203899d();
    }

    public void setFixedAspectRatio(boolean z) {
        this.f149146d.setFixedAspectRatio(z);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f149158p) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setCropViewDisallowInterceptTouchEvent(Boolean bool) {
        this.f149146d.f149118e = bool.booleanValue();
    }

    /* renamed from: a */
    private float m232361a(RectF rectF) {
        return Math.min(getMaxFrameWidth() / rectF.width(), getMaxFrameHeight() / rectF.height());
    }

    public void setInitCropRect(RectF rectF) {
        m232364c();
        this.f149146d.setCropWindowRect(rectF);
        this.f149146d.setVisibility(0);
        this.f149146d.invalidate();
        mo203938b();
    }

    public void setScaleType(CropImageView.ScaleType scaleType) {
        if (scaleType != this.f149152j) {
            this.f149152j = scaleType;
            this.f149154l = 1.0f;
            this.f149156n = BitmapDescriptorFactory.HUE_RED;
            this.f149155m = BitmapDescriptorFactory.HUE_RED;
            this.f149146d.mo203891a();
            requestLayout();
        }
    }

    /* renamed from: a */
    public static Bundle m232362a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }

    /* renamed from: c */
    public void mo203940c(int i, int i2) {
        int aspectRatioX = this.f149146d.getAspectRatioX();
        int aspectRatioY = this.f149146d.getAspectRatioY();
        if (aspectRatioX != i || aspectRatioY != i2 || !this.f149146d.mo203896b()) {
            this.f149146d.setAspectRatioX(i);
            this.f149146d.setAspectRatioY(i2);
            setFixedAspectRatio(true);
        }
    }

    public VECropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intent intent;
        Bundle a;
        this.f149147e = new float[8];
        this.f149153k = 1;
        this.f149154l = 1.0f;
        this.f149158p = true;
        CropImageOptions cropImageOptions = null;
        if (context instanceof Activity) {
            intent = ((Activity) context).getIntent();
        } else {
            intent = null;
        }
        if (!(intent == null || (a = m232362a(intent, "CROP_IMAGE_EXTRA_BUNDLE")) == null)) {
            cropImageOptions = (CropImageOptions) a.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        }
        if (cropImageOptions == null) {
            cropImageOptions = new CropImageOptions();
            cropImageOptions.f148937d = CropImageView.Guidelines.ON;
        }
        cropImageOptions.mo203789a();
        this.f149152j = cropImageOptions.f148938e;
        this.f149150h = false;
        this.f149151i = cropImageOptions.f148931T;
        VECropOverlayView vECropOverlayView = (VECropOverlayView) LayoutInflater.from(context).inflate(R.layout.ve_crop_image_overlay_view, (ViewGroup) this, true).findViewById(R.id.CropOverlayView);
        this.f149146d = vECropOverlayView;
        vECropOverlayView.setCropWindowChangeListener(new VECropOverlayView.AbstractC59888c() {
            /* class com.ss.android.photoeditor.ve.crop.view.VECropView.C598911 */

            @Override // com.ss.android.photoeditor.ve.crop.view.VECropOverlayView.AbstractC59888c
            /* renamed from: a */
            public void mo203931a() {
            }

            @Override // com.ss.android.photoeditor.ve.crop.view.VECropOverlayView.AbstractC59888c
            /* renamed from: a */
            public void mo203932a(boolean z) {
                if (z) {
                    VECropView.this.f149145c = true;
                    VECropView.this.f149144b.mo203738a(false);
                }
                VECropView.this.mo203936a(z, true);
            }
        });
        vECropOverlayView.setInitialAttributeValues(cropImageOptions);
    }

    /* renamed from: d */
    public RectF mo203941d(int i, int i2) {
        RectF rectF = new RectF();
        float f = ((float) i2) / ((float) i);
        if (f < getMaxFrameRatio()) {
            rectF.set((float) VECropOverlayView.f149096c, getFrameCenterY() - ((getMaxFrameWidth() * f) / 2.0f), (float) (getWidth() - VECropOverlayView.f149096c), getFrameCenterY() + ((getMaxFrameWidth() * f) / 2.0f));
        } else {
            rectF.set(getFrameCenterX() - ((getMaxFrameHeight() / f) / 2.0f), (float) VECropOverlayView.f149094a, getFrameCenterX() + ((getMaxFrameHeight() / f) / 2.0f), ((float) VECropOverlayView.f149094a) + getMaxFrameHeight());
        }
        return rectF;
    }

    /* renamed from: a */
    public void mo203934a(int i, int i2) {
        int aspectRatioX = this.f149146d.getAspectRatioX();
        int aspectRatioY = this.f149146d.getAspectRatioY();
        if (aspectRatioX != i || aspectRatioY != i2 || !this.f149146d.mo203896b()) {
            RectF rectF = new RectF();
            rectF.set(this.f149146d.getCropWindowRect());
            RectF d = mo203941d(i, i2);
            this.f149146d.setCropWindowRect(d);
            this.f149146d.invalidate();
            this.f149146d.setAspectRatioX(i);
            this.f149146d.setAspectRatioY(i2);
            setFixedAspectRatio(true);
            C59857g gVar = new C59857g(this.f149146d, this.f149144b, this.f149143a, rectF, d);
            gVar.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.photoeditor.ve.crop.view.VECropView.C598922 */

                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (VECropView.this.f149144b != null) {
                        VECropView.this.f149144b.mo203738a(true);
                    }
                    VECropView.this.mo203938b();
                }

                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    if (VECropView.this.f149144b != null) {
                        VECropView.this.f149144b.mo203738a(false);
                    }
                }
            });
            gVar.start();
            mo203938b();
        }
    }

    /* renamed from: b */
    public void mo203939b(int i, int i2) {
        int i3;
        boolean z;
        boolean z2 = true;
        if (this.f149157o == null) {
            VEAnimateChangeListener dVar = this.f149144b;
            VECropOverlayView vECropOverlayView = this.f149146d;
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f149157o = new C59858h(dVar, vECropOverlayView, z);
        }
        if (!this.f149157o.mo203773c()) {
            if (i < 0) {
                i3 = (i % 360) + 360;
            } else {
                i3 = i % 360;
            }
            Matrix matrix = new Matrix();
            RectF cropWindowRect = this.f149146d.getCropWindowRect();
            this.f149157o.mo203772b();
            float centerX = cropWindowRect.centerX();
            float centerY = cropWindowRect.centerY();
            float f = BitmapDescriptorFactory.HUE_RED;
            if (i2 == 0) {
                matrix.postRotate((float) i3, centerX, centerY);
                matrix.mapRect(cropWindowRect);
                f = m232361a(cropWindowRect);
                matrix.reset();
                matrix.postScale(f, f, centerX, centerY);
                matrix.mapRect(cropWindowRect);
            }
            this.f149157o.mo203771a(f, cropWindowRect);
            this.f149157o.setInterpolator(PathInterpolatorCompat.create(0.22f, 1.0f, 0.36f, 1.0f));
            this.f149157o.start();
            this.f149157o.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.photoeditor.ve.crop.view.VECropView.C598933 */

                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    VECropView.this.mo203938b();
                }
            });
            this.f149149g = (this.f149149g + i3) % 360;
            if (i2 == 0 && this.f149146d.mo203896b()) {
                mo203940c(this.f149146d.getAspectRatioY(), this.f149146d.getAspectRatioX());
            }
            if ((i3 <= 45 || i3 >= 135) && (i3 <= 215 || i3 >= 305)) {
                z2 = false;
            }
            if (z2) {
                boolean z3 = this.f149150h;
                this.f149150h = this.f149151i;
                this.f149151i = z3;
            }
        }
    }

    /* renamed from: a */
    public void mo203936a(boolean z, boolean z2) {
        boolean z3;
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            RectF cropWindowRect = this.f149146d.getCropWindowRect();
            if (!z) {
                float min = Math.min(getMaxFrameWidth() / cropWindowRect.width(), getMaxFrameHeight() / cropWindowRect.height());
                if (getFrameCenterX() == cropWindowRect.centerX() && getFrameCenterY() == cropWindowRect.centerY()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (min <= BitmapDescriptorFactory.HUE_RED || z3) {
                    this.f149145c = false;
                    return;
                }
                if (z2) {
                    if (this.f149148f == null) {
                        this.f149148f = new animationAnimation$AnimationListenerC59855f(this.f149146d, this.f149143a, this.f149144b);
                    }
                    this.f149148f.mo203763a(new animationAnimation$AnimationListenerC59855f.AbstractC59856a() {
                        /* class com.ss.android.photoeditor.ve.crop.view.VECropView.C598944 */

                        @Override // com.ss.android.photoeditor.ve.crop.p3015a.animationAnimation$AnimationListenerC59855f.AbstractC59856a
                        /* renamed from: a */
                        public void mo203768a() {
                            VECropView.this.f149145c = false;
                        }
                    });
                    this.f149148f.mo203761a();
                } else {
                    this.f149145c = false;
                }
                this.f149154l = min;
                m232363a((float) width, (float) height, z2);
            }
        }
    }

    /* renamed from: a */
    private void m232363a(float f, float f2, boolean z) {
        if (f > BitmapDescriptorFactory.HUE_RED && f2 > BitmapDescriptorFactory.HUE_RED) {
            RectF cropWindowRect = this.f149146d.getCropWindowRect();
            float f3 = this.f149154l;
            Matrix matrix = new Matrix();
            matrix.postScale(f3, f3, cropWindowRect.centerX(), cropWindowRect.centerY());
            matrix.mapRect(cropWindowRect);
            this.f149155m = getFrameCenterX() - cropWindowRect.centerX();
            float frameCenterY = getFrameCenterY() - cropWindowRect.centerY();
            this.f149156n = frameCenterY;
            cropWindowRect.offset(this.f149155m, frameCenterY);
            this.f149146d.setCropWindowRect(cropWindowRect);
            this.f149146d.invalidate();
            if (z) {
                this.f149148f.mo203762a(this.f149154l);
                this.f149146d.startAnimation(this.f149148f);
            }
            mo203938b();
        }
    }
}
