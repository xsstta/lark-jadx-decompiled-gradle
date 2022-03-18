package com.airbnb.lottie.parser;

import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.hms.site.ActivityC23764o;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.ai */
public class C1878ai {

    /* renamed from: a */
    private static JsonReader.C1891a f6490a = JsonReader.C1891a.m8474a("s", "e", ActivityC23764o.f58839a, "nm", "m", "hd");

    /* renamed from: a */
    static ShapeTrimPath m8418a(JsonReader jsonReader, C1792d dVar) throws IOException {
        String str = null;
        ShapeTrimPath.Type type = null;
        C1820b bVar = null;
        C1820b bVar2 = null;
        C1820b bVar3 = null;
        boolean z = false;
        while (jsonReader.mo9328e()) {
            int a = jsonReader.mo9321a(f6490a);
            if (a == 0) {
                bVar = C1881d.m8430a(jsonReader, dVar, false);
            } else if (a == 1) {
                bVar2 = C1881d.m8430a(jsonReader, dVar, false);
            } else if (a == 2) {
                bVar3 = C1881d.m8430a(jsonReader, dVar, false);
            } else if (a == 3) {
                str = jsonReader.mo9332i();
            } else if (a == 4) {
                type = ShapeTrimPath.Type.forId(jsonReader.mo9335l());
            } else if (a != 5) {
                jsonReader.mo9336m();
            } else {
                z = jsonReader.mo9333j();
            }
        }
        return new ShapeTrimPath(str, type, bVar, bVar2, bVar3, z);
    }
}
