package com.bytedance.platform.godzilla.p860a.p870d;

import android.view.WindowManager;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.plugin.AbstractC20331c;

/* renamed from: com.bytedance.platform.godzilla.a.d.e */
public class C20286e extends AbstractC20331c {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "PopupWindowBadTokenPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20331c
    /* renamed from: c */
    public boolean mo68569c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.common.AbstractC20328h
    /* renamed from: a */
    public boolean mo68568a(Thread thread, Throwable th) throws Throwable {
        return m74007b(thread, th);
    }

    /* renamed from: b */
    private boolean m74007b(Thread thread, Throwable th) {
        if (th instanceof WindowManager.BadTokenException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement != null && "android.widget.PopupWindow".equals(stackTraceElement.getClassName()) && "invokePopup".equals(stackTraceElement.getMethodName())) {
                    Logger.m74095a(mo68532b(), "Hint PopWindow BadToken case ,fix it.");
                    return true;
                }
            }
        }
        return false;
    }
}
