package com.bytedance.ee.bear.browser.plugin;

import android.content.res.Configuration;
import com.bytedance.ee.bear.browser.C4927f;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.browser.plugin.j */
public class C4949j {

    /* renamed from: a */
    static final /* synthetic */ boolean f14524a = true;

    /* renamed from: b */
    private static volatile C4949j f14525b;

    /* renamed from: c */
    private final LinkedHashMap<C4943e.AbstractC4944a, C4943e> f14526c = new LinkedHashMap<>();

    private C4949j() {
    }

    /* renamed from: b */
    public List<C4943e> mo19581b() {
        return new ArrayList(this.f14526c.values());
    }

    /* renamed from: a */
    public static C4949j m20465a() {
        if (f14525b == null) {
            synchronized (C4949j.class) {
                if (f14525b == null) {
                    f14525b = new C4949j();
                }
            }
        }
        return f14525b;
    }

    /* renamed from: a */
    public void mo19577a(C4943e.AbstractC4944a aVar) {
        C13479a.m54764b("PluginRuntime", "destroyHost");
        C4943e remove = this.f14526c.remove(aVar);
        if (f14524a || remove != null) {
            remove.mo19568j();
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void mo19578a(C4943e.AbstractC4944a aVar, Configuration configuration) {
        C4943e eVar = this.f14526c.get(aVar);
        if (eVar != null) {
            eVar.mo19542a(configuration);
        }
    }

    /* renamed from: a */
    private C4946h m20464a(C4943e eVar, AbstractC4948i iVar) {
        C4946h hVar;
        if (iVar != null) {
            hVar = iVar.mo17011a(eVar);
        } else {
            hVar = null;
        }
        if (hVar == null) {
            return C4946h.m20453a(new C4946h.C4947a[0]);
        }
        return hVar;
    }

    /* renamed from: b */
    private C4943e m20466b(C4943e.AbstractC4945b bVar, C4943e.AbstractC4944a aVar) {
        C4943e eVar;
        if (bVar != null) {
            eVar = bVar.createPluginHost();
        } else {
            eVar = new C4943e();
        }
        this.f14526c.put(aVar, eVar);
        return eVar;
    }

    /* renamed from: b */
    public void mo19582b(C4943e.AbstractC4944a aVar, AbstractC4958n nVar) {
        C4943e eVar = this.f14526c.get(aVar);
        if (f14524a || eVar != null) {
            eVar.mo19554b(nVar);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public C4943e mo19576a(C4943e.AbstractC4945b bVar, C4943e.AbstractC4944a aVar) {
        C13479a.m54764b("PluginRuntime", "createHost");
        C4943e b = m20466b(bVar, aVar);
        b.mo19544a(aVar);
        C4946h a = m20464a(b, aVar.mo19326b());
        C4927f.f14484b = System.currentTimeMillis();
        b.mo19546a(a);
        C4927f.f14485c = System.currentTimeMillis();
        return b;
    }

    /* renamed from: a */
    public void mo19579a(C4943e.AbstractC4944a aVar, AbstractC4958n nVar) {
        C4943e eVar = this.f14526c.get(aVar);
        if (f14524a || eVar != null) {
            if (nVar.mo19604i() == null) {
                nVar.mo19591a((AbstractC4958n.AbstractC4959a) new C4939a(nVar));
            }
            eVar.mo19548a(nVar);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void mo19580a(C4943e.AbstractC4944a aVar, boolean z) {
        C4943e eVar = this.f14526c.get(aVar);
        if (eVar != null) {
            eVar.mo19550a(z);
        }
    }
}
