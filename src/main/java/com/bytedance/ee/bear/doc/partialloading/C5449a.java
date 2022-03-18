package com.bytedance.ee.bear.doc.partialloading;

import android.view.View;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.doc.partialloading.a */
public class C5449a {

    /* renamed from: a */
    private View f15505a;

    /* renamed from: b */
    private BearLottieView f15506b = ((BearLottieView) this.f15505a.findViewById(R.id.doc_loading_lottie));

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21802a() {
        this.f15505a.setVisibility(0);
        this.f15506b.playAnimation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo21803b() {
        if (this.f15506b.isAnimating()) {
            this.f15506b.cancelAnimation();
        }
        this.f15505a.setVisibility(8);
    }

    C5449a(View view) {
        this.f15505a = view;
        view.setClickable(true);
    }
}
