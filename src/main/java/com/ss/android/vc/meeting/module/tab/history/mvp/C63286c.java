package com.ss.android.vc.meeting.module.tab.history.mvp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.larksuite.framework.mvp.C26033a;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.meeting.module.tab.history.mvp.C63278a;

/* renamed from: com.ss.android.vc.meeting.module.tab.history.mvp.c */
public class C63286c extends C26033a<C63278a.AbstractC63279a, C63278a.AbstractC63281b> {
    @Override // com.larksuite.framework.mvp.C26033a, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    /* renamed from: c */
    public C63278a.AbstractC63281b mo219020c() {
        return (C63278a.AbstractC63281b) mo92551a();
    }

    /* renamed from: d */
    public C63278a.AbstractC63279a mo219021d() {
        return (C63278a.AbstractC63279a) mo92554b();
    }

    /* renamed from: a */
    public void mo92553a(C63278a.AbstractC63281b bVar, C63278a.AbstractC63279a aVar) {
        super.mo92553a((IView) bVar, (IModel) aVar);
        bVar.mo219008a(aVar);
        aVar.mo218998a(bVar);
    }

    public C63286c(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C63283b bVar = new C63283b();
        C63287d dVar = new C63287d(activity, layoutInflater, viewGroup);
        mo92553a((C63278a.AbstractC63281b) dVar, (C63278a.AbstractC63279a) bVar);
        dVar.setViewDelegate(new C63291e(this));
    }
}
