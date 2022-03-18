package com.bytedance.lynx.webview.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.lynx.webview.internal.C20011y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lynx.webview.util.j */
public final class C20051j {

    /* renamed from: a */
    static final List<ActivityManager.RunningAppProcessInfo> f48989a = new ArrayList();

    /* renamed from: b */
    private static String f48990b = null;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c A[SYNTHETIC, Splitter:B:17:0x006c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m73194a() {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.util.C20051j.m73194a():java.lang.String");
    }

    /* renamed from: a */
    public static boolean m73195a(Context context) {
        String c = m73197c(context);
        if ((c == null || !c.contains(":")) && c != null && c.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m73196b(Context context) {
        String c = m73197c(context);
        if (c == null || !c.contains("sandboxed_process")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m73197c(Context context) {
        String o = C20011y.m73017o();
        if (!TextUtils.isEmpty(o)) {
            return o;
        }
        String str = f48990b;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    C20048g.m73162b("Process", "processName = " + runningAppProcessInfo.processName);
                    String str2 = runningAppProcessInfo.processName;
                    f48990b = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String a = m73194a();
        f48990b = a;
        return a;
    }
}
