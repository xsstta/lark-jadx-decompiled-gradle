package com.bytedance.ee.bear.bitable.card.model.stmodel.p257a;

import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;

/* renamed from: com.bytedance.ee.bear.bitable.card.model.stmodel.a.g */
public class C4533g {

    /* renamed from: a */
    private C4535b f13328a;

    /* renamed from: b */
    private EFieldType f13329b;

    /* renamed from: c */
    private String f13330c;

    /* renamed from: d */
    private String f13331d;

    /* renamed from: e */
    private boolean f13332e;

    /* renamed from: f */
    private String f13333f;

    /* renamed from: f */
    public C4535b mo17748f() {
        return this.f13328a;
    }

    /* renamed from: g */
    public String mo17749g() {
        return this.f13330c;
    }

    /* renamed from: h */
    public String mo17750h() {
        return this.f13331d;
    }

    /* renamed from: i */
    public EFieldType mo17752i() {
        return this.f13329b;
    }

    /* renamed from: j */
    public boolean mo17753j() {
        return this.f13332e;
    }

    /* renamed from: k */
    public String mo17754k() {
        return this.f13333f;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (mo17748f() != null) {
            i = mo17748f().hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (mo17749g() != null) {
            i2 = mo17749g().hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "STField{table=" + this.f13328a + ", fieldId='" + this.f13330c + '\'' + '}';
    }

    /* renamed from: c */
    public void mo17746c(String str) {
        this.f13333f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4533g)) {
            return false;
        }
        C4533g gVar = (C4533g) obj;
        if (mo17748f() == null ? gVar.mo17748f() != null : !mo17748f().equals(gVar.mo17748f())) {
            return false;
        }
        if (mo17749g() != null) {
            return mo17749g().equals(gVar.mo17749g());
        }
        if (gVar.mo17749g() == null) {
            return true;
        }
        return false;
    }

    public C4533g(C4535b bVar, EFieldType eFieldType, String str, String str2, boolean z) {
        this.f13328a = bVar;
        this.f13330c = str;
        this.f13331d = str2;
        this.f13329b = eFieldType;
        this.f13332e = z;
    }
}
