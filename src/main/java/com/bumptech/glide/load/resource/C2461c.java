package com.bumptech.glide.load.resource;

import android.content.Context;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.engine.AbstractC2383u;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.c */
public final class C2461c<T> implements AbstractC2393i<T> {

    /* renamed from: b */
    private static final AbstractC2393i<?> f8041b = new C2461c();

    @Override // com.bumptech.glide.load.AbstractC2393i
    /* renamed from: a */
    public AbstractC2383u<T> mo10631a(Context context, AbstractC2383u<T> uVar, int i, int i2) {
        return uVar;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }

    private C2461c() {
    }

    /* renamed from: a */
    public static <T> C2461c<T> m10391a() {
        return (C2461c) f8041b;
    }
}
