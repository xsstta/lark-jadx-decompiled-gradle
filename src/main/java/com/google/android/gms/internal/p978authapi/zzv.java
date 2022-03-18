package com.google.android.gms.internal.p978authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzv */
public abstract class zzv extends zzd implements zzu {
    public zzv() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p978authapi.zzd
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc((Status) C21853a.m79168a(parcel, Status.CREATOR), (Credential) C21853a.m79168a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            zzc((Status) C21853a.m79168a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            zzc((Status) C21853a.m79168a(parcel, Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
