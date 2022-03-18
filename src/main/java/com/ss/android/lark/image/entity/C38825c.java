package com.ss.android.lark.image.entity;

import com.bumptech.glide.load.AbstractC2265c;
import java.security.MessageDigest;
import java.util.Objects;

/* renamed from: com.ss.android.lark.image.entity.c */
public class C38825c implements AbstractC2265c {

    /* renamed from: b */
    private String f99779b;

    /* renamed from: c */
    private volatile byte[] f99780c;

    /* renamed from: a */
    public String mo142325a() {
        return this.f99779b;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return Objects.hash(this.f99779b);
    }

    /* renamed from: b */
    private byte[] m153238b() {
        if (this.f99780c == null) {
            this.f99780c = this.f99779b.getBytes(f7599a);
        }
        return this.f99780c;
    }

    public String toString() {
        return "Reaction#key is:" + this.f99779b;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(m153238b());
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38825c)) {
            return false;
        }
        return Objects.equals(this.f99779b, ((C38825c) obj).f99779b);
    }
}
