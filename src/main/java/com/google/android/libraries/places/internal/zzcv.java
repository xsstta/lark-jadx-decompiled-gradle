package com.google.android.libraries.places.internal;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.android.volley.C1934i;
import com.android.volley.toolbox.C1975q;
import com.google.android.gms.location.C21949e;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.libraries.places.api.net.PlacesClient;

public final class zzcv implements zzcw {
    private final zzdb zza;
    private final Context zzb;
    private final zzdj zzc;

    public static zzcz zza() {
        return new zzcx();
    }

    private final zzt zzd() {
        return zzw.zza(new zzdl(this.zzb), this.zzc, this.zza);
    }

    private final C1934i zzc() {
        return (C1934i) zzul.zza(C1975q.m8699a(zzdg.zza(this.zzb)), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.libraries.places.internal.zzcw
    public final PlacesClient zzb() {
        return zzba.zza(zzcg.zza(this.zza, new zzdr(this.zzb), zzae.zza(zzc(), new zzbu()), zzak.zza(zzc()), zzd(), zza.zza(), zzbf.zza(), zzbj.zza(zzch.zza()), zzbn.zza(), zzbr.zza(zzch.zza())), zzn.zza((FusedLocationProviderClient) zzul.zza(C21949e.m79316b(zzdg.zza(this.zzb)), "Cannot return null from a non-@Nullable @Provides method"), new zzcr(new zzco())), zzu.zza((WifiManager) zzdg.zza(this.zzb).getSystemService("wifi"), zza.zza()), zzd(), zza.zza());
    }

    private zzcv(Context context, zzdb zzdb, zzdj zzdj) {
        this.zza = zzdb;
        this.zzb = context;
        this.zzc = zzdj;
    }
}
