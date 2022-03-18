package com.airbnb.lottie.parser;

import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.p067a.p069b.C1771h;
import com.airbnb.lottie.p072d.C1793a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.r */
public class C1901r {

    /* renamed from: a */
    static JsonReader.C1891a f6536a = JsonReader.C1891a.m8474a("k");

    /* renamed from: a */
    public static <T> void m8521a(List<? extends C1793a<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C1793a aVar = (C1793a) list.get(i2);
            i2++;
            C1793a aVar2 = (C1793a) list.get(i2);
            aVar.f6151e = Float.valueOf(aVar2.f6150d);
            if (aVar.f6148b == null && aVar2.f6147a != null) {
                aVar.f6148b = aVar2.f6147a;
                if (aVar instanceof C1771h) {
                    ((C1771h) aVar).mo8979a();
                }
            }
        }
        C1793a aVar3 = (C1793a) list.get(i);
        if ((aVar3.f6147a == null || aVar3.f6148b == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }

    /* renamed from: a */
    static <T> List<C1793a<T>> m8520a(JsonReader jsonReader, C1792d dVar, float f, aj<T> ajVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo9329f() == JsonReader.Token.STRING) {
            dVar.mo9054a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.mo9326c();
        while (jsonReader.mo9328e()) {
            if (jsonReader.mo9321a(f6536a) != 0) {
                jsonReader.mo9336m();
            } else if (jsonReader.mo9329f() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.mo9323a();
                if (jsonReader.mo9329f() == JsonReader.Token.NUMBER) {
                    arrayList.add(C1900q.m8517a(jsonReader, dVar, f, ajVar, false));
                } else {
                    while (jsonReader.mo9328e()) {
                        arrayList.add(C1900q.m8517a(jsonReader, dVar, f, ajVar, true));
                    }
                }
                jsonReader.mo9325b();
            } else {
                arrayList.add(C1900q.m8517a(jsonReader, dVar, f, ajVar, false));
            }
        }
        jsonReader.mo9327d();
        m8521a(arrayList);
        return arrayList;
    }
}
