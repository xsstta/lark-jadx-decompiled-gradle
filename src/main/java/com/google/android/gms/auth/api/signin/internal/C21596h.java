package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.C21582d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.AbstractC21635e;
import com.google.android.gms.common.api.C21637f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21661c;
import com.google.android.gms.common.p975a.C21610a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.h */
public final class C21596h {

    /* renamed from: a */
    private static C21610a f52531a = new C21610a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m78204a(Context context, GoogleSignInOptions googleSignInOptions) {
        f52531a.mo73185a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: b */
    public static Intent m78208b(Context context, GoogleSignInOptions googleSignInOptions) {
        f52531a.mo73185a("getFallbackSignInIntent()", new Object[0]);
        Intent a = m78204a(context, googleSignInOptions);
        a.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return a;
    }

    /* renamed from: c */
    public static Intent m78210c(Context context, GoogleSignInOptions googleSignInOptions) {
        f52531a.mo73185a("getNoImplementationSignInIntent()", new Object[0]);
        Intent a = m78204a(context, googleSignInOptions);
        a.setAction("com.google.android.gms.auth.NO_IMPL");
        return a;
    }

    /* renamed from: a */
    public static AbstractC21635e<Status> m78206a(AbstractC21631d dVar, Context context, boolean z) {
        f52531a.mo73185a("Signing out", new Object[0]);
        m78207a(context);
        if (z) {
            return C21637f.m78316a(Status.RESULT_SUCCESS, dVar);
        }
        return dVar.mo73268b(new C21598j(dVar));
    }

    /* renamed from: b */
    public static AbstractC21635e<Status> m78209b(AbstractC21631d dVar, Context context, boolean z) {
        f52531a.mo73185a("Revoking access", new Object[0]);
        String c = C21590b.m78184a(context).mo73089c();
        m78207a(context);
        if (z) {
            return RunnableC21592d.m78196a(c);
        }
        return dVar.mo73268b(new C21599k(dVar));
    }

    /* renamed from: a */
    private static void m78207a(Context context) {
        C21601m.m78217a(context).mo73105a();
        for (AbstractC21631d dVar : AbstractC21631d.m78282a()) {
            dVar.mo73272d();
        }
        C21661c.m78525b();
    }

    /* renamed from: a */
    public static C21582d m78205a(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!intent.hasExtra("googleSignInStatus") && !intent.hasExtra("googleSignInAccount")) {
            return null;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        if (googleSignInAccount != null) {
            status = Status.RESULT_SUCCESS;
        }
        return new C21582d(googleSignInAccount, status);
    }
}
