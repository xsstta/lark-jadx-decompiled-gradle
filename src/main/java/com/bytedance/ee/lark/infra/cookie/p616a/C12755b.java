package com.bytedance.ee.lark.infra.cookie.p616a;

import okhttp3.Cookie;

/* renamed from: com.bytedance.ee.lark.infra.cookie.a.b */
class C12755b {

    /* renamed from: a */
    private Cookie f34126a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Cookie mo48267a() {
        return this.f34126a;
    }

    public int hashCode() {
        return ((((((((527 + this.f34126a.name().hashCode()) * 31) + this.f34126a.domain().hashCode()) * 31) + this.f34126a.path().hashCode()) * 31) + (!this.f34126a.secure())) * 31) + (!this.f34126a.hostOnly());
    }

    C12755b(Cookie cookie) {
        this.f34126a = cookie;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12755b)) {
            return false;
        }
        C12755b bVar = (C12755b) obj;
        if (!bVar.f34126a.name().equals(this.f34126a.name()) || !bVar.f34126a.domain().equals(this.f34126a.domain()) || !bVar.f34126a.path().equals(this.f34126a.path()) || bVar.f34126a.secure() != this.f34126a.secure() || bVar.f34126a.hostOnly() != this.f34126a.hostOnly()) {
            return false;
        }
        return true;
    }
}
