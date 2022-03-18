package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.AbstractC21561b;
import com.google.android.gms.auth.api.proxy.AbstractC21571a;
import com.google.android.gms.auth.api.signin.AbstractC21578b;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C21594f;
import com.google.android.gms.auth.api.signin.internal.C21595g;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.internal.p978authapi.C21856d;
import com.google.android.gms.internal.p978authapi.C21859g;

/* renamed from: com.google.android.gms.auth.api.a */
public final class C21543a {

    /* renamed from: a */
    public static final C21611a.C21623g<C21859g> f52342a;

    /* renamed from: b */
    public static final C21611a.C21623g<C21595g> f52343b;

    /* renamed from: c */
    public static final C21611a<C21558c> f52344c = C21557b.f52393a;

    /* renamed from: d */
    public static final C21611a<C21544a> f52345d;

    /* renamed from: e */
    public static final C21611a<GoogleSignInOptions> f52346e;

    /* renamed from: f */
    public static final AbstractC21571a f52347f = C21557b.f52394b;

    /* renamed from: g */
    public static final AbstractC21561b f52348g = new C21856d();

    /* renamed from: h */
    public static final AbstractC21578b f52349h = new C21594f();

    /* renamed from: i */
    private static final C21611a.AbstractC21612a<C21859g, C21544a> f52350i;

    /* renamed from: j */
    private static final C21611a.AbstractC21612a<C21595g, GoogleSignInOptions> f52351j;

    static {
        C21611a.C21623g<C21859g> gVar = new C21611a.C21623g<>();
        f52342a = gVar;
        C21611a.C21623g<C21595g> gVar2 = new C21611a.C21623g<>();
        f52343b = gVar2;
        C21569e eVar = new C21569e();
        f52350i = eVar;
        C21570f fVar = new C21570f();
        f52351j = fVar;
        f52345d = new C21611a<>("Auth.CREDENTIALS_API", eVar, gVar);
        f52346e = new C21611a<>("Auth.GOOGLE_SIGN_IN_API", fVar, gVar2);
    }

    /* renamed from: com.google.android.gms.auth.api.a$a */
    public static class C21544a implements C21611a.AbstractC21615d.AbstractC21620e {

        /* renamed from: a */
        private static final C21544a f52352a = new C21545a().mo72944a();

        /* renamed from: b */
        private final boolean f52353b;

        public C21544a(C21545a aVar) {
            this.f52353b = aVar.f52354a.booleanValue();
        }

        /* renamed from: com.google.android.gms.auth.api.a$a$a */
        public static class C21545a {

            /* renamed from: a */
            protected Boolean f52354a = false;

            /* renamed from: a */
            public C21544a mo72944a() {
                return new C21544a(this);
            }
        }

        /* renamed from: a */
        public final Bundle mo72943a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f52353b);
            return bundle;
        }
    }
}
