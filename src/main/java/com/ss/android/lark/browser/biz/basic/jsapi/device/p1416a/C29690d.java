package com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a;

import android.content.Context;
import android.os.Build;

/* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.a.d */
public class C29690d implements AbstractC29695h {

    /* renamed from: a */
    AbstractC29695h f74382a;

    /* renamed from: b */
    AbstractC29695h f74383b;

    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29695h
    /* renamed from: e */
    public void mo107005e() {
        AbstractC29695h hVar = this.f74382a;
        if (hVar != null) {
            hVar.mo107005e();
        }
        AbstractC29695h hVar2 = this.f74383b;
        if (hVar2 != null) {
            hVar2.mo107005e();
        }
    }

    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29695h
    /* renamed from: a */
    public void mo106998a(long j) {
        AbstractC29695h hVar = this.f74382a;
        if (hVar != null) {
            hVar.mo106998a(j);
        }
        AbstractC29695h hVar2 = this.f74383b;
        if (hVar2 != null) {
            hVar2.mo106998a(j);
        }
    }

    public C29690d(Context context) {
        this.f74382a = new C29686b(context);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f74383b = new C29692f(context);
        }
    }

    @Override // com.ss.android.lark.browser.biz.basic.jsapi.device.p1416a.AbstractC29695h
    /* renamed from: a */
    public void mo107000a(AbstractC29694g gVar) {
        AbstractC29695h hVar = this.f74382a;
        if (hVar != null) {
            hVar.mo107000a(gVar);
        }
        AbstractC29695h hVar2 = this.f74383b;
        if (hVar2 != null) {
            hVar2.mo107000a(gVar);
        }
    }
}
