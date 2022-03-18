package com.larksuite.framework.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.larksuite.framework.utils.a */
public class C26246a {

    /* renamed from: a */
    private static String f64835a = null;

    /* renamed from: b */
    private static int f64836b = -1;

    /* renamed from: c */
    private static int f64837c = -1;

    /* renamed from: b */
    public static int m94978b(Context context) {
        int i = f64836b;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).versionCode;
            f64836b = i2;
            return i2;
        } catch (Exception e) {
            e.printStackTrace();
            return i2;
        }
    }

    /* renamed from: a */
    public static String m94977a(Context context) {
        String str;
        Exception e;
        String str2 = f64835a;
        if (str2 != null) {
            return str2;
        }
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).versionName;
            try {
                f64835a = str;
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                return str;
            } catch (Exception e2) {
                e = e2;
                Log.m165398w("ApkUtil", "get version name exception", e);
                return str;
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
            Log.m165398w("ApkUtil", "get version name exception", e);
            return str;
        }
    }

    /* renamed from: c */
    public static int m94979c(Context context) {
        int i = f64837c;
        if (i != -1) {
            return i;
        }
        try {
            int b = m94978b(context);
            int i2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData.getInt("UPDATE_VERSION_CODE", b);
            if (i2 == b) {
                Log.m165383e("ApkUtil", "getUpdateVersionCode failed, will use version code as fallback value.");
            }
            f64837c = i2;
            return i2;
        } catch (Exception e) {
            Log.m165386e("ApkUtil", e);
            return m94978b(context);
        }
    }

    /* renamed from: a */
    public static Drawable m94976a(String str, Context context) {
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 0);
        if (packageArchiveInfo == null) {
            return null;
        }
        packageArchiveInfo.applicationInfo.sourceDir = str;
        packageArchiveInfo.applicationInfo.publicSourceDir = str;
        return packageArchiveInfo.applicationInfo.loadIcon(packageManager);
    }
}
