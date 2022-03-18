package com.bytedance.ee.bear.list.share;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.share.aa */
public class C8709aa extends C7667e {

    /* renamed from: a */
    private View f23556a;

    /* renamed from: b */
    private aj f23557b;

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        aj ajVar = this.f23557b;
        if (ajVar != null) {
            ajVar.mo33310k();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("ShareFolderFragment", "onDestroy()...");
        aj ajVar = this.f23557b;
        if (ajVar != null) {
            ajVar.destroy();
        }
    }

    /* renamed from: a */
    private void m36464a() {
        C13479a.m54764b("ShareFolderFragment", "initMVP()...");
        aj ajVar = new aj(new ak(getContext(), this.f23556a, this, ar.m20936a()), new C8716ai(this, getContext(), ar.m20936a()), getContext(), ar.m20936a(), this);
        this.f23557b = ajVar;
        ajVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C13479a.m54764b("ShareFolderFragment", "setUserVisibleHint()...isVisibleToUser = " + z);
        aj ajVar = this.f23557b;
        if (ajVar != null) {
            ajVar.mo33302a(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m36464a();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_fragment_sub_folder_layout, viewGroup, false);
        this.f23556a = inflate;
        return inflate;
    }
}
