package com.bytedance.ttnet.p911b;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.C20638j;
import com.bytedance.ttnet.TTNetInit;

/* renamed from: com.bytedance.ttnet.b.a */
public class C20742a {

    /* renamed from: a */
    private static String f50763a = "ttnet_debug_mode";

    /* renamed from: b */
    public static void m75551b() {
        Logger.setLogLevel(2);
        C20638j.m75018a(Logger.getLogLevel());
    }

    /* renamed from: c */
    private static boolean m75553c() {
        if (TTNetInit.ENV.RELEASE != TTNetInit.getEnv()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m75550a() {
        if (!m75553c()) {
            return false;
        }
        return C20743b.m75556b(TTNetInit.getTTNetDepend().mo69984a());
    }

    /* renamed from: a */
    public static void m75549a(Context context) {
        if (!m75553c()) {
            Logger.m15167d(f50763a, "debug_mode close");
        } else {
            m75552b(context);
        }
    }

    /* renamed from: b */
    private static void m75552b(Context context) {
        Logger.m15167d(f50763a, "debug_mode open");
        if (C20743b.m75555a(context)) {
            m75551b();
        }
    }
}
