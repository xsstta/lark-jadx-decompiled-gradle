package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: com.google.android.gms.auth.api.signin.internal.m */
public final class C21601m {

    /* renamed from: a */
    private static C21601m f52534a;

    /* renamed from: b */
    private C21590b f52535b;

    /* renamed from: c */
    private GoogleSignInAccount f52536c;

    /* renamed from: d */
    private GoogleSignInOptions f52537d = this.f52535b.mo73088b();

    private C21601m(Context context) {
        C21590b a = C21590b.m78184a(context);
        this.f52535b = a;
        this.f52536c = a.mo73086a();
    }

    /* renamed from: a */
    public static synchronized C21601m m78217a(Context context) {
        C21601m b;
        synchronized (C21601m.class) {
            b = m78218b(context.getApplicationContext());
        }
        return b;
    }

    /* renamed from: b */
    private static synchronized C21601m m78218b(Context context) {
        C21601m mVar;
        synchronized (C21601m.class) {
            if (f52534a == null) {
                f52534a = new C21601m(context);
            }
            mVar = f52534a;
        }
        return mVar;
    }

    /* renamed from: a */
    public final synchronized void mo73105a() {
        this.f52535b.mo73091e();
        this.f52536c = null;
        this.f52537d = null;
    }

    /* renamed from: a */
    public final synchronized void mo73106a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f52535b.mo73087a(googleSignInAccount, googleSignInOptions);
        this.f52536c = googleSignInAccount;
        this.f52537d = googleSignInOptions;
    }
}
