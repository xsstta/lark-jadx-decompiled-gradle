package com.airbnb.lottie.parser;

import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.content.AbstractC1837b;
import com.airbnb.lottie.model.content.C1845j;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.af */
public class C1875af {

    /* renamed from: a */
    private static JsonReader.C1891a f6486a = JsonReader.C1891a.m8474a("nm", "hd", "it");

    /* renamed from: a */
    static C1845j m8415a(JsonReader jsonReader, C1792d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (jsonReader.mo9328e()) {
            int a = jsonReader.mo9321a(f6486a);
            if (a == 0) {
                str = jsonReader.mo9332i();
            } else if (a == 1) {
                z = jsonReader.mo9333j();
            } else if (a != 2) {
                jsonReader.mo9336m();
            } else {
                jsonReader.mo9323a();
                while (jsonReader.mo9328e()) {
                    AbstractC1837b a2 = C1884g.m8443a(jsonReader, dVar);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                jsonReader.mo9325b();
            }
        }
        return new C1845j(str, arrayList, z);
    }
}
