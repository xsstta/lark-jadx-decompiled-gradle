package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C21661c;
import com.google.android.gms.common.util.PlatformVersion;

public abstract class an {

    /* renamed from: a */
    private final int f52665a;

    public an(int i) {
        this.f52665a = i;
    }

    /* renamed from: a */
    public abstract void mo73355a(Status status);

    /* renamed from: a */
    public abstract void mo73356a(C21661c.C21662a<?> aVar) throws DeadObjectException;

    /* renamed from: a */
    public abstract void mo73357a(C21681p pVar, boolean z);

    /* renamed from: a */
    public abstract void mo73358a(RuntimeException runtimeException);

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Status m78404b(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (PlatformVersion.isAtLeastIceCreamSandwichMR1() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}
