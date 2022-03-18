package com.bytedance.ee.bear.middleground.permission.p484d;

import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.audit.C29304b;
import com.ss.android.lark.audit.model.AuditEvent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.d.b */
public class C9899b implements AbstractC9901d {

    /* renamed from: a */
    private final AbstractC9900a f26791a;

    /* renamed from: com.bytedance.ee.bear.middleground.permission.d.b$a */
    public interface AbstractC9900a {
        /* renamed from: a */
        C29304b mo37707a();

        /* renamed from: b */
        void mo37708b();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.p484d.AbstractC9901d
    /* renamed from: a */
    public void mo37705a() {
        C13479a.m54764b("AuditManagerWrapper", "checkInit " + C29304b.m107714b());
        if (!C29304b.m107714b()) {
            this.f26791a.mo37708b();
        }
    }

    public C9899b(AbstractC9900a aVar) {
        this.f26791a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m41204b(AuditEvent auditEvent) {
        mo37705a();
        this.f26791a.mo37707a().mo103855a(auditEvent);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.p484d.AbstractC9901d
    /* renamed from: a */
    public void mo37706a(AuditEvent auditEvent) {
        C11678b.m48477a().scheduleDirect(new Runnable(auditEvent) {
            /* class com.bytedance.ee.bear.middleground.permission.p484d.$$Lambda$b$dwCyYJYraw2t8gSoz_GRpfo0IpU */
            public final /* synthetic */ AuditEvent f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C9899b.lambda$dwCyYJYraw2t8gSoz_GRpfo0IpU(C9899b.this, this.f$1);
            }
        });
    }

    @Override // com.bytedance.ee.bear.middleground.permission.p484d.AbstractC9901d
    /* renamed from: a */
    public int mo37704a(int i) {
        if (C29304b.m107714b()) {
            return this.f26791a.mo37707a().mo103852a(i);
        }
        C13479a.m54764b("AuditManagerWrapper", "checkAuthority: AuditManager is not init");
        C11678b.m48477a().scheduleDirect(new Runnable() {
            /* class com.bytedance.ee.bear.middleground.permission.p484d.$$Lambda$SWOXGtEobtu6MCt_kGb8lBoQTo */

            public final void run() {
                C9899b.this.mo37705a();
            }
        });
        return 3;
    }
}
