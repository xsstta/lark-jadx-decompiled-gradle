package com.ss.android.lark.p2989x.p2991b;

import com.ss.android.lark.biz.core.api.an;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.x.b.c */
public class C59354c {

    /* renamed from: a */
    private static final Object f147351a = new Object();

    /* renamed from: b */
    private Map<an, Object> f147352b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.x.b.c$a */
    public static class C59356a {

        /* renamed from: a */
        static C59354c f147353a = new C59354c();
    }

    /* renamed from: a */
    public static C59354c m230413a() {
        return C59356a.f147353a;
    }

    private C59354c() {
        this.f147352b = new ConcurrentHashMap();
    }

    /* renamed from: b */
    public void mo201707b() {
        for (an anVar : this.f147352b.keySet()) {
            if (anVar != null) {
                anVar.mo103104a();
            }
        }
    }

    /* renamed from: c */
    public void mo201709c() {
        for (an anVar : this.f147352b.keySet()) {
            if (anVar != null) {
                anVar.mo103105b();
            }
        }
    }

    /* renamed from: a */
    public void mo201706a(an anVar) {
        if (anVar != null) {
            this.f147352b.put(anVar, f147351a);
        }
    }

    /* renamed from: b */
    public void mo201708b(an anVar) {
        if (anVar != null) {
            this.f147352b.remove(anVar);
        }
    }
}
