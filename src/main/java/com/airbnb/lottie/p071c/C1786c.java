package com.airbnb.lottie.p071c;

import android.util.Log;
import com.airbnb.lottie.AbstractC1808h;
import com.airbnb.lottie.C1783c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.airbnb.lottie.c.c */
public class C1786c implements AbstractC1808h {

    /* renamed from: a */
    private static final Set<String> f6112a = new HashSet();

    @Override // com.airbnb.lottie.AbstractC1808h
    /* renamed from: a */
    public void mo9018a(String str) {
        mo9022c(str, null);
    }

    @Override // com.airbnb.lottie.AbstractC1808h
    /* renamed from: b */
    public void mo9020b(String str) {
        mo9019a(str, null);
    }

    @Override // com.airbnb.lottie.AbstractC1808h
    /* renamed from: b */
    public void mo9021b(String str, Throwable th) {
        if (C1783c.f6104a) {
            Log.d("LOTTIE", str, th);
        }
    }

    /* renamed from: c */
    public void mo9022c(String str, Throwable th) {
        if (C1783c.f6104a) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override // com.airbnb.lottie.AbstractC1808h
    /* renamed from: a */
    public void mo9019a(String str, Throwable th) {
        Set<String> set = f6112a;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th);
            set.add(str);
        }
    }
}
