package com.bumptech.glide;

import com.bumptech.glide.AbstractC2135h;
import com.bumptech.glide.request.p096b.AbstractC2531c;
import com.bumptech.glide.request.p096b.C2527a;

/* renamed from: com.bumptech.glide.h */
public abstract class AbstractC2135h<CHILD extends AbstractC2135h<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a */
    private AbstractC2531c<? super TranscodeType> f7427a = C2527a.m10756a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC2531c<? super TranscodeType> mo10472b() {
        return this.f7427a;
    }

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) ((AbstractC2135h) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
