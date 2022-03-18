package com.google.android.gms.internal.location;

import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C21668f;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.AbstractC21948d;
import com.google.android.gms.location.C21947c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.location.d */
public final class C21916d {

    /* renamed from: a */
    private final AbstractC21924l<zzao> f53320a;

    /* renamed from: b */
    private final Context f53321b;

    /* renamed from: c */
    private boolean f53322c;

    /* renamed from: d */
    private final Map<C21668f.C21669a<AbstractC21948d>, zzax> f53323d = new HashMap();

    /* renamed from: e */
    private final Map<C21668f.C21669a<Object>, zzaw> f53324e = new HashMap();

    /* renamed from: f */
    private final Map<C21668f.C21669a<C21947c>, zzat> f53325f = new HashMap();

    public C21916d(Context context, AbstractC21924l<zzao> lVar) {
        this.f53321b = context;
        this.f53320a = lVar;
    }

    /* renamed from: a */
    private final zzat m79225a(C21668f<C21947c> fVar) {
        zzat zzat;
        synchronized (this.f53325f) {
            zzat = this.f53325f.get(fVar.mo73481b());
            if (zzat == null) {
                zzat = new zzat(fVar);
            }
            this.f53325f.put(fVar.mo73481b(), zzat);
        }
        return zzat;
    }

    /* renamed from: a */
    public final Location mo74029a() throws RemoteException {
        this.f53320a.mo74047b();
        return this.f53320a.mo74046a().zza(this.f53321b.getPackageName());
    }

    /* renamed from: a */
    public final void mo74030a(C21668f.C21669a<C21947c> aVar, zzaj zzaj) throws RemoteException {
        this.f53320a.mo74047b();
        Preconditions.checkNotNull(aVar, "Invalid null listener key");
        synchronized (this.f53325f) {
            zzat remove = this.f53325f.remove(aVar);
            if (remove != null) {
                remove.release();
                this.f53320a.mo74046a().zza(zzbf.m79260a(remove, zzaj));
            }
        }
    }

    /* renamed from: a */
    public final void mo74031a(zzbd zzbd, C21668f<C21947c> fVar, zzaj zzaj) throws RemoteException {
        this.f53320a.mo74047b();
        this.f53320a.mo74046a().zza(new zzbf(1, zzbd, null, null, m79225a(fVar).asBinder(), zzaj != null ? zzaj.asBinder() : null));
    }

    /* renamed from: a */
    public final void mo74032a(boolean z) throws RemoteException {
        this.f53320a.mo74047b();
        this.f53320a.mo74046a().zza(z);
        this.f53322c = z;
    }

    /* renamed from: b */
    public final void mo74033b() throws RemoteException {
        synchronized (this.f53323d) {
            for (zzax zzax : this.f53323d.values()) {
                if (zzax != null) {
                    this.f53320a.mo74046a().zza(zzbf.m79261a(zzax, (zzaj) null));
                }
            }
            this.f53323d.clear();
        }
        synchronized (this.f53325f) {
            for (zzat zzat : this.f53325f.values()) {
                if (zzat != null) {
                    this.f53320a.mo74046a().zza(zzbf.m79260a(zzat, (zzaj) null));
                }
            }
            this.f53325f.clear();
        }
        synchronized (this.f53324e) {
            for (zzaw zzaw : this.f53324e.values()) {
                if (zzaw != null) {
                    this.f53320a.mo74046a().zza(new zzo(2, null, zzaw.asBinder(), null));
                }
            }
            this.f53324e.clear();
        }
    }

    /* renamed from: c */
    public final void mo74034c() throws RemoteException {
        if (this.f53322c) {
            mo74032a(false);
        }
    }
}
