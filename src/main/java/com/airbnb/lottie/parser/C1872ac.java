package com.airbnb.lottie.parser;

import com.airbnb.lottie.p072d.C1796d;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.ac */
public class C1872ac implements aj<C1796d> {

    /* renamed from: a */
    public static final C1872ac f6482a = new C1872ac();

    private C1872ac() {
    }

    /* renamed from: a */
    public C1796d mo9315b(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        if (jsonReader.mo9329f() == JsonReader.Token.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.mo9323a();
        }
        float k = (float) jsonReader.mo9334k();
        float k2 = (float) jsonReader.mo9334k();
        while (jsonReader.mo9328e()) {
            jsonReader.mo9336m();
        }
        if (z) {
            jsonReader.mo9325b();
        }
        return new C1796d((k / 100.0f) * f, (k2 / 100.0f) * f);
    }
}
