package com.bytedance.ee.bear.list.create;

import com.bytedance.ee.bear.service.C10917c;

/* renamed from: com.bytedance.ee.bear.list.create.e */
public class C8237e {

    /* renamed from: a */
    private C10917c f22214a;

    /* renamed from: b */
    private C8229c f22215b;

    /* renamed from: a */
    public C10917c mo32333a() {
        return this.f22214a;
    }

    /* renamed from: b */
    public String mo32334b() {
        return this.f22215b.mo32317a();
    }

    /* renamed from: c */
    public String mo32335c() {
        return this.f22215b.mo32320b();
    }

    /* renamed from: d */
    public String mo32336d() {
        return this.f22215b.mo32322c();
    }

    /* renamed from: e */
    public boolean mo32337e() {
        return this.f22215b.mo32324d();
    }

    public C8237e(C10917c cVar, String str, String str2, String str3) {
        this(cVar, str, str2, str3, false);
    }

    public C8237e(C10917c cVar, String str, String str2, String str3, boolean z) {
        this.f22214a = cVar;
        C8229c cVar2 = new C8229c();
        this.f22215b = cVar2;
        cVar2.mo32321b(str2);
        this.f22215b.mo32318a(str);
        this.f22215b.mo32323c(str3);
        this.f22215b.mo32319a(z);
    }
}
