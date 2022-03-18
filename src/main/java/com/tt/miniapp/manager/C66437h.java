package com.tt.miniapp.manager;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.streamloader.C66878d;
import com.tt.refer.common.pkg.PackageEntity;
import java.io.File;
import java.io.FileFilter;

/* renamed from: com.tt.miniapp.manager.h */
public class C66437h {
    /* renamed from: a */
    private static String m259714a(int i) {
        String str;
        if (i == 1) {
            str = "-preload";
        } else if (i != 3) {
            str = "";
        } else {
            str = "-async";
        }
        return str + ".pkg";
    }

    /* renamed from: b */
    public static void m259718b(File file) {
        boolean exists = file.exists();
        AppBrandLogger.m52830i("PkgManager", "deletePkg pkgFile path:", file.getAbsolutePath(), " isPkgFileExists:", Boolean.valueOf(exists));
        if (exists) {
            String name = file.getName();
            String parent = file.getParent();
            IOUtils.delete(new File(parent, name + ".info"));
        }
        IOUtils.delete(file);
    }

    /* renamed from: a */
    public static boolean m259716a(File file) {
        File a = C66878d.m260855a(file);
        if (a == null || !a.exists()) {
            return false;
        }
        return file.exists();
    }

    /* renamed from: a */
    public static File m259713a(Context context, String str) {
        return new File(AppbrandConstant.getDownloadDir(context), str);
    }

    /* renamed from: b */
    public static boolean m259720b(Context context, String str) {
        File[] listFiles;
        File a = m259713a(context, str);
        if (!a.exists() || (listFiles = a.listFiles(new FileFilter() {
            /* class com.tt.miniapp.manager.C66437h.C664381 */

            public boolean accept(File file) {
                String name = file.getName();
                if (TextUtils.isEmpty(name) || !name.endsWith(".pkg")) {
                    return false;
                }
                return !C66437h.m259721b(name, 1);
            }
        })) == null || listFiles.length == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m259715a(PackageEntity packageEntity, int i) {
        return AppbrandConstant.getPkgMD5ViaUrl(packageEntity) + m259714a(i);
    }

    /* renamed from: b */
    public static boolean m259721b(String str, int i) {
        String a = m259714a(i);
        if (i == 1 || i == 3) {
            return str.endsWith(a);
        }
        if (str.contains("-async") || str.contains("-preload")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m259717a(String str, int i) {
        if (str.endsWith(".pkg")) {
            return m259721b(str, i);
        }
        return false;
    }

    /* renamed from: a */
    public static File m259712a(Context context, PackageEntity packageEntity, int i) {
        return new File(m259713a(context, packageEntity.getAppId()), m259715a(packageEntity, i));
    }

    /* renamed from: b */
    public static boolean m259719b(Context context, PackageEntity packageEntity, int i) {
        boolean a = m259716a(m259712a(context, packageEntity, i));
        AppBrandLogger.m52830i("PkgManager", "isPkgFileAvailable:", Boolean.valueOf(a), "appId:", packageEntity.getIdentifier(), "downloadType:", Integer.valueOf(i));
        return a;
    }
}
