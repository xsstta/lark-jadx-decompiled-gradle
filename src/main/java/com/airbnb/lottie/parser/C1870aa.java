package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.content.C1841f;
import com.airbnb.lottie.model.p073a.AbstractC1831m;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1824f;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.aa */
public class C1870aa {

    /* renamed from: a */
    private static JsonReader.C1891a f6480a = JsonReader.C1891a.m8474a("nm", "p", "s", "r", "hd");

    /* renamed from: a */
    static C1841f m8408a(JsonReader jsonReader, C1792d dVar) throws IOException {
        String str = null;
        AbstractC1831m<PointF, PointF> mVar = null;
        C1824f fVar = null;
        C1820b bVar = null;
        boolean z = false;
        while (jsonReader.mo9328e()) {
            int a = jsonReader.mo9321a(f6480a);
            if (a == 0) {
                str = jsonReader.mo9332i();
            } else if (a == 1) {
                mVar = C1869a.m8407b(jsonReader, dVar);
            } else if (a == 2) {
                fVar = C1881d.m8435c(jsonReader, dVar);
            } else if (a == 3) {
                bVar = C1881d.m8429a(jsonReader, dVar);
            } else if (a != 4) {
                jsonReader.mo9336m();
            } else {
                z = jsonReader.mo9333j();
            }
        }
        return new C1841f(str, mVar, fVar, bVar, z);
    }
}
