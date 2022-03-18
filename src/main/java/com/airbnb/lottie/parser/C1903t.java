package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.C0516c;
import androidx.collection.C0525g;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.C1806f;
import com.airbnb.lottie.model.C1833b;
import com.airbnb.lottie.model.C1834c;
import com.airbnb.lottie.model.C1850g;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.p071c.C1787d;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.parser.t */
public class C1903t {

    /* renamed from: a */
    static JsonReader.C1891a f6540a = JsonReader.C1891a.m8474a("id", "layers", "w", C14002h.f36692e, "p", "u");

    /* renamed from: b */
    private static final JsonReader.C1891a f6541b = JsonReader.C1891a.m8474a("w", C14002h.f36692e, "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: c */
    private static final JsonReader.C1891a f6542c = JsonReader.C1891a.m8474a("list");

    /* renamed from: d */
    private static final JsonReader.C1891a f6543d = JsonReader.C1891a.m8474a("cm", "tm", "dr");

    /* renamed from: a */
    public static C1792d m8524a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList;
        HashMap hashMap;
        JsonReader jsonReader2 = jsonReader;
        float a = C1791h.m8011a();
        C0516c<Layer> cVar = new C0516c<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        C0525g<C1834c> gVar = new C0525g<>();
        C1792d dVar = new C1792d();
        jsonReader.mo9326c();
        int i = 0;
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        int i2 = 0;
        while (jsonReader.mo9328e()) {
            switch (jsonReader2.mo9321a(f6541b)) {
                case 0:
                    i = jsonReader.mo9335l();
                    continue;
                    jsonReader2 = jsonReader;
                case 1:
                    i2 = jsonReader.mo9335l();
                    continue;
                    jsonReader2 = jsonReader;
                case 2:
                    f = (float) jsonReader.mo9334k();
                    continue;
                    jsonReader2 = jsonReader;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) jsonReader.mo9334k()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) jsonReader.mo9334k();
                    break;
                case 5:
                    String[] split = jsonReader.mo9332i().split("\\.");
                    if (!C1791h.m8022a(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        dVar.mo9054a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    m8527a(jsonReader2, dVar, arrayList2, cVar);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 7:
                    m8528a(jsonReader2, dVar, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 8:
                    m8529a(jsonReader2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 9:
                    m8525a(jsonReader2, dVar, gVar);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 10:
                    m8526a(jsonReader2, dVar, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    jsonReader.mo9331h();
                    jsonReader.mo9336m();
                    break;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            jsonReader2 = jsonReader;
        }
        dVar.mo9053a(new Rect(0, 0, (int) (((float) i) * a), (int) (((float) i2) * a)), f, f2, f3, arrayList2, cVar, hashMap2, hashMap3, gVar, hashMap4, arrayList3);
        return dVar;
    }

    /* renamed from: a */
    private static void m8529a(JsonReader jsonReader, Map<String, C1833b> map) throws IOException {
        jsonReader.mo9326c();
        while (jsonReader.mo9328e()) {
            if (jsonReader.mo9321a(f6542c) != 0) {
                jsonReader.mo9331h();
                jsonReader.mo9336m();
            } else {
                jsonReader.mo9323a();
                while (jsonReader.mo9328e()) {
                    C1833b a = C1888k.m8449a(jsonReader);
                    map.put(a.mo9152b(), a);
                }
                jsonReader.mo9325b();
            }
        }
        jsonReader.mo9327d();
    }

    /* renamed from: a */
    private static void m8525a(JsonReader jsonReader, C1792d dVar, C0525g<C1834c> gVar) throws IOException {
        jsonReader.mo9323a();
        while (jsonReader.mo9328e()) {
            C1834c a = C1887j.m8448a(jsonReader, dVar);
            gVar.mo3051b(a.hashCode(), a);
        }
        jsonReader.mo9325b();
    }

    /* renamed from: a */
    private static void m8526a(JsonReader jsonReader, C1792d dVar, List<C1850g> list) throws IOException {
        jsonReader.mo9323a();
        while (jsonReader.mo9328e()) {
            String str = null;
            jsonReader.mo9326c();
            float f = BitmapDescriptorFactory.HUE_RED;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            while (jsonReader.mo9328e()) {
                int a = jsonReader.mo9321a(f6543d);
                if (a == 0) {
                    str = jsonReader.mo9332i();
                } else if (a == 1) {
                    f = (float) jsonReader.mo9334k();
                } else if (a != 2) {
                    jsonReader.mo9331h();
                    jsonReader.mo9336m();
                } else {
                    f2 = (float) jsonReader.mo9334k();
                }
            }
            jsonReader.mo9327d();
            list.add(new C1850g(str, f, f2));
        }
        jsonReader.mo9325b();
    }

    /* renamed from: a */
    private static void m8527a(JsonReader jsonReader, C1792d dVar, List<Layer> list, C0516c<Layer> cVar) throws IOException {
        jsonReader.mo9323a();
        int i = 0;
        while (jsonReader.mo9328e()) {
            Layer a = C1902s.m8523a(jsonReader, dVar);
            if (a.mo9280k() == Layer.LayerType.IMAGE) {
                i++;
            }
            list.add(a);
            cVar.mo2965b(a.mo9274e(), a);
            if (i > 4) {
                C1787d.m7973b("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.mo9325b();
    }

    /* renamed from: a */
    private static void m8528a(JsonReader jsonReader, C1792d dVar, Map<String, List<Layer>> map, Map<String, C1806f> map2) throws IOException {
        jsonReader.mo9323a();
        while (jsonReader.mo9328e()) {
            ArrayList arrayList = new ArrayList();
            C0516c cVar = new C0516c();
            jsonReader.mo9326c();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (jsonReader.mo9328e()) {
                int a = jsonReader.mo9321a(f6540a);
                if (a == 0) {
                    str = jsonReader.mo9332i();
                } else if (a == 1) {
                    jsonReader.mo9323a();
                    while (jsonReader.mo9328e()) {
                        Layer a2 = C1902s.m8523a(jsonReader, dVar);
                        cVar.mo2965b(a2.mo9274e(), a2);
                        arrayList.add(a2);
                    }
                    jsonReader.mo9325b();
                } else if (a == 2) {
                    i = jsonReader.mo9335l();
                } else if (a == 3) {
                    i2 = jsonReader.mo9335l();
                } else if (a == 4) {
                    str2 = jsonReader.mo9332i();
                } else if (a != 5) {
                    jsonReader.mo9331h();
                    jsonReader.mo9336m();
                } else {
                    str3 = jsonReader.mo9332i();
                }
            }
            jsonReader.mo9327d();
            if (str2 != null) {
                C1806f fVar = new C1806f(i, i2, str, str2, str3);
                map2.put(fVar.mo9106c(), fVar);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.mo9325b();
    }
}
