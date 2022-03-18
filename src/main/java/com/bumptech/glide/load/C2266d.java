package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.AbstractC2383u;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.load.d */
public class C2266d<T> implements AbstractC2393i<T> {

    /* renamed from: b */
    private final Collection<? extends AbstractC2393i<T>> f7600b;

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return this.f7600b.hashCode();
    }

    public C2266d(Collection<? extends AbstractC2393i<T>> collection) {
        if (!collection.isEmpty()) {
            this.f7600b = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (obj instanceof C2266d) {
            return this.f7600b.equals(((C2266d) obj).f7600b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        Iterator<? extends AbstractC2393i<T>> it = this.f7600b.iterator();
        while (it.hasNext()) {
            ((AbstractC2393i) it.next()).updateDiskCacheKey(messageDigest);
        }
    }

    @SafeVarargs
    public C2266d(AbstractC2393i<T>... iVarArr) {
        if (iVarArr.length != 0) {
            this.f7600b = Arrays.asList(iVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // com.bumptech.glide.load.AbstractC2393i
    /* renamed from: a */
    public AbstractC2383u<T> mo10631a(Context context, AbstractC2383u<T> uVar, int i, int i2) {
        Iterator<? extends AbstractC2393i<T>> it = this.f7600b.iterator();
        AbstractC2383u<T> uVar2 = uVar;
        while (it.hasNext()) {
            AbstractC2383u<T> a = ((AbstractC2393i) it.next()).mo10631a(context, uVar2, i, i2);
            if (uVar2 != null && !uVar2.equals(uVar) && !uVar2.equals(a)) {
                uVar2.mo10880f();
            }
            uVar2 = a;
        }
        return uVar2;
    }
}
