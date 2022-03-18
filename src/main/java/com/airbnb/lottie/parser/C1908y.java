package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.y */
public class C1908y implements aj<PointF> {

    /* renamed from: a */
    public static final C1908y f6546a = new C1908y();

    private C1908y() {
    }

    /* renamed from: a */
    public PointF mo9315b(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token f2 = jsonReader.mo9329f();
        if (f2 == JsonReader.Token.BEGIN_ARRAY) {
            return C1898p.m8510b(jsonReader, f);
        }
        if (f2 == JsonReader.Token.BEGIN_OBJECT) {
            return C1898p.m8510b(jsonReader, f);
        }
        if (f2 == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.mo9334k()) * f, ((float) jsonReader.mo9334k()) * f);
            while (jsonReader.mo9328e()) {
                jsonReader.mo9336m();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + f2);
    }
}
