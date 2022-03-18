package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.p */
public class C1898p {

    /* renamed from: a */
    private static final JsonReader.C1891a f6531a = JsonReader.C1891a.m8474a("x", "y");

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.parser.p$1 */
    public static /* synthetic */ class C18991 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6532a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.parser.moshi.JsonReader$Token[] r0 = com.airbnb.lottie.parser.moshi.JsonReader.Token.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.airbnb.lottie.parser.C1898p.C18991.f6532a = r0
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.airbnb.lottie.parser.C1898p.C18991.f6532a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.airbnb.lottie.parser.C1898p.C18991.f6532a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.C1898p.C18991.<clinit>():void");
        }
    }

    /* renamed from: a */
    static int m8507a(JsonReader jsonReader) throws IOException {
        jsonReader.mo9323a();
        int k = (int) (jsonReader.mo9334k() * 255.0d);
        int k2 = (int) (jsonReader.mo9334k() * 255.0d);
        int k3 = (int) (jsonReader.mo9334k() * 255.0d);
        while (jsonReader.mo9328e()) {
            jsonReader.mo9336m();
        }
        jsonReader.mo9325b();
        return Color.argb(255, k, k2, k3);
    }

    /* renamed from: b */
    static float m8509b(JsonReader jsonReader) throws IOException {
        JsonReader.Token f = jsonReader.mo9329f();
        int i = C18991.f6532a[f.ordinal()];
        if (i == 1) {
            return (float) jsonReader.mo9334k();
        }
        if (i == 2) {
            jsonReader.mo9323a();
            float k = (float) jsonReader.mo9334k();
            while (jsonReader.mo9328e()) {
                jsonReader.mo9336m();
            }
            jsonReader.mo9325b();
            return k;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + f);
    }

    /* renamed from: c */
    private static PointF m8511c(JsonReader jsonReader, float f) throws IOException {
        float k = (float) jsonReader.mo9334k();
        float k2 = (float) jsonReader.mo9334k();
        while (jsonReader.mo9328e()) {
            jsonReader.mo9336m();
        }
        return new PointF(k * f, k2 * f);
    }

    /* renamed from: b */
    static PointF m8510b(JsonReader jsonReader, float f) throws IOException {
        int i = C18991.f6532a[jsonReader.mo9329f().ordinal()];
        if (i == 1) {
            return m8511c(jsonReader, f);
        }
        if (i == 2) {
            return m8512d(jsonReader, f);
        }
        if (i == 3) {
            return m8513e(jsonReader, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.mo9329f());
    }

    /* renamed from: d */
    private static PointF m8512d(JsonReader jsonReader, float f) throws IOException {
        jsonReader.mo9323a();
        float k = (float) jsonReader.mo9334k();
        float k2 = (float) jsonReader.mo9334k();
        while (jsonReader.mo9329f() != JsonReader.Token.END_ARRAY) {
            jsonReader.mo9336m();
        }
        jsonReader.mo9325b();
        return new PointF(k * f, k2 * f);
    }

    /* renamed from: e */
    private static PointF m8513e(JsonReader jsonReader, float f) throws IOException {
        jsonReader.mo9326c();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        while (jsonReader.mo9328e()) {
            int a = jsonReader.mo9321a(f6531a);
            if (a == 0) {
                f2 = m8509b(jsonReader);
            } else if (a != 1) {
                jsonReader.mo9331h();
                jsonReader.mo9336m();
            } else {
                f3 = m8509b(jsonReader);
            }
        }
        jsonReader.mo9327d();
        return new PointF(f2 * f, f3 * f);
    }

    /* renamed from: a */
    static List<PointF> m8508a(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo9323a();
        while (jsonReader.mo9329f() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo9323a();
            arrayList.add(m8510b(jsonReader, f));
            jsonReader.mo9325b();
        }
        jsonReader.mo9325b();
        return arrayList;
    }
}
