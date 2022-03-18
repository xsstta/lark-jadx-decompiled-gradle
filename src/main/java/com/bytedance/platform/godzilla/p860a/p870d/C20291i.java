package com.bytedance.platform.godzilla.p860a.p870d;

import android.os.Build;
import com.bytedance.platform.godzilla.plugin.AbstractC20331c;

/* renamed from: com.bytedance.platform.godzilla.a.d.i */
public class C20291i extends AbstractC20331c {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "TopResumedActivityPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20331c
    /* renamed from: c */
    public boolean mo68569c() {
        if (Build.VERSION.SDK_INT == 29) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.platform.godzilla.common.AbstractC20328h
    /* renamed from: a */
    public boolean mo68568a(Thread thread, Throwable th) throws Throwable {
        return m74025b(thread, th);
    }

    /* renamed from: b */
    private boolean m74025b(Thread thread, Throwable th) {
        if (th instanceof IllegalStateException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement != null && "android.app.ActivityThread".equals(stackTraceElement.getClassName()) && "handleTopResumedActivityChanged".equals(stackTraceElement.getMethodName()) && "Activity top position already set to onTop=false".equals(th.getMessage())) {
                    return true;
                }
            }
        }
        return false;
    }
}
