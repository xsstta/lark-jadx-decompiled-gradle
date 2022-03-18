package com.bytedance.ee.bear.facade.common.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.ee.log.C13479a;

public class BearLottieView extends LottieAnimationView {

    /* renamed from: a */
    private boolean f20830a;

    /* renamed from: b */
    private boolean f20831b;

    @Override // com.airbnb.lottie.LottieAnimationView
    public void cancelAnimation() {
        super.cancelAnimation();
        this.f20830a = false;
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.lottie.LottieAnimationView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isAnimating()) {
            C13479a.m54764b("BearLottieView", "xxx: onAttachedToWindow: cancel animator");
            super.cancelAnimation();
            this.f20830a = true;
        }
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void playAnimation() {
        C13479a.m54764b("BearLottieView", "xxx:playAnimation: ");
        if (m30862a()) {
            super.playAnimation();
        } else {
            this.f20830a = true;
        }
    }

    /* renamed from: a */
    private boolean m30862a() {
        if (getVisibility() != 0 || getHeight() <= 0 || getWidth() <= 0) {
            return false;
        }
        return true;
    }

    public BearLottieView(Context context) {
        super(context);
        m30861a((AttributeSet) null);
    }

    /* renamed from: a */
    private void m30861a(AttributeSet attributeSet) {
        if (isAnimating()) {
            C13479a.m54764b("BearLottieView", "xxx:init: cancel animator");
            super.cancelAnimation();
            this.f20830a = true;
        }
        this.f20831b = true;
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void invalidateDrawable(Drawable drawable) {
        if (!this.f20831b) {
            super.invalidateDrawable(drawable);
        } else if (!m30862a()) {
            C13479a.m54764b("BearLottieView", "invalidateDrawable not visible, return");
            if (isAnimating()) {
                this.f20830a = true;
            }
            super.cancelAnimation();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: a */
    private void m30860a(int i) {
        if (this.f20831b) {
            if (i != 0 || !m30862a() || !this.f20830a) {
                if (isAnimating()) {
                    this.f20830a = true;
                }
                C13479a.m54772d("BearLottieView", "xxx: checkAnimation: cancel " + hashCode());
                super.cancelAnimation();
                return;
            }
            C13479a.m54764b("BearLottieView", "xxx: checkAnimation: play " + hashCode());
            super.playAnimation();
        }
    }

    public BearLottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30861a(attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.lottie.LottieAnimationView
    public void onVisibilityChanged(View view, int i) {
        C13479a.m54764b("BearLottieView", "xxx: onVisibilityChanged: " + i);
        m30860a(i);
    }

    public BearLottieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30861a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        C13479a.m54764b("BearLottieView", "xxx: onSizeChanged: ");
        m30860a(getVisibility());
    }
}
