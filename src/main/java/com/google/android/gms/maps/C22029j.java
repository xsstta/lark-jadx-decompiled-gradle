package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.j */
public final class C22029j {

    /* renamed from: a */
    private final IUiSettingsDelegate f53538a;

    C22029j(IUiSettingsDelegate iUiSettingsDelegate) {
        this.f53538a = iUiSettingsDelegate;
    }

    /* renamed from: a */
    public final void mo74766a(boolean z) {
        try {
            this.f53538a.setCompassEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final void mo74767b(boolean z) {
        try {
            this.f53538a.setMyLocationButtonEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public final void mo74768c(boolean z) {
        try {
            this.f53538a.setScrollGesturesEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public final void mo74769d(boolean z) {
        try {
            this.f53538a.setZoomGesturesEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public final void mo74770e(boolean z) {
        try {
            this.f53538a.setAllGesturesEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
