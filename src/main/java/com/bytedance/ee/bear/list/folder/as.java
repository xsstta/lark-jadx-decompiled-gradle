package com.bytedance.ee.bear.list.folder;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class as extends C7667e implements AbstractC8315aa {

    /* renamed from: a */
    private View f22481a;

    /* renamed from: b */
    private SubFolderPresenter f22482b;

    /* renamed from: c */
    private String f22483c;

    /* renamed from: d */
    private String f22484d;

    /* renamed from: e */
    private int f22485e;

    /* renamed from: f */
    private String f22486f;

    /* renamed from: g */
    private String f22487g;

    /* renamed from: h */
    private boolean f22488h;

    /* renamed from: i */
    private boolean f22489i;

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SubFolderPresenter subFolderPresenter = this.f22482b;
        if (subFolderPresenter != null) {
            subFolderPresenter.mo33310k();
        }
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8315aa
    /* renamed from: a */
    public void mo32707a() {
        C13479a.m54764b("SubFolderFragment", "finish()...");
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("SubFolderFragment", "onDestroy()...");
        SubFolderPresenter subFolderPresenter = this.f22482b;
        if (subFolderPresenter != null) {
            subFolderPresenter.destroy();
        }
    }

    /* renamed from: b */
    private void m34445b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f22483c = arguments.getString("token", "");
            this.f22484d = arguments.getString("title", getString(R.string.Doc_Facade_Folder));
            this.f22485e = arguments.getInt("depth", 0);
            this.f22488h = arguments.getBoolean("is_external");
            this.f22489i = arguments.getBoolean("is_personal_folder");
            this.f22486f = arguments.getString("current_module", "");
            this.f22487g = arguments.getString("parent_token", "");
        }
    }

    /* renamed from: c */
    private void m34446c() {
        C13479a.m54764b("SubFolderFragment", "initMVP()...");
        SubFolderPresenter subFolderPresenter = new SubFolderPresenter(new ax(getContext(), this.f22481a, this, ar.m20936a(), this.f22483c, this.f22484d, this.f22488h, this.f22489i, this.f22486f, this.f22487g, this.f22485e), new av(this, getContext(), ar.m20936a(), this.f22483c), getContext(), ar.m20936a(), this, this.f22483c, this.f22489i, this.f22485e, this.f22486f, this);
        this.f22482b = subFolderPresenter;
        subFolderPresenter.create();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13479a.m54764b("SubFolderFragment", "onCreate()...");
        m34445b();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C13479a.m54764b("SubFolderFragment", "setUserVisibleHint()...isVisibleToUser = " + z);
        SubFolderPresenter subFolderPresenter = this.f22482b;
        if (subFolderPresenter != null) {
            subFolderPresenter.mo33302a(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m34446c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        SubFolderPresenter subFolderPresenter = this.f22482b;
        if (subFolderPresenter != null) {
            subFolderPresenter.mo32702a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_fragment_sub_folder_layout, viewGroup, false);
        this.f22481a = inflate;
        return inflate;
    }
}
