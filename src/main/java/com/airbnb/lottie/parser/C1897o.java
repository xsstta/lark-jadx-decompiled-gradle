package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.o */
public class C1897o implements aj<Integer> {

    /* renamed from: a */
    public static final C1897o f6530a = new C1897o();

    private C1897o() {
    }

    /* renamed from: a */
    public Integer mo9315b(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(C1898p.m8509b(jsonReader) * f));
    }
}
