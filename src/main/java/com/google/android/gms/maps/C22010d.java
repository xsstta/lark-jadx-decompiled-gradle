package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.C22028e;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.model.C22040b;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.d */
public final class C22010d {

    /* renamed from: a */
    private static boolean f53519a;

    /* renamed from: a */
    public static synchronized int m79473a(Context context) {
        synchronized (C22010d.class) {
            Preconditions.checkNotNull(context, "Context is null");
            if (f53519a) {
                return 0;
            }
            try {
                zze a = C22028e.m79517a(context);
                try {
                    C22007b.m79470a(a.zze());
                    C22040b.m79608a(a.zzf());
                    f53519a = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (GooglePlayServicesNotAvailableException e2) {
                return e2.errorCode;
            }
        }
    }
}
