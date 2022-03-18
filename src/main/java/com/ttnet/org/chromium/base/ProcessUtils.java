package com.ttnet.org.chromium.base;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;

public class ProcessUtils {
    private static String sCurProcessName;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[SYNTHETIC, Splitter:B:20:0x0069] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getCurProcessNameFromProc() {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.ProcessUtils.getCurProcessNameFromProc():java.lang.String");
    }

    public static boolean isMainProcess(Context context) {
        String curProcessName = getCurProcessName(context);
        if ((curProcessName == null || !curProcessName.contains(":")) && curProcessName != null && curProcessName.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static boolean isMessageProcess(Context context) {
        String curProcessName = getCurProcessName(context);
        if (curProcessName == null) {
            return false;
        }
        if (curProcessName.endsWith(":push") || curProcessName.endsWith(":pushservice")) {
            return true;
        }
        return false;
    }

    public static String getCurProcessName(Context context) {
        String str = sCurProcessName;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (Logger.debug()) {
                        Logger.m264568d("Process", "processName = " + runningAppProcessInfo.processName);
                    }
                    String str2 = runningAppProcessInfo.processName;
                    sCurProcessName = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String curProcessNameFromProc = getCurProcessNameFromProc();
        sCurProcessName = curProcessNameFromProc;
        return curProcessNameFromProc;
    }
}
