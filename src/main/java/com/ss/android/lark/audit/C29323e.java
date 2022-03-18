package com.ss.android.lark.audit;

import com.ss.android.lark.audit.db.AbstractC29318e;
import com.ss.android.lark.audit.db.C29319f;
import com.ss.android.lark.audit.model.AuditEvent;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.lark.audit.e */
public class C29323e {

    /* renamed from: a */
    private C29319f<AuditEvent> f73374a;

    /* renamed from: a */
    public void mo103903a(AbstractC29318e<AuditEvent> eVar) {
        this.f73374a.mo103898a(eVar);
    }

    /* renamed from: a */
    public void mo103904a(AuditEvent auditEvent) {
        this.f73374a.mo103897a(auditEvent);
    }

    public C29323e(Executor executor, AbstractC29324f fVar) {
        this.f73374a = new C29319f<>(C29323e.class.getSimpleName(), new C29307c(), executor, fVar);
    }
}
