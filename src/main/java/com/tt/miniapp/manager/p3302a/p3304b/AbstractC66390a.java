package com.tt.miniapp.manager.p3302a.p3304b;

import android.content.Context;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.event.C66016a;

/* renamed from: com.tt.miniapp.manager.a.b.a */
public abstract class AbstractC66390a {

    /* renamed from: a */
    protected AbstractC66390a f167610a;

    /* renamed from: b */
    protected C66391b f167611b;

    /* renamed from: c */
    protected Context f167612c;

    /* renamed from: a */
    public abstract C66391b mo231908a(Context context, C66391b bVar);

    /* renamed from: a */
    public void mo231909a(IAppContext iAppContext) {
        mo231908a(this.f167612c, this.f167611b);
        C66016a.m258510a(this.f167611b.f167613a, iAppContext);
    }

    /* renamed from: a */
    public void mo231910a(AbstractC66390a aVar) {
        C66391b bVar;
        Context context = this.f167612c;
        if (context == null || (bVar = this.f167611b) == null) {
            throw new IllegalArgumentException("first handler not call setInitialParam, or param is null");
        }
        aVar.f167612c = context;
        aVar.f167611b = mo231908a(this.f167612c, bVar);
        this.f167610a = aVar;
    }

    /* renamed from: b */
    public void mo231911b(Context context, C66391b bVar) {
        this.f167612c = context;
        bVar.f167617e = true;
        this.f167611b = bVar;
    }
}
