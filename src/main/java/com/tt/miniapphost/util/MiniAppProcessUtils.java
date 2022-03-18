package com.tt.miniapphost.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12788f;
import com.tt.miniapphost.data.C67491e;
import java.util.Iterator;
import java.util.List;

public class MiniAppProcessUtils {
    public static boolean isMiniAppProcess(Context context) {
        return isMiniAppProcess(getCurProcessName(context));
    }

    public static boolean isOryxProcess(String str) {
        if (str == null) {
            return false;
        }
        return str.contains(":oryx");
    }

    public static boolean isMiniAppProcess(String str) {
        if (str == null) {
            return false;
        }
        return C12788f.m52855a(str);
    }

    public static String getCurProcessName(Context context) {
        C67491e a = C67491e.m262546a();
        try {
            String c = a.mo234319c();
            if (!TextUtils.isEmpty(c)) {
                return c;
            }
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    a.mo234316a(runningAppProcessInfo.processName);
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean isMainProcess(Context context) {
        String curProcessName = getCurProcessName(context);
        if ((curProcessName == null || !curProcessName.contains(":")) && context != null && curProcessName != null && curProcessName.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static boolean isMicroAppActivity(Activity activity) {
        String canonicalName = activity.getClass().getCanonicalName();
        if (canonicalName == null || !canonicalName.substring(canonicalName.lastIndexOf(".") + 1).matches("MiniappTabActivity\\d")) {
            return false;
        }
        return true;
    }

    public static void killCurrentProcess(Context context) {
        if (isMiniAppProcess(context)) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                AppBrandLogger.m52829e("MiniAppProcessUtils", e);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                killCurrentAppTask(context);
            }
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

    public static boolean checkMiniAppProcessExistInMainProcess(Context context) {
        boolean z;
        if (C67491e.m262546a().mo234320d()) {
            return false;
        }
        C67491e.m262546a().mo234317a(true);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().processName.contains(":miniapp")) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("MiniAppProcessUtils", e);
        }
        z = false;
        AppBrandLogger.m52830i("MiniAppProcessUtils", "checkMiniAppProcessExistInMainProcess hasMiniAppProcessExist:", Boolean.valueOf(z), "duration:", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return z;
    }

    public static void killCurrentAppTask(Context context) {
        List<ActivityManager.AppTask> appTasks;
        try {
            String curProcessName = getCurProcessName(context);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (!(activityManager == null || (appTasks = activityManager.getAppTasks()) == null || appTasks.size() <= 0)) {
                for (ActivityManager.AppTask appTask : appTasks) {
                    ComponentName component = appTask.getTaskInfo().baseIntent.getComponent();
                    if (component != null) {
                        String str = null;
                        int indexOf = curProcessName.indexOf(":");
                        if (indexOf >= 0) {
                            str = curProcessName.substring(indexOf + 1).replace("miniapp", "");
                        }
                        String className = component.getClassName();
                        AppBrandLogger.m52830i("MiniAppProcessUtils", "killCurrentAppTask processName", curProcessName, "miniAppProcessIndex", str, "componentClassName", className);
                        if (!className.endsWith("MiniappTabActivity" + str)) {
                            if (!className.endsWith("MiniappTabHostStackActivity" + str)) {
                            }
                        }
                        AppBrandLogger.m52830i("MiniAppProcessUtils", "finishAndRemoveMiniAppTask");
                        appTask.finishAndRemoveTask();
                    }
                }
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("MiniAppProcessUtils", e);
        }
    }
}
