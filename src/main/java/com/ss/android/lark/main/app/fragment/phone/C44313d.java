package com.ss.android.lark.main.app.fragment.phone;

import android.os.Bundle;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.app.fragment.AbstractC44241b;
import com.ss.android.lark.main.app.fragment.C44274f;
import com.ss.android.lark.maincore.AbstractC44552i;

/* renamed from: com.ss.android.lark.main.app.fragment.phone.d */
public class C44313d extends AbstractC44241b {
    @Override // com.ss.android.lark.main.app.fragment.AbstractC44241b
    /* renamed from: d */
    public Bundle mo157281d() {
        Bundle bundle = new Bundle();
        bundle.putString("key_tab_view_index", m175816f());
        return bundle;
    }

    @Override // com.ss.android.lark.main.app.fragment.AbstractC44241b
    /* renamed from: e */
    public boolean mo157282e() {
        AbstractC44552i b;
        C44274f.AbstractC44277b bVar = (C44274f.AbstractC44277b) getView();
        if (bVar == null || (b = bVar.mo157316b()) == null) {
            return false;
        }
        return b.mo31314e();
    }

    /* renamed from: f */
    private String m175816f() {
        C44274f.AbstractC44277b bVar = (C44274f.AbstractC44277b) getView();
        if (bVar == null) {
            return "";
        }
        if (bVar.mo157316b() != null) {
            return bVar.mo157316b().mo31311b();
        }
        Log.m165383e("MainModule_MainTabPresenter", "getCurrentShowingTab failed: spec is null");
        return "";
    }

    @Override // com.ss.android.lark.main.app.fragment.AbstractC44241b
    /* renamed from: a */
    public void mo157276a(Bundle bundle) {
        C44274f.AbstractC44277b bVar = (C44274f.AbstractC44277b) getView();
        if (bVar != null) {
            bVar.mo157311a(bundle.getString("key_tab_view_index"), bundle);
        }
    }

    C44313d(C44274f.AbstractC44275a aVar, C44274f.AbstractC44277b bVar) {
        super(aVar, bVar);
    }
}
