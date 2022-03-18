package com.airbnb.lottie.parser;

import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.content.C1846k;
import com.airbnb.lottie.model.p073a.C1826h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.ag */
public class C1876ag {

    /* renamed from: a */
    static JsonReader.C1891a f6487a = JsonReader.C1891a.m8474a("nm", "ind", "ks", "hd");

    /* renamed from: a */
    static C1846k m8416a(JsonReader jsonReader, C1792d dVar) throws IOException {
        int i = 0;
        String str = null;
        C1826h hVar = null;
        boolean z = false;
        while (jsonReader.mo9328e()) {
            int a = jsonReader.mo9321a(f6487a);
            if (a == 0) {
                str = jsonReader.mo9332i();
            } else if (a == 1) {
                i = jsonReader.mo9335l();
            } else if (a == 2) {
                hVar = C1881d.m8437e(jsonReader, dVar);
            } else if (a != 3) {
                jsonReader.mo9336m();
            } else {
                z = jsonReader.mo9333j();
            }
        }
        return new C1846k(str, i, hVar, z);
    }
}
