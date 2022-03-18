package com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.c */
public class C9820c extends C7667e {

    /* renamed from: a */
    private C10917c f26461a = new C10917c(new C10929e());

    /* renamed from: b */
    private C9823f f26462b;

    /* renamed from: c */
    private DocPermSetInfo f26463c;

    /* renamed from: d */
    private ShareUserInfoResult f26464d;

    /* renamed from: e */
    private String f26465e;

    /* renamed from: f */
    private int f26466f;

    /* renamed from: g */
    private View f26467g;

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        C9823f fVar = this.f26462b;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    /* renamed from: b */
    private void m40538b() {
        C9823f fVar = new C9823f(new C9821d(), new C9822e(getContext(), this.f26461a, this, this.f26467g, this.f26463c), this, getContext(), this.f26461a, this.f26463c, this.f26464d, this.f26465e, this.f26466f);
        this.f26462b = fVar;
        fVar.create();
    }

    /* renamed from: a */
    private void m40537a() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f26463c = (DocPermSetInfo) arguments.getParcelable("permission_doc_info");
            this.f26464d = (ShareUserInfoResult) arguments.getParcelable("collaborator_users");
            this.f26465e = arguments.getString("permission_module");
            this.f26466f = arguments.getInt("permission", 0);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40537a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m40538b();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.permission_fragment_collaborator_manage, viewGroup, false);
        this.f26467g = inflate;
        return inflate;
    }

    /* renamed from: a */
    public static C9820c m40536a(DocPermSetInfo docPermSetInfo, ShareUserInfoResult shareUserInfoResult, String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("permission_doc_info", docPermSetInfo);
        bundle.putParcelable("collaborator_users", shareUserInfoResult);
        bundle.putString("permission_module", str);
        bundle.putInt("permission", i);
        C9820c cVar = new C9820c();
        cVar.setArguments(bundle);
        return cVar;
    }
}
