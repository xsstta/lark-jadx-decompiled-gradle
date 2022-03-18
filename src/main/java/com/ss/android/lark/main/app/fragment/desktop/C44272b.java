package com.ss.android.lark.main.app.fragment.desktop;

import android.os.Bundle;
import android.view.KeyEvent;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.fragment.AbstractC44241b;
import com.ss.android.lark.main.app.fragment.C44274f;
import com.ss.android.lark.maincore.AbstractC44552i;

/* renamed from: com.ss.android.lark.main.app.fragment.desktop.b */
public class C44272b extends AbstractC44241b {
    /* renamed from: f */
    public void mo157349f() {
        C36512a.m144041a().mo134777d();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.ss.android.lark.main.app.fragment.AbstractC44241b, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C44134a.m174959a().mo133202V().mo133301b();
    }

    @Override // com.ss.android.lark.main.app.fragment.AbstractC44241b
    /* renamed from: d */
    public Bundle mo157281d() {
        Bundle bundle = new Bundle();
        bundle.putString("key_tab_view_index", m175608g());
        return bundle;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.ss.android.lark.main.app.fragment.AbstractC44241b, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C36512a.m144041a().mo134771b();
        super.destroy();
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

    /* renamed from: g */
    private String m175608g() {
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
        String string = bundle.getString("key_tab_view_index");
        C44274f.AbstractC44277b bVar = (C44274f.AbstractC44277b) getView();
        if (bVar != null) {
            bVar.mo157311a(string, bundle);
        }
    }

    @Override // com.ss.android.lark.main.app.fragment.AbstractC44241b
    /* renamed from: a */
    public boolean mo157278a(KeyEvent keyEvent) {
        super.mo157278a(keyEvent);
        C44274f.AbstractC44277b bVar = (C44274f.AbstractC44277b) getView();
        if (bVar == null) {
            return false;
        }
        return bVar.mo157315a(keyEvent);
    }

    C44272b(C44274f.AbstractC44275a aVar, C44274f.AbstractC44277b bVar) {
        super(aVar, bVar);
    }
}
