package com.larksuite.component.dybrid.h5core.core.impl;

import com.larksuite.component.dybrid.h5api.api.AbstractC24163f;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.AbstractC24171m;
import com.larksuite.component.dybrid.h5api.api.AbstractC24172n;
import com.larksuite.component.dybrid.h5api.api.H5PluginConfig;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.core.AbstractC24198a;
import com.larksuite.component.dybrid.h5core.p1073b.C24189a;
import com.larksuite.component.dybrid.h5core.p1074c.C24195a;
import com.larksuite.component.dybrid.h5core.p1076d.C24214b;
import com.larksuite.component.dybrid.h5core.p1079g.C24245f;
import com.larksuite.framework.utils.C26252ad;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: com.larksuite.component.dybrid.h5core.core.impl.d */
public class C24209d extends AbstractC24198a implements AbstractC24172n {

    /* renamed from: c */
    private final Stack<AbstractC24168k> f59839c = new Stack<>();

    /* renamed from: d */
    private String f59840d;

    /* renamed from: e */
    private boolean f59841e;

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24172n
    /* renamed from: e */
    public String mo86766e() {
        return this.f59840d;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24172n
    /* renamed from: h */
    public Stack<AbstractC24168k> mo86769h() {
        return this.f59839c;
    }

    public C24209d() {
        this.f59812a = new C24195a();
        m88429i();
    }

    /* renamed from: i */
    private void m88429i() {
        AbstractC24171m n = mo86816n();
        n.mo86762a(new C24245f(this));
        AbstractC24169l a = C24189a.m88341a().mo86795a(H5PluginConfig.Scope.SESSION, n);
        if (a != null) {
            n.mo86762a(a);
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24172n
    /* renamed from: g */
    public AbstractC24168k mo86768g() {
        synchronized (this.f59839c) {
            if (this.f59839c.isEmpty()) {
                return null;
            }
            return this.f59839c.peek();
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24172n
    /* renamed from: f */
    public boolean mo86767f() {
        if (this.f59841e) {
            C24174b.m88301c("H5SessionImpl", "session already exited!");
            return false;
        }
        this.f59841e = true;
        while (!this.f59839c.isEmpty()) {
            this.f59839c.firstElement().mo86736a("h5PageClose", null);
        }
        return true;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24172n
    /* renamed from: a */
    public void mo86763a(String str) {
        this.f59840d = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (com.larksuite.framework.utils.C26252ad.m94993b(com.larksuite.component.dybrid.h5core.p1076d.C24214b.m88460a()) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r5.mo86736a("h5PageCreated", null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return true;
     */
    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24172n
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo86764a(com.larksuite.component.dybrid.h5api.api.AbstractC24168k r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.Stack<com.larksuite.component.dybrid.h5api.api.k> r1 = r4.f59839c
            monitor-enter(r1)
            java.util.Stack<com.larksuite.component.dybrid.h5api.api.k> r2 = r4.f59839c     // Catch:{ all -> 0x003c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x003c }
        L_0x000d:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x0021
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x003c }
            com.larksuite.component.dybrid.h5api.api.k r3 = (com.larksuite.component.dybrid.h5api.api.AbstractC24168k) r3     // Catch:{ all -> 0x003c }
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x003c }
            return r0
        L_0x0021:
            r5.mo86735a(r4)     // Catch:{ all -> 0x003c }
            java.util.Stack<com.larksuite.component.dybrid.h5api.api.k> r0 = r4.f59839c     // Catch:{ all -> 0x003c }
            r0.add(r5)     // Catch:{ all -> 0x003c }
            monitor-exit(r1)     // Catch:{ all -> 0x003c }
            android.content.Context r0 = com.larksuite.component.dybrid.h5core.p1076d.C24214b.m88460a()
            boolean r0 = com.larksuite.framework.utils.C26252ad.m94993b(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "h5PageCreated"
            r1 = 0
            r5.mo86736a(r0, r1)
        L_0x003a:
            r5 = 1
            return r5
        L_0x003c:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.dybrid.h5core.core.impl.C24209d.mo86764a(com.larksuite.component.dybrid.h5api.api.k):boolean");
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24172n
    /* renamed from: b */
    public boolean mo86765b(AbstractC24168k kVar) {
        AbstractC24168k kVar2;
        if (kVar == null) {
            return false;
        }
        if (C26252ad.m94993b(C24214b.m88460a())) {
            kVar.mo86736a("h5PageClosed", null);
        }
        synchronized (this.f59839c) {
            Iterator<AbstractC24168k> it = this.f59839c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    kVar2 = null;
                    break;
                }
                kVar2 = it.next();
                if (kVar2.equals(kVar)) {
                    it.remove();
                    break;
                }
            }
            if (kVar2 != null) {
                kVar2.mo86749d();
                kVar.mo86735a((AbstractC24163f) null);
            }
            if (this.f59839c.isEmpty()) {
                C24210e.m88437g().mo86846b(mo86766e());
            }
        }
        if (kVar2 != null) {
            return true;
        }
        return false;
    }
}
