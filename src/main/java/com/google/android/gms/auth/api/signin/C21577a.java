package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.internal.C21596h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C21729a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* renamed from: com.google.android.gms.auth.api.signin.a */
public final class C21577a {
    /* renamed from: a */
    public static C21579c m78159a(Activity activity, GoogleSignInOptions googleSignInOptions) {
        return new C21579c(activity, (GoogleSignInOptions) Preconditions.checkNotNull(googleSignInOptions));
    }

    /* renamed from: a */
    public static Task<GoogleSignInAccount> m78160a(Intent intent) {
        C21582d a = C21596h.m78205a(intent);
        if (a == null) {
            return Tasks.forException(C21729a.m78917a(Status.RESULT_INTERNAL_ERROR));
        }
        if (!a.getStatus().isSuccess() || a.mo73067a() == null) {
            return Tasks.forException(C21729a.m78917a(a.getStatus()));
        }
        return Tasks.forResult(a.mo73067a());
    }
}
