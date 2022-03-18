package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.C21874m;
import com.google.android.gms.internal.auth.zza;

public final class zze extends zza implements zzc {
    zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.zzc
    public final void zzb(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21874m.m79188a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.auth.account.zzc
    public final void zza(zza zza, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21874m.m79186a(obtainAndWriteInterfaceToken, zza);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.auth.account.zzc
    public final void zza(zza zza, Account account) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21874m.m79186a(obtainAndWriteInterfaceToken, zza);
        C21874m.m79187a(obtainAndWriteInterfaceToken, account);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }
}
