package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.internal.AbstractC21745f;
import com.google.android.gms.common.internal.C21740c;

/* renamed from: com.google.android.gms.common.internal.service.h */
public final class C21771h extends AbstractC21745f<zal> {
    public C21771h(Context context, Looper looper, C21740c cVar, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar2) {
        super(context, looper, 39, cVar, bVar, cVar2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.service.START";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        if (queryLocalInterface instanceof zal) {
            return (zal) queryLocalInterface;
        }
        return new zam(iBinder);
    }
}
