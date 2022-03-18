package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.p073a.AbstractC1831m;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.z */
public class C1909z {

    /* renamed from: a */
    private static final JsonReader.C1891a f6547a = JsonReader.C1891a.m8474a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* renamed from: a */
    static PolystarShape m8537a(JsonReader jsonReader, C1792d dVar) throws IOException {
        String str = null;
        PolystarShape.Type type = null;
        C1820b bVar = null;
        AbstractC1831m<PointF, PointF> mVar = null;
        C1820b bVar2 = null;
        C1820b bVar3 = null;
        C1820b bVar4 = null;
        C1820b bVar5 = null;
        C1820b bVar6 = null;
        boolean z = false;
        while (jsonReader.mo9328e()) {
            switch (jsonReader.mo9321a(f6547a)) {
                case 0:
                    str = jsonReader.mo9332i();
                    break;
                case 1:
                    type = PolystarShape.Type.forValue(jsonReader.mo9335l());
                    break;
                case 2:
                    bVar = C1881d.m8430a(jsonReader, dVar, false);
                    break;
                case 3:
                    mVar = C1869a.m8407b(jsonReader, dVar);
                    break;
                case 4:
                    bVar2 = C1881d.m8430a(jsonReader, dVar, false);
                    break;
                case 5:
                    bVar4 = C1881d.m8429a(jsonReader, dVar);
                    break;
                case 6:
                    bVar6 = C1881d.m8430a(jsonReader, dVar, false);
                    break;
                case 7:
                    bVar3 = C1881d.m8429a(jsonReader, dVar);
                    break;
                case 8:
                    bVar5 = C1881d.m8430a(jsonReader, dVar, false);
                    break;
                case 9:
                    z = jsonReader.mo9333j();
                    break;
                default:
                    jsonReader.mo9331h();
                    jsonReader.mo9336m();
                    break;
            }
        }
        return new PolystarShape(str, type, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z);
    }
}
