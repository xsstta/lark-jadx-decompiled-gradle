package com.bytedance.ee.bear.list.recent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.homepage.AbstractC8463b;
import com.bytedance.ee.bear.list.homepage.AbstractC8473d;
import com.bytedance.ee.bear.list.homepage.AbstractC8476f;
import com.bytedance.ee.bear.list.p422a.C8143b;
import com.bytedance.ee.bear.list.preload.C8670d;
import com.bytedance.ee.bear.list.preload.C8672e;
import com.bytedance.ee.bear.list.recent.C8687i;
import com.bytedance.ee.log.C13479a;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;

/* renamed from: com.bytedance.ee.bear.list.recent.d */
public class C8682d extends C7667e implements AbstractC8473d, C8687i.AbstractC8690a {

    /* renamed from: a */
    private View f23493a;

    /* renamed from: b */
    private RecentDocumentPresenter f23494b;

    /* renamed from: c */
    private AbstractC8680b f23495c;

    @Override // com.bytedance.ee.bear.list.recent.C8687i.AbstractC8690a
    /* renamed from: a */
    public void mo33707a() {
        if (getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) getParentFragment()).y_();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("RecentDocumentFragment", "onDestroy()...");
        RecentDocumentPresenter recentDocumentPresenter = this.f23494b;
        if (recentDocumentPresenter != null) {
            recentDocumentPresenter.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C13479a.m54764b("RecentDocumentFragment", "onResume()...");
        RecentDocumentPresenter recentDocumentPresenter = this.f23494b;
        if (recentDocumentPresenter != null) {
            recentDocumentPresenter.mo33310k();
        }
    }

    /* renamed from: c */
    private void m36292c() {
        this.f23495c = new C8687i(getContext(), this.f23493a, this, ar.m20936a(), this);
        C8685h a = C8672e.m36232a(getContext()).mo33677a();
        if (a == null) {
            a = new C8685h(this, getContext(), ar.m20936a());
        } else {
            C13479a.m54764b("RecentDocumentFragment", "initMVP()...model is preloaded.");
            a.mo33710a(this);
        }
        RecentDocumentPresenter recentDocumentPresenter = new RecentDocumentPresenter(this.f23495c, a, getContext(), ar.m20936a(), this);
        this.f23494b = recentDocumentPresenter;
        recentDocumentPresenter.create();
        C8143b.m32605a().mo31462a("init");
    }

    @Override // com.bytedance.ee.bear.list.recent.C8687i.AbstractC8690a
    /* renamed from: b */
    public void mo33709b() {
        C13479a.m54764b("RecentDocumentFragment", "onCreateBtnClick()...");
        if (!(getParentFragment() == null || getParentFragment().getParentFragment() == null || !(getParentFragment().getParentFragment() instanceof AbstractC8476f))) {
            AbstractC8476f fVar = (AbstractC8476f) getParentFragment().getParentFragment();
            fVar.onMenuCreateClick(fVar.mo30786c().getCreateView());
        }
        if (getParentFragment() instanceof AbstractC8476f) {
            ((AbstractC8476f) getParentFragment()).onMenuCreateClick(null);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32695a(AbstractC27129h hVar) {
        C13479a.m54764b("RecentDocumentFragment", "onRefresh()...");
        RecentDocumentPresenter recentDocumentPresenter = this.f23494b;
        if (recentDocumentPresenter != null) {
            recentDocumentPresenter.mo33313o();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.list.homepage.AbstractC8473d
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C13479a.m54764b("RecentDocumentFragment", "setUserVisibleHint()...isVisibleToUser = " + z);
        RecentDocumentPresenter recentDocumentPresenter = this.f23494b;
        if (recentDocumentPresenter != null) {
            recentDocumentPresenter.mo33302a(z);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32694a(SmartRefreshLayout smartRefreshLayout) {
        C13479a.m54764b("RecentDocumentFragment", "setRefreshLayout()...refreshLayout = " + smartRefreshLayout);
        AbstractC8680b bVar = this.f23495c;
        if (bVar != null) {
            bVar.mo33706a(smartRefreshLayout);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C13479a.m54764b("RecentDocumentFragment", "onViewCreated()...");
        m36292c();
    }

    @Override // com.bytedance.ee.bear.list.recent.C8687i.AbstractC8690a
    /* renamed from: a */
    public void mo33708a(int i, int i2) {
        if (getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) getParentFragment()).mo30959a(i, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13479a.m54764b("RecentDocumentFragment", "onCreateView()...");
        C8143b.m32605a().mo31470c("inflate_recent_layout");
        this.f23493a = C8670d.m36229a().mo33675a(getActivity(), true);
        C8143b.m32605a().mo31468b("inflate_recent_layout");
        return this.f23493a;
    }
}
