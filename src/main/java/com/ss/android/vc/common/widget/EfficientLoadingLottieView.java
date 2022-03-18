package com.ss.android.vc.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;

public class EfficientLoadingLottieView extends LottieAnimationView {

    /* renamed from: a */
    private boolean f152017a;

    /* renamed from: a */
    private void m236305a() {
        if (!this.f152017a) {
            this.f152017a = true;
            setClickable(false);
            setEnabled(false);
            setRepeatCount(-1);
            setAnimation(R.raw.videochat_loading);
        }
    }

    public EfficientLoadingLottieView(Context context) {
        super(context);
        m236305a();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            m236305a();
            playAnimation();
        } else if (this.f152017a) {
            pauseAnimation();
        }
    }

    public EfficientLoadingLottieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236305a();
    }

    public EfficientLoadingLottieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236305a();
    }
}
