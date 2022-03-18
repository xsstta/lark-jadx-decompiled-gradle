package com.bumptech.glide.load.p085b.p086a;

import android.net.Uri;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.load.p085b.AbstractC2235o;
import com.bumptech.glide.load.p085b.C2219g;
import com.bumptech.glide.load.p085b.C2241r;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.a.b */
public class C2182b implements AbstractC2233n<Uri, InputStream> {

    /* renamed from: a */
    private static final Set<String> f7487a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: b */
    private final AbstractC2233n<C2219g, InputStream> f7488b;

    public C2182b(AbstractC2233n<C2219g, InputStream> nVar) {
        this.f7488b = nVar;
    }

    /* renamed from: com.bumptech.glide.load.b.a.b$a */
    public static class C2183a implements AbstractC2235o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Uri, InputStream> mo10538a(C2241r rVar) {
            return new C2182b(rVar.mo10614b(C2219g.class, InputStream.class));
        }
    }

    /* renamed from: a */
    public boolean mo10536a(Uri uri) {
        return f7487a.contains(uri.getScheme());
    }

    /* renamed from: a */
    public AbstractC2233n.C2234a<InputStream> mo10534a(Uri uri, int i, int i2, C2390f fVar) {
        return this.f7488b.mo10534a(new C2219g(uri.toString()), i, i2, fVar);
    }
}
