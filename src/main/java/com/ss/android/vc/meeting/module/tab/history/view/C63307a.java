package com.ss.android.vc.meeting.module.tab.history.view;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewGroup;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.p072d.C1794b;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1235b.C27134b;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;

/* renamed from: com.ss.android.vc.meeting.module.tab.history.view.a */
public class C63307a extends C27134b {

    /* renamed from: a */
    LottieAnimationView f159722a;

    /* renamed from: b */
    int f159723b = 25;

    /* renamed from: c */
    int f159724c;

    /* renamed from: d */
    int f159725d = 12;

    /* renamed from: e */
    int f159726e;

    /* renamed from: f */
    int f159727f = 12;

    /* renamed from: com.ss.android.vc.meeting.module.tab.history.view.a$1 */
    static /* synthetic */ class C633081 {

        /* renamed from: a */
        static final /* synthetic */ int[] f159728a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = com.scwang.smartrefresh.layout.constant.RefreshState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.tab.history.view.C63307a.C633081.f159728a = r0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.tab.history.view.C63307a.C633081.f159728a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadFinish     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.tab.history.view.C63307a.C633081.f159728a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.tab.history.view.C63307a.C633081.<clinit>():void");
        }
    }

    /* renamed from: b */
    public void mo219082b() {
        this.f159722a.setLayoutParams(new ViewGroup.LayoutParams(C57582a.m223600a(this.f159723b), C57582a.m223600a(this.f159723b)));
        this.f159722a.setPadding(this.f159724c, C60773o.m236115a((double) this.f159725d), this.f159726e, C60773o.m236115a((double) this.f159727f));
        this.f159722a.setVisibility(8);
        this.f159722a.pauseAnimation();
        this.f159722a.addValueCallback(new C1847d("**"), AbstractC1810j.f6196C, $$Lambda$a$tmZuCaITpEFcbypE7NvC2AoO49s.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ColorFilter m247996a(C1794b bVar) {
        return new PorterDuffColorFilter(C60773o.m236126d(R.color.primary_pri_500), PorterDuff.Mode.SRC_ATOP);
    }

    public C63307a(LottieAnimationView lottieAnimationView) {
        super(lottieAnimationView);
        this.f159722a = lottieAnimationView;
        mo219082b();
    }

    @Override // com.scwang.smartrefresh.layout.p1235b.C27134b, com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public int mo30297a(AbstractC27129h hVar, boolean z) {
        this.f159722a.setVisibility(8);
        this.f159722a.pauseAnimation();
        return 0;
    }

    @Override // com.scwang.smartrefresh.layout.p1235b.C27134b, com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: b */
    public void mo30304b(AbstractC27129h hVar, int i, int i2) {
        super.mo30304b(hVar, i, i2);
    }

    @Override // com.scwang.smartrefresh.layout.p1235b.C27134b, com.scwang.smartrefresh.layout.p1236c.AbstractC27141e
    /* renamed from: a */
    public void mo30300a(AbstractC27129h hVar, RefreshState refreshState, RefreshState refreshState2) {
        C60700b.m235851b("VCTabRefreshFooter", "[onStateChanged]", "oldState: " + refreshState + " newState: " + refreshState2);
        int i = C633081.f159728a[refreshState2.ordinal()];
        if (i == 1 || i == 2) {
            this.f159722a.setVisibility(8);
            if (this.f159722a.isAnimating()) {
                this.f159722a.pauseAnimation();
            }
        } else if (i == 3) {
            this.f159722a.setVisibility(0);
            if (!this.f159722a.isAnimating()) {
                this.f159722a.playAnimation();
            }
        }
    }
}
