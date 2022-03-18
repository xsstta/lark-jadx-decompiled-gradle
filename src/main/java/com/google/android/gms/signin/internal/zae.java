package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.C21902a;
import com.google.android.gms.internal.base.zab;

public abstract class zae extends zab implements zad {
    public zae() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.base.zab
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 3) {
            zaa((ConnectionResult) C21902a.m79211a(parcel, ConnectionResult.CREATOR), (zaa) C21902a.m79211a(parcel, zaa.CREATOR));
        } else if (i == 4) {
            zag((Status) C21902a.m79211a(parcel, Status.CREATOR));
        } else if (i == 6) {
            zah((Status) C21902a.m79211a(parcel, Status.CREATOR));
        } else if (i == 7) {
            zaa((Status) C21902a.m79211a(parcel, Status.CREATOR), (GoogleSignInAccount) C21902a.m79211a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            zab((zaj) C21902a.m79211a(parcel, zaj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
