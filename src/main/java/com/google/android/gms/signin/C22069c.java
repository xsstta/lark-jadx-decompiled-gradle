package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.internal.C21740c;
import com.google.android.gms.signin.internal.C22072a;

/* renamed from: com.google.android.gms.signin.c */
final class C22069c extends C21611a.AbstractC21612a<C22072a, C22066a> {
    C22069c() {
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.c, java.lang.Object, com.google.android.gms.common.api.d$b, com.google.android.gms.common.api.d$c] */
    @Override // com.google.android.gms.common.api.C21611a.AbstractC21612a
    /* renamed from: a */
    public final /* synthetic */ C22072a mo72954a(Context context, Looper looper, C21740c cVar, C22066a aVar, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar2) {
        C22066a aVar2 = aVar;
        if (aVar2 == null) {
            aVar2 = C22066a.f53669a;
        }
        return new C22072a(context, looper, true, cVar, aVar2, bVar, cVar2);
    }
}
