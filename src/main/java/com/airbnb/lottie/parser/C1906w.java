package com.airbnb.lottie.parser;

import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.p067a.p069b.C1771h;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.w */
public class C1906w {
    /* renamed from: a */
    static C1771h m8532a(JsonReader jsonReader, C1792d dVar) throws IOException {
        boolean z;
        if (jsonReader.mo9329f() == JsonReader.Token.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        return new C1771h(dVar, C1900q.m8517a(jsonReader, dVar, C1791h.m8011a(), C1907x.f6545a, z));
    }
}
