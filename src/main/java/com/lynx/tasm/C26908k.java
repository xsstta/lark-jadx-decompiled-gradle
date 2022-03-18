package com.lynx.tasm;

/* renamed from: com.lynx.tasm.k */
public class C26908k {

    /* renamed from: a */
    static int f66804a = 0;

    /* renamed from: b */
    public static String f66805b = "-1";

    /* renamed from: c */
    private String f66806c;

    /* renamed from: d */
    private String f66807d;

    /* renamed from: e */
    private boolean f66808e;

    /* renamed from: f */
    private String[] f66809f;

    /* renamed from: g */
    private boolean f66810g;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo95716b() {
        return this.f66807d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo95717c() {
        return this.f66808e;
    }

    /* renamed from: d */
    public boolean mo95718d() {
        return this.f66810g;
    }

    /* renamed from: e */
    public String[] mo95719e() {
        return this.f66809f;
    }

    /* renamed from: a */
    static String m97761a() {
        String format = String.format("%d", Integer.valueOf(f66804a));
        f66804a++;
        return format;
    }

    /* renamed from: a */
    public static C26908k m97760a(String str, String[] strArr) {
        return new C26908k(str, m97761a(), strArr, false, false);
    }

    C26908k(String str, String str2, String[] strArr, boolean z, boolean z2) {
        this.f66806c = str;
        this.f66809f = strArr;
        this.f66810g = z2;
        this.f66807d = str2;
        this.f66808e = z;
        this.f66810g = z2;
    }

    /* renamed from: a */
    public static C26908k m97759a(String str, String str2, String[] strArr, boolean z, boolean z2) {
        return new C26908k(str, str2, strArr, z, z2);
    }
}
