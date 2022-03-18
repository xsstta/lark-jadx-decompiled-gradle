package com.huawei.hms.stats;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.provider.Settings;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.support.log.HMSLog;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.huawei.hms.stats.a */
public class C23781a {

    /* renamed from: a */
    public static int f58919a;

    /* renamed from: b */
    public static final Object f58920b = new Object();

    /* renamed from: a */
    public static boolean m86952a(Context context) {
        if (context == null) {
            HMSLog.m86964e("AnalyticsSwitchHolder", "In getBiIsReportSetting, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).applicationInfo;
                if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                    return applicationInfo.metaData.getBoolean("com.huawei.hms.client.bireport.setting");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                HMSLog.m86964e("AnalyticsSwitchHolder", "In getBiIsReportSetting, Failed to read meta data bi report setting.");
            }
        }
        HMSLog.m86966i("AnalyticsSwitchHolder", "In getBiIsReportSetting, configuration not found for bi report setting.");
        return false;
    }

    /* renamed from: b */
    public static boolean m86953b(Context context) {
        if (context == null) {
            HMSLog.m86964e("AnalyticsSwitchHolder", "In getBiSetting, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).applicationInfo;
                if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                    return applicationInfo.metaData.getBoolean("com.huawei.hms.client.bi.setting");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                HMSLog.m86964e("AnalyticsSwitchHolder", "In getBiSetting, Failed to read meta data bisetting.");
            }
        }
        HMSLog.m86966i("AnalyticsSwitchHolder", "In getBiSetting, configuration not found for bisetting.");
        return false;
    }

    /* renamed from: c */
    public static boolean m86954c(Context context) {
        synchronized (f58920b) {
            boolean z = true;
            if (f58919a == 0) {
                if (context == null) {
                    return true;
                }
                if (m86952a(context)) {
                    HMSLog.m86966i("AnalyticsSwitchHolder", "Builder->biReportSetting :true");
                    f58919a = 1;
                } else if (m86953b(context)) {
                    HMSLog.m86966i("AnalyticsSwitchHolder", "Builder->biSetting :true");
                    f58919a = 2;
                } else if ("CN".equalsIgnoreCase(GrsApp.getInstance().getIssueCountryCode(context))) {
                    f58919a = 1;
                } else {
                    HMSLog.m86966i("AnalyticsSwitchHolder", "not ChinaROM");
                    try {
                        int i = Settings.Secure.getInt(context.getContentResolver(), "hw_app_analytics_state");
                        HMSLog.m86966i("AnalyticsSwitchHolder", "hw_app_analytics_state value is " + i);
                        if (i == 1) {
                            f58919a = 1;
                        } else {
                            f58919a = 2;
                        }
                    } catch (Settings.SettingNotFoundException unused) {
                        HMSLog.m86966i("AnalyticsSwitchHolder", "Get OOBE failed");
                        f58919a = 2;
                    }
                }
            }
            if (f58919a == 1) {
                z = false;
            }
            return z;
        }
    }
}
