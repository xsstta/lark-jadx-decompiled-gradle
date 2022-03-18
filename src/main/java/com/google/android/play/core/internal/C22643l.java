package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.l */
public final class C22643l extends C22640i implements AbstractC22645n {
    C22643l(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    @Override // com.google.android.play.core.internal.AbstractC22645n
    /* renamed from: a */
    public final void mo78948a(String str, Bundle bundle, AbstractC22647p pVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        ch.m82409a(a, bundle);
        ch.m82408a(a, pVar);
        mo78944a(2, a);
    }

    @Override // com.google.android.play.core.internal.AbstractC22645n
    /* renamed from: b */
    public final void mo78949b(String str, Bundle bundle, AbstractC22647p pVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        ch.m82409a(a, bundle);
        ch.m82408a(a, pVar);
        mo78944a(3, a);
    }
}
