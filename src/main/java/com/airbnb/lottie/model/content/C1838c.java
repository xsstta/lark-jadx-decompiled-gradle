package com.airbnb.lottie.model.content;

import com.airbnb.lottie.p071c.C1785b;
import com.airbnb.lottie.p071c.C1790g;

/* renamed from: com.airbnb.lottie.model.content.c */
public class C1838c {

    /* renamed from: a */
    private final float[] f6319a;

    /* renamed from: b */
    private final int[] f6320b;

    /* renamed from: c */
    public int mo9202c() {
        return this.f6320b.length;
    }

    /* renamed from: a */
    public float[] mo9200a() {
        return this.f6319a;
    }

    /* renamed from: b */
    public int[] mo9201b() {
        return this.f6320b;
    }

    public C1838c(float[] fArr, int[] iArr) {
        this.f6319a = fArr;
        this.f6320b = iArr;
    }

    /* renamed from: a */
    public void mo9199a(C1838c cVar, C1838c cVar2, float f) {
        if (cVar.f6320b.length == cVar2.f6320b.length) {
            for (int i = 0; i < cVar.f6320b.length; i++) {
                this.f6319a[i] = C1790g.m8000a(cVar.f6319a[i], cVar2.f6319a[i], f);
                this.f6320b[i] = C1785b.m7964a(f, cVar.f6320b[i], cVar2.f6320b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + cVar.f6320b.length + " vs " + cVar2.f6320b.length + ")");
    }
}
