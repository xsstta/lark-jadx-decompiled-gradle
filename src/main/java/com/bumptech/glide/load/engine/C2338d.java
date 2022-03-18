package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.AbstractC2265c;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.d */
public final class C2338d implements AbstractC2265c {

    /* renamed from: b */
    private final AbstractC2265c f7739b;

    /* renamed from: c */
    private final AbstractC2265c f7740c;

    /* renamed from: a */
    public AbstractC2265c mo10782a() {
        return this.f7739b;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return (this.f7739b.hashCode() * 31) + this.f7740c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f7739b + ", signature=" + this.f7740c + '}';
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f7739b.updateDiskCacheKey(messageDigest);
        this.f7740c.updateDiskCacheKey(messageDigest);
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (!(obj instanceof C2338d)) {
            return false;
        }
        C2338d dVar = (C2338d) obj;
        if (!this.f7739b.equals(dVar.f7739b) || !this.f7740c.equals(dVar.f7740c)) {
            return false;
        }
        return true;
    }

    C2338d(AbstractC2265c cVar, AbstractC2265c cVar2) {
        this.f7739b = cVar;
        this.f7740c = cVar2;
    }
}
