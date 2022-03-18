package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.C21543a;
import com.google.android.gms.auth.api.signin.internal.C21596h;
import com.google.android.gms.common.C21608a;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.C21628c;
import com.google.android.gms.common.api.internal.AbstractC21675j;
import com.google.android.gms.common.api.internal.C21644a;
import com.google.android.gms.common.internal.C21752k;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.auth.api.signin.c */
public class C21579c extends C21628c<GoogleSignInOptions> {

    /* renamed from: b */
    private static final C21580a f52496b = new C21580a(null);

    /* renamed from: c */
    private static int f52497c = C21581b.f52498a;

    /* renamed from: com.google.android.gms.auth.api.signin.c$a */
    private static class C21580a implements C21752k.AbstractC21753a<C21582d, GoogleSignInAccount> {
        private C21580a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.i] */
        @Override // com.google.android.gms.common.internal.C21752k.AbstractC21753a
        /* renamed from: a */
        public final /* synthetic */ GoogleSignInAccount mo73066a(C21582d dVar) {
            return dVar.mo73067a();
        }

        /* synthetic */ C21580a(C21587i iVar) {
            this();
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.auth.api.signin.c$b */
    public static final class C21581b {

        /* renamed from: a */
        public static final int f52498a = 1;

        /* renamed from: b */
        public static final int f52499b = 2;

        /* renamed from: c */
        public static final int f52500c = 3;

        /* renamed from: d */
        public static final int f52501d = 4;

        /* renamed from: e */
        private static final /* synthetic */ int[] f52502e = {1, 2, 3, 4};

        /* renamed from: a */
        public static int[] m78166a() {
            return (int[]) f52502e.clone();
        }
    }

    C21579c(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, (C21611a) C21543a.f52346e, (C21611a.AbstractC21615d) googleSignInOptions, (AbstractC21675j) new C21644a());
    }

    /* renamed from: k */
    private final synchronized int m78162k() {
        if (f52497c == C21581b.f52498a) {
            Context i = mo73256i();
            C21608a a = C21608a.m78228a();
            int isGooglePlayServicesAvailable = a.isGooglePlayServicesAvailable(i, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (isGooglePlayServicesAvailable == 0) {
                f52497c = C21581b.f52501d;
            } else if (a.getErrorResolutionIntent(i, isGooglePlayServicesAvailable, null) != null || DynamiteModule.getLocalVersion(i, "com.google.android.gms.auth.api.fallback") == 0) {
                f52497c = C21581b.f52499b;
            } else {
                f52497c = C21581b.f52500c;
            }
        }
        return f52497c;
    }

    /* renamed from: a */
    public Intent mo73064a() {
        Context i = mo73256i();
        int i2 = C21587i.f52506a[m78162k() - 1];
        if (i2 == 1) {
            return C21596h.m78208b(i, (GoogleSignInOptions) mo73251d());
        }
        if (i2 != 2) {
            return C21596h.m78210c(i, (GoogleSignInOptions) mo73251d());
        }
        return C21596h.m78204a(i, (GoogleSignInOptions) mo73251d());
    }

    /* renamed from: b */
    public Task<Void> mo73065b() {
        return C21752k.m79000a(C21596h.m78206a(mo73254g(), mo73256i(), m78162k() == C21581b.f52500c));
    }
}
