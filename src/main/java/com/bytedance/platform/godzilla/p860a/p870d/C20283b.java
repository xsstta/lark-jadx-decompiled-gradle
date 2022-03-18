package com.bytedance.platform.godzilla.p860a.p870d;

import android.os.Build;
import android.view.WindowManager;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.plugin.AbstractC20331c;

/* renamed from: com.bytedance.platform.godzilla.a.d.b */
public class C20283b extends AbstractC20331c {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "JsDialogBadTokenPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20331c
    /* renamed from: c */
    public boolean mo68569c() {
        int i = Build.VERSION.SDK_INT;
        if (i == 24 || i == 25 || i == 26 || i == 27) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m73996a(Throwable th) {
        if (th instanceof WindowManager.BadTokenException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if ("android.webkit.JsDialogHelper".equals(stackTraceElement.getClassName()) && "showDialog".equals(stackTraceElement.getMethodName())) {
                    Logger.m74095a(mo68532b(), "Hint JsDialogBadToken case ,fix it.");
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.platform.godzilla.common.AbstractC20328h
    /* renamed from: a */
    public boolean mo68568a(Thread thread, Throwable th) throws Throwable {
        return m73996a(th);
    }
}
