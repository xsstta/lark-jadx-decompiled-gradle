package com.bytedance.ee.bear.list.folderselect;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.facade.common.AbstractC7664b;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.folderselect.C8424n;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.folderselect.l */
public class C8422l extends C7667e implements AbstractC7664b, C8424n.AbstractC8427b {

    /* renamed from: a */
    private View f22705a;

    /* renamed from: b */
    private DocOperateBean f22706b;

    /* renamed from: c */
    private String f22707c;

    /* renamed from: d */
    private boolean f22708d;

    /* renamed from: e */
    private int f22709e;

    /* renamed from: f */
    private String f22710f;

    /* renamed from: g */
    private String f22711g;

    /* renamed from: h */
    private boolean f22712h;

    /* renamed from: i */
    private boolean f22713i;

    /* renamed from: j */
    private int f22714j;

    /* renamed from: k */
    private int f22715k;

    /* renamed from: l */
    private C8424n f22716l;

    /* renamed from: m */
    private AbstractC8402d f22717m;

    @Override // com.bytedance.ee.bear.list.folderselect.C8424n.AbstractC8427b
    /* renamed from: a */
    public void mo32885a() {
        AbstractC8402d dVar = this.f22717m;
        if (dVar != null) {
            dVar.mo32826a();
        }
    }

    @Override // com.bytedance.ee.bear.list.folderselect.C8424n.AbstractC8427b
    /* renamed from: b */
    public void mo32888b() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @Override // com.bytedance.ee.bear.list.folderselect.C8424n.AbstractC8427b
    /* renamed from: c */
    public void mo32889c() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* renamed from: d */
    private void m34870d() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            DocOperateBean docOperateBean = (DocOperateBean) arguments.getParcelable("EXTRA_OPERATE_BEAN");
            this.f22706b = docOperateBean;
            if (docOperateBean == null) {
                this.f22706b = new DocOperateBean();
            }
            this.f22707c = arguments.getString("extra_operate_text");
            this.f22708d = arguments.getBoolean("extra_disable_create_folder");
            this.f22709e = arguments.getInt("folder_type");
            this.f22710f = arguments.getString("dest_token");
            this.f22711g = arguments.getString("dest_name");
            this.f22713i = arguments.getBoolean("is_share_folder");
            this.f22714j = arguments.getInt("permission", 2);
            this.f22712h = arguments.getBoolean("extra_is_dest_external", false);
            this.f22715k = arguments.getInt("extra_owner_type");
        }
    }

    /* renamed from: e */
    private void m34871e() {
        C8424n nVar = new C8424n(this, getContext(), new C8428o(getContext(), this.f22705a, ar.m20936a(), this.f22706b, this.f22707c, this.f22708d, this.f22709e, this.f22711g, this.f22715k, this.f22714j, this.f22713i), new C8423m(ar.m20936a(), this.f22709e, this.f22710f, this.f22715k, this.f22713i), ar.m20936a(), this.f22706b, this, this.f22713i, this.f22710f, this.f22711g, this.f22712h, this.f22715k, this.f22709e);
        this.f22716l = nVar;
        nVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AbstractC8402d) {
            this.f22717m = (AbstractC8402d) context;
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m34870d();
        C13479a.m54764b("SubFolderSelectFragment", "onCreate()...");
    }

    @Override // com.bytedance.ee.bear.list.folderselect.C8424n.AbstractC8427b
    /* renamed from: a */
    public void mo32887a(Intent intent) {
        if (getActivity() != null) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m34871e();
        C13479a.m54764b("SubFolderSelectFragment", "onViewCreated()...");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_fragment_sub_folder_select, viewGroup, false);
        this.f22705a = inflate;
        return inflate;
    }

    @Override // com.bytedance.ee.bear.list.folderselect.C8424n.AbstractC8427b
    /* renamed from: a */
    public void mo32886a(int i, String str, String str2, boolean z, int i2, boolean z2, int i3) {
        AbstractC8402d dVar = this.f22717m;
        if (dVar != null) {
            dVar.mo32828a(i, str, str2, z, i2, z2, i3);
        }
    }

    /* renamed from: a */
    public static C8422l m34869a(DocOperateBean docOperateBean, String str, boolean z, int i, String str2, String str3, boolean z2, int i2, boolean z3, int i3) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_OPERATE_BEAN", docOperateBean);
        bundle.putString("extra_operate_text", str);
        bundle.putBoolean("extra_disable_create_folder", z);
        bundle.putInt("folder_type", i);
        bundle.putString("dest_token", str2);
        bundle.putString("dest_name", str3);
        bundle.putBoolean("is_share_folder", z2);
        bundle.putInt("permission", i2);
        bundle.putBoolean("extra_is_dest_external", z3);
        bundle.putInt("extra_owner_type", i3);
        C8422l lVar = new C8422l();
        lVar.setArguments(bundle);
        return lVar;
    }
}
