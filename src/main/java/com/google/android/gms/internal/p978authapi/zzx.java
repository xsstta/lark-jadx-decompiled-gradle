package com.google.android.gms.internal.p978authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: com.google.android.gms.internal.auth-api.zzx */
public final class zzx extends zzc implements zzw {
    zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // com.google.android.gms.internal.p978authapi.zzw
    public final void zzc(zzu zzu, CredentialRequest credentialRequest) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21853a.m79169a(obtainAndWriteInterfaceToken, zzu);
        C21853a.m79170a(obtainAndWriteInterfaceToken, credentialRequest);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.p978authapi.zzw
    public final void zzc(zzu zzu, zzy zzy) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21853a.m79169a(obtainAndWriteInterfaceToken, zzu);
        C21853a.m79170a(obtainAndWriteInterfaceToken, zzy);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.p978authapi.zzw
    public final void zzc(zzu zzu, zzs zzs) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21853a.m79169a(obtainAndWriteInterfaceToken, zzu);
        C21853a.m79170a(obtainAndWriteInterfaceToken, zzs);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.p978authapi.zzw
    public final void zzc(zzu zzu) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21853a.m79169a(obtainAndWriteInterfaceToken, zzu);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }
}
