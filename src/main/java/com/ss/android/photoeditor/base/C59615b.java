package com.ss.android.photoeditor.base;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.animation.DecelerateInterpolator;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.photoeditor.base.b */
public class C59615b {

    /* renamed from: a */
    public AbstractC59618a f147967a;

    /* renamed from: com.ss.android.photoeditor.base.b$a */
    public static abstract class AbstractC59618a {
        /* renamed from: a */
        public void mo203071a() {
        }

        /* renamed from: a */
        public void mo203072a(RectF rectF) {
        }

        /* renamed from: b */
        public void mo203073b() {
        }

        /* renamed from: c */
        public void mo203074c() {
        }
    }

    public C59615b(AbstractC59618a aVar) {
        this.f147967a = aVar;
    }

    /* renamed from: b */
    public void mo203066b(RectF rectF, RectF rectF2) {
        m231218a(rectF, rectF2, 250);
    }

    /* renamed from: c */
    private boolean m231219c(RectF rectF, RectF rectF2) {
        boolean z;
        RectF rectF3 = new RectF(rectF);
        RectF rectF4 = new RectF();
        boolean z2 = true;
        if (rectF3.width() >= rectF2.width() || rectF3.height() >= rectF2.height()) {
            rectF4.set(rectF);
            if (rectF4.top > rectF2.top) {
                rectF4.offset(BitmapDescriptorFactory.HUE_RED, rectF2.top - rectF4.top);
                z = true;
            } else {
                z = false;
            }
            if (rectF4.left > rectF2.left) {
                rectF4.offset(rectF2.left - rectF4.left, BitmapDescriptorFactory.HUE_RED);
                z = true;
            }
            if (rectF4.bottom < rectF2.bottom) {
                rectF4.offset(BitmapDescriptorFactory.HUE_RED, rectF2.bottom - rectF4.bottom);
                z = true;
            }
            if (rectF4.right < rectF2.right) {
                rectF4.offset(rectF2.right - rectF4.right, BitmapDescriptorFactory.HUE_RED);
            } else {
                z2 = z;
            }
        } else {
            rectF4.set(rectF2);
        }
        if (z2) {
            m231218a(rectF3, rectF4, LocationRequest.PRIORITY_INDOOR);
        }
        return z2;
    }

    /* renamed from: a */
    public boolean mo203065a(RectF rectF, RectF rectF2) {
        if (Math.abs((rectF.width() / rectF.height()) - (rectF2.width() / rectF2.height())) < 0.001f) {
            return m231219c(rectF, rectF2);
        }
        return m231220d(rectF, rectF2);
    }

    /* renamed from: d */
    private boolean m231220d(RectF rectF, RectF rectF2) {
        float f;
        float f2;
        boolean z;
        RectF rectF3 = new RectF(rectF);
        RectF rectF4 = new RectF();
        boolean z2 = true;
        if (rectF3.width() < rectF2.width() || rectF3.height() < rectF2.height()) {
            if (rectF.width() / rectF.height() > rectF2.width() / rectF2.height()) {
                f2 = rectF2.height();
                f = rectF.width() * (f2 / rectF.height());
            } else {
                float width = rectF2.width();
                f2 = rectF.height() * (width / rectF.width());
                f = width;
            }
            float f3 = f / 2.0f;
            float f4 = f2 / 2.0f;
            rectF4.set(rectF2.centerX() - f3, rectF2.centerY() - f4, rectF2.centerX() + f3, rectF2.centerY() + f4);
        } else {
            rectF4.set(rectF);
            if (rectF4.top > rectF2.top) {
                rectF4.offset(BitmapDescriptorFactory.HUE_RED, rectF2.top - rectF4.top);
                z = true;
            } else {
                z = false;
            }
            if (rectF4.left > rectF2.left) {
                rectF4.offset(rectF2.left - rectF4.left, BitmapDescriptorFactory.HUE_RED);
                z = true;
            }
            if (rectF4.bottom < rectF2.bottom) {
                rectF4.offset(BitmapDescriptorFactory.HUE_RED, rectF2.bottom - rectF4.bottom);
                z = true;
            }
            if (rectF4.right < rectF2.right) {
                rectF4.offset(rectF2.right - rectF4.right, BitmapDescriptorFactory.HUE_RED);
            } else {
                z2 = z;
            }
        }
        if (z2) {
            m231218a(rectF3, rectF4, LocationRequest.PRIORITY_INDOOR);
        }
        return z2;
    }

    /* renamed from: a */
    private void m231218a(final RectF rectF, final RectF rectF2, int i) {
        final RectF rectF3 = new RectF();
        ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration((long) i);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.photoeditor.base.C59615b.C596161 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                rectF3.left = ((rectF2.left - rectF.left) * animatedFraction) + rectF.left;
                rectF3.right = ((rectF2.right - rectF.right) * animatedFraction) + rectF.right;
                rectF3.top = ((rectF2.top - rectF.top) * animatedFraction) + rectF.top;
                rectF3.bottom = ((rectF2.bottom - rectF.bottom) * animatedFraction) + rectF.bottom;
                C59615b.this.f147967a.mo203072a(rectF3);
            }
        });
        duration.setInterpolator(new DecelerateInterpolator());
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.photoeditor.base.C59615b.C596172 */

            public void onAnimationEnd(Animator animator) {
                C59615b.this.f147967a.mo203073b();
            }

            public void onAnimationStart(Animator animator) {
                C59615b.this.f147967a.mo203071a();
            }

            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                C59615b.this.f147967a.mo203074c();
            }
        });
        duration.start();
    }
}
