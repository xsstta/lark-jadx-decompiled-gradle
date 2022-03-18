package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.o */
public abstract class AbstractBinderC22646o extends BinderC22641j implements AbstractC22647p {
    public AbstractBinderC22646o() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.BinderC22641j
    /* renamed from: a */
    public final boolean mo78896a(int i, Parcel parcel) throws RemoteException {
        if (i == 2) {
            mo78680a((Bundle) ch.m82407a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            mo78681b((Bundle) ch.m82407a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
