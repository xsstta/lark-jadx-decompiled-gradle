package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.util.C2567j;
import java.security.MessageDigest;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.engine.n */
public class C2374n implements AbstractC2265c {

    /* renamed from: b */
    private final Object f7874b;

    /* renamed from: c */
    private final int f7875c;

    /* renamed from: d */
    private final int f7876d;

    /* renamed from: e */
    private final Class<?> f7877e;

    /* renamed from: f */
    private final Class<?> f7878f;

    /* renamed from: g */
    private final AbstractC2265c f7879g;

    /* renamed from: h */
    private final Map<Class<?>, AbstractC2393i<?>> f7880h;

    /* renamed from: i */
    private final C2390f f7881i;

    /* renamed from: j */
    private int f7882j;

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        if (this.f7882j == 0) {
            int hashCode = this.f7874b.hashCode();
            this.f7882j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f7879g.hashCode();
            this.f7882j = hashCode2;
            int i = (hashCode2 * 31) + this.f7875c;
            this.f7882j = i;
            int i2 = (i * 31) + this.f7876d;
            this.f7882j = i2;
            int hashCode3 = (i2 * 31) + this.f7880h.hashCode();
            this.f7882j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f7877e.hashCode();
            this.f7882j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f7878f.hashCode();
            this.f7882j = hashCode5;
            this.f7882j = (hashCode5 * 31) + this.f7881i.hashCode();
        }
        return this.f7882j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f7874b + ", width=" + this.f7875c + ", height=" + this.f7876d + ", resourceClass=" + this.f7877e + ", transcodeClass=" + this.f7878f + ", signature=" + this.f7879g + ", hashCode=" + this.f7882j + ", transformations=" + this.f7880h + ", options=" + this.f7881i + '}';
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (!(obj instanceof C2374n)) {
            return false;
        }
        C2374n nVar = (C2374n) obj;
        if (!this.f7874b.equals(nVar.f7874b) || !this.f7879g.equals(nVar.f7879g) || this.f7876d != nVar.f7876d || this.f7875c != nVar.f7875c || !this.f7880h.equals(nVar.f7880h) || !this.f7877e.equals(nVar.f7877e) || !this.f7878f.equals(nVar.f7878f) || !this.f7881i.equals(nVar.f7881i)) {
            return false;
        }
        return true;
    }

    C2374n(Object obj, AbstractC2265c cVar, int i, int i2, Map<Class<?>, AbstractC2393i<?>> map, Class<?> cls, Class<?> cls2, C2390f fVar) {
        this.f7874b = C2567j.m10894a(obj);
        this.f7879g = (AbstractC2265c) C2567j.m10895a(cVar, "Signature must not be null");
        this.f7875c = i;
        this.f7876d = i2;
        this.f7880h = (Map) C2567j.m10894a(map);
        this.f7877e = (Class) C2567j.m10895a(cls, "Resource class must not be null");
        this.f7878f = (Class) C2567j.m10895a(cls2, "Transcode class must not be null");
        this.f7881i = (C2390f) C2567j.m10894a(fVar);
    }
}
