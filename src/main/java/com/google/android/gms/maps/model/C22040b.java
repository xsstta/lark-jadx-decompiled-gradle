package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zze;

/* renamed from: com.google.android.gms.maps.model.b */
public final class C22040b {

    /* renamed from: a */
    private static zze f53659a;

    /* renamed from: a */
    private static zze m79606a() {
        return (zze) Preconditions.checkNotNull(f53659a, "IBitmapDescriptorFactory is not initialized");
    }

    /* renamed from: a */
    public static void m79608a(zze zze) {
        if (f53659a == null) {
            f53659a = (zze) Preconditions.checkNotNull(zze);
        }
    }

    /* renamed from: a */
    public static C22035a m79607a(Bitmap bitmap) {
        try {
            return new C22035a(m79606a().zza(bitmap));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
