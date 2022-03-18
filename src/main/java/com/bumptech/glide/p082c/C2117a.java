package com.bumptech.glide.p082c;

import android.content.Context;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.util.C2568k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.c.a */
public final class C2117a implements AbstractC2265c {

    /* renamed from: b */
    private final int f7308b;

    /* renamed from: c */
    private final AbstractC2265c f7309c;

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return C2568k.m10904a(this.f7309c, this.f7308b);
    }

    /* renamed from: a */
    public static AbstractC2265c m9167a(Context context) {
        return new C2117a(context.getResources().getConfiguration().uiMode & 48, C2118b.m9168a(context));
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (!(obj instanceof C2117a)) {
            return false;
        }
        C2117a aVar = (C2117a) obj;
        if (this.f7308b != aVar.f7308b || !this.f7309c.equals(aVar.f7309c)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f7309c.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f7308b).array());
    }

    private C2117a(int i, AbstractC2265c cVar) {
        this.f7308b = i;
        this.f7309c = cVar;
    }
}
