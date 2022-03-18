package com.ss.android.vc.meeting.module.follow.share;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.p072d.AbstractC1797e;
import com.airbnb.lottie.p072d.C1794b;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1235b.C27134b;
import com.ss.android.vc.common.p3083e.C60773o;

/* renamed from: com.ss.android.vc.meeting.module.follow.share.d */
public class C61826d extends C27134b {

    /* renamed from: a */
    LottieAnimationView f155181a;

    /* renamed from: b */
    public void mo214157b() {
        this.f155181a.setPadding(0, C60773o.m236115a(12.0d), 0, C60773o.m236115a(12.0d));
        this.f155181a.setVisibility(8);
        this.f155181a.pauseAnimation();
        this.f155181a.addValueCallback(new C1847d("**"), AbstractC1810j.f6196C, new AbstractC1797e<ColorFilter>() {
            /* class com.ss.android.vc.meeting.module.follow.share.C61826d.C618271 */

            /* renamed from: a */
            public ColorFilter getValue(C1794b<ColorFilter> bVar) {
                return new PorterDuffColorFilter(C60773o.m236126d(R.color.primary_pri_500), PorterDuff.Mode.SRC_ATOP);
            }
        });
    }

    public C61826d(LottieAnimationView lottieAnimationView) {
        super(lottieAnimationView);
        this.f155181a = lottieAnimationView;
        mo214157b();
    }

    @Override // com.scwang.smartrefresh.layout.p1235b.C27134b, com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public int mo30297a(AbstractC27129h hVar, boolean z) {
        this.f155181a.setVisibility(8);
        this.f155181a.cancelAnimation();
        return 0;
    }

    @Override // com.scwang.smartrefresh.layout.p1235b.C27134b, com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: b */
    public void mo30304b(AbstractC27129h hVar, int i, int i2) {
        super.mo30304b(hVar, i, i2);
        this.f155181a.setVisibility(0);
        this.f155181a.playAnimation();
    }
}
