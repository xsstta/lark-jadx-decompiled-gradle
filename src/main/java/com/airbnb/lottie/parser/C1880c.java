package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.p073a.AbstractC1831m;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1822d;
import com.airbnb.lottie.model.p073a.C1823e;
import com.airbnb.lottie.model.p073a.C1825g;
import com.airbnb.lottie.model.p073a.C1827i;
import com.airbnb.lottie.model.p073a.C1830l;
import com.airbnb.lottie.p072d.C1793a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.site.ActivityC23764o;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.c */
public class C1880c {

    /* renamed from: a */
    private static JsonReader.C1891a f6493a = JsonReader.C1891a.m8474a(AbstractC60044a.f149675a, "p", "s", "rz", "r", ActivityC23764o.f58839a, "so", "eo", "sk", "sa");

    /* renamed from: b */
    private static JsonReader.C1891a f6494b = JsonReader.C1891a.m8474a("k");

    /* renamed from: a */
    private static boolean m8424a(C1823e eVar) {
        if (eVar == null || (eVar.mo9136b() && eVar.mo9137c().get(0).f6147a.equals(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m8423a(C1820b bVar) {
        if (bVar == null || (bVar.mo9136b() && bVar.mo9137c().get(0).f6147a.floatValue() == BitmapDescriptorFactory.HUE_RED)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m8427b(C1820b bVar) {
        if (bVar == null || (bVar.mo9136b() && bVar.mo9137c().get(0).f6147a.floatValue() == BitmapDescriptorFactory.HUE_RED)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m8428c(C1820b bVar) {
        if (bVar == null || (bVar.mo9136b() && bVar.mo9137c().get(0).f6147a.floatValue() == BitmapDescriptorFactory.HUE_RED)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m8425a(C1825g gVar) {
        if (gVar == null || (gVar.mo9136b() && gVar.mo9137c().get(0).f6147a.mo9088b(1.0f, 1.0f))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m8426a(AbstractC1831m<PointF, PointF> mVar) {
        if (mVar == null || (!(mVar instanceof C1827i) && mVar.mo9136b() && mVar.mo9137c().get(0).f6147a.equals(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C1830l m8422a(JsonReader jsonReader, C1792d dVar) throws IOException {
        boolean z;
        C1823e eVar;
        AbstractC1831m<PointF, PointF> mVar;
        C1820b bVar;
        C1820b bVar2;
        C1820b bVar3;
        boolean z2 = false;
        if (jsonReader.mo9329f() == JsonReader.Token.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.mo9326c();
        }
        C1820b bVar4 = null;
        C1823e eVar2 = null;
        AbstractC1831m<PointF, PointF> mVar2 = null;
        C1825g gVar = null;
        C1820b bVar5 = null;
        C1820b bVar6 = null;
        C1822d dVar2 = null;
        C1820b bVar7 = null;
        C1820b bVar8 = null;
        while (jsonReader.mo9328e()) {
            switch (jsonReader.mo9321a(f6493a)) {
                case 0:
                    jsonReader.mo9326c();
                    while (jsonReader.mo9328e()) {
                        if (jsonReader.mo9321a(f6494b) != 0) {
                            jsonReader.mo9331h();
                            jsonReader.mo9336m();
                        } else {
                            eVar2 = C1869a.m8406a(jsonReader, dVar);
                        }
                    }
                    jsonReader.mo9327d();
                    break;
                case 1:
                    mVar2 = C1869a.m8407b(jsonReader, dVar);
                    break;
                case 2:
                    gVar = C1881d.m8436d(jsonReader, dVar);
                    break;
                case 3:
                    dVar.mo9054a("Lottie doesn't support 3D layers.");
                case 4:
                    C1820b a = C1881d.m8430a(jsonReader, dVar, z2);
                    if (!a.mo9137c().isEmpty()) {
                        if (a.mo9137c().get(0).f6147a == null) {
                            a.mo9137c().set(0, new C1793a<>(dVar, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(dVar.mo9065g())));
                            bVar4 = a;
                            break;
                        }
                    } else {
                        a.mo9137c().add(new C1793a<>(dVar, Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(dVar.mo9065g())));
                    }
                    bVar4 = a;
                case 5:
                    dVar2 = C1881d.m8434b(jsonReader, dVar);
                    continue;
                case 6:
                    bVar7 = C1881d.m8430a(jsonReader, dVar, z2);
                    continue;
                case 7:
                    bVar8 = C1881d.m8430a(jsonReader, dVar, z2);
                    continue;
                case 8:
                    bVar5 = C1881d.m8430a(jsonReader, dVar, z2);
                    continue;
                case 9:
                    bVar6 = C1881d.m8430a(jsonReader, dVar, z2);
                    continue;
                default:
                    jsonReader.mo9331h();
                    jsonReader.mo9336m();
                    break;
            }
            z2 = false;
        }
        if (z) {
            jsonReader.mo9327d();
        }
        if (m8424a(eVar2)) {
            eVar = null;
        } else {
            eVar = eVar2;
        }
        if (m8426a(mVar2)) {
            mVar = null;
        } else {
            mVar = mVar2;
        }
        if (m8423a(bVar4)) {
            bVar = null;
        } else {
            bVar = bVar4;
        }
        if (m8425a(gVar)) {
            gVar = null;
        }
        if (m8427b(bVar5)) {
            bVar2 = null;
        } else {
            bVar2 = bVar5;
        }
        if (m8428c(bVar6)) {
            bVar3 = null;
        } else {
            bVar3 = bVar6;
        }
        return new C1830l(eVar, mVar, gVar, bVar, dVar2, bVar7, bVar8, bVar2, bVar3);
    }
}
