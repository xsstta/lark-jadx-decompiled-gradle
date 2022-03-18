package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.e */
final /* synthetic */ class C21583e implements Comparator {

    /* renamed from: a */
    static final Comparator f52505a = new C21583e();

    private C21583e() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return GoogleSignInAccount.m78115a((Scope) obj, (Scope) obj2);
    }
}
