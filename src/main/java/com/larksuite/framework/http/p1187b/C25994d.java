package com.larksuite.framework.http.p1187b;

import com.larksuite.framework.http.p1187b.AbstractC25990b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.larksuite.framework.http.b.d */
public class C25994d {

    /* renamed from: a */
    private AbstractC25990b f64357a;

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.http.b.d$a */
    public static final class C25996a {

        /* renamed from: a */
        public static final C25994d f64358a = new C25994d();
    }

    /* renamed from: b */
    public static C25994d m94103b() {
        return C25996a.f64358a;
    }

    /* renamed from: a */
    public AbstractC25990b mo92425a() {
        return this.f64357a;
    }

    private C25994d() {
        AbstractC25990b.C25991a aVar = new AbstractC25990b.C25991a();
        aVar.mo92417a(15000, TimeUnit.MILLISECONDS).mo92422b(10000, TimeUnit.MILLISECONDS).mo92423c(30000, TimeUnit.MICROSECONDS);
        this.f64357a = aVar.mo92421a();
    }
}
