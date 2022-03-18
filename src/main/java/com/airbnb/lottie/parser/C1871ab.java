package com.airbnb.lottie.parser;

import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.content.C1842g;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1830l;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.hms.site.ActivityC23764o;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.ab */
public class C1871ab {

    /* renamed from: a */
    private static JsonReader.C1891a f6481a = JsonReader.C1891a.m8474a("nm", C60375c.f150914a, ActivityC23764o.f58839a, "tr", "hd");

    /* renamed from: a */
    static C1842g m8409a(JsonReader jsonReader, C1792d dVar) throws IOException {
        String str = null;
        C1820b bVar = null;
        C1820b bVar2 = null;
        C1830l lVar = null;
        boolean z = false;
        while (jsonReader.mo9328e()) {
            int a = jsonReader.mo9321a(f6481a);
            if (a == 0) {
                str = jsonReader.mo9332i();
            } else if (a == 1) {
                bVar = C1881d.m8430a(jsonReader, dVar, false);
            } else if (a == 2) {
                bVar2 = C1881d.m8430a(jsonReader, dVar, false);
            } else if (a == 3) {
                lVar = C1880c.m8422a(jsonReader, dVar);
            } else if (a != 4) {
                jsonReader.mo9336m();
            } else {
                z = jsonReader.mo9333j();
            }
        }
        return new C1842g(str, bVar, bVar2, lVar, z);
    }
}
