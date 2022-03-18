package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.content.C1836a;
import com.airbnb.lottie.model.p073a.AbstractC1831m;
import com.airbnb.lottie.model.p073a.C1824f;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.android.vc.statistics.p3180a.C63690d;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.e */
public class C1882e {

    /* renamed from: a */
    private static JsonReader.C1891a f6495a = JsonReader.C1891a.m8474a("nm", "p", "s", "hd", C63690d.f160779a);

    /* renamed from: a */
    static C1836a m8440a(JsonReader jsonReader, C1792d dVar, int i) throws IOException {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        String str = null;
        AbstractC1831m<PointF, PointF> mVar = null;
        C1824f fVar = null;
        boolean z3 = false;
        while (jsonReader.mo9328e()) {
            int a = jsonReader.mo9321a(f6495a);
            if (a == 0) {
                str = jsonReader.mo9332i();
            } else if (a == 1) {
                mVar = C1869a.m8407b(jsonReader, dVar);
            } else if (a == 2) {
                fVar = C1881d.m8435c(jsonReader, dVar);
            } else if (a == 3) {
                z3 = jsonReader.mo9333j();
            } else if (a != 4) {
                jsonReader.mo9331h();
                jsonReader.mo9336m();
            } else if (jsonReader.mo9335l() == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return new C1836a(str, mVar, fVar, z2, z3);
    }
}
