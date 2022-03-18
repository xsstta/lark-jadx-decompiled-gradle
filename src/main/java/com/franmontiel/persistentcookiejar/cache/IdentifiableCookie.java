package com.franmontiel.persistentcookiejar.cache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.Cookie;

class IdentifiableCookie {

    /* renamed from: a */
    private Cookie f51816a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Cookie mo72358a() {
        return this.f51816a;
    }

    public int hashCode() {
        return ((((((((527 + this.f51816a.name().hashCode()) * 31) + this.f51816a.domain().hashCode()) * 31) + this.f51816a.path().hashCode()) * 31) + (!this.f51816a.secure())) * 31) + (!this.f51816a.hostOnly());
    }

    IdentifiableCookie(Cookie cookie) {
        this.f51816a = cookie;
    }

    /* renamed from: a */
    static List<IdentifiableCookie> m77105a(Collection<Cookie> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Cookie cookie : collection) {
            arrayList.add(new IdentifiableCookie(cookie));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IdentifiableCookie)) {
            return false;
        }
        IdentifiableCookie identifiableCookie = (IdentifiableCookie) obj;
        if (!identifiableCookie.f51816a.name().equals(this.f51816a.name()) || !identifiableCookie.f51816a.domain().equals(this.f51816a.domain()) || !identifiableCookie.f51816a.path().equals(this.f51816a.path()) || identifiableCookie.f51816a.secure() != this.f51816a.secure() || identifiableCookie.f51816a.hostOnly() != this.f51816a.hostOnly()) {
            return false;
        }
        return true;
    }
}
