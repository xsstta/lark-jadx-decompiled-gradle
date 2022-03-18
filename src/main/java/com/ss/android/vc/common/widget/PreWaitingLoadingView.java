package com.ss.android.vc.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;

public class PreWaitingLoadingView extends LottieAnimationView {
    /* renamed from: a */
    private void m236344a() {
        setAnimation("lottie/pre_waiting_loading.json");
        playAnimation();
        setRepeatCount(-1);
    }

    public PreWaitingLoadingView(Context context) {
        super(context);
        m236344a();
    }

    public PreWaitingLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236344a();
    }

    public PreWaitingLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236344a();
    }
}
