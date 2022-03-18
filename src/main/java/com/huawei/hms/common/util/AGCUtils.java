package com.huawei.hms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.agconnect.p1009a.AbstractC23399a;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

public class AGCUtils {
    /* renamed from: c */
    public static boolean m85266c(Context context) {
        return context.getPackageName().equals(HMSPackageManager.getInstance(context).getHMSPackageName());
    }

    public static String getAppId(Context context) {
        if (m85266c(context)) {
            return m85264a(context, "client/app_id");
        }
        String str = null;
        try {
            str = AbstractC23399a.m84921a(context).mo81785a("client/app_id");
        } catch (NullPointerException unused) {
            HMSLog.m86964e("AGCUtils", "Get appId with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String a = m85263a(context);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return m85264a(context, "client/app_id");
    }

    public static String getCpId(Context context) {
        if (m85266c(context)) {
            return m85264a(context, "client/cp_id");
        }
        String str = null;
        try {
            str = AbstractC23399a.m84921a(context).mo81785a("client/cp_id");
        } catch (NullPointerException unused) {
            HMSLog.m86964e("AGCUtils", "Get cpid with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String b = m85265b(context);
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        return m85264a(context, "client/cp_id");
    }

    /* renamed from: a */
    public static String m85263a(Context context) {
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.m86964e("AGCUtils", "In getMetaDataAppId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).applicationInfo;
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get("com.huawei.hms.client.appid")) == null) {
                HMSLog.m86964e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
                return "";
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.startsWith("appid=")) {
                return valueOf.substring(6);
            }
            return valueOf;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.m86964e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        }
    }

    /* renamed from: b */
    public static String m85265b(Context context) {
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.m86964e("AGCUtils", "In getMetaDataCpId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).applicationInfo;
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get("com.huawei.hms.client.cpid")) == null) {
                HMSLog.m86966i("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
                return "";
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.startsWith("cpid=")) {
                return valueOf.substring(5);
            }
            return valueOf;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.m86964e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m85264a(android.content.Context r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.util.AGCUtils.m85264a(android.content.Context, java.lang.String):java.lang.String");
    }
}
