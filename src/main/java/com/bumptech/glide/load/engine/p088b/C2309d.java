package com.bumptech.glide.load.engine.p088b;

import com.bumptech.glide.load.engine.p088b.AbstractC2302a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.b.d */
public class C2309d implements AbstractC2302a.AbstractC2303a {

    /* renamed from: a */
    private final long f7671a;

    /* renamed from: b */
    private final AbstractC2310a f7672b;

    /* renamed from: com.bumptech.glide.load.engine.b.d$a */
    public interface AbstractC2310a {
        File getCacheDirectory();
    }

    @Override // com.bumptech.glide.load.engine.p088b.AbstractC2302a.AbstractC2303a
    /* renamed from: a */
    public AbstractC2302a mo10724a() {
        File cacheDirectory = this.f7672b.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (cacheDirectory.mkdirs() || (cacheDirectory.exists() && cacheDirectory.isDirectory())) {
            return C2311e.m9865b(cacheDirectory, this.f7671a);
        }
        return null;
    }

    public C2309d(AbstractC2310a aVar, long j) {
        this.f7671a = j;
        this.f7672b = aVar;
    }
}
