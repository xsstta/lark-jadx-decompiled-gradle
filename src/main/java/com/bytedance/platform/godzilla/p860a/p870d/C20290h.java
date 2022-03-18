package com.bytedance.platform.godzilla.p860a.p870d;

import android.os.Build;
import android.view.WindowManager;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.plugin.AbstractC20331c;

/* renamed from: com.bytedance.platform.godzilla.a.d.h */
public class C20290h extends AbstractC20331c {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "ToastBadTokenPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20331c
    /* renamed from: c */
    public boolean mo68569c() {
        int i = Build.VERSION.SDK_INT;
        if (i == 24 || i == 25) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.platform.godzilla.common.AbstractC20328h
    /* renamed from: a */
    public boolean mo68568a(Thread thread, Throwable th) throws Throwable {
        return m74021b(thread, th);
    }

    /* renamed from: b */
    private boolean m74021b(Thread thread, Throwable th) {
        if (th instanceof WindowManager.BadTokenException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement != null && "android.widget.Toast$TN".equals(stackTraceElement.getClassName()) && "handleShow".equals(stackTraceElement.getMethodName())) {
                    Logger.m74095a(mo68532b(), "Hint ToastBadToken case ,fix it.");
                    return true;
                }
            }
        }
        return false;
    }
}
