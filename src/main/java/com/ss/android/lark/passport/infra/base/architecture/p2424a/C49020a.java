package com.ss.android.lark.passport.infra.base.architecture.p2424a;

import com.larksuite.framework.callback.CallbackManager;
import com.ss.android.lark.passport.infra.base.p2423a.C49010a;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;

/* renamed from: com.ss.android.lark.passport.infra.base.architecture.a.a */
public class C49020a implements AbstractC49025e {

    /* renamed from: a */
    public UniContext f123074a;

    /* renamed from: b */
    public PassportLog f123075b;

    /* renamed from: c */
    private C49010a f123076c;

    /* renamed from: d */
    private CallbackManager f123077d;

    /* renamed from: e */
    private AbstractC49347c f123078e;

    public UniContext ci_() {
        return this.f123074a;
    }

    public C49010a cw_() {
        return this.f123076c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public CallbackManager mo171176d() {
        return this.f123077d;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f123076c = new C49010a();
        this.f123077d = new CallbackManager();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        C49010a aVar = this.f123076c;
        if (aVar != null) {
            aVar.mo171121a();
        }
        CallbackManager callbackManager = this.f123077d;
        if (callbackManager != null) {
            callbackManager.cancelCallbacks();
        }
    }

    /* renamed from: f */
    public void mo171177f() {
        AbstractC49347c cVar = this.f123078e;
        if (cVar != null && !cVar.mo171124b()) {
            this.f123078e.mo171123a();
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e
    /* renamed from: a */
    public void mo171170a(PassportLog passportLog) {
        this.f123075b = passportLog;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e
    /* renamed from: a */
    public synchronized void mo171172a(UniContext uniContext) {
        this.f123074a = uniContext;
    }

    /* renamed from: a */
    public void mo171171a(AbstractC49347c cVar) {
        if (cVar != null) {
            this.f123078e = cVar;
        }
        cw_().mo171122a(cVar);
    }
}
