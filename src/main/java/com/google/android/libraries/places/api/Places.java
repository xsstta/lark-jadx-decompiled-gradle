package com.google.android.libraries.places.api;

import android.content.Context;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzcv;
import com.google.android.libraries.places.internal.zzdb;
import com.google.android.libraries.places.internal.zzdj;
import com.google.android.libraries.places.internal.zzdk;
import com.google.android.libraries.places.internal.zzft;
import java.util.Locale;

public final class Places {
    private static final zzdb zza = new zzdb();

    private Places() {
    }

    public static synchronized void deinitialize() {
        synchronized (Places.class) {
            zza.zze();
        }
    }

    public static synchronized boolean isInitialized() {
        boolean zzd;
        synchronized (Places.class) {
            try {
                zzd = zza.zzd();
            } catch (Error | RuntimeException e) {
                zzdk.zza(e);
                throw e;
            }
        }
        return zzd;
    }

    public static synchronized PlacesClient createClient(Context context) {
        PlacesClient zza2;
        synchronized (Places.class) {
            try {
                zzft.zza(context, "Context must not be null.");
                zza2 = zza(context, zzdj.zza(context).zzb());
            } catch (Error | RuntimeException e) {
                zzdk.zza(e);
                throw e;
            }
        }
        return zza2;
    }

    public static void initialize(Context context, String str) {
        try {
            zza(context, str, null, false);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    public static synchronized PlacesClient zza(Context context, zzdj zzdj) {
        PlacesClient zzb;
        synchronized (Places.class) {
            try {
                zzft.zza(context, "Context must not be null.");
                zzft.zza(zzdj, "ClientProfile must not be null.");
                zzft.zzb(isInitialized(), "Places must be initialized first.");
                zzb = zzcv.zza().zza(context).zza(zza).zza(zzdj).zza().zzb();
            } catch (Error | RuntimeException e) {
                zzdk.zza(e);
                throw e;
            }
        }
        return zzb;
    }

    public static synchronized void initialize(Context context, String str, Locale locale) {
        synchronized (Places.class) {
            try {
                zza(context, str, locale, false);
            } catch (Error | RuntimeException e) {
                zzdk.zza(e);
                throw e;
            }
        }
    }

    private static synchronized void zza(Context context, String str, Locale locale, boolean z) {
        boolean z2;
        synchronized (Places.class) {
            try {
                zzft.zza(context, "Application context must not be null.");
                zzft.zza(str, "API Key must not be null.");
                if (!str.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzft.zza(z2, "API Key must not be empty.");
                zzdk.zza(context.getApplicationContext(), false);
                zza.zza(str, locale, false);
            } catch (Error | RuntimeException e) {
                zzdk.zza(e);
                throw e;
            }
        }
    }
}
