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
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

/* renamed from: com.bytedance.ee.bear.list.folder.e */
public class C8358e extends C7667e implements AbstractC8315aa {

    /* renamed from: a */
    private View f22562a;

    /* renamed from: b */
    private FolderDetailPresenter f22563b;

    /* renamed from: c */
    private String f22564c;

    /* renamed from: d */
    private String f22565d;

    /* renamed from: e */
    private String f22566e;

    /* renamed from: f */
    private String f22567f;

    /* renamed from: g */
    private int f22568g;

    /* renamed from: h */
    private String f22569h;

    /* renamed from: i */
    private String f22570i;

    /* renamed from: j */
    private int f22571j;

    /* renamed from: k */
    private boolean f22572k;

    /* renamed from: l */
    private boolean f22573l;

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FolderDetailPresenter folderDetailPresenter = this.f22563b;
        if (folderDetailPresenter != null) {
            folderDetailPresenter.mo33310k();
        }
    }

    @Override // com.bytedance.ee.bear.list.folder.AbstractC8315aa
    /* renamed from: a */
    public void mo32707a() {
        C13479a.m54764b("FolderDetailFragment", "finish()...");
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("FolderDetailFragment", "onDestroy()...");
        FolderDetailPresenter folderDetailPresenter = this.f22563b;
        if (folderDetailPresenter != null) {
            folderDetailPresenter.destroy();
        }
    }

    /* renamed from: b */
    private void m34592b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f22564c = arguments.getString("token", "");
            this.f22565d = arguments.getString("title", getString(R.string.Doc_Facade_Folder));
            this.f22567f = arguments.getString("parent_space_id");
            this.f22568g = arguments.getInt("depth", 0);
            this.f22566e = arguments.getString(ShareHitPoint.f121869d);
            this.f22571j = arguments.getInt("permission");
            this.f22572k = arguments.getBoolean("is_external");
            this.f22573l = arguments.getBoolean("is_personal_folder");
            this.f22569h = arguments.getString("current_module", "");
            this.f22570i = arguments.getString("parent_token", "");
        }
    }

    /* renamed from: c */
    private void m34593c() {
        C13479a.m54764b("FolderDetailFragment", "initMVP()...");
        FolderDetailPresenter folderDetailPresenter = new FolderDetailPresenter(new C8372o(getContext(), this.f22562a, this, ar.m20936a(), this.f22564c, this.f22565d, this.f22571j, this.f22572k, this.f22573l, this.f22569h, this.f22570i, this.f22568g), new C8368k(this, getContext(), ar.m20936a(), this.f22564c, this.f22566e), getContext(), ar.m20936a(), this, this.f22564c, this.f22568g, this.f22567f, this.f22569h, this);
        this.f22563b = folderDetailPresenter;
        folderDetailPresenter.create();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13479a.m54764b("FolderDetailFragment", "onCreate()...");
        m34592b();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C13479a.m54764b("FolderDetailFragment", "setUserVisibleHint()...isVisibleToUser = " + z);
        FolderDetailPresenter folderDetailPresenter = this.f22563b;
        if (folderDetailPresenter != null) {
            folderDetailPresenter.mo33302a(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m34593c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FolderDetailPresenter folderDetailPresenter = this.f22563b;
        if (folderDetailPresenter != null) {
            folderDetailPresenter.mo32647a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_fragment_sub_folder_layout, viewGroup, false);
        this.f22562a = inflate;
        return inflate;
    }
}
