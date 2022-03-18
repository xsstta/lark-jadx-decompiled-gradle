package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.v */
public abstract class AbstractBinderC22653v extends BinderC22641j implements AbstractC22654w {
    public AbstractBinderC22653v() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.BinderC22641j
    /* renamed from: a */
    public final boolean mo78896a(int i, Parcel parcel) throws RemoteException {
        AbstractC22656y yVar = null;
        if (i == 2) {
            Bundle bundle = (Bundle) ch.m82407a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                yVar = queryLocalInterface instanceof AbstractC22656y ? (AbstractC22656y) queryLocalInterface : new C22655x(readStrongBinder);
            }
            mo78755a(bundle, yVar);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) ch.m82407a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                yVar = queryLocalInterface2 instanceof AbstractC22656y ? (AbstractC22656y) queryLocalInterface2 : new C22655x(readStrongBinder2);
            }
            mo78756a(yVar);
            return true;
        }
    }
}
