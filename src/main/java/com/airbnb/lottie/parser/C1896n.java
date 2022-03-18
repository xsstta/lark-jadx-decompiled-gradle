package com.airbnb.lottie.parser;

import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.content.C1840e;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1821c;
import com.airbnb.lottie.model.p073a.C1822d;
import com.airbnb.lottie.model.p073a.C1824f;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.site.ActivityC23764o;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.ss.android.vesdk.C64034n;
import java.io.IOException;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.n */
public class C1896n {

    /* renamed from: a */
    private static JsonReader.C1891a f6527a = JsonReader.C1891a.m8474a("nm", "g", ActivityC23764o.f58839a, "t", "s", "e", "w", "lc", "lj", "ml", "hd", C63690d.f160779a);

    /* renamed from: b */
    private static final JsonReader.C1891a f6528b = JsonReader.C1891a.m8474a("p", "k");

    /* renamed from: c */
    private static final JsonReader.C1891a f6529c = JsonReader.C1891a.m8474a(C64034n.f161683a, "v");

    /* renamed from: a */
    static C1840e m8504a(JsonReader jsonReader, C1792d dVar) throws IOException {
        C1821c cVar;
        GradientType gradientType;
        ArrayList arrayList = new ArrayList();
        String str = null;
        GradientType gradientType2 = null;
        C1821c cVar2 = null;
        C1822d dVar2 = null;
        C1824f fVar = null;
        C1824f fVar2 = null;
        C1820b bVar = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        float f = BitmapDescriptorFactory.HUE_RED;
        C1820b bVar2 = null;
        boolean z = false;
        while (jsonReader.mo9328e()) {
            switch (jsonReader.mo9321a(f6527a)) {
                case 0:
                    str = jsonReader.mo9332i();
                    break;
                case 1:
                    int i = -1;
                    jsonReader.mo9326c();
                    while (jsonReader.mo9328e()) {
                        int a = jsonReader.mo9321a(f6528b);
                        if (a != 0) {
                            cVar = cVar2;
                            if (a != 1) {
                                jsonReader.mo9331h();
                                jsonReader.mo9336m();
                            } else {
                                cVar2 = C1881d.m8431a(jsonReader, dVar, i);
                            }
                        } else {
                            cVar = cVar2;
                            i = jsonReader.mo9335l();
                        }
                        cVar2 = cVar;
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
                    bVar = C1881d.m8429a(jsonReader, dVar);
                    break;
                case 7:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.mo9335l() - 1];
                    break;
                case 8:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.mo9335l() - 1];
                    break;
                case 9:
                    f = (float) jsonReader.mo9334k();
                    break;
                case 10:
                    z = jsonReader.mo9333j();
                    break;
                case 11:
                    jsonReader.mo9323a();
                    while (jsonReader.mo9328e()) {
                        jsonReader.mo9326c();
                        String str2 = null;
                        C1820b bVar3 = null;
                        while (jsonReader.mo9328e()) {
                            int a2 = jsonReader.mo9321a(f6529c);
                            if (a2 != 0) {
                                if (a2 != 1) {
                                    jsonReader.mo9331h();
                                    jsonReader.mo9336m();
                                } else {
                                    bVar3 = C1881d.m8429a(jsonReader, dVar);
                                }
                                bVar2 = bVar2;
                            } else {
                                str2 = jsonReader.mo9332i();
                            }
                        }
                        jsonReader.mo9327d();
                        if (str2.equals(ActivityC23764o.f58839a)) {
                            bVar2 = bVar3;
                        } else {
                            if (str2.equals(C63690d.f160779a) || str2.equals("g")) {
                                dVar.mo9055a(true);
                                arrayList.add(bVar3);
                            }
                            bVar2 = bVar2;
                        }
                    }
                    jsonReader.mo9325b();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    bVar2 = bVar2;
                    break;
                default:
                    jsonReader.mo9331h();
                    jsonReader.mo9336m();
                    break;
            }
        }
        return new C1840e(str, gradientType2, cVar2, dVar2, fVar, fVar2, bVar, lineCapType, lineJoinType, f, arrayList, bVar2, z);
    }
}
