package com.bytedance.ee.bear.list.mine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.homepage.AbstractC8463b;
import com.bytedance.ee.bear.list.homepage.AbstractC8473d;
import com.bytedance.ee.bear.list.homepage.AbstractC8476f;
import com.bytedance.ee.bear.list.mine.C8627o;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;

public class MyDocumentFragment extends C7667e implements AbstractC8473d, C8627o.AbstractC8629a {

    /* renamed from: a */
    private View f23361a;

    /* renamed from: b */
    private MyDocumentPresenter f23362b;

    /* renamed from: c */
    private AbstractC8618g f23363c;

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MyDocumentPresenter myDocumentPresenter = this.f23362b;
        if (myDocumentPresenter != null) {
            myDocumentPresenter.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MyDocumentPresenter myDocumentPresenter = this.f23362b;
        if (myDocumentPresenter != null) {
            myDocumentPresenter.mo33310k();
        }
    }

    @Override // com.bytedance.ee.bear.list.mine.C8627o.AbstractC8629a
    /* renamed from: a */
    public void mo33561a() {
        if (getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) getParentFragment()).y_();
        }
    }

    /* renamed from: c */
    private void m35953c() {
        this.f23363c = new C8627o(getContext(), this.f23361a, this, ar.m20936a(), this);
        MyDocumentPresenter myDocumentPresenter = new MyDocumentPresenter(this.f23363c, new C8624n(this, getContext(), ar.m20936a()), getContext(), ar.m20936a(), this);
        this.f23362b = myDocumentPresenter;
        myDocumentPresenter.create();
    }

    @Override // com.bytedance.ee.bear.list.mine.C8627o.AbstractC8629a
    /* renamed from: b */
    public void mo33563b() {
        if (!(getParentFragment() == null || getParentFragment().getParentFragment() == null || !(getParentFragment().getParentFragment() instanceof AbstractC8476f))) {
            ((AbstractC8476f) getParentFragment().getParentFragment()).onMenuCreateClick(null);
        }
        if (getActivity() instanceof AbstractC8476f) {
            ((AbstractC8476f) getActivity()).onMenuCreateClick(null);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32694a(SmartRefreshLayout smartRefreshLayout) {
        AbstractC8618g gVar = this.f23363c;
        if (gVar != null) {
            gVar.mo33574a(smartRefreshLayout);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32695a(AbstractC27129h hVar) {
        MyDocumentPresenter myDocumentPresenter = this.f23362b;
        if (myDocumentPresenter != null) {
            myDocumentPresenter.mo33313o();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.list.homepage.AbstractC8473d
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        MyDocumentPresenter myDocumentPresenter = this.f23362b;
        if (myDocumentPresenter != null) {
            myDocumentPresenter.mo33302a(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m35953c();
    }

    @Override // com.bytedance.ee.bear.list.mine.C8627o.AbstractC8629a
    /* renamed from: a */
    public void mo33562a(int i, int i2) {
        if (getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) getParentFragment()).mo30959a(i, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_doc_sub_list, viewGroup, false);
        this.f23361a = inflate;
        return inflate;
    }
}
