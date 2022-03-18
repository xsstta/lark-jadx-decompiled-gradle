package com.ss.android.vc.meeting.module.tab3.detail.p3172a;

import com.larksuite.framework.mvp.C26033a;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.meeting.module.tab3.detail.VcTab3DetailActivity;
import com.ss.android.vc.meeting.module.tab3.detail.VcTabDetailEntryParam;
import com.ss.android.vc.meeting.module.tab3.detail.p3172a.C63328a;

/* renamed from: com.ss.android.vc.meeting.module.tab3.detail.a.d */
public class C63355d extends C26033a<C63328a.AbstractC63329a, C63328a.AbstractC63332b> {
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C63328a.AbstractC63332b mo219257c() {
        return (C63328a.AbstractC63332b) mo92551a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C63328a.AbstractC63329a mo219258d() {
        return (C63328a.AbstractC63329a) mo92554b();
    }

    /* renamed from: a */
    public void mo92553a(C63328a.AbstractC63332b bVar, C63328a.AbstractC63329a aVar) {
        super.mo92553a((IView) bVar, (IModel) aVar);
        bVar.mo219186a(aVar);
        aVar.mo219170a(bVar);
    }

    public C63355d(VcTab3DetailActivity vcTab3DetailActivity, VcTabDetailEntryParam vcTabDetailEntryParam) {
        C63349c cVar = new C63349c(vcTabDetailEntryParam);
        C63334b bVar = new C63334b(vcTab3DetailActivity);
        mo92553a((C63328a.AbstractC63332b) bVar, (C63328a.AbstractC63329a) cVar);
        bVar.setViewDelegate(new C63356e(this));
    }
}
