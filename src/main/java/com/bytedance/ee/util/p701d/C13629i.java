package com.bytedance.ee.util.p701d;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.ee.util.db.C13646g;
import com.bytedance.ee.util.p699b.C13595b;

/* renamed from: com.bytedance.ee.util.d.i */
public class C13629i {

    /* renamed from: a */
    private static String f35790a = "";

    /* renamed from: b */
    private static String f35791b;

    /* renamed from: c */
    private static boolean f35792c;

    /* renamed from: b */
    public static boolean m55304b() {
        return m55305b(null, "p0");
    }

    /* renamed from: c */
    public static boolean m55308c() {
        return m55306b(m55303b((Context) null));
    }

    /* renamed from: a */
    public static boolean m55302a() {
        boolean z = f35792c;
        if (z) {
            return z;
        }
        if (!TextUtils.isEmpty(f35790a) && !f35790a.contains(":")) {
            f35792c = true;
        }
        return f35792c;
    }

    /* renamed from: a */
    public static void m55301a(String str) {
        f35790a = str;
    }

    /* renamed from: b */
    public static String m55303b(Context context) {
        return f35790a;
    }

    /* renamed from: d */
    public static boolean m55309d(Context context) {
        return m55302a();
    }

    /* renamed from: b */
    public static boolean m55306b(String str) {
        if (C13595b.m55176a()) {
            return !str.contains(":");
        }
        if (str.endsWith(":docs") || str.endsWith(":p0")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static String m55307c(Context context) {
        int i;
        if (TextUtils.isEmpty(f35791b)) {
            int indexOf = f35790a.indexOf(":");
            if (indexOf < 0 || (i = indexOf + 1) >= f35790a.length()) {
                f35791b = "";
            } else {
                String str = f35790a;
                f35791b = str.subSequence(i, str.length()).toString();
            }
        }
        return f35791b;
    }

    /* renamed from: a */
    public static void m55300a(Context context) {
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.contains("sandboxed_process")) {
                Process.killProcess(runningAppProcessInfo.pid);
            }
        }
    }

    /* renamed from: b */
    public static boolean m55305b(Context context, String str) {
        return m55303b(context).endsWith(str);
    }

    /* renamed from: a */
    public static String m55299a(Context context, String str) {
        if (!m55302a()) {
            String c = m55307c(context);
            return str + "_" + c;
        } else if (!C13595b.m55176a() || !C13646g.f35832a.contains(str)) {
            return str;
        } else {
            return str + "_p0";
        }
    }
}
