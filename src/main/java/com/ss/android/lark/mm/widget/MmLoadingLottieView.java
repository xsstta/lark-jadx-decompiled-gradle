package com.ss.android.lark.mm.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;

public class MmLoadingLottieView extends LottieAnimationView {

    /* renamed from: a */
    private boolean f118750a;

    /* renamed from: a */
    private void m186650a() {
        if (!this.f118750a) {
            this.f118750a = true;
            setClickable(false);
            setEnabled(false);
            setRepeatCount(-1);
            setAnimation(R.raw.mm_loading);
        }
    }

    public MmLoadingLottieView(Context context) {
        this(context, null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            m186650a();
            playAnimation();
        } else if (this.f118750a) {
            pauseAnimation();
        }
    }

    public MmLoadingLottieView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MmLoadingLottieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m186650a();
    }
}
