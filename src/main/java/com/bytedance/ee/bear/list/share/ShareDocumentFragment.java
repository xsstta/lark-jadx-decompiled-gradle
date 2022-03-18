package com.bytedance.ee.bear.list.share;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.homepage.AbstractC8463b;
import com.bytedance.ee.bear.list.homepage.AbstractC8473d;
import com.bytedance.ee.bear.list.share.C8750w;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;

public class ShareDocumentFragment extends C7667e implements AbstractC8473d, C8750w.AbstractC8751a {

    /* renamed from: a */
    private View f23550a;

    /* renamed from: b */
    private C8748v f23551b;

    /* renamed from: c */
    private AbstractC8739n f23552c;

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C8748v vVar = this.f23551b;
        if (vVar != null) {
            vVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C8748v vVar = this.f23551b;
        if (vVar != null) {
            vVar.mo33310k();
        }
    }

    @Override // com.bytedance.ee.bear.list.share.C8750w.AbstractC8751a
    /* renamed from: a */
    public void mo33748a() {
        if (getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) getParentFragment()).y_();
        }
    }

    /* renamed from: b */
    private void m36436b() {
        this.f23552c = new C8750w(getContext(), this.f23550a, this, ar.m20936a(), this);
        C8748v vVar = new C8748v(this.f23552c, new C8747u(this, getContext(), ar.m20936a()), getContext(), ar.m20936a(), this);
        this.f23551b = vVar;
        vVar.create();
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32694a(SmartRefreshLayout smartRefreshLayout) {
        AbstractC8739n nVar = this.f23552c;
        if (nVar != null) {
            nVar.mo33781a(smartRefreshLayout);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32695a(AbstractC27129h hVar) {
        C8748v vVar = this.f23551b;
        if (vVar != null) {
            vVar.mo33313o();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.list.homepage.AbstractC8473d
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C8748v vVar = this.f23551b;
        if (vVar != null) {
            vVar.mo33302a(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m36436b();
    }

    @Override // com.bytedance.ee.bear.list.share.C8750w.AbstractC8751a
    /* renamed from: a */
    public void mo33749a(int i, int i2) {
        if (getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) getParentFragment()).mo30959a(i, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_doc_sub_list, viewGroup, false);
        this.f23550a = inflate;
        return inflate;
    }
}
