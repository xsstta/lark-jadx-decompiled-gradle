package com.bumptech.glide.load.engine.p088b;

import com.bumptech.glide.load.engine.p088b.C2309d;
import com.bumptech.glide.load.engine.p088b.C2323k;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.b.g */
public class C2315g extends C2309d {

    /* renamed from: a */
    private final long f7686a;

    /* renamed from: b */
    private final C2309d.AbstractC2310a f7687b;

    /* renamed from: c */
    private final C2309d.AbstractC2310a f7688c;

    /* renamed from: d */
    private final C2323k.AbstractC2325a f7689d;

    @Override // com.bumptech.glide.load.engine.p088b.C2309d, com.bumptech.glide.load.engine.p088b.AbstractC2302a.AbstractC2303a
    /* renamed from: a */
    public AbstractC2302a mo10724a() {
        File cacheDirectory = this.f7687b.getCacheDirectory();
        File cacheDirectory2 = this.f7688c.getCacheDirectory();
        if (cacheDirectory == null || cacheDirectory2 == null) {
            return null;
        }
        if (!cacheDirectory.mkdirs() && (!cacheDirectory.exists() || !cacheDirectory.isDirectory())) {
            return null;
        }
        if (cacheDirectory2.mkdirs() || (cacheDirectory2.exists() && cacheDirectory2.isDirectory())) {
            return C2311e.m9862a(cacheDirectory, cacheDirectory2, this.f7686a, this.f7689d);
        }
        return null;
    }

    public C2315g(C2309d.AbstractC2310a aVar, C2309d.AbstractC2310a aVar2, long j, C2323k.AbstractC2325a aVar3) {
        super(aVar, j);
        this.f7686a = j;
        this.f7687b = aVar;
        this.f7688c = aVar2;
        this.f7689d = aVar3;
    }
}
