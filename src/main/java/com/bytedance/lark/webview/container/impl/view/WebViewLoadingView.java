package com.bytedance.lark.webview.container.impl.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;

public class WebViewLoadingView extends FrameLayout {

    /* renamed from: a */
    private LottieAnimationView f48596a;

    /* renamed from: b */
    private Guideline f48597b;

    public LottieAnimationView getLottieAnimationView() {
        return this.f48596a;
    }

    public WebViewLoadingView(Context context) {
        this(context, null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f48596a.setVisibility(i);
        if (i == 0) {
            this.f48596a.playAnimation();
        } else {
            this.f48596a.cancelAnimation();
        }
    }

    public WebViewLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m72585a(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.webview_common_loading_view, (ViewGroup) this, true);
        this.f48596a = (LottieAnimationView) inflate.findViewById(R.id.lottie);
        this.f48597b = (Guideline) inflate.findViewById(R.id.start_line);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.webViewTopMarginPercent});
        this.f48597b.setGuidelinePercent(obtainStyledAttributes.getFloat(0, 0.3f));
        obtainStyledAttributes.recycle();
    }

    public WebViewLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m72585a(context, attributeSet);
    }
}
