package com.bytedance.ee.bear.list.share;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.share.b */
public class C8723b extends C7667e {

    /* renamed from: a */
    private View f23582a;

    /* renamed from: b */
    private aj f23583b;

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("HistorySharedFolderFragment", "onDestroy()...");
        aj ajVar = this.f23583b;
        if (ajVar != null) {
            ajVar.destroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C13479a.m54764b("HistorySharedFolderFragment", "onResume()...");
        aj ajVar = this.f23583b;
        if (ajVar != null) {
            ajVar.mo33310k();
        }
    }

    /* renamed from: a */
    private void m36632a() {
        C13479a.m54764b("HistorySharedFolderFragment", "initMVP()...");
        aj ajVar = new aj(new C8728g(getContext(), this.f23582a, this, ar.m20936a()), new C8725d(this, getContext(), ar.m20936a()), getContext(), ar.m20936a(), this);
        this.f23583b = ajVar;
        ajVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m36632a();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.list_fragment_sub_folder_layout, viewGroup, false);
        this.f23582a = inflate;
        return inflate;
    }
}
