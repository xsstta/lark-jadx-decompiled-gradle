package com.ss.android.photoeditor.ve.crop.p3015a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.photoeditor.ve.crop.view.VECropOverlayView;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.ss.android.photoeditor.ve.crop.a.h */
public class C59858h extends ValueAnimator {

    /* renamed from: a */
    public final VECropOverlayView f148880a;

    /* renamed from: b */
    public final RectF f148881b = new RectF();

    /* renamed from: c */
    public final RectF f148882c = new RectF();

    /* renamed from: d */
    public final float[] f148883d = new float[9];

    /* renamed from: e */
    public final float[] f148884e = new float[9];

    /* renamed from: f */
    public final float[] f148885f = new float[9];

    /* renamed from: g */
    public final float[] f148886g = new float[9];

    /* renamed from: h */
    public final float[] f148887h = new float[9];

    /* renamed from: i */
    public boolean f148888i = false;

    /* renamed from: j */
    public boolean f148889j = true;

    /* renamed from: k */
    public float[] f148890k;

    /* renamed from: l */
    public Matrix f148891l = new Matrix();

    /* renamed from: m */
    public VEAnimateChangeListener f148892m;

    /* renamed from: n */
    public float f148893n = 1.0f;

    /* renamed from: o */
    public float f148894o = 1.0f;

    /* renamed from: p */
    public float f148895p = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: c */
    public boolean mo203773c() {
        return this.f148888i;
    }

    /* renamed from: a */
    public void mo203770a() {
        this.f148893n = 1.0f;
        this.f148895p = BitmapDescriptorFactory.HUE_RED;
        this.f148894o = 1.0f;
    }

    /* renamed from: b */
    public void mo203772b() {
        RectF rectF = new RectF();
        VECropOverlayView vECropOverlayView = this.f148880a;
        if (vECropOverlayView != null) {
            rectF.set(vECropOverlayView.getCropWindowRect());
            this.f148881b.set(this.f148880a.getCropWindowRect());
            this.f148890k = new float[8];
            Matrix matrix = new Matrix();
            matrix.reset();
            matrix.getValues(this.f148885f);
        }
    }

    /* renamed from: com.ss.android.photoeditor.ve.crop.a.h$a */
    private static class C59861a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private VECropOverlayView f148900a;

        public C59861a(VECropOverlayView vECropOverlayView) {
            this.f148900a = vECropOverlayView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            VECropOverlayView vECropOverlayView = this.f148900a;
            if (vECropOverlayView != null) {
                vECropOverlayView.setBordersPaintAlpha(intValue);
                this.f148900a.invalidate();
            }
        }
    }

    /* renamed from: com.ss.android.photoeditor.ve.crop.a.h$b */
    public class C59862b implements ValueAnimator.AnimatorUpdateListener {
        public C59862b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C59858h.this.f148880a != null) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i = 0; i < C59858h.this.f148887h.length; i++) {
                    C59858h.this.f148887h[i] = C59858h.this.f148883d[i] + ((C59858h.this.f148884e[i] - C59858h.this.f148883d[i]) * floatValue);
                }
                if (C59858h.this.f148889j) {
                    for (int i2 = 0; i2 < C59858h.this.f148887h.length; i2++) {
                        C59858h.this.f148887h[i2] = C59858h.this.f148885f[i2] + ((C59858h.this.f148886g[i2] - C59858h.this.f148885f[i2]) * floatValue);
                    }
                    C59858h.this.f148891l.reset();
                    C59858h.this.f148891l.setValues(C59858h.this.f148887h);
                    C59858h.this.f148890k[0] = C59858h.this.f148881b.left;
                    C59858h.this.f148890k[1] = C59858h.this.f148881b.top;
                    C59858h.this.f148890k[2] = C59858h.this.f148881b.right;
                    C59858h.this.f148890k[3] = C59858h.this.f148881b.top;
                    C59858h.this.f148890k[4] = C59858h.this.f148881b.right;
                    C59858h.this.f148890k[5] = C59858h.this.f148881b.bottom;
                    C59858h.this.f148890k[6] = C59858h.this.f148881b.left;
                    C59858h.this.f148890k[7] = C59858h.this.f148881b.bottom;
                    C59858h.this.f148891l.mapPoints(C59858h.this.f148890k);
                    C59858h.this.f148880a.setRotationRectPoints(C59858h.this.f148890k);
                    C59858h.this.f148880a.mo203895b(true);
                    C59858h.this.f148880a.invalidate();
                }
                if (C59858h.this.f148892m != null) {
                    float f = ((C59858h.this.f148894o - 1.0f) * floatValue) + 1.0f;
                    float f2 = f / C59858h.this.f148893n;
                    C59858h.this.f148893n = f;
                    float centerX = C59858h.this.f148882c.centerX();
                    float centerY = C59858h.this.f148882c.centerY();
                    float f3 = floatValue * -90.0f;
                    float f4 = f3 - C59858h.this.f148895p;
                    C59858h.this.f148895p = f3;
                    C59858h.this.f148892m.mo203736a(-f4, centerX, centerY, f2, centerX, centerY);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo203771a(float f, RectF rectF) {
        if (this.f148880a != null) {
            this.f148882c.set(rectF);
            Matrix matrix = new Matrix();
            matrix.reset();
            matrix.postScale(f, f, this.f148881b.centerX(), this.f148881b.centerY());
            matrix.postRotate(-90.0f, this.f148881b.centerX(), this.f148881b.centerY());
            matrix.getValues(this.f148886g);
            this.f148894o = f;
        }
    }

    public C59858h(final VEAnimateChangeListener dVar, VECropOverlayView vECropOverlayView, final boolean z) {
        this.f148892m = dVar;
        this.f148880a = vECropOverlayView;
        this.f148889j = z;
        setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        setDuration(400L);
        addUpdateListener(new C59862b());
        addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.photoeditor.ve.crop.p3015a.C59858h.C598591 */

            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                C59858h.this.f148888i = true;
                if (C59858h.this.f148880a != null && z) {
                    C59858h.this.f148880a.setBordersPaintAlpha(0);
                    C59858h.this.f148880a.setBackgroundAlpha(0);
                    C59858h.this.f148880a.mo203895b(true);
                }
                VEAnimateChangeListener dVar = dVar;
                if (dVar != null) {
                    dVar.mo203738a(false);
                }
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (C59858h.this.f148880a != null) {
                    C59858h.this.f148880a.setCropWindowRect(C59858h.this.f148882c);
                    C59858h.this.f148880a.mo203895b(false);
                    C59858h.this.f148880a.setBackgroundAlpha(SmActions.ACTION_ONTHECALL_ENTRY);
                    if (z) {
                        C59861a aVar = new C59861a(C59858h.this.f148880a);
                        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                        ofInt.addListener(new AnimatorListenerAdapter() {
                            /* class com.ss.android.photoeditor.ve.crop.p3015a.C59858h.C598591.C598601 */

                            public void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                                C59858h.this.f148888i = false;
                            }
                        });
                        ofInt.setDuration(200L);
                        ofInt.setRepeatCount(0);
                        ofInt.setInterpolator(PathInterpolatorCompat.create(0.32f, 0.94f, 0.6f, 1.0f));
                        ofInt.addUpdateListener(aVar);
                        ofInt.start();
                    } else {
                        C59858h.this.f148888i = false;
                    }
                    C59858h.this.mo203770a();
                }
                VEAnimateChangeListener dVar = dVar;
                if (dVar != null) {
                    dVar.mo203738a(true);
                    if (C59858h.this.f148880a != null && C59858h.this.f148880a.getCropWindowRect() != null) {
                        dVar.mo203737a(C59858h.this.f148880a.getCropWindowRect());
                    }
                }
            }
        });
    }
}
