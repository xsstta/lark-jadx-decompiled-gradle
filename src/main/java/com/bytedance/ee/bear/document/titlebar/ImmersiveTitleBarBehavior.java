package com.bytedance.ee.bear.document.titlebar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.ee.log.C13479a;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class ImmersiveTitleBarBehavior extends CoordinatorLayout.Behavior<AppBarLayout> {

    /* renamed from: a */
    private int f17224a;

    /* renamed from: b */
    private int f17225b;

    /* renamed from: c */
    private View f17226c;

    /* renamed from: d */
    private ObjectAnimator f17227d;

    /* renamed from: e */
    private ObjectAnimator f17228e;

    /* renamed from: f */
    private final int[] f17229f = new int[2];

    /* renamed from: g */
    private final int[] f17230g = new int[2];

    /* renamed from: a */
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        ObjectAnimator objectAnimator = this.f17227d;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.f17227d.removeAllListeners();
        } else {
            View view = this.f17226c;
            if (view != null) {
                view.setVisibility(0);
                this.f17226c.setAlpha(1.0f);
            }
        }
        ObjectAnimator objectAnimator2 = this.f17228e;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            this.f17228e.removeAllListeners();
            this.f17228e.cancel();
        }
    }

    /* renamed from: a */
    private void m24957a(CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, View view, int i) {
        if (i > 0) {
            if (appBarLayout.getAlpha() > BitmapDescriptorFactory.HUE_RED) {
                coordinatorLayout.getLocationOnScreen(this.f17229f);
                view.getLocationOnScreen(this.f17230g);
                if (this.f17230g[1] - this.f17229f[1] < appBarLayout.getMeasuredHeight()) {
                    ObjectAnimator objectAnimator = this.f17227d;
                    if (objectAnimator != null && objectAnimator.isRunning()) {
                        this.f17227d.cancel();
                    }
                    if (this.f17228e == null) {
                        ObjectAnimator duration = ObjectAnimator.ofFloat(appBarLayout, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(100L);
                        this.f17228e = duration;
                        duration.addListener(new AnimatorListenerAdapter() {
                            /* class com.bytedance.ee.bear.document.titlebar.ImmersiveTitleBarBehavior.C61831 */

                            public void onAnimationEnd(Animator animator) {
                                appBarLayout.setVisibility(4);
                            }
                        });
                    }
                    if (!this.f17228e.isRunning()) {
                        C13479a.m54764b("ImmersiveTitleBarBehavior", "start hideAnimator");
                        this.f17228e.start();
                    }
                }
            }
        } else if (i < 0 && appBarLayout.getAlpha() < 1.0f) {
            ObjectAnimator objectAnimator2 = this.f17228e;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                this.f17228e.cancel();
            }
            if (this.f17227d == null) {
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(appBarLayout, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(100L);
                this.f17227d = duration2;
                duration2.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.ee.bear.document.titlebar.ImmersiveTitleBarBehavior.C61842 */

                    public void onAnimationStart(Animator animator) {
                        appBarLayout.setVisibility(0);
                    }
                });
            }
            if (!this.f17227d.isRunning()) {
                C13479a.m54764b("ImmersiveTitleBarBehavior", "start showAnimator");
                this.f17227d.start();
            }
        }
    }

    /* renamed from: a */
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        this.f17226c = appBarLayout;
        if (this.f17224a <= 0) {
            this.f17224a = ViewConfiguration.get(appBarLayout.getContext()).getScaledTouchSlop();
        }
        if (Math.abs(this.f17225b) > this.f17224a) {
            m24957a(coordinatorLayout, appBarLayout, view, i2);
            this.f17225b = 0;
            return;
        }
        this.f17225b += i2;
    }
}
