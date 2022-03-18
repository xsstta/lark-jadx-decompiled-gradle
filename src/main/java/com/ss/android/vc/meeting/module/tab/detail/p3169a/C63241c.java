package com.ss.android.vc.meeting.module.tab.detail.p3169a;

import com.larksuite.framework.mvp.C26033a;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.meeting.module.tab.detail.VcTabDetailActivity;
import com.ss.android.vc.meeting.module.tab.detail.VcTabDetailEntryParam;
import com.ss.android.vc.meeting.module.tab.detail.p3169a.C63230a;

/* renamed from: com.ss.android.vc.meeting.module.tab.detail.a.c */
public class C63241c extends C26033a<C63230a.AbstractC63231a, C63230a.AbstractC63234b> {
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C63230a.AbstractC63234b mo218904c() {
        return (C63230a.AbstractC63234b) mo92551a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C63230a.AbstractC63231a mo218905d() {
        return (C63230a.AbstractC63231a) mo92554b();
    }

    /* renamed from: a */
    public void mo92553a(C63230a.AbstractC63234b bVar, C63230a.AbstractC63231a aVar) {
        super.mo92553a((IView) bVar, (IModel) aVar);
        bVar.mo218869a(aVar);
        aVar.mo218856a(bVar);
    }

    public C63241c(VcTabDetailActivity vcTabDetailActivity, VcTabDetailEntryParam vcTabDetailEntryParam) {
        C63236b bVar = new C63236b(vcTabDetailEntryParam);
        C63242d dVar = new C63242d(vcTabDetailActivity);
        mo92553a((C63230a.AbstractC63234b) dVar, (C63230a.AbstractC63231a) bVar);
        dVar.setViewDelegate(new C63260e(this));
    }
}
