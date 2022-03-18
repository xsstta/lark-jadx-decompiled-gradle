package com.bytedance.ee.bear.wiki.wikitree.bean;

import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.bean.a */
public final class C12075a implements Cloneable {

    /* renamed from: a */
    private final int f32565a;

    /* renamed from: b */
    private final int f32566b;

    /* renamed from: c */
    public boolean mo46249c() {
        if (this.f32565a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private boolean m49988h() {
        if (!mo46248b() || this.f32566b != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo46246a() {
        int i = this.f32565a;
        if (i == 4 || i == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo46248b() {
        int i = this.f32565a;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public C12075a clone() {
        try {
            return (C12075a) super.clone();
        } catch (Exception e) {
            C13479a.m54761a("UserRole", e);
            return null;
        }
    }

    /* renamed from: d */
    public boolean mo46251d() {
        if (mo46246a() || ((mo46248b() && (this.f32566b & 2) > 0) || m49988h())) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo46252e() {
        if (mo46246a() || ((mo46248b() && (this.f32566b & 64) > 0) || m49988h())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo46254f() {
        if (mo46246a() || ((mo46248b() && (this.f32566b & 16) > 0) || m49988h())) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "[role=" + this.f32565a + ", prop=" + this.f32566b + ']';
    }

    /* renamed from: a */
    public boolean mo46247a(C12075a aVar) {
        if (aVar == null || this.f32565a != aVar.f32565a) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12075a) {
            C12075a aVar = (C12075a) obj;
            if (this.f32565a == aVar.f32565a && this.f32566b == aVar.f32566b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C12075a(int i, int i2) {
        this.f32565a = i;
        this.f32566b = i2;
    }
}
