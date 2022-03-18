package com.bytedance.ee.bear.bitable.card.model.stmodel.p257a;

import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.bitable.card.model.stmodel.a.c */
public class C4528c extends C4533g {

    /* renamed from: a */
    public boolean f13312a;

    /* renamed from: b */
    private boolean f13313b;

    /* renamed from: c */
    private C4535b f13314c;

    /* renamed from: a */
    public C4535b mo17721a() {
        return this.f13314c;
    }

    /* renamed from: e */
    public boolean mo17725e() {
        return this.f13313b;
    }

    /* renamed from: b */
    public Map<String, C4533g> mo17722b() {
        return this.f13314c.mo17777f();
    }

    /* renamed from: c */
    public String mo17723c() {
        return this.f13314c.mo17757a();
    }

    /* renamed from: d */
    public String mo17724d() {
        return this.f13314c.mo17767b();
    }

    public C4528c(C4535b bVar, String str, String str2, EFieldType eFieldType, boolean z, C4535b bVar2, boolean z2, boolean z3) {
        super(bVar, eFieldType, str, str2, z);
        this.f13314c = bVar2;
        this.f13313b = z2;
        this.f13312a = z3;
    }
}
