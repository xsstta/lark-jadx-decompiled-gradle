package com.franmontiel.persistentcookiejar.cache;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import okhttp3.Cookie;

public class SetCookieCache implements CookieCache {

    /* renamed from: a */
    public Set<IdentifiableCookie> f51817a = new HashSet();

    private class SetCookieCacheIterator implements Iterator<Cookie> {

        /* renamed from: b */
        private Iterator<IdentifiableCookie> f51819b;

        public boolean hasNext() {
            return this.f51819b.hasNext();
        }

        public void remove() {
            this.f51819b.remove();
        }

        /* renamed from: a */
        public Cookie next() {
            return this.f51819b.next().mo72358a();
        }

        public SetCookieCacheIterator() {
            this.f51819b = SetCookieCache.this.f51817a.iterator();
        }
    }

    @Override // com.franmontiel.persistentcookiejar.cache.CookieCache
    /* renamed from: a */
    public void mo72356a() {
        this.f51817a.clear();
    }

    @Override // java.lang.Iterable
    public Iterator<Cookie> iterator() {
        return new SetCookieCacheIterator();
    }

    @Override // com.franmontiel.persistentcookiejar.cache.CookieCache
    /* renamed from: a */
    public void mo72357a(Collection<Cookie> collection) {
        for (IdentifiableCookie identifiableCookie : IdentifiableCookie.m77105a(collection)) {
            this.f51817a.remove(identifiableCookie);
            this.f51817a.add(identifiableCookie);
        }
    }
}
