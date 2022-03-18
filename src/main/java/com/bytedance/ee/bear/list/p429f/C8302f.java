package com.bytedance.ee.bear.list.p429f;

import android.os.Bundle;
import android.view.View;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.p380a.C7663b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.f.f */
public class C8302f extends C7663b {

    /* renamed from: c */
    private C8297d f22435c;

    /* renamed from: d */
    private View f22436d;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b
    /* renamed from: d */
    public void mo30115d() {
        super.mo30115d();
        C8297d dVar = this.f22435c;
        if (dVar != null) {
            dVar.mo33302a(true);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b
    /* renamed from: f */
    public void mo30117f() {
        super.mo30117f();
        C13479a.m54764b("PinFragment", "onResume()...");
        C8297d dVar = this.f22435c;
        if (dVar != null) {
            dVar.mo33310k();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.p380a.C7662a, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("PinFragment", "onDestroy()...");
        C8297d dVar = this.f22435c;
        if (dVar != null) {
            dVar.destroy();
        }
    }

    /* renamed from: a */
    private void m34218a() {
        C13479a.m54764b("PinFragment", "initMVP()...");
        C8297d dVar = new C8297d(new C8303g(getContext(), this.f22436d, this, ar.m20936a()), new C8296c(this, getContext(), ar.m20936a()), getContext(), ar.m20936a(), this);
        this.f22435c = dVar;
        dVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b
    /* renamed from: b */
    public void mo30113b(Bundle bundle) {
        super.mo30113b(bundle);
        C13479a.m54764b("PinFragment", "onCreateViewLazy()...");
        View inflate = View.inflate(getContext(), R.layout.list_doc_sub_list, null);
        this.f22436d = inflate;
        mo30109a(inflate);
        m34218a();
    }
}
