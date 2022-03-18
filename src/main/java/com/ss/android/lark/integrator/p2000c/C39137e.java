package com.ss.android.lark.integrator.p2000c;

import com.bytedance.platform.godzilla.plugin.AbstractC20331c;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.integrator.c.e */
public class C39137e extends AbstractC20331c {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "TrimMemoryException";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20331c
    /* renamed from: c */
    public boolean mo68569c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.common.AbstractC20328h
    /* renamed from: a */
    public boolean mo68568a(Thread thread, Throwable th) throws Throwable {
        StackTraceElement[] stackTrace;
        try {
            if ((th instanceof ArrayIndexOutOfBoundsException) && (stackTrace = th.getStackTrace()) != null) {
                if (stackTrace.length != 0) {
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        if (stackTraceElement.getClassName().contains("android.app.ActivityThread") && stackTraceElement.getMethodName().equals("collectComponentCallbacks")) {
                            Log.m165385e("GodzillaSuperCaught", mo68532b() + " success", th, true);
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            Log.m165385e("GodzillaSuperCaught", mo68532b() + " error", th2, true);
            return false;
        }
    }
}
