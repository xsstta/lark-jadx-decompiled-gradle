package com.tt.miniapp.manager.p3302a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.tt.miniapp.event.C66016a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.util.AppbrandUtil;
import java.io.File;
import java.io.IOException;

/* renamed from: com.tt.miniapp.manager.a.b */
public class C66389b {
    /* renamed from: a */
    public static boolean m259578a(File file) {
        if (!file.exists()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsoluteFile());
        sb.append("/");
        sb.append("greyHash");
        return new File(sb.toString()).exists();
    }

    /* renamed from: a */
    public static File m259574a() {
        return new File(AppbrandUtil.getAppServiceDir(AppbrandContext.getInst().getApplicationContext()), "latest_basebundle_version");
    }

    /* renamed from: b */
    public static File m259579b() {
        return new File(AppbrandUtil.getAppServiceDir(AppbrandContext.getInst().getApplicationContext()), "latest_grey_hash");
    }

    /* renamed from: c */
    public static long m259581c() {
        try {
            File a = m259574a();
            if (!a.exists()) {
                AppBrandLogger.m52829e("BaseBundleFileManager", "getLatestBaseBundleVersion, version file not exist");
                return -1;
            }
            String readString = IOUtils.readString(a.getAbsolutePath(), "utf-8");
            if (TextUtils.isEmpty(readString)) {
                AppBrandLogger.m52829e("BaseBundleFileManager", "getLatestBaseBundleVersion, read empty version info");
                return -1;
            }
            long parseLong = Long.parseLong(CharacterUtils.replaceBlank(readString));
            AppBrandLogger.m52830i("BaseBundleFileManager", ", getLatestBaseBundleVersion, version: ", Long.valueOf(parseLong));
            return parseLong;
        } catch (Exception e) {
            AppBrandLogger.m52829e("BaseBundleFileManager", "getLatestBaseBundleVersion exception: " + e.getMessage(), e);
            return -1;
        }
    }

    /* renamed from: d */
    public static String m259584d() {
        try {
            File b = m259579b();
            if (!b.exists()) {
                AppBrandLogger.m52829e("BaseBundleFileManager", "getLatestGreyHash, version file not exist");
                return null;
            }
            String readString = IOUtils.readString(b.getAbsolutePath(), "utf-8");
            if (TextUtils.isEmpty(readString)) {
                AppBrandLogger.m52828d("BaseBundleFileManager", "getLatestGreyHash, read empty version info");
                return null;
            }
            String replaceBlank = CharacterUtils.replaceBlank(readString);
            AppBrandLogger.m52830i("BaseBundleFileManager", ", getLatestGreyHash, version: ", replaceBlank);
            return replaceBlank;
        } catch (Exception e) {
            AppBrandLogger.m52829e("BaseBundleFileManager", "getLatestGreyHash exception: " + e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: d */
    public static File m259583d(Context context, String str) {
        File file = new File(AppbrandUtil.getAppbrandBaseFile(context).getAbsolutePath(), str);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: a */
    public static File m259575a(Context context, String str) {
        File file = new File(AppbrandUtil.getAppbrandBaseFile(context).getAbsolutePath(), str);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: b */
    public static File m259580b(Context context, String str) {
        File a = m259575a(context, str);
        if (!a.exists()) {
            a.mkdir();
        }
        File file = new File(a, "__dev__");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: c */
    public static File m259582c(Context context, String str) {
        File d = m259583d(context, str);
        if (!d.exists()) {
            d.mkdir();
        }
        File file = new File(d, "__dev__.zip");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                AppBrandLogger.m52829e("BaseBundleFileManager", e);
            }
        }
        return file;
    }

    /* renamed from: e */
    public static int m259585e(Context context, String str) {
        try {
            int parseInt = Integer.parseInt(IOUtils.readString(new File(m259580b(context, str), "basebundlecheck").getAbsolutePath(), "utf-8"));
            AppBrandLogger.m52830i("BaseBundleFileManager", "getBundleVersion, bundleVersion: ", Integer.valueOf(parseInt));
            return parseInt;
        } catch (Exception e) {
            AppBrandLogger.m52829e("BaseBundleFileManager", "getBundleVersion error: " + e.getMessage(), e);
            return -1;
        }
    }

    /* renamed from: f */
    private static void m259586f(Context context, String str) {
        if (context == null) {
            context = AppbrandContext.getInst().getApplicationContext();
            AppBrandLogger.m52828d("BaseBundleFileManager", "AppbrandContext:" + context);
        }
        File b = m259579b();
        AppBrandLogger.m52828d("BaseBundleFileManager", "context:" + context);
        if (context != null) {
            try {
                IOUtils.writeStringToFile(b.getAbsolutePath(), str, "UTF-8");
            } catch (Exception e) {
                AppBrandLogger.eWithThrowable("BaseBundleFileManager", "updateLatestGreyHashFile error: " + e.getMessage(), e);
            }
        } else {
            AppBrandLogger.m52829e("BaseBundleFileManager", "updateLatestGreyHashFile error, context is null");
        }
    }

    /* renamed from: a */
    private static void m259577a(Context context, long j) {
        if (context == null) {
            context = AppbrandContext.getInst().getApplicationContext();
            AppBrandLogger.m52828d("BaseBundleFileManager", "AppbrandContext:" + context);
        }
        File a = m259574a();
        AppBrandLogger.m52828d("BaseBundleFileManager", "context:" + context);
        if (context != null) {
            try {
                String absolutePath = a.getAbsolutePath();
                IOUtils.writeStringToFile(absolutePath, j + "", "UTF-8");
            } catch (Exception e) {
                AppBrandLogger.eWithThrowable("BaseBundleFileManager", "updateLatestBaseBundleFile error: " + e.getMessage(), e);
            }
        } else {
            AppBrandLogger.m52829e("BaseBundleFileManager", "updateLatestBaseBundleFile error, context is null");
        }
    }

    /* renamed from: a */
    public static File m259576a(Context context, String str, String str2) {
        File d = m259583d(context, str);
        if (!d.exists()) {
            d.mkdir();
        }
        File file = new File(d, str2 + ".zip");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                AppBrandLogger.m52829e("BaseBundleFileManager", e);
            }
        }
        return file;
    }

    /* renamed from: a */
    public static long m259572a(Context context, File file, String str, boolean z, C66016a.C66018a aVar) {
        return m259571a(context, file, str, (String) null, z, aVar);
    }

    /* renamed from: a */
    public static long m259573a(Context context, String str, String str2, boolean z, C66016a.C66018a aVar) {
        File c = m259582c(context, str2);
        AppBrandLogger.m52830i("BaseBundleFileManager", "unZipAssetsBundle, temp folder: ", c.getAbsolutePath());
        try {
            aVar.mo231087e("start copy buildIn baseBundle to temp dir");
            IOUtils.copyAssets(context, str, c.getAbsolutePath());
            if (c.exists()) {
                long a = m259572a(context, c, "buildin_bundle", z, aVar);
                IOUtils.delete(m259583d(context, "buildin_bundle"));
                aVar.mo231087e("delete temp baseBundle dir");
                return a;
            }
            AppBrandLogger.m52831w("BaseBundleFileManager", "unZipAssetsBundle, temp folder not exist");
            IOUtils.delete(m259583d(context, "buildin_bundle"));
            aVar.mo231087e("delete temp baseBundle dir");
            return 0;
        } catch (Exception e) {
            AppBrandLogger.m52829e("BaseBundleFileManager", "unZipAssetsBundle error: " + e.getMessage(), e);
            aVar.mo231078a("unZipBuildInBaseBundle exception", e);
        } catch (Throwable th) {
            IOUtils.delete(m259583d(context, "buildin_bundle"));
            aVar.mo231087e("delete temp baseBundle dir");
            throw th;
        }
    }

    /* renamed from: a */
    public static synchronized long m259570a(Context context, long j, String str, String str2, boolean z, C66016a.C66018a aVar) {
        synchronized (C66389b.class) {
            long c = m259581c();
            AppBrandLogger.m52831w("BaseBundleFileManager", "copyFileToBaseBundle, latestVersion: ", Long.valueOf(c), ", originVersion: ", Long.valueOf(j), ", isForceUpdate: ", Boolean.valueOf(z));
            if (c < j || z) {
                File a = m259575a(context, str);
                String convertVersionCodeToStr = AppbrandUtil.convertVersionCodeToStr(j);
                if (!TextUtils.isEmpty(str2)) {
                    convertVersionCodeToStr = convertVersionCodeToStr + "_" + str2;
                }
                File file = new File(AppbrandUtil.getAppServiceDir(context), convertVersionCodeToStr);
                aVar.mo231087e("start copy folder to __dev__");
                int i = 0;
                boolean z2 = false;
                while (i < 3 && !z2) {
                    IOUtils.clearDir(file);
                    z2 = IOUtils.copyFolder(new File(a, "__dev__"), file);
                    i++;
                }
                AppBrandLogger.m52830i("BaseBundleFileManager", "copyFileToBaseBundle, isCopySuccess: ", Boolean.valueOf(z2), ", retryTime: ", Integer.valueOf(i), ", folderName: ", str, ", bundleDir: ", file.getAbsolutePath());
                if (!z2) {
                    aVar.mo231087e("copy folder fail");
                    return 0;
                }
                aVar.mo231087e("copy folder done");
                m259577a(context, j);
                m259586f(context, str2);
                aVar.mo231087e("update latest version, the version is" + j);
                IOUtils.delete(a);
                return j;
            }
            AppBrandLogger.m52831w("BaseBundleFileManager", "copyFileToBaseBundle, no need copy");
            aVar.mo231087e("current baseBundle version bigger or equals than baseBundle version");
            return c;
        }
    }

    /* renamed from: a */
    public static long m259571a(Context context, File file, String str, String str2, boolean z, C66016a.C66018a aVar) {
        boolean z2;
        AppBrandLogger.m52830i("BaseBundleFileManager", "unZipAssetsBundle begin, file: ", file.getAbsolutePath(), ", folderName: ", str, ", isForceUpdate: ", Boolean.valueOf(z));
        if (!file.exists()) {
            AppBrandLogger.m52831w("BaseBundleFileManager", "unZipFileToBundle, file not exist: ", file.getAbsolutePath());
            return 0;
        }
        File a = m259575a(context, str);
        aVar.mo231087e("start unzip" + str);
        try {
            IOUtils.unZipFolder(file.getAbsolutePath(), a.getAbsolutePath());
            AppBrandLogger.m52830i("BaseBundleFileManager", "unZipAssetsBundle, unzip done");
            z2 = true;
        } catch (Exception e) {
            aVar.mo231087e("unzip fail" + str);
            AppBrandLogger.m52829e("BaseBundleFileManager", "unZipFileToBundle error: " + e.getMessage(), e);
            z2 = false;
        }
        if (!z2) {
            try {
                aVar.mo231087e("retry unzip" + str);
                AppBrandLogger.m52830i("BaseBundleFileManager", "unZipAssetsBundle, retry unzip...");
                IOUtils.unZipFolder(file.getAbsolutePath(), a.getAbsolutePath());
                z2 = true;
            } catch (Exception e2) {
                AppBrandLogger.m52829e("BaseBundleFileManager", "unZipFileToBundle retry error: " + e2.getMessage(), e2);
                aVar.mo231087e("retry unzip fail" + str);
                z2 = false;
            }
        }
        if (!z2) {
            aVar.mo231087e(str + "clear dir");
            IOUtils.clearDir(a);
            return 0;
        }
        aVar.mo231087e(str + "baseBundle unzip success");
        long e3 = (long) m259585e(context, str);
        aVar.mo231087e(str + "get version:" + e3);
        long a2 = m259570a(context, e3, str, str2, z, aVar);
        file.delete();
        AppBrandLogger.m52830i("BaseBundleFileManager", "unZipAssetsBundle, after copy, resultVersion: ", Long.valueOf(a2));
        return a2;
    }
}
