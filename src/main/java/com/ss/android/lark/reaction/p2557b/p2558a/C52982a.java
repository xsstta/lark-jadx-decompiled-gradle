package com.ss.android.lark.reaction.p2557b.p2558a;

import com.bumptech.glide.load.AbstractC2265c;
import java.security.MessageDigest;
import java.util.Objects;

/* renamed from: com.ss.android.lark.reaction.b.a.a */
public class C52982a implements AbstractC2265c {

    /* renamed from: b */
    public String f130893b;

    /* renamed from: c */
    private volatile byte[] f130894c;

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return Objects.hash(this.f130893b);
    }

    /* renamed from: a */
    private byte[] m205204a() {
        if (this.f130894c == null) {
            this.f130894c = this.f130893b.getBytes(f7599a);
        }
        return this.f130894c;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(m205204a());
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f130893b, ((C52982a) obj).f130893b);
    }
}
