package com.ss.android.photoeditor.ve.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/photoeditor/ve/view/AnimationRelativeLayout;", "Landroid/widget/RelativeLayout;", "Lcom/ss/android/photoeditor/ve/base/IAnimationShow;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "showAnimator", "Landroid/animation/ValueAnimator;", "hideWithAnimation", "", "setVisibility", "visibility", "showWithAnimation", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
public class AnimationRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private final ValueAnimator f149403a;

    /* renamed from: a */
    public void mo204122a() {
        if (getVisibility() != 0) {
            this.f149403a.cancel();
            this.f149403a.start();
        }
    }

    /* renamed from: b */
    public void mo204123b() {
        if (getVisibility() != 8) {
            this.f149403a.cancel();
            this.f149403a.reverse();
        }
    }

    public void setVisibility(int i) {
        if (i == 0) {
            setAlpha(1.0f);
        }
        super.setVisibility(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/photoeditor/ve/view/AnimationRelativeLayout$showAnimator$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.AnimationRelativeLayout$a */
    static final class C59937a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AnimationRelativeLayout f149404a;

        C59937a(AnimationRelativeLayout animationRelativeLayout) {
            this.f149404a = animationRelativeLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            Float f = null;
            if (valueAnimator != null) {
                obj = valueAnimator.getAnimatedValue();
            } else {
                obj = null;
            }
            if (obj instanceof Float) {
                f = obj;
            }
            Float f2 = f;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                this.f149404a.setAlpha(floatValue);
                if (floatValue <= BitmapDescriptorFactory.HUE_RED) {
                    AnimationRelativeLayout.super.setVisibility(8);
                }
                if (floatValue > ((float) 0)) {
                    AnimationRelativeLayout.super.setVisibility(0);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/photoeditor/ve/view/AnimationRelativeLayout$showAnimator$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.AnimationRelativeLayout$b */
    static final class C59938b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AnimationRelativeLayout f149405a;

        C59938b(AnimationRelativeLayout animationRelativeLayout) {
            this.f149405a = animationRelativeLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            Float f = null;
            if (valueAnimator != null) {
                obj = valueAnimator.getAnimatedValue();
            } else {
                obj = null;
            }
            if (obj instanceof Float) {
                f = obj;
            }
            Float f2 = f;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                this.f149405a.setAlpha(floatValue);
                if (floatValue <= BitmapDescriptorFactory.HUE_RED) {
                    AnimationRelativeLayout.super.setVisibility(8);
                }
                if (floatValue > ((float) 0)) {
                    AnimationRelativeLayout.super.setVisibility(0);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/photoeditor/ve/view/AnimationRelativeLayout$showAnimator$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.AnimationRelativeLayout$c */
    static final class C59939c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AnimationRelativeLayout f149406a;

        C59939c(AnimationRelativeLayout animationRelativeLayout) {
            this.f149406a = animationRelativeLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            Float f = null;
            if (valueAnimator != null) {
                obj = valueAnimator.getAnimatedValue();
            } else {
                obj = null;
            }
            if (obj instanceof Float) {
                f = obj;
            }
            Float f2 = f;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                this.f149406a.setAlpha(floatValue);
                if (floatValue <= BitmapDescriptorFactory.HUE_RED) {
                    AnimationRelativeLayout.super.setVisibility(8);
                }
                if (floatValue > ((float) 0)) {
                    AnimationRelativeLayout.super.setVisibility(0);
                }
            }
        }
    }

    public AnimationRelativeLayout(Context context) {
        super(context);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C59937a(this));
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ValueAnimator.ofFloat(0f…        }\n        }\n    }");
        this.f149403a = ofFloat;
    }

    public AnimationRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C59938b(this));
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ValueAnimator.ofFloat(0f…        }\n        }\n    }");
        this.f149403a = ofFloat;
    }

    public AnimationRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C59939c(this));
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ValueAnimator.ofFloat(0f…        }\n        }\n    }");
        this.f149403a = ofFloat;
    }
}
