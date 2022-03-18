package com.ss.android.lark.mail.impl.p2165d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.mail.impl.d.b */
public final class C42041b {

    /* renamed from: a */
    public final LottieAnimationView f106684a;

    /* renamed from: b */
    public final TextView f106685b;

    /* renamed from: c */
    private final RelativeLayout f106686c;

    /* renamed from: a */
    public RelativeLayout mo151056a() {
        return this.f106686c;
    }

    /* renamed from: a */
    public static C42041b m167227a(View view) {
        int i = R.id.mLottieAnimationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.mLottieAnimationView);
        if (lottieAnimationView != null) {
            i = R.id.mNoMoreTipsTextView;
            TextView textView = (TextView) view.findViewById(R.id.mNoMoreTipsTextView);
            if (textView != null) {
                return new C42041b((RelativeLayout) view, lottieAnimationView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    private C42041b(RelativeLayout relativeLayout, LottieAnimationView lottieAnimationView, TextView textView) {
        this.f106686c = relativeLayout;
        this.f106684a = lottieAnimationView;
        this.f106685b = textView;
    }

    /* renamed from: a */
    public static C42041b m167226a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mail_home_empty_footer_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m167227a(inflate);
    }
}
