package com.larksuite.framework.apiplugin.p1176b;

/* renamed from: com.larksuite.framework.apiplugin.b.e */
public class C25910e extends C25908c {

    /* renamed from: a */
    public static C25910e f64123a = new C25910e(1401001, 1401001, "spaceFile filePath does not support");

    /* renamed from: b */
    public static C25910e f64124b = new C25910e(1400209, 1400209, "get config fail");

    /* renamed from: c */
    public static C25910e f64125c = new C25910e(1400001, 1400001, "read permission denied, %s");

    /* renamed from: d */
    public static C25910e f64126d = new C25910e(1400002, 1400002, "write permission denied, %s");

    /* renamed from: e */
    public static C25910e f64127e = new C25910e(1400003, 1400003, "file not exists, %s");

    /* renamed from: f */
    public static C25910e f64128f = new C25910e(1400004, 1400004, "file already exists, %s");

    /* renamed from: g */
    public static C25910e f64129g = new C25910e(1400005, 1400005, "directory not empty, %s");

    /* renamed from: h */
    public static C25910e f64130h = new C25910e(1400006, 1400006, "file is not directory, %s");

    /* renamed from: i */
    public static C25910e f64131i = new C25910e(1400007, 1400007, "file is not regular file, %s");

    /* renamed from: j */
    public static C25910e f64132j = new C25910e(1400008, 1400008, "total size limit exceeded");

    /* renamed from: k */
    public static C25910e f64133k = new C25910e(1400009, 1400009, "cannot operate path and subpath at the same time");

    /* renamed from: l */
    public static C25910e f64134l = new C25910e(1400010, 1400010, "read data exceeds size limit");

    /* renamed from: a */
    public static C25908c m93820a(C25908c cVar, Object... objArr) {
        return new C25910e(cVar.f64115H, cVar.f64116I, String.format(cVar.f64117J, objArr));
    }

    C25910e(int i, int i2, String str) {
        super(i, i2, str);
    }
}
