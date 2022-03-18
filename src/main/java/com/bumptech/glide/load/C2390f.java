package com.bumptech.glide.load;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.bumptech.glide.util.C2557b;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.f */
public final class C2390f implements AbstractC2265c {

    /* renamed from: b */
    private final ArrayMap<C2267e<?>, Object> f7931b = new C2557b();

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return this.f7931b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f7931b + '}';
    }

    /* renamed from: a */
    public void mo10901a(C2390f fVar) {
        this.f7931b.putAll((SimpleArrayMap<? extends C2267e<?>, ? extends Object>) fVar.f7931b);
    }

    /* renamed from: a */
    public <T> T mo10900a(C2267e<T> eVar) {
        return this.f7931b.containsKey(eVar) ? (T) this.f7931b.get(eVar) : eVar.mo10632a();
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (obj instanceof C2390f) {
            return this.f7931b.equals(((C2390f) obj).f7931b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i = 0; i < this.f7931b.size(); i++) {
            m10133a(this.f7931b.keyAt(i), this.f7931b.valueAt(i), messageDigest);
        }
    }

    /* renamed from: a */
    public <T> C2390f mo10899a(C2267e<T> eVar, T t) {
        this.f7931b.put(eVar, t);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <T> void m10133a(C2267e<T> eVar, Object obj, MessageDigest messageDigest) {
        eVar.mo10633a(obj, messageDigest);
    }
}
