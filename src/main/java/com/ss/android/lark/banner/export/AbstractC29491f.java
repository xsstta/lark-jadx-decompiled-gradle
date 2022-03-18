package com.ss.android.lark.banner.export;

import com.ss.android.lark.banner.export.entity.AbstractC29485a;
import com.ss.android.lark.banner.export.entity.C29489b;

/* renamed from: com.ss.android.lark.banner.export.f */
public abstract class AbstractC29491f<T extends AbstractC29485a> implements AbstractC29478a {

    /* renamed from: a */
    protected C29489b f73673a;

    /* renamed from: b */
    protected T f73674b;

    /* renamed from: c */
    protected AbstractC29482c f73675c;

    /* renamed from: b */
    public abstract T mo104370b(C29489b bVar);

    @Override // com.ss.android.lark.banner.export.AbstractC29478a
    /* renamed from: c */
    public void mo104441c() {
    }

    /* renamed from: e */
    public void mo104448e() {
        AbstractC29482c cVar = this.f73675c;
        if (cVar != null) {
            cVar.mo104355c();
        }
    }

    /* renamed from: d */
    public String mo104447d() {
        C29489b bVar = this.f73673a;
        if (bVar != null) {
            return bVar.mo104443a();
        }
        return null;
    }

    /* renamed from: f */
    public String mo104449f() {
        AbstractC29482c cVar = this.f73675c;
        if (cVar != null) {
            return cVar.mo104354b();
        }
        return null;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29478a
    /* renamed from: a */
    public void mo104440a(AbstractC29482c cVar) {
        this.f73675c = cVar;
    }

    @Override // com.ss.android.lark.banner.export.AbstractC29478a
    /* renamed from: c */
    public void mo104442c(C29489b bVar) {
        this.f73673a = bVar;
        this.f73674b = mo104370b(bVar);
    }
}
