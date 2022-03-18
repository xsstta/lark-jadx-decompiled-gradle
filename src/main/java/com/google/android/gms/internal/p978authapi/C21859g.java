package com.google.android.gms.internal.p978authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.C21543a;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.internal.AbstractC21745f;
import com.google.android.gms.common.internal.C21740c;

/* renamed from: com.google.android.gms.internal.auth-api.g */
public final class C21859g extends AbstractC21745f<zzw> {

    /* renamed from: a */
    private final C21543a.C21544a f53264a;

    public C21859g(Context context, Looper looper, C21740c cVar, C21543a.C21544a aVar, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar2) {
        super(context, looper, 68, cVar, bVar, cVar2);
        this.f53264a = aVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.C21611a.AbstractC21622f, com.google.android.gms.common.internal.AbstractC21745f
    public final int getMinApkVersion() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        C21543a.C21544a aVar = this.f53264a;
        return aVar == null ? new Bundle() : aVar.mo72943a();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof zzw) {
            return (zzw) queryLocalInterface;
        }
        return new zzx(iBinder);
    }
}
