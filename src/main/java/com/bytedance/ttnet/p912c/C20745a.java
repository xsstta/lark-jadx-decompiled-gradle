package com.bytedance.ttnet.p912c;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ttnet.c.a */
public class C20745a {

    /* renamed from: a */
    private static C20745a f50767a;

    /* renamed from: b */
    private Map<String, C20746b> f50768b = new ConcurrentHashMap();

    /* renamed from: a */
    public static synchronized C20745a m75575a() {
        C20745a aVar;
        synchronized (C20745a.class) {
            if (f50767a == null) {
                f50767a = new C20745a();
            }
            aVar = f50767a;
        }
        return aVar;
    }

    /* renamed from: a */
    public C20747c mo70001a(String str, int i) throws Exception {
        C20746b bVar = new C20746b(str, i);
        this.f50768b.put(bVar.mo70003a(), bVar);
        bVar.mo70008e();
        bVar.mo70005b();
        this.f50768b.remove(bVar.mo70003a());
        return bVar.mo70007d();
    }

    /* renamed from: a */
    public void mo70002a(String str, String str2, int i, int i2, int i3, List<String> list, String str3) {
        C20746b bVar = this.f50768b.get(str);
        if (bVar != null) {
            bVar.mo70004a(new C20747c(i, i2, i3, list, str3));
            bVar.mo70006c();
            this.f50768b.remove(str);
        }
    }
}
