package com.bytedance.ee.bear.list.share;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.homepage.AbstractC8463b;
import com.bytedance.ee.bear.list.homepage.AbstractC8473d;
import com.bytedance.ee.bear.list.share.aw;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;

public class SharedFragment extends C7667e implements AbstractC8473d, aw.AbstractC8722a {

    /* renamed from: a */
    private View f23553a;

    /* renamed from: b */
    private au f23554b;

    /* renamed from: c */
    private AbstractC8744r f23555c;

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        au auVar = this.f23554b;
        if (auVar != null) {
            auVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        au auVar = this.f23554b;
        if (auVar != null) {
            auVar.mo33310k();
        }
    }

    @Override // com.bytedance.ee.bear.list.share.aw.AbstractC8722a
    /* renamed from: a */
    public void mo33763a() {
        if (getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) getParentFragment()).y_();
        }
    }

    /* renamed from: b */
    private void m36453b() {
        this.f23555c = new aw(getContext(), this.f23553a, this, ar.m20936a(), this);
        au auVar = new au(this.f23555c, new C8721at(this, getContext(), ar.m20936a()), getContext(), ar.m20936a(), this);
        this.f23554b = auVar;
        auVar.create();
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32694a(SmartRefreshLayout smartRefreshLayout) {
        AbstractC8744r rVar = this.f23555c;
        if (rVar != null) {
            rVar.mo33775a(smartRefreshLayout);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32695a(AbstractC27129h hVar) {
        au auVar = this.f23554b;
        if (auVar != null) {
            auVar.mo33313o();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.list.homepage.AbstractC8473d
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        au auVar = this.f23554b;
        if (auVar != null) {
            auVar.mo33302a(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m36453b();
    }

    @Override // com.bytedance.ee.bear.list.share.aw.AbstractC8722a
    /* renamed from: a */
    public void mo33764a(int i, int i2) {
        if (getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) getParentFragment()).mo30959a(i, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_doc_sub_list, viewGroup, false);
        this.f23553a = inflate;
        return inflate;
    }
}
