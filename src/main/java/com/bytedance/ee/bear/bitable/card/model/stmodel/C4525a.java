package com.bytedance.ee.bear.bitable.card.model.stmodel;

import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.model.stmodel.a */
public class C4525a {

    /* renamed from: a */
    private C4535b f13299a;

    /* renamed from: b */
    private String f13300b;

    /* renamed from: c */
    private String f13301c;

    /* renamed from: d */
    private String f13302d;

    /* renamed from: e */
    private boolean f13303e;

    /* renamed from: f */
    private boolean f13304f;

    /* renamed from: g */
    private boolean f13305g;

    /* renamed from: h */
    private boolean f13306h;

    /* renamed from: i */
    private List<C4537a> f13307i;

    /* renamed from: a */
    public C4535b mo17705a() {
        return this.f13299a;
    }

    /* renamed from: b */
    public String mo17707b() {
        return this.f13300b;
    }

    /* renamed from: c */
    public String mo17708c() {
        return this.f13301c;
    }

    /* renamed from: d */
    public String mo17709d() {
        return this.f13302d;
    }

    /* renamed from: e */
    public boolean mo17710e() {
        return this.f13303e;
    }

    /* renamed from: f */
    public boolean mo17712f() {
        return this.f13304f;
    }

    /* renamed from: g */
    public boolean mo17713g() {
        return this.f13306h;
    }

    /* renamed from: h */
    public List<C4537a> mo17714h() {
        return this.f13307i;
    }

    /* renamed from: i */
    public boolean mo17716i() {
        return this.f13305g;
    }

    public String toString() {
        return this.f13300b;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (mo17705a() != null) {
            i = mo17705a().hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (mo17707b() != null) {
            i2 = mo17707b().hashCode();
        }
        return i3 + i2;
    }

    /* renamed from: a */
    public void mo17706a(List<C4537a> list) {
        this.f13307i = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4525a)) {
            return false;
        }
        C4525a aVar = (C4525a) obj;
        if (mo17705a() == null || aVar.mo17705a() == null || mo17705a().mo17767b() == null || !mo17705a().mo17767b().equals(aVar.mo17705a().mo17767b())) {
            return false;
        }
        if (mo17707b() != null) {
            return mo17707b().equals(aVar.mo17707b());
        }
        if (aVar.mo17707b() == null) {
            return true;
        }
        return false;
    }

    public C4525a(C4535b bVar, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f13299a = bVar;
        this.f13300b = str;
        this.f13301c = str2;
        this.f13302d = str3;
        this.f13303e = z;
        this.f13304f = z2;
        this.f13306h = z3;
        this.f13305g = z4;
    }
}
