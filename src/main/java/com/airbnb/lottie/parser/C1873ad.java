package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.C1818a;
import com.airbnb.lottie.model.content.C1843h;
import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.hms.site.ActivityC23764o;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.parser.ad */
public class C1873ad implements aj<C1843h> {

    /* renamed from: a */
    public static final C1873ad f6483a = new C1873ad();

    /* renamed from: b */
    private static final JsonReader.C1891a f6484b = JsonReader.C1891a.m8474a(C60375c.f150914a, "v", "i", ActivityC23764o.f58839a);

    private C1873ad() {
    }

    /* renamed from: a */
    public C1843h mo9315b(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.mo9329f() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo9323a();
        }
        jsonReader.mo9326c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.mo9328e()) {
            int a = jsonReader.mo9321a(f6484b);
            if (a == 0) {
                z = jsonReader.mo9333j();
            } else if (a == 1) {
                list = C1898p.m8508a(jsonReader, f);
            } else if (a == 2) {
                list2 = C1898p.m8508a(jsonReader, f);
            } else if (a != 3) {
                jsonReader.mo9331h();
                jsonReader.mo9336m();
            } else {
                list3 = C1898p.m8508a(jsonReader, f);
            }
        }
        jsonReader.mo9327d();
        if (jsonReader.mo9329f() == JsonReader.Token.END_ARRAY) {
            jsonReader.mo9325b();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new C1843h(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new C1818a(C1790g.m8005a(list.get(i2), list3.get(i2)), C1790g.m8005a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new C1818a(C1790g.m8005a(list.get(i3), list3.get(i3)), C1790g.m8005a(pointF3, list2.get(0)), pointF3));
            }
            return new C1843h(pointF, z, arrayList);
        }
    }
}
