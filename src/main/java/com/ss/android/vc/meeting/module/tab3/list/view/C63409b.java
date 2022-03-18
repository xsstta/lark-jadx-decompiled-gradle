package com.ss.android.vc.meeting.module.tab3.list.view;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.p072d.C1794b;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1235b.C27134b;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.LoadingLottieView;
import com.ss.android.vc.meeting.module.tab3.widgets.LoadMoreView;

/* renamed from: com.ss.android.vc.meeting.module.tab3.list.view.b */
public class C63409b extends C27134b {

    /* renamed from: a */
    LoadMoreView f160104a;

    /* renamed from: b */
    LottieAnimationView f160105b;

    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.view.b$1 */
    static /* synthetic */ class C634101 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160106a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = com.scwang.smartrefresh.layout.constant.RefreshState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.tab3.list.view.C63409b.C634101.f160106a = r0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.view.C63409b.C634101.f160106a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadFinish     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.view.C63409b.C634101.f160106a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.tab3.list.view.C63409b.C634101.<clinit>():void");
        }
    }

    /* renamed from: b */
    public void mo219417b() {
        this.f160104a.setVisibility(8);
        LoadingLottieView loadingLottieView = this.f160104a.getLoadingLottieView();
        this.f160105b = loadingLottieView;
        loadingLottieView.pauseAnimation();
        this.f160105b.addValueCallback(new C1847d("**"), AbstractC1810j.f6196C, $$Lambda$b$DsM_KJcQVUAWOqWGkdy2jazVMFo.INSTANCE);
    }

    /* renamed from: a */
    public void mo219416a(View.OnClickListener onClickListener) {
        this.f160104a.setOnRetryListener(onClickListener);
    }

    /* renamed from: b */
    public void mo219418b(boolean z) {
        this.f160104a.mo219440a(z);
    }

    public C63409b(LoadMoreView loadMoreView) {
        super(loadMoreView);
        this.f160104a = loadMoreView;
        mo219417b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ColorFilter m248464a(C1794b bVar) {
        return new PorterDuffColorFilter(C60773o.m236126d(R.color.primary_pri_500), PorterDuff.Mode.SRC_ATOP);
    }

    @Override // com.scwang.smartrefresh.layout.p1235b.C27134b, com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public int mo30297a(AbstractC27129h hVar, boolean z) {
        this.f160104a.setVisibility(8);
        this.f160105b.pauseAnimation();
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
        int i = C634101.f160106a[refreshState2.ordinal()];
        if (i == 1 || i == 2) {
            this.f160104a.setVisibility(8);
            if (this.f160105b.isAnimating()) {
                this.f160105b.pauseAnimation();
            }
        } else if (i == 3) {
            this.f160104a.setVisibility(0);
            if (!this.f160105b.isAnimating()) {
                this.f160105b.playAnimation();
            }
        }
    }
}
