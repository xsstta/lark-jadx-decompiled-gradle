package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.content.AbstractC1837b;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1828j;
import com.airbnb.lottie.model.p073a.C1829k;
import com.airbnb.lottie.model.p073a.C1830l;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.p072d.C1793a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vc.statistics.p3180a.C63690d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.parser.s */
public class C1902s {

    /* renamed from: a */
    private static final JsonReader.C1891a f6537a = JsonReader.C1891a.m8474a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", C14002h.f36692e, "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    private static final JsonReader.C1891a f6538b = JsonReader.C1891a.m8474a(C63690d.f160779a, AbstractC60044a.f149675a);

    /* renamed from: c */
    private static final JsonReader.C1891a f6539c = JsonReader.C1891a.m8474a("nm");

    /* renamed from: a */
    public static Layer m8522a(C1792d dVar) {
        Rect d = dVar.mo9062d();
        return new Layer(Collections.emptyList(), dVar, "__container", -1, Layer.LayerType.PRE_COMP, -1, null, Collections.emptyList(), new C1830l(), 0, 0, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, d.width(), d.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false);
    }

    /* renamed from: a */
    public static Layer m8523a(JsonReader jsonReader, C1792d dVar) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        jsonReader.mo9326c();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf((float) BitmapDescriptorFactory.HUE_RED);
        Layer.MatteType matteType2 = matteType;
        Layer.LayerType layerType = null;
        String str = null;
        C1830l lVar = null;
        C1828j jVar = null;
        C1829k kVar = null;
        C1820b bVar = null;
        long j = -1;
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f3 = 1.0f;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        long j2 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (jsonReader.mo9328e()) {
            switch (jsonReader.mo9321a(f6537a)) {
                case 0:
                    str3 = jsonReader.mo9332i();
                    break;
                case 1:
                    j2 = (long) jsonReader.mo9335l();
                    break;
                case 2:
                    str = jsonReader.mo9332i();
                    break;
                case 3:
                    int l = jsonReader.mo9335l();
                    if (l >= Layer.LayerType.UNKNOWN.ordinal()) {
                        layerType = Layer.LayerType.UNKNOWN;
                        break;
                    } else {
                        layerType = Layer.LayerType.values()[l];
                        break;
                    }
                case 4:
                    j = (long) jsonReader.mo9335l();
                    break;
                case 5:
                    i = (int) (((float) jsonReader.mo9335l()) * C1791h.m8011a());
                    break;
                case 6:
                    i2 = (int) (((float) jsonReader.mo9335l()) * C1791h.m8011a());
                    break;
                case 7:
                    i3 = Color.parseColor(jsonReader.mo9332i());
                    break;
                case 8:
                    lVar = C1880c.m8422a(jsonReader, dVar);
                    break;
                case 9:
                    matteType2 = Layer.MatteType.values()[jsonReader.mo9335l()];
                    dVar.mo9052a(1);
                    break;
                case 10:
                    jsonReader.mo9323a();
                    while (jsonReader.mo9328e()) {
                        arrayList3.add(C1904u.m8530a(jsonReader, dVar));
                    }
                    dVar.mo9052a(arrayList3.size());
                    jsonReader.mo9325b();
                    break;
                case 11:
                    jsonReader.mo9323a();
                    while (jsonReader.mo9328e()) {
                        AbstractC1837b a = C1884g.m8443a(jsonReader, dVar);
                        if (a != null) {
                            arrayList4.add(a);
                        }
                    }
                    jsonReader.mo9325b();
                    break;
                case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                    jsonReader.mo9326c();
                    while (jsonReader.mo9328e()) {
                        int a2 = jsonReader.mo9321a(f6538b);
                        if (a2 == 0) {
                            jVar = C1881d.m8438f(jsonReader, dVar);
                        } else if (a2 != 1) {
                            jsonReader.mo9331h();
                            jsonReader.mo9336m();
                        } else {
                            jsonReader.mo9323a();
                            if (jsonReader.mo9328e()) {
                                kVar = C1879b.m8420a(jsonReader, dVar);
                            }
                            while (jsonReader.mo9328e()) {
                                jsonReader.mo9336m();
                            }
                            jsonReader.mo9325b();
                        }
                    }
                    jsonReader.mo9327d();
                    break;
                case 13:
                    jsonReader.mo9323a();
                    ArrayList arrayList5 = new ArrayList();
                    while (jsonReader.mo9328e()) {
                        jsonReader.mo9326c();
                        while (jsonReader.mo9328e()) {
                            if (jsonReader.mo9321a(f6539c) != 0) {
                                jsonReader.mo9331h();
                                jsonReader.mo9336m();
                            } else {
                                arrayList5.add(jsonReader.mo9332i());
                            }
                        }
                        jsonReader.mo9327d();
                    }
                    jsonReader.mo9325b();
                    dVar.mo9054a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f3 = (float) jsonReader.mo9334k();
                    break;
                case 15:
                    f4 = (float) jsonReader.mo9334k();
                    break;
                case 16:
                    i4 = (int) (((float) jsonReader.mo9335l()) * C1791h.m8011a());
                    break;
                case 17:
                    i5 = (int) (((float) jsonReader.mo9335l()) * C1791h.m8011a());
                    break;
                case 18:
                    f = (float) jsonReader.mo9334k();
                    break;
                case 19:
                    f2 = (float) jsonReader.mo9334k();
                    break;
                case 20:
                    bVar = C1881d.m8430a(jsonReader, dVar, false);
                    break;
                case 21:
                    str2 = jsonReader.mo9332i();
                    break;
                case 22:
                    z = jsonReader.mo9333j();
                    break;
                default:
                    jsonReader.mo9331h();
                    jsonReader.mo9336m();
                    break;
            }
        }
        jsonReader.mo9327d();
        float f5 = f / f3;
        float f6 = f2 / f3;
        ArrayList arrayList6 = new ArrayList();
        if (f5 > BitmapDescriptorFactory.HUE_RED) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new C1793a(dVar, valueOf2, valueOf2, null, BitmapDescriptorFactory.HUE_RED, Float.valueOf(f5)));
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (f6 <= BitmapDescriptorFactory.HUE_RED) {
            f6 = dVar.mo9065g();
        }
        arrayList2.add(new C1793a(dVar, valueOf, valueOf, null, f5, Float.valueOf(f6)));
        arrayList2.add(new C1793a(dVar, valueOf2, valueOf2, null, f6, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            dVar.mo9054a("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList4, dVar, str3, j2, layerType, j, str, arrayList, lVar, i, i2, i3, f3, f4, i4, i5, jVar, kVar, arrayList2, matteType2, bVar, z);
    }
}
