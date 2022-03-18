package com.google.android.gms.internal.p978authapi;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzu */
public interface zzu extends IInterface {
    void zzc(Status status) throws RemoteException;

    void zzc(Status status, Credential credential) throws RemoteException;

    void zzc(Status status, String str) throws RemoteException;
}
