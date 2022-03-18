package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.p */
public class C10076p extends C7667e {

    /* renamed from: a */
    private C10917c f27219a = new C10917c(new C10929e());

    /* renamed from: b */
    private View f27220b;

    /* renamed from: c */
    private FolderPermSetInfo f27221c;

    /* renamed from: d */
    private String f27222d;

    /* renamed from: e */
    private C10079s f27223e;

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        C10079s sVar = this.f27223e;
        if (sVar != null) {
            sVar.destroy();
        }
    }

    /* renamed from: a */
    private void m41925a() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27221c = (FolderPermSetInfo) arguments.getParcelable("permission_doc_info");
            this.f27222d = arguments.getString("module");
        }
    }

    /* renamed from: b */
    private void m41926b() {
        C10079s sVar = new C10079s(new C10078r(this.f27219a, this.f27221c.mo38883s()), new C10085t(getContext(), this.f27219a, this.f27220b, this.f27221c), getContext(), this.f27219a, this.f27221c, this.f27222d);
        this.f27223e = sVar;
        sVar.create();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m41925a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m41926b();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.link_share_set_view, viewGroup, false);
        this.f27220b = inflate;
        return inflate;
    }
}
