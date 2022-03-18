package com.bytedance.ee.bear.list.folder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.folder.an;
import com.bytedance.ee.bear.list.homepage.AbstractC8463b;
import com.bytedance.ee.bear.list.homepage.AbstractC8473d;
import com.bytedance.ee.bear.list.homepage.AbstractC8476f;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;

public class MyRootFolderFragment extends C7667e implements an.AbstractC8327a, AbstractC8473d {

    /* renamed from: a */
    private View f22463a;

    /* renamed from: b */
    private MyRootFolderPresenter f22464b;

    /* renamed from: c */
    private AbstractC8320ae f22465c;

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MyRootFolderPresenter myRootFolderPresenter = this.f22464b;
        if (myRootFolderPresenter != null) {
            myRootFolderPresenter.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MyRootFolderPresenter myRootFolderPresenter = this.f22464b;
        if (myRootFolderPresenter != null) {
            myRootFolderPresenter.mo33310k();
        }
    }

    @Override // com.bytedance.ee.bear.list.folder.an.AbstractC8327a
    /* renamed from: a */
    public void mo32692a() {
        if (getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) getParentFragment()).y_();
        }
    }

    /* renamed from: c */
    private void m34306c() {
        this.f22465c = new an(getContext(), this.f22463a, this, ar.m20936a(), this);
        MyRootFolderPresenter myRootFolderPresenter = new MyRootFolderPresenter(this.f22465c, new am(this, getContext(), ar.m20936a()), getContext(), ar.m20936a(), this);
        this.f22464b = myRootFolderPresenter;
        myRootFolderPresenter.create();
    }

    @Override // com.bytedance.ee.bear.list.folder.an.AbstractC8327a
    /* renamed from: b */
    public void mo32696b() {
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
        AbstractC8320ae aeVar = this.f22465c;
        if (aeVar != null) {
            aeVar.mo32716a(smartRefreshLayout);
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8473d
    /* renamed from: a */
    public void mo32695a(AbstractC27129h hVar) {
        MyRootFolderPresenter myRootFolderPresenter = this.f22464b;
        if (myRootFolderPresenter != null) {
            myRootFolderPresenter.mo33313o();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.list.homepage.AbstractC8473d
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        MyRootFolderPresenter myRootFolderPresenter = this.f22464b;
        if (myRootFolderPresenter != null) {
            myRootFolderPresenter.mo33302a(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m34306c();
    }

    @Override // com.bytedance.ee.bear.list.folder.an.AbstractC8327a
    /* renamed from: a */
    public void mo32693a(int i, int i2) {
        if (getParentFragment() instanceof AbstractC8463b) {
            ((AbstractC8463b) getParentFragment()).mo30959a(i, i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_doc_sub_list, viewGroup, false);
        this.f22463a = inflate;
        return inflate;
    }
}
