package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.C1833b;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.k */
public class C1888k {

    /* renamed from: a */
    private static final JsonReader.C1891a f6503a = JsonReader.C1891a.m8474a("fFamily", "fName", "fStyle", "ascent");

    /* renamed from: a */
    static C1833b m8449a(JsonReader jsonReader) throws IOException {
        jsonReader.mo9326c();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = BitmapDescriptorFactory.HUE_RED;
        while (jsonReader.mo9328e()) {
            int a = jsonReader.mo9321a(f6503a);
            if (a == 0) {
                str = jsonReader.mo9332i();
            } else if (a == 1) {
                str2 = jsonReader.mo9332i();
            } else if (a == 2) {
                str3 = jsonReader.mo9332i();
            } else if (a != 3) {
                jsonReader.mo9331h();
                jsonReader.mo9336m();
            } else {
                f = (float) jsonReader.mo9334k();
            }
        }
        jsonReader.mo9327d();
        return new C1833b(str, str2, str3, f);
    }
}
