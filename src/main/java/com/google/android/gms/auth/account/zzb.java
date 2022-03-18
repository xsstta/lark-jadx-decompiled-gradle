package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.C21874m;

public abstract class zzb extends com.google.android.gms.internal.auth.zzb implements zza {
    public zzb() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc((Account) C21874m.m79185a(parcel, Account.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zza(C21874m.m79189a(parcel));
        }
        return true;
    }
}
