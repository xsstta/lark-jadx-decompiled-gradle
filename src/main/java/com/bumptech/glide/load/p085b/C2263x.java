package com.bumptech.glide.load.p085b;

import android.net.Uri;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.x */
public class C2263x<Data> implements AbstractC2233n<Uri, Data> {

    /* renamed from: a */
    private static final Set<String> f7597a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: b */
    private final AbstractC2233n<C2219g, Data> f7598b;

    public C2263x(AbstractC2233n<C2219g, Data> nVar) {
        this.f7598b = nVar;
    }

    /* renamed from: com.bumptech.glide.load.b.x$a */
    public static class C2264a implements AbstractC2235o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Uri, InputStream> mo10538a(C2241r rVar) {
            return new C2263x(rVar.mo10614b(C2219g.class, InputStream.class));
        }
    }

    /* renamed from: a */
    public boolean mo10536a(Uri uri) {
        return f7597a.contains(uri.getScheme());
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<Data> mo10534a(Uri uri, int i, int i2, C2390f fVar) {
        return this.f7598b.mo10534a(new C2219g(uri.toString()), i, i2, fVar);
    }
}
