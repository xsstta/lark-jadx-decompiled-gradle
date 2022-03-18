package com.scwang.smart.refresh.layout.constant;

/* renamed from: com.scwang.smart.refresh.layout.constant.a */
public class C27098a {

    /* renamed from: a */
    public static final C27098a f67322a;

    /* renamed from: b */
    public static final C27098a f67323b;

    /* renamed from: c */
    public static final C27098a f67324c;

    /* renamed from: d */
    public static final C27098a f67325d;

    /* renamed from: e */
    public static final C27098a f67326e;

    /* renamed from: f */
    public static final C27098a f67327f;

    /* renamed from: g */
    public static final C27098a f67328g;

    /* renamed from: h */
    public static final C27098a f67329h;

    /* renamed from: i */
    public static final C27098a f67330i;

    /* renamed from: j */
    public static final C27098a f67331j;

    /* renamed from: k */
    public static final C27098a f67332k;

    /* renamed from: l */
    public static final C27098a f67333l;

    /* renamed from: o */
    public static final C27098a[] f67334o;

    /* renamed from: m */
    public final int f67335m;

    /* renamed from: n */
    public final boolean f67336n;

    /* renamed from: a */
    public C27098a mo96331a() {
        if (!this.f67336n) {
            return f67334o[this.f67335m + 1];
        }
        return this;
    }

    static {
        C27098a aVar = new C27098a(0, false);
        f67322a = aVar;
        C27098a aVar2 = new C27098a(1, true);
        f67323b = aVar2;
        C27098a aVar3 = new C27098a(2, false);
        f67324c = aVar3;
        C27098a aVar4 = new C27098a(3, true);
        f67325d = aVar4;
        C27098a aVar5 = new C27098a(4, false);
        f67326e = aVar5;
        C27098a aVar6 = new C27098a(5, true);
        f67327f = aVar6;
        C27098a aVar7 = new C27098a(6, false);
        f67328g = aVar7;
        C27098a aVar8 = new C27098a(7, true);
        f67329h = aVar8;
        C27098a aVar9 = new C27098a(8, false);
        f67330i = aVar9;
        C27098a aVar10 = new C27098a(9, true);
        f67331j = aVar10;
        C27098a aVar11 = new C27098a(10, false);
        f67332k = aVar11;
        C27098a aVar12 = new C27098a(10, true);
        f67333l = aVar12;
        f67334o = new C27098a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
    }

    /* renamed from: a */
    public boolean mo96332a(C27098a aVar) {
        int i = this.f67335m;
        int i2 = aVar.f67335m;
        if (i < i2 || ((!this.f67336n || f67331j == this) && i == i2)) {
            return true;
        }
        return false;
    }

    private C27098a(int i, boolean z) {
        this.f67335m = i;
        this.f67336n = z;
    }
}
