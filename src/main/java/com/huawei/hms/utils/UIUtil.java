package com.huawei.hms.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.support.common.ActivityMgr;
import com.huawei.hms.support.log.HMSLog;
import java.util.List;

public class UIUtil {
    public static boolean isActivityFullscreen(Activity activity) {
        if ((activity.getWindow().getAttributes().flags & 1024) == 1024) {
            return true;
        }
        return false;
    }

    public static boolean isBackground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        boolean z;
        boolean z2;
        if (context == null) {
            return true;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return true;
        }
        String processName = getProcessName(context, Process.myPid());
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (TextUtils.equals(runningAppProcessInfo.processName, processName)) {
                HMSLog.m86966i("UIUtil", "appProcess.importance is " + runningAppProcessInfo.importance);
                if (runningAppProcessInfo.importance == 100) {
                    z = true;
                } else {
                    z = false;
                }
                if (Build.VERSION.SDK_INT > 22) {
                    z2 = keyguardManager.isDeviceLocked();
                } else {
                    z2 = keyguardManager.inKeyguardRestrictedInputMode();
                }
                HMSLog.m86966i("UIUtil", "isForground is " + z + "***  isLockedState is " + z2);
                if (!z || z2) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public static String getProcessName(Context context, int i) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (!(context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null)) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == i) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return "";
    }

    public static Activity getActiveActivity(Activity activity, Context context) {
        if (isBackground(context)) {
            HMSLog.m86966i("UIUtil", "isBackground" + isBackground(context));
            return null;
        } else if (activity != null && !activity.isFinishing()) {
            return activity;
        } else {
            HMSLog.m86966i("UIUtil", "activity is " + activity + "activity isFinishing is " + activity.isFinishing());
            return ActivityMgr.INST.getCurrentActivity();
        }
    }
}
