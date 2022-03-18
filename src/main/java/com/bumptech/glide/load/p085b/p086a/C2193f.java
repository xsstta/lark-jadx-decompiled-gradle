package com.bumptech.glide.load.p085b.p086a;

import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.load.p085b.AbstractC2235o;
import com.bumptech.glide.load.p085b.C2219g;
import com.bumptech.glide.load.p085b.C2241r;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.b.a.f */
public class C2193f implements AbstractC2233n<URL, InputStream> {

    /* renamed from: a */
    private final AbstractC2233n<C2219g, InputStream> f7510a;

    /* renamed from: a */
    public boolean mo10536a(URL url) {
        return true;
    }

    public C2193f(AbstractC2233n<C2219g, InputStream> nVar) {
        this.f7510a = nVar;
    }

    /* renamed from: com.bumptech.glide.load.b.a.f$a */
    public static class C2194a implements AbstractC2235o<URL, InputStream> {
        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<URL, InputStream> mo10538a(C2241r rVar) {
            return new C2193f(rVar.mo10614b(C2219g.class, InputStream.class));
        }
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<InputStream> mo10534a(URL url, int i, int i2, C2390f fVar) {
        return this.f7510a.mo10534a(new C2219g(url), i, i2, fVar);
    }
}
