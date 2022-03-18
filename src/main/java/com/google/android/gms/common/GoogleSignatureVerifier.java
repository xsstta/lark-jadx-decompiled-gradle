package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zzam;
    private final Context mContext;
    private volatile String zzan;

    private GoogleSignatureVerifier(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (zzam == null) {
                C21708f.m78864a(context);
                zzam = new GoogleSignatureVerifier(context);
            }
        }
        return zzam;
    }

    public boolean isUidGoogleSigned(int i) {
        C21779j jVar;
        String[] packagesForUid = Wrappers.packageManager(this.mContext).getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            jVar = C21779j.m79022a("no pkgs");
        } else {
            jVar = null;
            for (String str : packagesForUid) {
                jVar = zza(str, i);
                if (jVar.f53119a) {
                    break;
                }
            }
        }
        jVar.mo73763c();
        return jVar.f53119a;
    }

    public boolean isPackageGoogleSigned(String str) {
        C21779j zzc = zzc(str);
        zzc.mo73763c();
        return zzc.f53119a;
    }

    public static boolean zza(PackageInfo packageInfo, boolean z) {
        zze zze;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                zze = zza(packageInfo, C21710h.f52948a);
            } else {
                zze = zza(packageInfo, C21710h.f52948a[0]);
            }
            if (zze != null) {
                return true;
            }
        }
        return false;
    }

    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        if (zza(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.mContext)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    private final C21779j zza(String str, int i) {
        try {
            PackageInfo zza = Wrappers.packageManager(this.mContext).zza(str, 64, i);
            boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.mContext);
            if (zza == null) {
                return C21779j.m79022a("null pkg");
            }
            if (zza.signatures.length != 1) {
                return C21779j.m79022a("single cert required");
            }
            zzf zzf = new zzf(zza.signatures[0].toByteArray());
            String str2 = zza.packageName;
            C21779j a = C21708f.m78862a(str2, zzf, honorsDebugCertificates, false);
            return (!a.f53119a || zza.applicationInfo == null || (zza.applicationInfo.flags & 2) == 0 || !C21708f.m78862a(str2, zzf, false, true).f53119a) ? a : C21779j.m79022a("debuggable release cert app rejected");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return C21779j.m79022a(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    private final C21779j zzc(String str) {
        C21779j jVar;
        if (str == null) {
            return C21779j.m79022a("null pkg");
        }
        if (str.equals(this.zzan)) {
            return C21779j.m79021a();
        }
        try {
            PackageInfo packageInfo = Wrappers.packageManager(this.mContext).getPackageInfo(str, 64);
            boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.mContext);
            if (packageInfo == null) {
                jVar = C21779j.m79022a("null pkg");
            } else if (packageInfo.signatures.length != 1) {
                jVar = C21779j.m79022a("single cert required");
            } else {
                zzf zzf = new zzf(packageInfo.signatures[0].toByteArray());
                String str2 = packageInfo.packageName;
                C21779j a = C21708f.m78862a(str2, zzf, honorsDebugCertificates, false);
                jVar = (!a.f53119a || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !C21708f.m78862a(str2, zzf, false, true).f53119a) ? a : C21779j.m79022a("debuggable release cert app rejected");
            }
            if (jVar.f53119a) {
                this.zzan = str;
            }
            return jVar;
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return C21779j.m79022a(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    private static zze zza(PackageInfo packageInfo, zze... zzeArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        zzf zzf = new zzf(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < zzeArr.length; i++) {
            if (zzeArr[i].equals(zzf)) {
                return zzeArr[i];
            }
        }
        return null;
    }
}
