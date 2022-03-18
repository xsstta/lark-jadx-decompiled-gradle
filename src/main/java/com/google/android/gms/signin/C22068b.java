package com.google.android.gms.signin;

import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.C22072a;

/* renamed from: com.google.android.gms.signin.b */
public final class C22068b {

    /* renamed from: a */
    public static final C21611a.AbstractC21612a<C22072a, C22066a> f53678a;

    /* renamed from: b */
    public static final C21611a<C22066a> f53679b;

    /* renamed from: c */
    private static final C21611a.C21623g<C22072a> f53680c;

    /* renamed from: d */
    private static final C21611a.C21623g<C22072a> f53681d;

    /* renamed from: e */
    private static final C21611a.AbstractC21612a<C22072a, Object> f53682e;

    /* renamed from: f */
    private static final Scope f53683f = new Scope("profile");

    /* renamed from: g */
    private static final Scope f53684g = new Scope("email");

    /* renamed from: h */
    private static final C21611a<Object> f53685h;

    static {
        C21611a.C21623g<C22072a> gVar = new C21611a.C21623g<>();
        f53680c = gVar;
        C21611a.C21623g<C22072a> gVar2 = new C21611a.C21623g<>();
        f53681d = gVar2;
        C22069c cVar = new C22069c();
        f53678a = cVar;
        C22070d dVar = new C22070d();
        f53682e = dVar;
        f53679b = new C21611a<>("SignIn.API", cVar, gVar);
        f53685h = new C21611a<>("SignIn.INTERNAL_API", dVar, gVar2);
    }
}
