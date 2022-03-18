package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.C0525g;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.p071c.C1790g;
import com.airbnb.lottie.p071c.C1791h;
import com.airbnb.lottie.p072d.C1793a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.site.ActivityC23764o;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.q */
public class C1900q {

    /* renamed from: a */
    static JsonReader.C1891a f6533a = JsonReader.C1891a.m8474a("t", "s", "e", ActivityC23764o.f58839a, "i", C14002h.f36692e, "to", "ti");

    /* renamed from: b */
    private static final Interpolator f6534b = new LinearInterpolator();

    /* renamed from: c */
    private static C0525g<WeakReference<Interpolator>> f6535c;

    C1900q() {
    }

    /* renamed from: a */
    private static C0525g<WeakReference<Interpolator>> m8514a() {
        if (f6535c == null) {
            f6535c = new C0525g<>();
        }
        return f6535c;
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m8518a(int i) {
        WeakReference<Interpolator> a;
        synchronized (C1900q.class) {
            a = m8514a().mo3047a(i);
        }
        return a;
    }

    /* renamed from: a */
    private static void m8519a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C1900q.class) {
            f6535c.mo3051b(i, weakReference);
        }
    }

    /* renamed from: a */
    private static <T> C1793a<T> m8516a(JsonReader jsonReader, float f, aj<T> ajVar) throws IOException {
        return new C1793a<>(ajVar.mo9315b(jsonReader, f));
    }

    /* renamed from: a */
    private static <T> C1793a<T> m8515a(C1792d dVar, JsonReader jsonReader, float f, aj<T> ajVar) throws IOException {
        Interpolator interpolator;
        T t;
        Interpolator interpolator2;
        jsonReader.mo9326c();
        Interpolator interpolator3 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        while (jsonReader.mo9328e()) {
            switch (jsonReader.mo9321a(f6533a)) {
                case 0:
                    f2 = (float) jsonReader.mo9334k();
                    break;
                case 1:
                    t3 = ajVar.mo9315b(jsonReader, f);
                    break;
                case 2:
                    t2 = ajVar.mo9315b(jsonReader, f);
                    break;
                case 3:
                    pointF = C1898p.m8510b(jsonReader, f);
                    break;
                case 4:
                    pointF2 = C1898p.m8510b(jsonReader, f);
                    break;
                case 5:
                    if (jsonReader.mo9335l() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF4 = C1898p.m8510b(jsonReader, f);
                    break;
                case 7:
                    pointF3 = C1898p.m8510b(jsonReader, f);
                    break;
                default:
                    jsonReader.mo9336m();
                    break;
            }
        }
        jsonReader.mo9327d();
        if (z) {
            interpolator = f6534b;
            t = t3;
        } else {
            if (pointF == null || pointF2 == null) {
                interpolator = f6534b;
            } else {
                float f3 = -f;
                pointF.x = C1790g.m8008b(pointF.x, f3, f);
                pointF.y = C1790g.m8008b(pointF.y, -100.0f, 100.0f);
                pointF2.x = C1790g.m8008b(pointF2.x, f3, f);
                pointF2.y = C1790g.m8008b(pointF2.y, -100.0f, 100.0f);
                int a = C1791h.m8014a(pointF.x, pointF.y, pointF2.x, pointF2.y);
                WeakReference<Interpolator> a2 = m8518a(a);
                if (a2 != null) {
                    interpolator3 = a2.get();
                }
                if (a2 == null || interpolator3 == null) {
                    pointF.x /= f;
                    pointF.y /= f;
                    pointF2.x /= f;
                    pointF2.y /= f;
                    try {
                        interpolator2 = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
                    } catch (IllegalArgumentException e) {
                        if (e.getMessage().equals("The Path cannot loop back on itself.")) {
                            interpolator2 = PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, (float) BitmapDescriptorFactory.HUE_RED), pointF2.y);
                        } else {
                            interpolator2 = new LinearInterpolator();
                        }
                    }
                    interpolator3 = interpolator2;
                    try {
                        m8519a(a, new WeakReference(interpolator3));
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                }
                interpolator = interpolator3;
            }
            t = t2;
        }
        C1793a<T> aVar = new C1793a<>(dVar, t3, t, interpolator, f2, null);
        aVar.f6152f = pointF4;
        aVar.f6153g = pointF3;
        return aVar;
    }

    /* renamed from: a */
    static <T> C1793a<T> m8517a(JsonReader jsonReader, C1792d dVar, float f, aj<T> ajVar, boolean z) throws IOException {
        if (z) {
            return m8515a(dVar, jsonReader, f, ajVar);
        }
        return m8516a(jsonReader, f, ajVar);
    }
}
