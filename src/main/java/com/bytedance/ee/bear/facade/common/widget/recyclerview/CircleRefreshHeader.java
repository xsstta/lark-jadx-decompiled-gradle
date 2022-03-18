package com.bytedance.ee.bear.facade.common.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.progress.UDProgress;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

public class CircleRefreshHeader extends FrameLayout implements AbstractC7741a {

    /* renamed from: a */
    private BearLottieView f20927a;

    /* renamed from: b */
    private UDProgress f20928b;

    /* renamed from: c */
    private AbstractC7741a f20929c;

    /* renamed from: d */
    private int f20930d = ParticipantRepo.f117150c;

    /* renamed from: e */
    private float f20931e;

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30298a(float f, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public boolean mo30301a() {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: b */
    public void mo30304b(AbstractC27129h hVar, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void b_(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public View getView() {
        return this;
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

    /* renamed from: com.bytedance.ee.bear.facade.common.widget.recyclerview.CircleRefreshHeader$1 */
    static /* synthetic */ class C77331 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20932a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = com.scwang.smartrefresh.layout.constant.RefreshState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.facade.common.widget.recyclerview.CircleRefreshHeader.C77331.f20932a = r0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.facade.common.widget.recyclerview.CircleRefreshHeader.C77331.f20932a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.facade.common.widget.recyclerview.CircleRefreshHeader.C77331.f20932a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.facade.common.widget.recyclerview.CircleRefreshHeader.C77331.f20932a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshReleased     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.facade.common.widget.recyclerview.CircleRefreshHeader.C77331.f20932a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToRefresh     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.ee.bear.facade.common.widget.recyclerview.CircleRefreshHeader.C77331.f20932a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.facade.common.widget.recyclerview.CircleRefreshHeader.C77331.<clinit>():void");
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.widget.recyclerview.AbstractC7741a
    public void setAssociatedHeader(AbstractC7741a aVar) {
        this.f20929c = aVar;
    }

    public CircleRefreshHeader(Context context) {
        super(context);
        m30929a(context, (AttributeSet) null);
    }

    public CircleRefreshHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30929a(context, attributeSet);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public int mo30297a(AbstractC27129h hVar, boolean z) {
        this.f20927a.setVisibility(8);
        AbstractC7741a aVar = this.f20929c;
        if (aVar != null) {
            aVar.mo30297a(hVar, z);
        }
        return this.f20930d;
    }

    /* renamed from: a */
    private void m30929a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.facade_circle_refresh_header, (ViewGroup) this, true);
        this.f20927a = (BearLottieView) findViewById(R.id.home_page_lottie_view);
        this.f20928b = (UDProgress) findViewById(R.id.home_page_refresh_progress_bar);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30299a(AbstractC27128g gVar, int i, int i2) {
        AbstractC7741a aVar = this.f20929c;
        if (aVar != null) {
            aVar.mo30299a(gVar, i, i2);
        }
    }

    public CircleRefreshHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30929a(context, attributeSet);
    }

    @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27141e
    /* renamed from: a */
    public void mo30300a(AbstractC27129h hVar, RefreshState refreshState, RefreshState refreshState2) {
        int i = C77331.f20932a[refreshState2.ordinal()];
        if (i == 1) {
            C13479a.m54764b("CircleRefreshHeader", "refresh finish, hide mCircleProgressBar mBearLottieView");
            this.f20928b.setVisibility(8);
            this.f20927a.setVisibility(8);
        } else if (i == 2) {
            C13479a.m54764b("CircleRefreshHeader", "start pull down, set mCircleProgressBar visible");
            this.f20927a.setVisibility(8);
            this.f20928b.setVisibility(0);
        } else if (i == 3 || i == 4) {
            C13479a.m54764b("CircleRefreshHeader", "refresh releaseed, start play lottie animation");
            this.f20928b.setVisibility(8);
            this.f20927a.setVisibility(0);
        }
        AbstractC7741a aVar = this.f20929c;
        if (aVar != null) {
            aVar.mo30300a(hVar, refreshState, refreshState2);
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(AbstractC27129h hVar, int i, int i2) {
        this.f20927a.setVisibility(0);
        this.f20927a.setAnimation(R.raw.facade_circle_refresh);
        this.f20927a.setRepeatCount(-1);
        this.f20927a.playAnimation();
        AbstractC7741a aVar = this.f20929c;
        if (aVar != null) {
            aVar.a_(hVar, i, i2);
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(float f, int i, int i2, int i3) {
        float f2 = (f - 0.2f) * 100.0f;
        this.f20931e = f2;
        if (f2 > 100.0f) {
            this.f20931e = 100.0f;
        }
        this.f20928b.setProgress((int) this.f20931e);
        AbstractC7741a aVar = this.f20929c;
        if (aVar != null) {
            aVar.a_(f, i, i2, i3);
        }
    }
}
