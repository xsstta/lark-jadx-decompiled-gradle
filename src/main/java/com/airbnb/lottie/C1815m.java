package com.airbnb.lottie;

import androidx.collection.C0513a;
import androidx.core.util.C0844e;
import com.airbnb.lottie.p071c.C1789f;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.airbnb.lottie.m */
public class C1815m {

    /* renamed from: a */
    private boolean f6233a;

    /* renamed from: b */
    private final Set<AbstractC1817a> f6234b = new C0513a();

    /* renamed from: c */
    private final Map<String, C1789f> f6235c = new HashMap();

    /* renamed from: d */
    private final Comparator<C0844e<String, Float>> f6236d = new Comparator<C0844e<String, Float>>() {
        /* class com.airbnb.lottie.C1815m.C18161 */

        /* renamed from: a */
        public int compare(C0844e<String, Float> eVar, C0844e<String, Float> eVar2) {
            float floatValue = eVar.f3318b.floatValue();
            float floatValue2 = eVar2.f3318b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    };

    /* renamed from: com.airbnb.lottie.m$a */
    public interface AbstractC1817a {
        /* renamed from: a */
        void mo9127a(float f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9124a(boolean z) {
        this.f6233a = z;
    }

    /* renamed from: a */
    public void mo9123a(String str, float f) {
        if (this.f6233a) {
            C1789f fVar = this.f6235c.get(str);
            if (fVar == null) {
                fVar = new C1789f();
                this.f6235c.put(str, fVar);
            }
            fVar.mo9050a(f);
            if (str.equals("__container")) {
                for (AbstractC1817a aVar : this.f6234b) {
                    aVar.mo9127a(f);
                }
            }
        }
    }
}
