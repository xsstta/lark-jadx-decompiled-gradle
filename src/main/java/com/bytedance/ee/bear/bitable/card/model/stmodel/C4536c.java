package com.bytedance.ee.bear.bitable.card.model.stmodel;

import com.bytedance.ee.bear.bitable.card.model.enums.EViewType;

/* renamed from: com.bytedance.ee.bear.bitable.card.model.stmodel.c */
public class C4536c {

    /* renamed from: a */
    private C4535b f13350a;

    /* renamed from: b */
    private String f13351b;

    /* renamed from: c */
    private String f13352c;

    /* renamed from: d */
    private EViewType f13353d;

    /* renamed from: a */
    public C4535b mo17791a() {
        return this.f13350a;
    }

    /* renamed from: b */
    public String mo17793b() {
        return this.f13351b;
    }

    /* renamed from: c */
    public EViewType mo17794c() {
        return this.f13353d;
    }

    /* renamed from: d */
    public String mo17795d() {
        return this.f13352c;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (mo17791a() != null) {
            i = mo17791a().hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (mo17793b() != null) {
            i2 = mo17793b().hashCode();
        }
        return i3 + i2;
    }

    /* renamed from: a */
    public void mo17792a(EViewType eViewType) {
        this.f13353d = eViewType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4536c)) {
            return false;
        }
        C4536c cVar = (C4536c) obj;
        if (mo17791a() == null ? cVar.mo17791a() != null : !mo17791a().equals(cVar.mo17791a())) {
            return false;
        }
        if (mo17793b() != null) {
            return mo17793b().equals(cVar.mo17793b());
        }
        if (cVar.mo17793b() == null) {
            return true;
        }
        return false;
    }

    public C4536c(C4535b bVar, String str, String str2, EViewType eViewType) {
        this.f13350a = bVar;
        this.f13351b = str;
        this.f13352c = str2;
        this.f13353d = eViewType;
    }
}
