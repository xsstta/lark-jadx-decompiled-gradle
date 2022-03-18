package com.ss.android.lark.utils.statistics;

import android.os.Trace;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.log.Log;
import java.util.UUID;

public class PerfLog {
    public static String getContextId() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 10);
    }

    public static void end(String str, String str2) {
        log(str, "end", str2);
        Trace.endSection();
    }

    public static void start(String str, String str2) {
        log(str, "start", str2);
        Trace.beginSection(str);
    }

    public static String generateMsg(String str, String str2) {
        return str + ContainerUtils.KEY_VALUE_DELIMITER + str2 + ",";
    }

    public static void end(String str, String str2, String str3) {
        end(str, generateMsg("context", str2) + str3);
    }

    public static void start(String str, String str2, String str3) {
        start(str, generateMsg("context", str2) + str3);
    }

    public static void log(String str, String str2, String str3) {
        Log.m165389i("PerfLog", "[perf][android_" + str + "][" + str2 + "]" + str3);
    }

    public static void log(String str, String str2, String str3, String str4) {
        log(str, str2, generateMsg("context", str3) + str4);
    }
}
