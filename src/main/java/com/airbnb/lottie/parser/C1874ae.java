package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.content.C1844i;
import com.airbnb.lottie.model.p073a.C1819a;
import com.airbnb.lottie.model.p073a.C1822d;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.hms.site.ActivityC23764o;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.ae */
public class C1874ae {

    /* renamed from: a */
    private static final JsonReader.C1891a f6485a = JsonReader.C1891a.m8474a("nm", C60375c.f150914a, ActivityC23764o.f58839a, "fillEnabled", "r", "hd");

    /* renamed from: a */
    static C1844i m8414a(JsonReader jsonReader, C1792d dVar) throws IOException {
        Path.FillType fillType;
        String str = null;
        C1819a aVar = null;
        C1822d dVar2 = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (jsonReader.mo9328e()) {
            int a = jsonReader.mo9321a(f6485a);
            if (a == 0) {
                str = jsonReader.mo9332i();
            } else if (a == 1) {
                aVar = C1881d.m8439g(jsonReader, dVar);
            } else if (a == 2) {
                dVar2 = C1881d.m8434b(jsonReader, dVar);
            } else if (a == 3) {
                z = jsonReader.mo9333j();
            } else if (a == 4) {
                i = jsonReader.mo9335l();
            } else if (a != 5) {
                jsonReader.mo9331h();
                jsonReader.mo9336m();
            } else {
                z2 = jsonReader.mo9333j();
            }
        }
        if (i == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new C1844i(str, z, fillType, aVar, dVar2, z2);
    }
}
