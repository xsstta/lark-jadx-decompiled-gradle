package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.accounttransfer.C21552e;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.internal.AbstractC21745f;
import com.google.android.gms.common.internal.C21740c;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.google.android.gms.internal.auth.u */
public final class C21882u extends AbstractC21745f<zzz> {

    /* renamed from: a */
    private final Bundle f53280a;

    public C21882u(Context context, Looper looper, C21740c cVar, C21552e eVar, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar2) {
        super(context, looper, SmActions.ACTION_ONTHECALL_EXIT, cVar, bVar, cVar2);
        if (eVar == null) {
            this.f53280a = new Bundle();
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
        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.accounttransfer.service.START";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f53280a;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        if (queryLocalInterface instanceof zzz) {
            return (zzz) queryLocalInterface;
        }
        return new zzaa(iBinder);
    }
}
