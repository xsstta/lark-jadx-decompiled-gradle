package com.bytedance.ee.bear.list.folderselect;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.folderselect.C8414j;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.folderselect.h */
public class C8412h extends C7667e implements C8414j.AbstractC8417b {

    /* renamed from: a */
    private View f22678a;

    /* renamed from: b */
    private DocOperateBean f22679b;

    /* renamed from: c */
    private String f22680c;

    /* renamed from: d */
    private boolean f22681d;

    /* renamed from: e */
    private AbstractC8402d f22682e;

    @Override // com.bytedance.ee.bear.list.folderselect.C8414j.AbstractC8417b
    /* renamed from: a */
    public void mo32878a() {
        AbstractC8402d dVar = this.f22682e;
        if (dVar != null) {
            dVar.mo32826a();
        }
    }

    /* renamed from: b */
    private void m34841b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f22679b = (DocOperateBean) arguments.getParcelable("EXTRA_OPERATE_BEAN");
            this.f22680c = arguments.getString("extra_root_title");
            this.f22681d = arguments.getBoolean("extra_show_recent_folder");
            if (this.f22679b == null) {
                this.f22679b = new DocOperateBean();
            }
        }
    }

    /* renamed from: c */
    private void m34842c() {
        new C8414j(getContext(), ar.m20936a(), new C8418k(getContext(), this.f22678a, ar.m20936a(), this.f22679b, this.f22680c), new C8413i(ar.m20936a()), this, this.f22679b, this.f22681d).create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AbstractC8402d) {
            this.f22682e = (AbstractC8402d) context;
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13479a.m54764b("RootFolderSelectFragment", "onCreate()...");
        m34841b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C13479a.m54764b("RootFolderSelectFragment", "onViewCreated()...");
        m34842c();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_fragment_root_folder_select, viewGroup, false);
        this.f22678a = inflate;
        return inflate;
    }

    @Override // com.bytedance.ee.bear.list.folderselect.C8414j.AbstractC8417b
    /* renamed from: a */
    public void mo32879a(int i, String str, String str2, boolean z) {
        AbstractC8402d dVar = this.f22682e;
        if (dVar != null) {
            dVar.mo32827a(i, str, str2, z);
        }
    }

    /* renamed from: a */
    public static C8412h m34840a(Context context, DocOperateBean docOperateBean, String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_OPERATE_BEAN", docOperateBean);
        bundle.putString("extra_root_title", str);
        bundle.putBoolean("extra_show_recent_folder", z);
        return (C8412h) Fragment.instantiate(context, C8412h.class.getName(), bundle);
    }

    @Override // com.bytedance.ee.bear.list.folderselect.C8414j.AbstractC8417b
    /* renamed from: a */
    public void mo32880a(int i, String str, String str2, boolean z, int i2, boolean z2, int i3) {
        AbstractC8402d dVar = this.f22682e;
        if (dVar != null) {
            dVar.mo32828a(i, str, str2, z, i2, z2, i3);
        }
    }
}
