package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.x */
public final class C22655x extends C22640i implements AbstractC22656y {
    C22655x(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    @Override // com.google.android.play.core.internal.AbstractC22656y
    /* renamed from: a */
    public final void mo78960a(Bundle bundle) throws RemoteException {
        Parcel a = mo78943a();
        ch.m82409a(a, bundle);
        mo78944a(3, a);
    }

    @Override // com.google.android.play.core.internal.AbstractC22656y
    /* renamed from: a */
    public final void mo78961a(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel a = mo78943a();
        ch.m82409a(a, bundle);
        ch.m82409a(a, bundle2);
        mo78944a(2, a);
    }

    @Override // com.google.android.play.core.internal.AbstractC22656y
    /* renamed from: b */
    public final void mo78962b(Bundle bundle) throws RemoteException {
        Parcel a = mo78943a();
        ch.m82409a(a, bundle);
        mo78944a(4, a);
    }
}
