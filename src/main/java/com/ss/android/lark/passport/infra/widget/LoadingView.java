package com.ss.android.lark.passport.infra.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;

public class LoadingView extends LottieAnimationView {
    /* renamed from: b */
    private void m194089b() {
        mo171781a();
    }

    /* renamed from: a */
    public void mo171781a() {
        setPadding(0, 0, 0, 0);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setImageResource(R.drawable.signin_sdk_arrow);
    }

    public LoadingView(Context context) {
        super(context);
        m194089b();
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m194089b();
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m194089b();
    }
}
