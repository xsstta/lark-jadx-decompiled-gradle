package com.tt.miniapp.streamloader.p3330a;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tt.miniapp.streamloader.a.g */
public class C66874g {

    /* renamed from: a */
    private ConcurrentHashMap<String, C66875a> f168698a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public void mo232853a() {
    }

    /* renamed from: com.tt.miniapp.streamloader.a.g$a */
    class C66875a {

        /* renamed from: a */
        String f168699a;

        /* renamed from: b */
        byte[] f168700b;

        C66875a() {
        }
    }

    /* renamed from: a */
    public String mo232852a(String str, byte[] bArr) {
        C66875a aVar = this.f168698a.get(str);
        if (aVar == null) {
            aVar = new C66875a();
            aVar.f168700b = bArr;
            aVar.f168699a = new String(bArr);
            this.f168698a.put(str, aVar);
        }
        return aVar.f168699a;
    }
}
