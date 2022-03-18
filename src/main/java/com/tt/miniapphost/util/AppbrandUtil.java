package com.tt.miniapphost.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.process.p3316a.C66613b;
import com.tt.miniapp.util.C67020ab;
import com.tt.miniapphost.entity.DisableStateEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.p3370d.C67481d;
import java.io.File;
import java.util.Locale;

public class AppbrandUtil {

    /* renamed from: com.tt.miniapphost.util.AppbrandUtil$a */
    public interface AbstractC67580a {
        /* renamed from: a */
        void mo234776a(int i, String str);

        /* renamed from: a */
        void mo234777a(String str);
    }

    public static boolean isAppBundleEnable() {
        return false;
    }

    public static String getCurrentDeviceFlag() {
        return Build.BRAND + "-" + Build.MODEL;
    }

    public static String convertFourToThreeVersion(String str) {
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf > 0) {
            return str.substring(0, lastIndexOf);
        }
        return str;
    }

    public static File getAppServiceDir(Context context) {
        return new File(getAppbrandBaseFile(context), "base_bundle/");
    }

    public static File getAppbrandBaseFile(Context context) {
        return new File(context.getFilesDir(), "appbrand");
    }

    public static File getOfflineZipDir(Context context) {
        return new File(getAppbrandBaseFile(context), "offline/");
    }

    public static void setLanguage(Locale locale) {
        C67479c.m262467a().mo234227a(locale);
        C66613b.m260247b(C67481d.m262478a(locale));
    }

    public static long convertVersionStrToCode(String str) {
        if (!TextUtils.isEmpty(str)) {
            return (long) getIntFromStr(str.split("\\."));
        }
        return -1;
    }

    public static String getApplicationName(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo = null;
        try {
            packageManager = context.getApplicationContext().getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            packageManager = null;
        }
        return (String) packageManager.getApplicationLabel(applicationInfo);
    }

    public static String convertVersionCodeToStr(long j) {
        try {
            String sdkVersionIntToStr = sdkVersionIntToStr(j, 3);
            if (!TextUtils.isEmpty(sdkVersionIntToStr)) {
                AppBrandLogger.m52828d("AppbrandUtil", "localUpdateVersion ", sdkVersionIntToStr);
            }
            return sdkVersionIntToStr;
        } catch (Exception e) {
            AppBrandLogger.m52829e("AppbrandUtil", e);
            return "";
        }
    }

    public static int getIntFromStr(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return 0;
        }
        int length = strArr.length;
        int i = 0;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            try {
                i += (Integer.parseInt(strArr[i2]) * ((int) Math.pow(100.0d, (double) (length - 1)))) / ((int) Math.pow(100.0d, (double) i2));
            } catch (Exception e) {
                AppBrandLogger.stacktrace(6, "AppbrandUtil", e.getStackTrace());
                return 0;
            }
        }
        return i;
    }

    public static String getUpdateVersionStr(String str) {
        try {
            String sdkVersionIntToStr = sdkVersionIntToStr(Long.parseLong(str), 3);
            if (!TextUtils.isEmpty(sdkVersionIntToStr)) {
                AppBrandLogger.m52828d("AppbrandUtil", "localUpdateVersion ", sdkVersionIntToStr);
            }
            return sdkVersionIntToStr;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "AppbrandUtil", e.getStackTrace());
            return "-1";
        }
    }

    public static void handleAppbrandDisableState(Context context, DisableStateEntity disableStateEntity) {
        if (TextUtils.isEmpty(disableStateEntity.getHintUrl())) {
            HostDependManager.getInst().showToast(context, null, disableStateEntity.getHintMessage(), 1, null);
        } else {
            HostDependManager.getInst().jumpToWebView(context, disableStateEntity.getHintUrl(), "", true);
        }
        AppBrandLogger.m52829e("AppbrandUtil", "handleAppbrandDisableState: " + disableStateEntity.getHintMessage());
    }

    public static String sdkVersionIntToStr(long j, int i) {
        StringBuilder sb = new StringBuilder();
        while (i >= 0) {
            double d = (double) i;
            sb.append(String.valueOf(j / ((long) ((int) Math.pow(100.0d, d)))));
            sb.append(".");
            j %= (long) ((int) Math.pow(100.0d, d));
            i--;
        }
        if (!TextUtils.isEmpty(sb) && sb.length() >= 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static void getUidByOpenId(Context context, String str, String str2, final AbstractC67580a aVar, IAppContext iAppContext) {
        C67020ab.m261224a(context, str, str2, new C67020ab.AbstractC67023a() {
            /* class com.tt.miniapphost.util.AppbrandUtil.C675791 */

            @Override // com.tt.miniapp.util.C67020ab.AbstractC67023a
            /* renamed from: a */
            public void mo233139a(String str) {
                aVar.mo234777a(str);
            }

            @Override // com.tt.miniapp.util.C67020ab.AbstractC67023a
            /* renamed from: a */
            public void mo233138a(int i, String str) {
                aVar.mo234776a(i, str);
            }
        }, iAppContext);
    }
}
