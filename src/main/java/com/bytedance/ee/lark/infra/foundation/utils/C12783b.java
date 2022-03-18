package com.bytedance.ee.lark.infra.foundation.utils;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.service.OPMonitor;

/* renamed from: com.bytedance.ee.lark.infra.foundation.utils.b */
public class C12783b {

    /* renamed from: a */
    private static boolean f34162a = false;

    /* renamed from: b */
    private static int f34163b = 10;

    /* renamed from: c */
    private static final OPMonitorCode f34164c = new OPMonitorCode("client.open_platform.common.assert", HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.ERROR, "assert");

    /* renamed from: b */
    private static void m52841b(String str) {
        new OPMonitor(f34164c).setErrorMessage(str).flush();
    }

    /* renamed from: a */
    public static void m52840a(String str) {
        if (!f34162a) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            StringBuilder sb = new StringBuilder("assertFailed:" + str);
            sb.append("\n");
            if (stackTrace != null) {
                int i = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb.append(stackTraceElement);
                    sb.append("\n");
                    i++;
                    if (i >= f34163b) {
                        break;
                    }
                }
            }
            m52841b(sb.toString());
            return;
        }
        AppBrandLogger.m52829e("AndroidAssert", "assertFailed:" + str);
        throw new RuntimeException(str);
    }
}
