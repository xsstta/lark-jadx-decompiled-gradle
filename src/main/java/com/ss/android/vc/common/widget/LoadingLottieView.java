package com.ss.android.vc.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;

public class LoadingLottieView extends LottieAnimationView {
    /* renamed from: a */
    private void m236341a() {
        setClickable(false);
        setEnabled(false);
        setRepeatCount(-1);
        setAnimation(R.raw.videochat_loading);
        setColorFilter(R.color.ud_B500);
        playAnimation();
    }

    public void setLoadingAnimation(int i) {
        setAnimation(i);
    }

    public LoadingLottieView(Context context) {
        super(context);
        m236341a();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            playAnimation();
        } else {
            cancelAnimation();
        }
    }

    public LoadingLottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236341a();
    }

    public LoadingLottieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236341a();
    }
}
