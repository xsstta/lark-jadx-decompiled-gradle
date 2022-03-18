package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.engine.AbstractC2383u;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.m */
public class C2439m implements AbstractC2393i<Drawable> {

    /* renamed from: b */
    private final AbstractC2393i<Bitmap> f8000b;

    /* renamed from: c */
    private final boolean f8001c;

    /* renamed from: a */
    public AbstractC2393i<BitmapDrawable> mo10955a() {
        return this;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return this.f8000b.hashCode();
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f8000b.updateDiskCacheKey(messageDigest);
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (obj instanceof C2439m) {
            return this.f8000b.equals(((C2439m) obj).f8000b);
        }
        return false;
    }

    public C2439m(AbstractC2393i<Bitmap> iVar, boolean z) {
        this.f8000b = iVar;
        this.f8001c = z;
    }

    /* renamed from: a */
    private AbstractC2383u<Drawable> m10309a(Context context, AbstractC2383u<Bitmap> uVar) {
        return C2447s.m10337a(context.getResources(), uVar);
    }

    @Override // com.bumptech.glide.load.AbstractC2393i
    /* renamed from: a */
    public AbstractC2383u<Drawable> mo10631a(Context context, AbstractC2383u<Drawable> uVar, int i, int i2) {
        AbstractC2283e a = ComponentCallbacks2C2115c.m9149b(context).mo10350a();
        Drawable d = uVar.mo10878d();
        AbstractC2383u<Bitmap> a2 = C2437l.m10306a(a, d, i, i2);
        if (a2 != null) {
            AbstractC2383u<Bitmap> a3 = this.f8000b.mo10631a(context, a2, i, i2);
            if (!a3.equals(a2)) {
                return m10309a(context, a3);
            }
            a3.mo10880f();
            return uVar;
        } else if (!this.f8001c) {
            return uVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + d + " to a Bitmap");
        }
    }
}
