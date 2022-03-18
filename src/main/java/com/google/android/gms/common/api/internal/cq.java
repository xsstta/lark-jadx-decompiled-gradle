package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.C21611a.AbstractC21615d;
import com.google.android.gms.common.api.C21628c;
import com.google.android.gms.common.api.internal.C21661c;
import com.google.android.gms.common.internal.C21740c;
import com.google.android.gms.signin.AbstractC22071e;
import com.google.android.gms.signin.C22066a;

public final class cq<O extends C21611a.AbstractC21615d> extends C21628c<O> {

    /* renamed from: b */
    private final C21611a.AbstractC21622f f52823b;

    /* renamed from: c */
    private final ck f52824c;

    /* renamed from: d */
    private final C21740c f52825d;

    /* renamed from: e */
    private final C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> f52826e;

    public cq(Context context, C21611a<O> aVar, Looper looper, C21611a.AbstractC21622f fVar, ck ckVar, C21740c cVar, C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> aVar2) {
        super(context, aVar, looper);
        this.f52823b = fVar;
        this.f52824c = ckVar;
        this.f52825d = cVar;
        this.f52826e = aVar2;
        this.f52565a.mo73415a(this);
    }

    /* renamed from: a */
    public final C21611a.AbstractC21622f mo73466a() {
        return this.f52823b;
    }

    @Override // com.google.android.gms.common.api.C21628c
    /* renamed from: a */
    public final C21611a.AbstractC21622f mo73243a(Looper looper, C21661c.C21662a<O> aVar) {
        this.f52824c.mo73463a(aVar);
        return this.f52823b;
    }

    @Override // com.google.android.gms.common.api.C21628c
    /* renamed from: a */
    public final zace mo73245a(Context context, Handler handler) {
        return new zace(context, handler, this.f52825d, this.f52826e);
    }
}
