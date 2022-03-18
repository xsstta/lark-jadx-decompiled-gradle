package com.larksuite.framework.apiplugin.p1176b;

/* renamed from: com.larksuite.framework.apiplugin.b.f */
public class C25911f extends C25908c {

    /* renamed from: a */
    public static C25911f f64135a = new C25911f(1601201, 1601201, "location fail");

    /* renamed from: b */
    public static C25911f f64136b = new C25911f(1600001, 1600001, "please check gps service and location permission is open");

    /* renamed from: c */
    public static C25911f f64137c = new C25911f(1600002, 1600002, "please move multi WiFi area");

    /* renamed from: d */
    public static C25911f f64138d = new C25911f(1600003, 1600003, "please close Flight mode and open WiFi");

    /* renamed from: e */
    public static C25911f f64139e = new C25911f(1600004, 1600004, "network exception,please check network");

    /* renamed from: f */
    public static C25911f f64140f = new C25911f(1600005, 1600005, "Network location failed, please insert sim card or connect to WiFi");

    /* renamed from: g */
    public static C25911f f64141g = new C25911f(1600006, 1600006, "location timeout please app is front");

    /* renamed from: h */
    public static C25911f f64142h = new C25911f(1600007, 1600007, "google service not available please install google service");

    /* renamed from: a */
    public static C25911f m93821a(int i) {
        if (i == 2) {
            return f64137c;
        }
        if (i == 4) {
            return f64139e;
        }
        if (i == 18) {
            return f64138d;
        }
        if (i == 12) {
            return f64136b;
        }
        if (i == 13) {
            return f64140f;
        }
        if (i == 2003) {
            return f64142h;
        }
        if (i != 2004) {
            return f64135a;
        }
        return f64141g;
    }

    C25911f(int i, int i2, String str) {
        super(i, i2, str);
    }
}
