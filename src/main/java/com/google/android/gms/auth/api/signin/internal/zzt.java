package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p978authapi.C21853a;
import com.google.android.gms.internal.p978authapi.zzd;

public abstract class zzt extends zzd implements zzs {
    public zzt() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p978authapi.zzd
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                zzc((GoogleSignInAccount) C21853a.m79168a(parcel, GoogleSignInAccount.CREATOR), (Status) C21853a.m79168a(parcel, Status.CREATOR));
                break;
            case 102:
                zze((Status) C21853a.m79168a(parcel, Status.CREATOR));
                break;
            case 103:
                zzf((Status) C21853a.m79168a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
