package com.ss.android.lark.apihandler.basic.jsapi.device.p1352a;

import android.content.Context;
import android.os.Build;

/* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.a.d */
public class C28757d implements AbstractC28762h {

    /* renamed from: a */
    AbstractC28762h f72314a;

    /* renamed from: b */
    AbstractC28762h f72315b;

    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28762h
    /* renamed from: e */
    public void mo102252e() {
        AbstractC28762h hVar = this.f72314a;
        if (hVar != null) {
            hVar.mo102252e();
        }
        AbstractC28762h hVar2 = this.f72315b;
        if (hVar2 != null) {
            hVar2.mo102252e();
        }
    }

    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28762h
    /* renamed from: a */
    public void mo102245a(long j) {
        AbstractC28762h hVar = this.f72314a;
        if (hVar != null) {
            hVar.mo102245a(j);
        }
        AbstractC28762h hVar2 = this.f72315b;
        if (hVar2 != null) {
            hVar2.mo102245a(j);
        }
    }

    public C28757d(Context context) {
        this.f72314a = new C28753b(context);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f72315b = new C28759f(context);
        }
    }

    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28762h
    /* renamed from: a */
    public void mo102247a(AbstractC28761g gVar) {
        AbstractC28762h hVar = this.f72314a;
        if (hVar != null) {
            hVar.mo102247a(gVar);
        }
        AbstractC28762h hVar2 = this.f72315b;
        if (hVar2 != null) {
            hVar2.mo102247a(gVar);
        }
    }
}
