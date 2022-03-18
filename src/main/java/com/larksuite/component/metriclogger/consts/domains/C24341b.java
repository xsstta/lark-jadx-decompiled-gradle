package com.larksuite.component.metriclogger.consts.domains;

/* renamed from: com.larksuite.component.metriclogger.consts.domains.b */
public class C24341b {

    /* renamed from: a */
    private int f60032a;

    /* renamed from: b */
    private int f60033b;

    /* renamed from: c */
    private int[] f60034c;

    /* renamed from: a */
    public int mo87091a() {
        return this.f60032a;
    }

    /* renamed from: b */
    public int mo87092b() {
        return this.f60033b;
    }

    /* renamed from: c */
    public int[] mo87093c() {
        return this.f60034c;
    }

    public C24341b(int i, int i2, Class<? extends C24340a> cls) {
        this.f60033b = i2;
        this.f60034c = C24340a.m88851a(cls);
    }

    /* renamed from: a */
    public static C24341b m88853a(int i, int i2, int... iArr) {
        C24341b bVar = new C24341b(i, i2, null);
        bVar.f60034c = iArr;
        return bVar;
    }
}
