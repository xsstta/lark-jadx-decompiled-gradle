package com.bytedance.common.wschannel.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.util.Date;

public class Utils {
    private static String sCurProcessName;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[SYNTHETIC, Splitter:B:20:0x0069] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getCurProcessNameFromProc() {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.utils.Utils.getCurProcessNameFromProc():java.lang.String");
    }

    public static String getTimeFormat(long j) {
        return DateFormat.getDateTimeInstance().format(new Date(j));
    }

    public static boolean isMessageProcess(String str) {
        if (str == null || !str.endsWith(":push")) {
            return false;
        }
        return true;
    }

    public static boolean isMainProcess(Context context) {
        String curProcessName = getCurProcessName(context);
        if ((curProcessName == null || !curProcessName.contains(":")) && curProcessName != null && curProcessName.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    public static String byte2HexStr(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
            sb.append(" ");
        }
        return sb.toString().toUpperCase().trim();
    }

    public static String getCurProcessName(Context context) {
        String str = sCurProcessName;
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (Logger.debug()) {
                        Logger.m15167d("Process", "processName = " + runningAppProcessInfo.processName);
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

    public static String md5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean isMainProcess(Context context, String str) {
        if ((str == null || !str.contains(":")) && str != null && str.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }
}
