package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.C21557b;
import com.google.android.gms.auth.api.C21558c;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.internal.AbstractC21745f;
import com.google.android.gms.common.internal.C21740c;

/* renamed from: com.google.android.gms.internal.auth.e */
public final class C21866e extends AbstractC21745f<zzan> {

    /* renamed from: a */
    private final Bundle f53267a;

    public C21866e(Context context, Looper looper, C21740c cVar, C21558c cVar2, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar3) {
        super(context, looper, 16, cVar, bVar, cVar3);
        if (cVar2 == null) {
            this.f53267a = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.C21611a.AbstractC21622f, com.google.android.gms.common.internal.AbstractC21745f
    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.C21611a.AbstractC21622f
    public final boolean requiresSignIn() {
        C21740c b = mo73706b();
        return !TextUtils.isEmpty(b.mo73685a()) && !b.mo73686a(C21557b.f52393a).isEmpty();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f53267a;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof zzan) {
            return (zzan) queryLocalInterface;
        }
        return new zzao(iBinder);
    }
}
