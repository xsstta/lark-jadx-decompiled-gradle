package com.google.firebase;

import android.content.Context;
import com.google.firebase.p995a.AbstractC22752a;

/* renamed from: com.google.firebase.a */
final /* synthetic */ class C22751a implements AbstractC22752a {

    /* renamed from: a */
    private final FirebaseApp f56278a;

    /* renamed from: b */
    private final Context f56279b;

    private C22751a(FirebaseApp firebaseApp, Context context) {
        this.f56278a = firebaseApp;
        this.f56279b = context;
    }

    /* renamed from: a */
    public static AbstractC22752a m82712a(FirebaseApp firebaseApp, Context context) {
        return new C22751a(firebaseApp, context);
    }

    @Override // com.google.firebase.p995a.AbstractC22752a
    /* renamed from: a */
    public Object mo79125a() {
        return FirebaseApp.lambda$new$0(this.f56278a, this.f56279b);
    }
}
