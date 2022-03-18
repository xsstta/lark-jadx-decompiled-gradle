package com.google.android.gms.internal.location;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.internal.C21655b;
import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.common.internal.C21740c;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.C21947c;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.location.h */
public final class C21920h extends C21930r {

    /* renamed from: b */
    private final C21916d f53329b;

    public C21920h(Context context, Looper looper, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar, String str, @Nullable C21740c cVar2) {
        super(context, looper, bVar, cVar, str, cVar2);
        this.f53329b = new C21916d(context, this.f53333a);
    }

    /* renamed from: a */
    public final Location mo74035a() throws RemoteException {
        return this.f53329b.mo74029a();
    }

    /* renamed from: a */
    public final void mo74036a(C21668f.C21669a<C21947c> aVar, zzaj zzaj) throws RemoteException {
        this.f53329b.mo74030a(aVar, zzaj);
    }

    /* renamed from: a */
    public final void mo74037a(zzbd zzbd, C21668f<C21947c> fVar, zzaj zzaj) throws RemoteException {
        synchronized (this.f53329b) {
            this.f53329b.mo74031a(zzbd, fVar, zzaj);
        }
    }

    /* renamed from: a */
    public final void mo74038a(LocationSettingsRequest locationSettingsRequest, C21655b.AbstractC21657b<LocationSettingsResult> bVar, @Nullable String str) throws RemoteException {
        checkConnected();
        boolean z = true;
        Preconditions.checkArgument(locationSettingsRequest != null, "locationSettingsRequest can't be null nor empty.");
        if (bVar == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "listener can't be null.");
        ((zzao) getService()).zza(locationSettingsRequest, new zzbc(bVar), str);
    }

    /* renamed from: a */
    public final void mo74039a(boolean z) throws RemoteException {
        this.f53329b.mo74032a(z);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.C21611a.AbstractC21622f
    public final void disconnect() {
        synchronized (this.f53329b) {
            if (isConnected()) {
                try {
                    this.f53329b.mo74033b();
                    this.f53329b.mo74034c();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }
}
