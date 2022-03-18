package com.lynx.tasm.behavior.ui.utils;

import android.graphics.Matrix;
import android.util.DisplayMetrics;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.utils.C26953h;
import com.lynx.tasm.utils.C26960n;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.utils.g */
public class C26834g {

    /* renamed from: g */
    private static ThreadLocal<double[]> f66648g = new ThreadLocal<double[]>() {
        /* class com.lynx.tasm.behavior.ui.utils.C26834g.C268351 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public double[] initialValue() {
            return new double[16];
        }
    };

    /* renamed from: a */
    private C26833f f66649a;

    /* renamed from: b */
    private float f66650b;

    /* renamed from: c */
    private float f66651c;

    /* renamed from: d */
    private Matrix f66652d = new Matrix();

    /* renamed from: e */
    private LinkedHashMap<String, Float> f66653e = new LinkedHashMap<>();

    /* renamed from: f */
    private LinkedHashMap<String, String> f66654f = new LinkedHashMap<>();

    /* renamed from: k */
    private static double m97549k(float f) {
        return (((double) f) * 3.141592653589793d) / 180.0d;
    }

    /* renamed from: j */
    public float mo95576j() {
        return this.f66650b;
    }

    /* renamed from: k */
    public float mo95578k() {
        return this.f66651c;
    }

    /* renamed from: a */
    public void mo95555a() {
        this.f66652d.reset();
        this.f66653e.clear();
    }

    public C26834g() {
        mo95555a();
    }

    /* renamed from: b */
    public float mo95559b() {
        Float f = this.f66653e.get("translateX");
        if (f != null) {
            return f.floatValue();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: c */
    public float mo95562c() {
        Float f = this.f66653e.get("translateY");
        if (f != null) {
            return f.floatValue();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: d */
    public float mo95564d() {
        Float f = this.f66653e.get("translateZ");
        if (f != null) {
            return f.floatValue();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: e */
    public float mo95566e() {
        Float f = this.f66653e.get("rotate");
        if (f != null) {
            return f.floatValue();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: f */
    public float mo95568f() {
        Float f = this.f66653e.get("rotateX");
        if (f != null) {
            return f.floatValue();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: g */
    public float mo95570g() {
        Float f = this.f66653e.get("rotateY");
        if (f != null) {
            return f.floatValue();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: h */
    public float mo95572h() {
        Float f = this.f66653e.get("scaleX");
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    /* renamed from: i */
    public float mo95574i() {
        Float f = this.f66653e.get("scaleY");
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    /* renamed from: a */
    public void mo95557a(C26833f fVar) {
        this.f66649a = fVar;
    }

    /* renamed from: i */
    public void mo95575i(float f) {
        this.f66650b = f;
    }

    /* renamed from: j */
    public void mo95577j(float f) {
        this.f66651c = f;
    }

    /* renamed from: b */
    public void mo95561b(float f) {
        this.f66653e.put("translateY", Float.valueOf(f));
    }

    /* renamed from: c */
    public void mo95563c(float f) {
        this.f66653e.put("translateZ", Float.valueOf(f));
    }

    /* renamed from: d */
    public void mo95565d(float f) {
        this.f66653e.put("rotate", Float.valueOf(f));
    }

    /* renamed from: e */
    public void mo95567e(float f) {
        this.f66653e.put("rotateX", Float.valueOf(f));
    }

    /* renamed from: f */
    public void mo95569f(float f) {
        this.f66653e.put("rotateY", Float.valueOf(f));
    }

    /* renamed from: g */
    public void mo95571g(float f) {
        this.f66653e.put("scaleX", Float.valueOf(f));
    }

    /* renamed from: h */
    public void mo95573h(float f) {
        this.f66653e.put("scaleY", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo95556a(float f) {
        this.f66653e.put("translateX", Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo95558a(double[] dArr) {
        double[] dArr2 = f66648g.get();
        C26953h.m97920a(dArr);
        for (String str : this.f66653e.keySet()) {
            C26953h.m97920a(dArr2);
            float floatValue = this.f66653e.get(str).floatValue();
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1721943862:
                    if (str.equals("translateX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1721943861:
                    if (str.equals("translateY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1721943860:
                    if (str.equals("translateZ")) {
                        c = 2;
                        break;
                    }
                    break;
                case -925180581:
                    if (str.equals("rotate")) {
                        c = 3;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 4;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1384173149:
                    if (str.equals("rotateX")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1384173150:
                    if (str.equals("rotateY")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1384173151:
                    if (str.equals("rotateZ")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    C26953h.m97922a(dArr2, (double) floatValue, 0.0d);
                    break;
                case 1:
                    C26953h.m97922a(dArr2, 0.0d, (double) floatValue);
                    break;
                case 2:
                    C26953h.m97923a(dArr2, 0.0d, 0.0d, (double) floatValue);
                    break;
                case 3:
                case '\b':
                    C26953h.m97937e(dArr2, m97549k(floatValue));
                    break;
                case 4:
                    C26953h.m97921a(dArr2, (double) floatValue);
                    break;
                case 5:
                    C26953h.m97929b(dArr2, (double) floatValue);
                    break;
                case 6:
                    C26953h.m97934c(dArr2, m97549k(floatValue));
                    break;
                case 7:
                    C26953h.m97935d(dArr2, m97549k(floatValue));
                    break;
            }
            C26953h.m97925a(dArr, dArr, dArr2);
        }
    }

    /* renamed from: a */
    public float mo95553a(float f, DisplayMetrics displayMetrics) {
        String str = this.f66654f.get("translateX");
        if (str != null && str.endsWith("%")) {
            return C26960n.m97980a(str, f, BitmapDescriptorFactory.HUE_RED, displayMetrics);
        }
        Float f2 = this.f66653e.get("translateX");
        if (f2 != null) {
            return f2.floatValue();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: b */
    public float mo95560b(float f, DisplayMetrics displayMetrics) {
        String str = this.f66654f.get("translateY");
        if (str != null && str.endsWith("%")) {
            return C26960n.m97980a(str, f, BitmapDescriptorFactory.HUE_RED, displayMetrics);
        }
        Float f2 = this.f66653e.get("translateY");
        if (f2 != null) {
            return f2.floatValue();
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: a */
    public Matrix mo95554a(float f, float f2) {
        if (this.f66652d == null) {
            this.f66652d = new Matrix();
        }
        if (!this.f66652d.isIdentity()) {
            return this.f66652d;
        }
        for (String str : this.f66653e.keySet()) {
            float floatValue = this.f66653e.get(str).floatValue();
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1721943862:
                    if (str.equals("translateX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1721943861:
                    if (str.equals("translateY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -925180581:
                    if (str.equals("rotate")) {
                        c = 2;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 3;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f66652d.preTranslate(floatValue, BitmapDescriptorFactory.HUE_RED);
                    break;
                case 1:
                    this.f66652d.preTranslate(BitmapDescriptorFactory.HUE_RED, floatValue);
                    break;
                case 2:
                    this.f66652d.preRotate(floatValue, f, f2);
                    break;
                case 3:
                    this.f66652d.preScale(floatValue, 1.0f, f, f2);
                    break;
                case 4:
                    this.f66652d.preScale(1.0f, floatValue, f, f2);
                    break;
            }
        }
        return this.f66652d;
    }

    /* renamed from: a */
    public static C26834g m97547a(C26833f fVar, float f, float f2) {
        C26834g gVar = new C26834g();
        gVar.mo95557a(fVar);
        gVar.mo95575i(f * 0.5f);
        gVar.mo95577j(0.5f * f2);
        if (!(fVar == null || fVar == C26833f.f66643a)) {
            if (fVar.mo95546b()) {
                float g = fVar.mo95551g();
                if (fVar.mo95548d()) {
                    g *= f;
                }
                gVar.mo95575i(g);
            }
            if (fVar.mo95547c()) {
                float h = fVar.mo95552h();
                if (fVar.mo95549e()) {
                    h *= f2;
                }
                gVar.mo95577j(h);
            }
        }
        return gVar;
    }

    /* renamed from: a */
    public static C26834g m97548a(List<C26836h> list, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        float f8;
        C26834g gVar = new C26834g();
        if (list != null && !list.isEmpty()) {
            for (C26836h hVar : list) {
                int a = hVar.mo95581a();
                if (a != 1) {
                    if (a == 2) {
                        boolean c = hVar.mo95583c();
                        float b = hVar.mo95582b();
                        if (c) {
                            b *= f5;
                        }
                        gVar.mo95556a(b);
                    } else if (a == 4) {
                        boolean c2 = hVar.mo95583c();
                        float b2 = hVar.mo95582b();
                        if (c2) {
                            b2 *= f6;
                        }
                        gVar.mo95561b(b2);
                    } else if (a == 8) {
                        boolean c3 = hVar.mo95583c();
                        float b3 = hVar.mo95582b();
                        if (c3) {
                            b3 *= f3;
                        }
                        gVar.mo95563c(b3);
                    } else if (a != 16) {
                        if (a != 32) {
                            if (a == 64) {
                                gVar.mo95567e(hVar.mo95582b());
                            } else if (a == 128) {
                                gVar.mo95569f(hVar.mo95582b());
                            } else if (a != 256) {
                                if (a == 512) {
                                    gVar.mo95571g(hVar.mo95582b());
                                    gVar.mo95573h(hVar.mo95584d());
                                } else if (a == 1024) {
                                    gVar.mo95571g(hVar.mo95582b());
                                } else if (a != 2048) {
                                    LLog.m96424c();
                                    return null;
                                } else {
                                    gVar.mo95573h(hVar.mo95582b());
                                }
                            }
                        }
                        gVar.mo95565d(hVar.mo95582b());
                    }
                }
                if (hVar.mo95583c()) {
                    f7 = hVar.mo95582b() * f5;
                } else {
                    f7 = hVar.mo95582b();
                }
                gVar.mo95556a(f7);
                if (hVar.mo95585e()) {
                    f8 = hVar.mo95584d() * f6;
                } else {
                    f8 = hVar.mo95584d();
                }
                gVar.mo95561b(f8);
                gVar.mo95563c(hVar.mo95586f());
            }
        }
        return gVar;
    }
}
