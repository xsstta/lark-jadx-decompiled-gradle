package com.airbnb.lottie.parser;

import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.C1834c;
import com.airbnb.lottie.model.content.C1845j;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.j */
public class C1887j {

    /* renamed from: a */
    private static final JsonReader.C1891a f6501a = JsonReader.C1891a.m8474a("ch", "size", "w", "style", "fFamily", Constants.ScionAnalytics.MessageType.DATA_MESSAGE);

    /* renamed from: b */
    private static final JsonReader.C1891a f6502b = JsonReader.C1891a.m8474a("shapes");

    /* renamed from: a */
    static C1834c m8448a(JsonReader jsonReader, C1792d dVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo9326c();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c = 0;
        while (jsonReader.mo9328e()) {
            int a = jsonReader.mo9321a(f6501a);
            if (a == 0) {
                c = jsonReader.mo9332i().charAt(0);
            } else if (a == 1) {
                d = jsonReader.mo9334k();
            } else if (a == 2) {
                d2 = jsonReader.mo9334k();
            } else if (a == 3) {
                str = jsonReader.mo9332i();
            } else if (a == 4) {
                str2 = jsonReader.mo9332i();
            } else if (a != 5) {
                jsonReader.mo9331h();
                jsonReader.mo9336m();
            } else {
                jsonReader.mo9326c();
                while (jsonReader.mo9328e()) {
                    if (jsonReader.mo9321a(f6502b) != 0) {
                        jsonReader.mo9331h();
                        jsonReader.mo9336m();
                    } else {
                        jsonReader.mo9323a();
                        while (jsonReader.mo9328e()) {
                            arrayList.add((C1845j) C1884g.m8443a(jsonReader, dVar));
                        }
                        jsonReader.mo9325b();
                    }
                }
                jsonReader.mo9327d();
            }
        }
        jsonReader.mo9327d();
        return new C1834c(arrayList, c, d, d2, str, str2);
    }
}
