package com.airbnb.lottie.parser;

import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.p073a.C1819a;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1829k;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.b */
public class C1879b {

    /* renamed from: a */
    private static JsonReader.C1891a f6491a = JsonReader.C1891a.m8474a(AbstractC60044a.f149675a);

    /* renamed from: b */
    private static JsonReader.C1891a f6492b = JsonReader.C1891a.m8474a("fc", "sc", "sw", "t");

    /* renamed from: a */
    public static C1829k m8420a(JsonReader jsonReader, C1792d dVar) throws IOException {
        jsonReader.mo9326c();
        C1829k kVar = null;
        while (jsonReader.mo9328e()) {
            if (jsonReader.mo9321a(f6491a) != 0) {
                jsonReader.mo9331h();
                jsonReader.mo9336m();
            } else {
                kVar = m8421b(jsonReader, dVar);
            }
        }
        jsonReader.mo9327d();
        if (kVar == null) {
            return new C1829k(null, null, null, null);
        }
        return kVar;
    }

    /* renamed from: b */
    private static C1829k m8421b(JsonReader jsonReader, C1792d dVar) throws IOException {
        jsonReader.mo9326c();
        C1819a aVar = null;
        C1819a aVar2 = null;
        C1820b bVar = null;
        C1820b bVar2 = null;
        while (jsonReader.mo9328e()) {
            int a = jsonReader.mo9321a(f6492b);
            if (a == 0) {
                aVar = C1881d.m8439g(jsonReader, dVar);
            } else if (a == 1) {
                aVar2 = C1881d.m8439g(jsonReader, dVar);
            } else if (a == 2) {
                bVar = C1881d.m8429a(jsonReader, dVar);
            } else if (a != 3) {
                jsonReader.mo9331h();
                jsonReader.mo9336m();
            } else {
                bVar2 = C1881d.m8429a(jsonReader, dVar);
            }
        }
        jsonReader.mo9327d();
        return new C1829k(aVar, aVar2, bVar, bVar2);
    }
}
