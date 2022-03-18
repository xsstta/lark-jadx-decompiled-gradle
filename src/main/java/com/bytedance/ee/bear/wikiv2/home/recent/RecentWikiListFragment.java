package com.bytedance.ee.bear.wikiv2.home.recent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.homepage.AbstractC8463b;
import com.bytedance.ee.bear.list.homepage.AbstractC8473d;
import com.bytedance.ee.bear.wikiv2.home.recent.C12294f;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;

public class RecentWikiListFragment extends C7667e implements AbstractC8473d, C12294f.AbstractC12295a {

    /* renamed from: a */
    private View f32992a;

    /* renamed from: b */
    private C12292d f32993b;

    /* renamed from: c */
    private C12294f f32994c;

    @Override // com.bytedance.ee.bear.wikiv2.home.recent.C12294f.AbstractC12295a
    /* renamed from: a */
    public void mo46879a() {
        C13479a.m54764b("Wiki_RecentWikiListFragment", "RecentWikiListFragment.onViewRefresh. ");
        if (getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) getParentFragment()).y_();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("Wiki_RecentWikiListFragment", "RecentWikiListFragment.onDestroy. ");
        C12292d dVar = this.f32993b;
        if (dVar != null) {
            dVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C13479a.m54764b("Wiki_RecentWikiListFragment", "RecentWikiListFragment.onPause. ");
        C12292d dVar = this.f32993b;
        if (dVar != null) {
            dVar.mo32660d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C13479a.m54764b("Wiki_RecentWikiListFragment", "RecentWikiListFragment.onResume. ");
        C12292d dVar = this.f32993b;
        if (dVar != null) {
            dVar.mo33310k();
        }
    }

    /* renamed from: b */
    private void m51169b() {
        this.f32994c = new C12294f(getContext(), this.f32992a, this, ar.m20936a(), this);
        C12292d dVar = new C12292d(this.f32994c, new C12291c(this, getContext(), ar.m20936a()), getContext(), ar.m20936a(), this);
        this.f32993b = dVar;
        dVar.create();
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32695a(AbstractC27129h hVar) {
        C13479a.m54764b("Wiki_RecentWikiListFragment", "RecentWikiListFragment.onRefresh. ");
        C12292d dVar = this.f32993b;
        if (dVar != null) {
            dVar.mo33313o();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.list.homepage.AbstractC8473d
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C13479a.m54764b("Wiki_RecentWikiListFragment", "RecentWikiListFragment.setUserVisibleHint, isVisibleToUser = " + z);
        C12292d dVar = this.f32993b;
        if (dVar != null) {
            dVar.mo33302a(z);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32694a(SmartRefreshLayout smartRefreshLayout) {
        C13479a.m54764b("Wiki_RecentWikiListFragment", "RecentWikiListFragment.setRefreshLayout(), refreshLayout = " + smartRefreshLayout);
        C12294f fVar = this.f32994c;
        if (fVar != null) {
            fVar.mo46882a(smartRefreshLayout);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C13479a.m54764b("Wiki_RecentWikiListFragment", "RecentWikiListFragment.onViewCreated. ");
        m51169b();
    }

    @Override // com.bytedance.ee.bear.wikiv2.home.recent.C12294f.AbstractC12295a
    /* renamed from: a */
    public void mo46880a(int i, int i2) {
        if (getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) getParentFragment()).mo30959a(i, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13479a.m54764b("Wiki_RecentWikiListFragment", "RecentWikiListFragment.onCreateView. ");
        View inflate = layoutInflater.inflate(R.layout.wiki_home_recent_list, viewGroup, false);
        this.f32992a = inflate;
        return inflate;
    }
}
