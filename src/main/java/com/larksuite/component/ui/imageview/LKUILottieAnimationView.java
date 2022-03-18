package com.larksuite.component.ui.imageview;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;

public class LKUILottieAnimationView extends LottieAnimationView {
    /* access modifiers changed from: protected */
    @Override // com.airbnb.lottie.LottieAnimationView
    public void onDetachedFromWindow() {
        cancelAnimation();
        super.onDetachedFromWindow();
    }

    public LKUILottieAnimationView(Context context) {
        super(context);
    }

    public LKUILottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LKUILottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
