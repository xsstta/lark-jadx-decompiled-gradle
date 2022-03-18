package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.i */
public class C1886i implements aj<Float> {

    /* renamed from: a */
    public static final C1886i f6500a = new C1886i();

    private C1886i() {
    }

    /* renamed from: a */
    public Float mo9315b(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(C1898p.m8509b(jsonReader) * f);
    }
}
