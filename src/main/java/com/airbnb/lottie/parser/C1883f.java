package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.f */
public class C1883f implements aj<Integer> {

    /* renamed from: a */
    public static final C1883f f6496a = new C1883f();

    private C1883f() {
    }

    /* renamed from: a */
    public Integer mo9315b(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        if (jsonReader.mo9329f() == JsonReader.Token.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.mo9323a();
        }
        double k = jsonReader.mo9334k();
        double k2 = jsonReader.mo9334k();
        double k3 = jsonReader.mo9334k();
        double k4 = jsonReader.mo9334k();
        if (z) {
            jsonReader.mo9325b();
        }
        if (k <= 1.0d && k2 <= 1.0d && k3 <= 1.0d) {
            k *= 255.0d;
            k2 *= 255.0d;
            k3 *= 255.0d;
            if (k4 <= 1.0d) {
                k4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) k4, (int) k, (int) k2, (int) k3));
    }
}
