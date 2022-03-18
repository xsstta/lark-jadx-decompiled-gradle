package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.content.C1839d;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.p073a.C1821c;
import com.airbnb.lottie.model.p073a.C1822d;
import com.airbnb.lottie.model.p073a.C1824f;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.hms.site.ActivityC23764o;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.m */
public class C1890m {

    /* renamed from: a */
    private static final JsonReader.C1891a f6505a = JsonReader.C1891a.m8474a("nm", "g", ActivityC23764o.f58839a, "t", "s", "e", "r", "hd");

    /* renamed from: b */
    private static final JsonReader.C1891a f6506b = JsonReader.C1891a.m8474a("p", "k");

    /* renamed from: a */
    static C1839d m8454a(JsonReader jsonReader, C1792d dVar) throws IOException {
        GradientType gradientType;
        Path.FillType fillType;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        GradientType gradientType2 = null;
        C1821c cVar = null;
        C1822d dVar2 = null;
        C1824f fVar = null;
        C1824f fVar2 = null;
        boolean z = false;
        while (jsonReader.mo9328e()) {
            switch (jsonReader.mo9321a(f6505a)) {
                case 0:
                    str = jsonReader.mo9332i();
                    break;
                case 1:
                    int i = -1;
                    jsonReader.mo9326c();
                    while (jsonReader.mo9328e()) {
                        int a = jsonReader.mo9321a(f6506b);
                        if (a == 0) {
                            i = jsonReader.mo9335l();
                        } else if (a != 1) {
                            jsonReader.mo9331h();
                            jsonReader.mo9336m();
                        } else {
                            cVar = C1881d.m8431a(jsonReader, dVar, i);
                        }
                    }
                    jsonReader.mo9327d();
                    break;
                case 2:
                    dVar2 = C1881d.m8434b(jsonReader, dVar);
                    break;
                case 3:
                    if (jsonReader.mo9335l() == 1) {
                        gradientType = GradientType.LINEAR;
                    } else {
                        gradientType = GradientType.RADIAL;
                    }
                    gradientType2 = gradientType;
                    break;
                case 4:
                    fVar = C1881d.m8435c(jsonReader, dVar);
                    break;
                case 5:
                    fVar2 = C1881d.m8435c(jsonReader, dVar);
                    break;
                case 6:
                    if (jsonReader.mo9335l() == 1) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    fillType2 = fillType;
                    break;
                case 7:
                    z = jsonReader.mo9333j();
                    break;
                default:
                    jsonReader.mo9331h();
                    jsonReader.mo9336m();
                    break;
            }
        }
        return new C1839d(str, gradientType2, fillType2, cVar, dVar2, fVar, fVar2, null, null, z);
    }
}
