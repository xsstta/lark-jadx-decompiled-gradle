package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C21595g;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.internal.C21740c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.f */
final class C21570f extends C21611a.AbstractC21612a<C21595g, GoogleSignInOptions> {
    C21570f() {
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.c, java.lang.Object, com.google.android.gms.common.api.d$b, com.google.android.gms.common.api.d$c] */
    @Override // com.google.android.gms.common.api.C21611a.AbstractC21612a
    /* renamed from: a */
    public final /* synthetic */ C21595g mo72954a(Context context, Looper looper, C21740c cVar, GoogleSignInOptions googleSignInOptions, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar2) {
        return new C21595g(context, looper, cVar, googleSignInOptions, bVar, cVar2);
    }

    @Override // com.google.android.gms.common.api.C21611a.AbstractC21621e
    /* renamed from: a */
    public final /* synthetic */ List mo73020a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.mo73043a();
    }
}
