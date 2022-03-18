package com.bytedance.geckox.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import com.bytedance.geckox.p771g.C14276b;
import java.util.List;

/* renamed from: com.bytedance.geckox.utils.a */
public class C14350a {
    /* renamed from: a */
    public static int m57806a() {
        return Process.myPid();
    }

    /* renamed from: b */
    public static long m57808b() {
        return Thread.currentThread().getId();
    }

    /* renamed from: a */
    public static String m57807a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            C14276b.m57603a("gecko-debug-tag", "getVersion:", e);
            return "null";
        }
    }

    /* renamed from: b */
    public static String m57809b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            if (applicationInfo == null) {
                return "";
            }
            return applicationInfo.loadLabel(packageManager).toString();
        } catch (Throwable th) {
            C14276b.m57603a("gecko-debug-tag", "getApplicationName:", th);
            return "";
        }
    }

    /* renamed from: c */
    public static String m57810c(Context context) {
        try {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return null;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (Exception e) {
            C14276b.m57603a("gecko-debug-tag", "getProcessName:", e);
        }
    }
}
