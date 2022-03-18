package com.bytedance.crash.util;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.p222f.C3750a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.StringReader;
import java.util.List;
import java.util.Properties;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.c */
public final class C3934c {
    /* renamed from: a */
    public static boolean m16344a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static List<ApplicationExitInfo> m16345b() {
        Context j;
        ActivityManager activityManager;
        List<ApplicationExitInfo> historicalProcessExitReasons;
        if (!m16344a() || (j = C3774m.m15609j()) == null || (activityManager = (ActivityManager) j.getSystemService("activity")) == null || (historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(j.getPackageName(), 0, 30)) == null || historicalProcessExitReasons.size() <= 0) {
            return null;
        }
        return historicalProcessExitReasons;
    }

    /* renamed from: a */
    public static void m16343a(String str, JSONObject jSONObject) {
        C3742b.m15432a(jSONObject, "filters", "has_exit_info", "true");
        Properties properties = new Properties();
        try {
            properties.load(new StringReader(str));
        } catch (Throwable unused) {
        }
        C3742b.m15432a(jSONObject, "filters", "exit_reason", properties.getProperty("reason", "err"));
        C3742b.m15432a(jSONObject, "filters", "exit_sub_reason", properties.getProperty("sub_reason", "err"));
        C3742b.m15432a(jSONObject, "filters", "exit_status", properties.getProperty(UpdateKey.STATUS, "err"));
    }

    /* renamed from: a */
    public static void m16342a(ApplicationExitInfo applicationExitInfo, Properties properties) {
        properties.setProperty("process", String.valueOf(applicationExitInfo.getProcessName()));
        properties.setProperty("reason", String.valueOf(applicationExitInfo.getReason()));
        properties.setProperty("sub_reason", String.valueOf(C3750a.m15511a(applicationExitInfo, "getSubReason", new Object[0])));
        properties.setProperty("description", String.valueOf(applicationExitInfo.getDescription()));
        properties.setProperty(UpdateKey.STATUS, String.valueOf(applicationExitInfo.getStatus()));
        properties.setProperty("importance", String.valueOf(applicationExitInfo.getImportance()));
        properties.setProperty("pss", String.valueOf(applicationExitInfo.getPss()));
        properties.setProperty("rss", String.valueOf(applicationExitInfo.getRss()));
    }
}
