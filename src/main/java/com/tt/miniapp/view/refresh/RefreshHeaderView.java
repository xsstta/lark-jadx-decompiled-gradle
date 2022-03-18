package com.tt.miniapp.view.refresh;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.view.loading.NewLoadingView;

public class RefreshHeaderView extends NewLoadingView implements AbstractC67215d, AbstractC67216e {

    /* renamed from: D */
    private AbstractC67203a f169580D;

    /* renamed from: com.tt.miniapp.view.refresh.RefreshHeaderView$a */
    public interface AbstractC67203a {
        /* renamed from: a */
        void mo230217a();

        /* renamed from: b */
        void mo230218b();
    }

    @Override // com.tt.miniapp.view.refresh.AbstractC67216e
    /* renamed from: e */
    public void mo233649e() {
        AppBrandLogger.m52828d("tma_RefreshHeaderView", "onRelease");
    }

    @Override // com.tt.miniapp.view.refresh.AbstractC67215d
    /* renamed from: c */
    public void mo233647c() {
        mo233633a();
        AppBrandLogger.m52828d("tma_RefreshHeaderView", "onRefresh");
        AbstractC67203a aVar = this.f169580D;
        if (aVar != null) {
            aVar.mo230217a();
        }
    }

    @Override // com.tt.miniapp.view.refresh.AbstractC67216e
    /* renamed from: d */
    public void mo233648d() {
        mo233636b();
        AppBrandLogger.m52828d("tma_RefreshHeaderView", "onPrepare");
    }

    @Override // com.tt.miniapp.view.refresh.AbstractC67216e
    /* renamed from: f */
    public void mo233650f() {
        AppBrandLogger.m52828d("tma_RefreshHeaderView", "onComplete");
        AbstractC67203a aVar = this.f169580D;
        if (aVar != null) {
            aVar.mo230218b();
        }
    }

    @Override // com.tt.miniapp.view.refresh.AbstractC67216e
    /* renamed from: g */
    public void mo233651g() {
        mo233636b();
        AppBrandLogger.m52828d("tma_RefreshHeaderView", "onReset");
    }

    public RefreshHeaderView(Context context) {
        super(context);
    }

    public void setRefreshState(AbstractC67203a aVar) {
        this.f169580D = aVar;
    }

    public RefreshHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tt.miniapp.view.refresh.AbstractC67216e
    /* renamed from: a */
    public void mo233646a(int i, boolean z, boolean z2) {
        if (z) {
            return;
        }
        if (i <= getHeight()) {
            mo233634a(((double) i) / ((double) getHeight()));
        } else {
            mo233634a(1.0d);
        }
    }
}
