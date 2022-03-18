package com.bumptech.glide.load.resource.p093d;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.resource.bitmap.C2428e;
import com.bumptech.glide.util.C2567j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.d.f */
public class C2472f implements AbstractC2393i<C2468c> {

    /* renamed from: b */
    private final AbstractC2393i<Bitmap> f8064b;

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return this.f8064b.hashCode();
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f8064b.updateDiskCacheKey(messageDigest);
    }

    public C2472f(AbstractC2393i<Bitmap> iVar) {
        this.f8064b = (AbstractC2393i) C2567j.m10894a(iVar);
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (obj instanceof C2472f) {
            return this.f8064b.equals(((C2472f) obj).f8064b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.AbstractC2393i
    /* renamed from: a */
    public AbstractC2383u<C2468c> mo10631a(Context context, AbstractC2383u<C2468c> uVar, int i, int i2) {
        C2468c d = uVar.mo10878d();
        AbstractC2383u<Bitmap> eVar = new C2428e(d.mo11000b(), ComponentCallbacks2C2115c.m9149b(context).mo10350a());
        AbstractC2383u<Bitmap> a = this.f8064b.mo10631a(context, eVar, i, i2);
        if (!eVar.equals(a)) {
            eVar.mo10880f();
        }
        d.mo10999a(this.f8064b, a.mo10878d());
        return uVar;
    }
}
