package com.bumptech.glide.p082c;

import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.util.C2567j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.c.d */
public final class C2120d implements AbstractC2265c {

    /* renamed from: b */
    private final Object f7312b;

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return this.f7312b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f7312b + '}';
    }

    public C2120d(Object obj) {
        this.f7312b = C2567j.m10894a(obj);
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f7312b.toString().getBytes(f7599a));
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (obj instanceof C2120d) {
            return this.f7312b.equals(((C2120d) obj).f7312b);
        }
        return false;
    }
}
