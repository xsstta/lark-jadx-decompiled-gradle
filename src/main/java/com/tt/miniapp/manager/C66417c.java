package com.tt.miniapp.manager;

import android.app.Application;
import com.tt.miniapp.p3289g.p3291b.C66182a;
import com.tt.miniapp.p3289g.p3291b.C66183b;
import com.tt.miniapp.p3289g.p3292c.C66184a;
import com.tt.miniapp.p3289g.p3292c.C66185b;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.tt.miniapp.manager.c */
public class C66417c {

    /* renamed from: a */
    private C66184a f167685a;

    /* renamed from: b */
    private C66182a f167686b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.manager.c$a */
    public static class C66419a {

        /* renamed from: a */
        static final C66417c f167687a = new C66417c();
    }

    /* renamed from: a */
    public static C66417c m259663a() {
        return C66419a.f167687a;
    }

    /* renamed from: b */
    public C66184a mo231955b() {
        return this.f167685a;
    }

    /* renamed from: c */
    public C66182a mo231956c() {
        return this.f167686b;
    }

    private C66417c() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        C66184a aVar = new C66184a(new C66185b(applicationContext));
        this.f167685a = aVar;
        aVar.mo231520d();
        this.f167686b = new C66182a(new C66183b(applicationContext));
    }
}
