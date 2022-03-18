package com.bytedance.ee.bear.list.star;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.homepage.AbstractC8463b;
import com.bytedance.ee.bear.list.homepage.AbstractC8473d;
import com.bytedance.ee.bear.list.star.C8803g;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;

public class FavoriteFragment extends C7667e implements AbstractC8473d, C8803g.AbstractC8804a {

    /* renamed from: a */
    private View f23720a;

    /* renamed from: b */
    private C8802f f23721b;

    /* renamed from: c */
    private AbstractC8808k f23722c;

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C8802f fVar = this.f23721b;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C8802f fVar = this.f23721b;
        if (fVar != null) {
            fVar.mo33310k();
        }
    }

    /* renamed from: a */
    private void m36884a() {
        this.f23722c = new C8803g(getContext(), this.f23720a, this, ar.m20936a(), this);
        C8802f fVar = new C8802f(this.f23722c, new C8801e(this, getContext(), ar.m20936a()), getContext(), ar.m20936a(), this);
        this.f23721b = fVar;
        fVar.create();
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32694a(SmartRefreshLayout smartRefreshLayout) {
        AbstractC8808k kVar = this.f23722c;
        if (kVar != null) {
            kVar.mo33862a(smartRefreshLayout);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32695a(AbstractC27129h hVar) {
        C8802f fVar = this.f23721b;
        if (fVar != null) {
            fVar.mo33313o();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.list.homepage.AbstractC8473d
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C8802f fVar = this.f23721b;
        if (fVar != null) {
            fVar.mo33302a(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m36884a();
    }

    @Override // com.bytedance.ee.bear.list.star.C8803g.AbstractC8804a
    /* renamed from: a */
    public void mo33861a(int i, int i2) {
        if (getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) getParentFragment()).mo30959a(i, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_doc_sub_list, viewGroup, false);
        this.f23720a = inflate;
        return inflate;
    }
}
