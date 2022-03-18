package com.airbnb.lottie.model;

/* renamed from: com.airbnb.lottie.model.g */
public class C1850g {

    /* renamed from: c */
    private static String f6375c = "\r";

    /* renamed from: a */
    public final float f6376a;

    /* renamed from: b */
    public final float f6377b;

    /* renamed from: d */
    private final String f6378d;

    /* renamed from: a */
    public boolean mo9264a(String str) {
        if (this.f6378d.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f6378d.endsWith(f6375c)) {
            String str2 = this.f6378d;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public C1850g(String str, float f, float f2) {
        this.f6378d = str;
        this.f6377b = f2;
        this.f6376a = f;
    }
}
