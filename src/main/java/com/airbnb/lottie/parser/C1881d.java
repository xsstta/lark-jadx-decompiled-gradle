package com.airbnb.lottie.parser;

import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.p073a.C1819a;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1821c;
import com.airbnb.lottie.model.p073a.C1822d;
import com.airbnb.lottie.model.p073a.C1824f;
import com.airbnb.lottie.model.p073a.C1825g;
import com.airbnb.lottie.model.p073a.C1826h;
import com.airbnb.lottie.model.p073a.C1828j;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.p072d.C1793a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;

/* renamed from: com.airbnb.lottie.parser.d */
public class C1881d {
    /* renamed from: a */
    public static C1820b m8429a(JsonReader jsonReader, C1792d dVar) throws IOException {
        return m8430a(jsonReader, dVar, true);
    }

    /* renamed from: b */
    static C1822d m8434b(JsonReader jsonReader, C1792d dVar) throws IOException {
        return new C1822d(m8433a(jsonReader, dVar, C1897o.f6530a));
    }

    /* renamed from: c */
    static C1824f m8435c(JsonReader jsonReader, C1792d dVar) throws IOException {
        return new C1824f(m8432a(jsonReader, C1791h.m8011a(), dVar, C1908y.f6546a));
    }

    /* renamed from: d */
    static C1825g m8436d(JsonReader jsonReader, C1792d dVar) throws IOException {
        return new C1825g(m8433a(jsonReader, dVar, C1872ac.f6482a));
    }

    /* renamed from: e */
    static C1826h m8437e(JsonReader jsonReader, C1792d dVar) throws IOException {
        return new C1826h(m8432a(jsonReader, C1791h.m8011a(), dVar, C1873ad.f6483a));
    }

    /* renamed from: f */
    static C1828j m8438f(JsonReader jsonReader, C1792d dVar) throws IOException {
        return new C1828j(m8433a(jsonReader, dVar, C1885h.f6498a));
    }

    /* renamed from: g */
    static C1819a m8439g(JsonReader jsonReader, C1792d dVar) throws IOException {
        return new C1819a(m8433a(jsonReader, dVar, C1883f.f6496a));
    }

    /* renamed from: a */
    static C1821c m8431a(JsonReader jsonReader, C1792d dVar, int i) throws IOException {
        return new C1821c(m8433a(jsonReader, dVar, new C1889l(i)));
    }

    /* renamed from: a */
    public static C1820b m8430a(JsonReader jsonReader, C1792d dVar, boolean z) throws IOException {
        float f;
        if (z) {
            f = C1791h.m8011a();
        } else {
            f = 1.0f;
        }
        return new C1820b(m8432a(jsonReader, f, dVar, C1886i.f6500a));
    }

    /* renamed from: a */
    private static <T> List<C1793a<T>> m8433a(JsonReader jsonReader, C1792d dVar, aj<T> ajVar) throws IOException {
        return C1901r.m8520a(jsonReader, dVar, 1.0f, ajVar);
    }

    /* renamed from: a */
    private static <T> List<C1793a<T>> m8432a(JsonReader jsonReader, float f, C1792d dVar, aj<T> ajVar) throws IOException {
        return C1901r.m8520a(jsonReader, dVar, f, ajVar);
    }
}
