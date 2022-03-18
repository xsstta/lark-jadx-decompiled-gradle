package com.bytedance.ee.bear.middleground.permission.setting.doc.p490a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.a.b */
public class C9946b extends C7667e {

    /* renamed from: a */
    private C10917c f26889a = new C10917c(new C10929e());

    /* renamed from: b */
    private DocPermSetInfo f26890b;

    /* renamed from: c */
    private String f26891c;

    /* renamed from: d */
    private View f26892d;

    /* renamed from: a */
    private void m41405a() {
        new C9948d(new C9947c(this, this.f26890b), m41404a(this.f26890b)).create();
    }

    /* renamed from: b */
    private void m41406b() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f26890b = (DocPermSetInfo) arguments.getParcelable("permission_doc_info");
            this.f26891c = arguments.getString("permission_module");
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m41406b();
    }

    /* renamed from: a */
    private C9951e m41404a(DocPermSetInfo docPermSetInfo) {
        boolean ab = docPermSetInfo.ab();
        if (!docPermSetInfo.mo38844q() || !ab) {
            return new C9951e(getContext(), this, this.f26889a, this.f26890b, this.f26891c, this.f26892d);
        }
        return new C9960h(getContext(), this, this.f26889a, this.f26890b, this.f26891c, this.f26892d);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m41405a();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.share_fragment_set_doc_permission, viewGroup, false);
        this.f26892d = inflate;
        return inflate;
    }
}
