package com.ss.android.vc.meeting.module.tab3.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.widget.VcCircleProgressBar;

public class RefreshHeader extends RelativeLayout implements AbstractC7741a {

    /* renamed from: a */
    private VcCircleProgressBar f160090a;

    /* renamed from: b */
    private LottieAnimationView f160091b;

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30298a(float f, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public boolean mo30301a() {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void b_(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public View getView() {
        return this;
    }

    @Override // com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a
    public void setAssociatedHeader(AbstractC7741a aVar) {
    }

    @Override // com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a
    public void setCustomText(String str) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public void setPrimaryColors(int... iArr) {
    }

    @Override // com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a
    public void setStartNumber(int i) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public SpinnerStyle getSpinnerStyle() {
        return SpinnerStyle.Translate;
    }

    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.view.RefreshHeader$1 */
    static /* synthetic */ class C634031 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160092a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = com.scwang.smartrefresh.layout.constant.RefreshState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.tab3.list.view.RefreshHeader.C634031.f160092a = r0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.view.RefreshHeader.C634031.f160092a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.view.RefreshHeader.C634031.f160092a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshReleased     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.view.RefreshHeader.C634031.f160092a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.tab3.list.view.RefreshHeader.C634031.<clinit>():void");
        }
    }

    public RefreshHeader(Context context) {
        super(context);
        m248442a(context, (AttributeSet) null);
    }

    public RefreshHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m248442a(context, attributeSet);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public int mo30297a(AbstractC27129h hVar, boolean z) {
        LottieAnimationView lottieAnimationView = this.f160091b;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
            this.f160091b.pauseAnimation();
        }
        VcCircleProgressBar vcCircleProgressBar = this.f160090a;
        if (vcCircleProgressBar != null) {
            vcCircleProgressBar.setVisibility(0);
            this.f160090a.setProgress(BitmapDescriptorFactory.HUE_RED);
        }
        return 0;
    }

    /* renamed from: a */
    private void m248442a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.view_vc_tab_refresh_header, this);
        this.f160090a = (VcCircleProgressBar) findViewById(R.id.vc_tab_refresh_progress_bar);
        this.f160091b = (LottieAnimationView) findViewById(R.id.vc_tab_refresh_lottie_view);
        this.f160090a.setVisibility(0);
        this.f160090a.setProgress(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30299a(AbstractC27128g gVar, int i, int i2) {
        C60700b.m235851b("RefreshHeader", "onInitialized", "init");
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(AbstractC27129h hVar, int i, int i2) {
        C60700b.m235851b("RefreshHeader", "onRefreshReleased", "release");
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: b */
    public void mo30304b(AbstractC27129h hVar, int i, int i2) {
        C60700b.m235851b("RefreshHeader", "onStartAnimator", "startAnimator");
    }

    public RefreshHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m248442a(context, attributeSet);
    }

    @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27141e
    /* renamed from: a */
    public void mo30300a(AbstractC27129h hVar, RefreshState refreshState, RefreshState refreshState2) {
        C60700b.m235851b("RefreshHeader", "[onStateChanged]", "oldState: " + refreshState + " newState: " + refreshState2);
        int i = C634031.f160092a[refreshState2.ordinal()];
        if (i == 1) {
            this.f160091b.setVisibility(8);
            if (this.f160091b.isAnimating()) {
                this.f160091b.pauseAnimation();
            }
            this.f160090a.setVisibility(8);
            this.f160090a.setProgress(BitmapDescriptorFactory.HUE_RED);
        } else if (i == 2 || i == 3) {
            this.f160090a.setVisibility(8);
            VcCircleProgressBar vcCircleProgressBar = this.f160090a;
            vcCircleProgressBar.setProgress(vcCircleProgressBar.getMaxValue());
            this.f160091b.setVisibility(0);
            if (!this.f160091b.isAnimating()) {
                this.f160091b.playAnimation();
            }
        } else if (i == 4) {
            this.f160091b.setVisibility(8);
            if (this.f160091b.isAnimating()) {
                this.f160091b.pauseAnimation();
            }
            this.f160090a.setVisibility(0);
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(float f, int i, int i2, int i3) {
        VcCircleProgressBar vcCircleProgressBar = this.f160090a;
        if (vcCircleProgressBar != null) {
            vcCircleProgressBar.setVisibility(0);
            VcCircleProgressBar vcCircleProgressBar2 = this.f160090a;
            vcCircleProgressBar2.setProgress(Math.min(f * 100.0f, vcCircleProgressBar2.getMaxValue()));
        }
    }
}
