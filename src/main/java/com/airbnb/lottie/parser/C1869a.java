package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.p073a.AbstractC1831m;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1823e;
import com.airbnb.lottie.model.p073a.C1827i;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.p072d.C1793a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.parser.a */
public class C1869a {

    /* renamed from: a */
    private static JsonReader.C1891a f6479a = JsonReader.C1891a.m8474a("k", "x", "y");

    /* renamed from: a */
    public static C1823e m8406a(JsonReader jsonReader, C1792d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo9329f() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo9323a();
            while (jsonReader.mo9328e()) {
                arrayList.add(C1906w.m8532a(jsonReader, dVar));
            }
            jsonReader.mo9325b();
            C1901r.m8521a(arrayList);
        } else {
            arrayList.add(new C1793a(C1898p.m8510b(jsonReader, C1791h.m8011a())));
        }
        return new C1823e(arrayList);
    }

    /* renamed from: b */
    static AbstractC1831m<PointF, PointF> m8407b(JsonReader jsonReader, C1792d dVar) throws IOException {
        jsonReader.mo9326c();
        C1823e eVar = null;
        C1820b bVar = null;
        C1820b bVar2 = null;
        boolean z = false;
        while (jsonReader.mo9329f() != JsonReader.Token.END_OBJECT) {
            int a = jsonReader.mo9321a(f6479a);
            if (a != 0) {
                if (a != 1) {
                    if (a != 2) {
                        jsonReader.mo9331h();
                        jsonReader.mo9336m();
                    } else if (jsonReader.mo9329f() == JsonReader.Token.STRING) {
                        jsonReader.mo9336m();
                    } else {
                        bVar2 = C1881d.m8429a(jsonReader, dVar);
                    }
                } else if (jsonReader.mo9329f() == JsonReader.Token.STRING) {
                    jsonReader.mo9336m();
                } else {
                    bVar = C1881d.m8429a(jsonReader, dVar);
                }
                z = true;
            } else {
                eVar = m8406a(jsonReader, dVar);
            }
        }
        jsonReader.mo9327d();
        if (z) {
            dVar.mo9054a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new C1827i(bVar, bVar2);
    }
}
