package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.b */
public final class C22007b {

    /* renamed from: a */
    private static ICameraUpdateFactoryDelegate f53518a;

    /* renamed from: a */
    private static ICameraUpdateFactoryDelegate m79469a() {
        return (ICameraUpdateFactoryDelegate) Preconditions.checkNotNull(f53518a, "CameraUpdateFactory is not initialized");
    }

    /* renamed from: a */
    public static void m79470a(ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate) {
        f53518a = (ICameraUpdateFactoryDelegate) Preconditions.checkNotNull(iCameraUpdateFactoryDelegate);
    }

    /* renamed from: a */
    public static C22006a m79466a(float f) {
        try {
            return new C22006a(m79469a().zoomTo(f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public static C22006a m79467a(LatLng latLng) {
        try {
            return new C22006a(m79469a().newLatLng(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public static C22006a m79468a(LatLng latLng, float f) {
        try {
            return new C22006a(m79469a().newLatLngZoom(latLng, f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
