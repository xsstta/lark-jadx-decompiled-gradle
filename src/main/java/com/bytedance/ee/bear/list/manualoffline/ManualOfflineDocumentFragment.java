package com.bytedance.ee.bear.list.manualoffline;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.homepage.AbstractC8463b;
import com.bytedance.ee.bear.list.homepage.AbstractC8473d;
import com.bytedance.ee.bear.list.manualoffline.C8607f;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;

public class ManualOfflineDocumentFragment extends C7667e implements AbstractC8473d, C8607f.AbstractC8608a {

    /* renamed from: a */
    private View f23341a;

    /* renamed from: b */
    private C8606e f23342b;

    /* renamed from: c */
    private AbstractC8601b f23343c;

    @Override // com.bytedance.ee.bear.list.manualoffline.C8607f.AbstractC8608a
    /* renamed from: a */
    public void mo33536a() {
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C8606e eVar = this.f23342b;
        if (eVar != null) {
            eVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C8606e eVar = this.f23342b;
        if (eVar != null) {
            eVar.mo33310k();
        }
    }

    /* renamed from: b */
    private void m35874b() {
        this.f23343c = new C8607f(getContext(), this.f23341a, this, ar.m20936a(), this);
        C8606e eVar = new C8606e(this.f23343c, new C8603d(this, getContext(), ar.m20936a()), getContext(), ar.m20936a(), this);
        this.f23342b = eVar;
        eVar.create();
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32694a(SmartRefreshLayout smartRefreshLayout) {
        AbstractC8601b bVar = this.f23343c;
        if (bVar != null) {
            bVar.mo33545a(smartRefreshLayout);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32695a(AbstractC27129h hVar) {
        C8606e eVar = this.f23342b;
        if (eVar != null) {
            eVar.mo33313o();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.list.homepage.AbstractC8473d
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C8606e eVar = this.f23342b;
        if (eVar != null) {
            eVar.mo33302a(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m35874b();
    }

    @Override // com.bytedance.ee.bear.list.manualoffline.C8607f.AbstractC8608a
    /* renamed from: a */
    public void mo33537a(int i, int i2) {
        if (getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) getParentFragment()).mo30959a(i, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_doc_sub_list, viewGroup, false);
        this.f23341a = inflate;
        return inflate;
    }
}
