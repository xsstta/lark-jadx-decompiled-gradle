package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.d */
public class C10028d extends C7667e {

    /* renamed from: a */
    private View f27112a;

    /* renamed from: b */
    private DocPermSetInfo f27113b;

    /* renamed from: c */
    private String f27114c;

    /* renamed from: d */
    private C10031g f27115d;

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        C10031g gVar = this.f27115d;
        if (gVar != null) {
            gVar.destroy();
        }
    }

    /* renamed from: a */
    private void m41727a() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27113b = (DocPermSetInfo) arguments.getParcelable("permission_doc_info");
            this.f27114c = arguments.getString("module");
        }
    }

    /* renamed from: b */
    private void m41728b() {
        C10031g gVar = new C10031g(new C10030f(), new C10025c(getContext(), this.f27112a, this.f27113b), this, this.f27113b, this.f27114c);
        this.f27115d = gVar;
        gVar.create();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m41727a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m41728b();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.link_share_set_view, viewGroup, false);
        this.f27112a = inflate;
        return inflate;
    }
}
