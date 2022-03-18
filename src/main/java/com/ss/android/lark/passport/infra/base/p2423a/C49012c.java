package com.ss.android.lark.passport.infra.base.p2423a;

import com.ss.android.lark.passport.infra.util.C49148ac;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;

/* renamed from: com.ss.android.lark.passport.infra.base.a.c */
public class C49012c<Data> extends C49011b<AbstractC49352d<Data>> implements AbstractC49352d<Data> {
    public C49012c() {
    }

    public C49012c(AbstractC49352d<Data> dVar) {
        super(dVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
    /* renamed from: a */
    public void mo145178a(final NetworkErrorResult networkErrorResult) {
        C49148ac.m193806a(new Runnable() {
            /* class com.ss.android.lark.passport.infra.base.p2423a.C49012c.RunnableC490142 */

            public void run() {
                if (!C49012c.this.mo171124b()) {
                    if (C49012c.this.f123044a != null) {
                        ((AbstractC49352d) C49012c.this.f123044a).mo145178a(networkErrorResult);
                    }
                    C49012c.this.mo171123a();
                }
            }
        });
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
    /* renamed from: a */
    public void mo145179a(final Data data) {
        C49148ac.m193806a(new Runnable() {
            /* class com.ss.android.lark.passport.infra.base.p2423a.C49012c.RunnableC490131 */

            /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: com.ss.android.lark.passport.signinsdk_api.base.d */
            /* JADX WARN: Multi-variable type inference failed */
            public void run() {
                if (!C49012c.this.mo171124b()) {
                    if (C49012c.this.f123044a != null) {
                        ((AbstractC49352d) C49012c.this.f123044a).mo145179a(data);
                    }
                    C49012c.this.mo171123a();
                }
            }
        });
    }
}
