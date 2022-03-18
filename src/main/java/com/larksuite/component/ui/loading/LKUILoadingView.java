package com.larksuite.component.ui.loading;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.suite.R;

public class LKUILoadingView extends LKUILottieAnimationView {
    private void init() {
        setAnimation(R.raw.loading_anim);
        setRepeatCount(-1);
    }

    public LKUILoadingView(Context context) {
        this(context, null);
    }

    public LKUILoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LKUILoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
