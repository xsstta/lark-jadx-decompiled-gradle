package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p978authapi.C21853a;
import com.google.android.gms.internal.p978authapi.zzc;

public final class zzv extends zzc implements zzu {
    zzv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzu
    public final void zzc(zzs zzs, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21853a.m79169a(obtainAndWriteInterfaceToken, zzs);
        C21853a.m79170a(obtainAndWriteInterfaceToken, googleSignInOptions);
        transactAndReadExceptionReturnVoid(101, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzu
    public final void zzd(zzs zzs, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21853a.m79169a(obtainAndWriteInterfaceToken, zzs);
        C21853a.m79170a(obtainAndWriteInterfaceToken, googleSignInOptions);
        transactAndReadExceptionReturnVoid(102, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzu
    public final void zze(zzs zzs, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21853a.m79169a(obtainAndWriteInterfaceToken, zzs);
        C21853a.m79170a(obtainAndWriteInterfaceToken, googleSignInOptions);
        transactAndReadExceptionReturnVoid(103, obtainAndWriteInterfaceToken);
    }
}
