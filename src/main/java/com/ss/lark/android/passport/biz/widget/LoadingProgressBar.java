package com.ss.lark.android.passport.biz.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LoadingProgressBar extends LottieAnimationView {

    /* renamed from: a */
    private Context f164367a;

    /* renamed from: b */
    private int f164368b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
    }

    public int getStatus() {
        return this.f164368b;
    }

    /* renamed from: a */
    private void m256183a() {
        setEnabled(false);
        m256184b();
    }

    /* renamed from: b */
    private void m256184b() {
        setVisibility(8);
        this.f164368b = 1;
        setClickable(true);
        setEnabled(true);
        cancelAnimation();
    }

    public LoadingProgressBar(Context context) {
        super(context);
        this.f164367a = context;
        m256183a();
    }

    public LoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f164367a = context;
        m256183a();
    }

    public LoadingProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f164367a = context;
        m256183a();
    }
}
