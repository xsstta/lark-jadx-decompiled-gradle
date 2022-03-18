package com.airbnb.lottie.p071c;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.C1818a;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.model.content.C1843h;
import com.airbnb.lottie.p067a.p068a.AbstractC1747k;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.g */
public class C1790g {

    /* renamed from: a */
    private static PointF f6125a = new PointF();

    /* renamed from: a */
    public static double m7999a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: a */
    public static float m8000a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m8003a(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: c */
    public static boolean m8010c(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: a */
    static int m8001a(float f, float f2) {
        return m8002a((int) f, (int) f2);
    }

    /* renamed from: b */
    private static int m8009b(int i, int i2) {
        boolean z;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (z || i4 == 0) {
            return i3;
        }
        return i3 - 1;
    }

    /* renamed from: a */
    private static int m8002a(int i, int i2) {
        return i - (i2 * m8009b(i, i2));
    }

    /* renamed from: a */
    public static PointF m8005a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: a */
    public static void m8006a(C1843h hVar, Path path) {
        path.reset();
        PointF a = hVar.mo9235a();
        path.moveTo(a.x, a.y);
        f6125a.set(a.x, a.y);
        for (int i = 0; i < hVar.mo9238c().size(); i++) {
            C1818a aVar = hVar.mo9238c().get(i);
            PointF a2 = aVar.mo9129a();
            PointF b = aVar.mo9131b();
            PointF c = aVar.mo9133c();
            if (!a2.equals(f6125a) || !b.equals(c)) {
                path.cubicTo(a2.x, a2.y, b.x, b.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            f6125a.set(c.x, c.y);
        }
        if (hVar.mo9237b()) {
            path.close();
        }
    }

    /* renamed from: b */
    public static float m8008b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: a */
    public static int m8004a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: a */
    public static void m8007a(C1847d dVar, int i, List<C1847d> list, C1847d dVar2, AbstractC1747k kVar) {
        if (dVar.mo9259c(kVar.mo8939b(), i)) {
            list.add(dVar2.mo9255a(kVar.mo8939b()).mo9254a(kVar));
        }
    }
}
