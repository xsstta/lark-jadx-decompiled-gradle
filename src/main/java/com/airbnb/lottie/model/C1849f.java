package com.airbnb.lottie.model;

import androidx.collection.C0517d;
import com.airbnb.lottie.C1792d;

/* renamed from: com.airbnb.lottie.model.f */
public class C1849f {

    /* renamed from: a */
    private static final C1849f f6373a = new C1849f();

    /* renamed from: b */
    private final C0517d<String, C1792d> f6374b = new C0517d<>(20);

    /* renamed from: a */
    public static C1849f m8289a() {
        return f6373a;
    }

    C1849f() {
    }

    /* renamed from: a */
    public C1792d mo9262a(String str) {
        if (str == null) {
            return null;
        }
        return this.f6374b.mo2974a(str);
    }

    /* renamed from: a */
    public void mo9263a(String str, C1792d dVar) {
        if (str != null) {
            this.f6374b.mo2975a(str, dVar);
        }
    }
}
