package com.bumptech.glide.load.p085b.p086a;

import com.bumptech.glide.load.C2267e;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p083a.C2157j;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.load.p085b.AbstractC2235o;
import com.bumptech.glide.load.p085b.C2219g;
import com.bumptech.glide.load.p085b.C2230m;
import com.bumptech.glide.load.p085b.C2241r;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.a.a */
public class C2180a implements AbstractC2233n<C2219g, InputStream> {

    /* renamed from: a */
    public static final C2267e<Integer> f7484a = C2267e.m9710a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", (Object) 2500);

    /* renamed from: b */
    private final C2230m<C2219g, C2219g> f7485b;

    /* renamed from: a */
    public boolean mo10536a(C2219g gVar) {
        return true;
    }

    public C2180a() {
        this(null);
    }

    /* renamed from: com.bumptech.glide.load.b.a.a$a */
    public static class C2181a implements AbstractC2235o<C2219g, InputStream> {

        /* renamed from: a */
        private final C2230m<C2219g, C2219g> f7486a = new C2230m<>(500);

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<C2219g, InputStream> mo10538a(C2241r rVar) {
            return new C2180a(this.f7486a);
        }
    }

    public C2180a(C2230m<C2219g, C2219g> mVar) {
        this.f7485b = mVar;
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<InputStream> mo10534a(C2219g gVar, int i, int i2, C2390f fVar) {
        C2230m<C2219g, C2219g> mVar = this.f7485b;
        if (mVar != null) {
            C2219g a = mVar.mo10595a(gVar, 0, 0);
            if (a == null) {
                this.f7485b.mo10596a(gVar, 0, 0, gVar);
            } else {
                gVar = a;
            }
        }
        return new AbstractC2233n.C2234a<>(gVar, new C2157j(gVar, ((Integer) fVar.mo10900a(f7484a)).intValue()));
    }
}
