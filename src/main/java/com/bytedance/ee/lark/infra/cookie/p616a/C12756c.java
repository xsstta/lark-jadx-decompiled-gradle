package com.bytedance.ee.lark.infra.cookie.p616a;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import okhttp3.Cookie;

/* renamed from: com.bytedance.ee.lark.infra.cookie.a.c */
public class C12756c implements AbstractC12754a {

    /* renamed from: a */
    public Set<C12755b> f34127a = new HashSet();

    /* renamed from: com.bytedance.ee.lark.infra.cookie.a.c$a */
    private class C12757a implements Iterator<Cookie> {

        /* renamed from: b */
        private Iterator<C12755b> f34129b;

        public boolean hasNext() {
            return this.f34129b.hasNext();
        }

        public void remove() {
            this.f34129b.remove();
        }

        /* renamed from: a */
        public Cookie next() {
            return this.f34129b.next().mo48267a();
        }

        public C12757a() {
            this.f34129b = C12756c.this.f34127a.iterator();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Cookie> iterator() {
        return new C12757a();
    }

    @Override // com.bytedance.ee.lark.infra.cookie.p616a.AbstractC12754a
    /* renamed from: a */
    public void mo48266a(Collection<Cookie> collection) {
        if (collection != null) {
            for (Cookie cookie : collection) {
                C12755b bVar = new C12755b(cookie);
                this.f34127a.remove(bVar);
                this.f34127a.add(bVar);
            }
        }
    }
}
