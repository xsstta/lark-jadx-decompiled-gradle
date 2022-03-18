package com.airbnb.lottie.p071c;

/* renamed from: com.airbnb.lottie.c.f */
public class C1789f {

    /* renamed from: a */
    private float f6123a;

    /* renamed from: b */
    private int f6124b;

    /* renamed from: a */
    public void mo9050a(float f) {
        float f2 = this.f6123a + f;
        this.f6123a = f2;
        int i = this.f6124b + 1;
        this.f6124b = i;
        if (i == Integer.MAX_VALUE) {
            this.f6123a = f2 / 2.0f;
            this.f6124b = i / 2;
        }
    }
}
