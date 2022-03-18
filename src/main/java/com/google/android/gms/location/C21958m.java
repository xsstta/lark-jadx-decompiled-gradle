package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.internal.C21740c;
import com.google.android.gms.internal.location.C21920h;

/* renamed from: com.google.android.gms.location.m */
final class C21958m extends C21611a.AbstractC21612a<C21920h, Object> {
    C21958m() {
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    @Override // com.google.android.gms.common.api.C21611a.AbstractC21612a
    /* renamed from: a */
    public final /* synthetic */ C21920h mo72954a(Context context, Looper looper, C21740c cVar, Object obj, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar2) {
        return new C21920h(context, looper, bVar, cVar2, "locationServices", cVar);
    }
}
