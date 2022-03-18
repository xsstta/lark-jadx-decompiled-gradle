package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzm;
import com.google.android.gms.common.internal.zzn;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import javax.annotation.CheckReturnValue;

/* access modifiers changed from: package-private */
@CheckReturnValue
/* renamed from: com.google.android.gms.common.f */
public final class C21708f {

    /* renamed from: a */
    private static volatile zzm f52942a;

    /* renamed from: b */
    private static final Object f52943b = new Object();

    /* renamed from: c */
    private static Context f52944c;

    /* renamed from: a */
    static synchronized void m78864a(Context context) {
        synchronized (C21708f.class) {
            if (f52944c != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f52944c = context.getApplicationContext();
            }
        }
    }

    /* renamed from: a */
    static C21779j m78862a(String str, zze zze, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m78865b(str, zze, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    private static C21779j m78865b(String str, zze zze, boolean z, boolean z2) {
        try {
            if (f52942a == null) {
                Preconditions.checkNotNull(f52944c);
                synchronized (f52943b) {
                    if (f52942a == null) {
                        f52942a = zzn.zzc(DynamiteModule.load(f52944c, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            Preconditions.checkNotNull(f52944c);
            try {
                if (f52942a.zza(new zzk(str, zze, z, z2), ObjectWrapper.wrap(f52944c.getPackageManager()))) {
                    return C21779j.m79021a();
                }
                return C21779j.m79024a(new CallableC21709g(z, str, zze));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C21779j.m79023a("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return C21779j.m79023a(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ String m78863a(boolean z, String str, zze zze) throws Exception {
        boolean z2 = true;
        if (z || !m78865b(str, zze, true, false).f53119a) {
            z2 = false;
        }
        return C21779j.m79025a(str, zze, z, z2);
    }
}
