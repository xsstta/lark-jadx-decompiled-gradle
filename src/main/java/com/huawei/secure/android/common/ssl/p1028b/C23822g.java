package com.huawei.secure.android.common.ssl.p1028b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.List;

/* renamed from: com.huawei.secure.android.common.ssl.b.g */
public class C23822g {

    /* renamed from: a */
    private static final String f59000a = "g";

    /* renamed from: a */
    public static boolean m87079a(String str) {
        PackageManager packageManager;
        Context a = C23818c.m87065a();
        if (!(a == null || (packageManager = a.getPackageManager()) == null)) {
            try {
                List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(0);
                if (installedApplications != null) {
                    for (ApplicationInfo applicationInfo : installedApplications) {
                        if (applicationInfo.packageName.equals(str)) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
                C23821f.m87078d(f59000a, ApiHandler.API_CALLBACK_EXCEPTION);
            } catch (Throwable unused2) {
                C23821f.m87078d(f59000a, "throwable");
            }
        }
        return false;
    }

    /* renamed from: b */
    public static String m87080b(String str) {
        Context a = C23818c.m87065a();
        if (a == null) {
            return "";
        }
        try {
            return a.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            String str2 = f59000a;
            C23821f.m87078d(str2, "getVersion NameNotFoundException : " + e.getMessage());
            return "";
        } catch (Exception e2) {
            String str3 = f59000a;
            C23821f.m87078d(str3, "getVersion: " + e2.getMessage());
            return "";
        } catch (Throwable unused) {
            C23821f.m87078d(f59000a, "throwable");
            return "";
        }
    }
}
