package com.ss.android.photoeditor.base;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/photoeditor/base/AlphaAnimShowHideViewHelper;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "isVisible", "", "mHideAnimator", "Landroid/animation/ObjectAnimator;", "mShowAnimator", "getView", "()Landroid/view/View;", "animHideView", "", "animShowView", "isViewVisible", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.base.c */
public final class AlphaAnimShowHideViewHelper {

    /* renamed from: a */
    public boolean f147973a = true;

    /* renamed from: b */
    private final ObjectAnimator f147974b;

    /* renamed from: c */
    private final ObjectAnimator f147975c;

    /* renamed from: d */
    private final View f147976d;

    /* renamed from: c */
    public final boolean mo203077c() {
        return this.f147973a;
    }

    /* renamed from: d */
    public final View mo203078d() {
        return this.f147976d;
    }

    /* renamed from: a */
    public final void mo203075a() {
        if (!this.f147973a) {
            if (this.f147975c.isRunning()) {
                this.f147975c.cancel();
            }
            this.f147974b.start();
        }
    }

    /* renamed from: b */
    public final void mo203076b() {
        if (this.f147973a) {
            if (this.f147974b.isRunning()) {
                this.f147974b.cancel();
            }
            this.f147975c.start();
        }
    }

    public AlphaAnimShowHideViewHelper(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f147976d = view;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(200L);
        Intrinsics.checkExpressionValueIsNotNull(duration, "ObjectAnimator.ofFloat(v… 0F, 1F).setDuration(200)");
        this.f147974b = duration;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(200L);
        Intrinsics.checkExpressionValueIsNotNull(duration2, "ObjectAnimator.ofFloat(v… 1F, 0F).setDuration(200)");
        this.f147975c = duration2;
        duration.addListener(new AnimatorListenerAdapter(this) {
            /* class com.ss.android.photoeditor.base.AlphaAnimShowHideViewHelper.C596191 */

            /* renamed from: a */
            final /* synthetic */ AlphaAnimShowHideViewHelper f147977a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f147977a = r1;
            }

            public void onAnimationCancel(Animator animator) {
                this.f147977a.mo203078d().setAlpha(1.0f);
            }

            public void onAnimationEnd(Animator animator) {
                this.f147977a.mo203078d().setAlpha(1.0f);
            }

            public void onAnimationStart(Animator animator) {
                this.f147977a.mo203078d().setVisibility(0);
                this.f147977a.f147973a = true;
            }
        });
        duration2.addListener(new AnimatorListenerAdapter(this) {
            /* class com.ss.android.photoeditor.base.AlphaAnimShowHideViewHelper.C596202 */

            /* renamed from: a */
            final /* synthetic */ AlphaAnimShowHideViewHelper f147978a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f147978a = r1;
            }

            public void onAnimationStart(Animator animator) {
                this.f147978a.mo203078d().setVisibility(0);
                this.f147978a.f147973a = false;
            }

            public void onAnimationCancel(Animator animator) {
                this.f147978a.mo203078d().setAlpha(BitmapDescriptorFactory.HUE_RED);
                this.f147978a.mo203078d().setVisibility(8);
            }

            public void onAnimationEnd(Animator animator) {
                this.f147978a.mo203078d().setAlpha(BitmapDescriptorFactory.HUE_RED);
                this.f147978a.mo203078d().setVisibility(8);
            }
        });
    }
}
