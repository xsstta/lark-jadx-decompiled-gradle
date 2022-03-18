package com.bytedance.platform.godzilla.p860a.p870d;

import android.os.Build;
import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.p872b.C20317i;
import com.bytedance.platform.godzilla.plugin.AbstractC20331c;

/* renamed from: com.bytedance.platform.godzilla.a.d.d */
public class C20285d extends AbstractC20331c {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "OppoMessageNPEPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20331c
    /* renamed from: c */
    public boolean mo68569c() {
        int i = Build.VERSION.SDK_INT;
        if (i != 22 && i != 21) {
            return false;
        }
        try {
            if (C20317i.m74091a()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    private boolean m74003a(Throwable th) {
        if (th instanceof NullPointerException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if ("android.os.Message".equals(stackTraceElement.getClassName()) && "toString".equals(stackTraceElement.getMethodName())) {
                    Logger.m74095a(mo68532b(), "Hint OppoMessageNPE case ,fix it.");
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.platform.godzilla.common.AbstractC20328h
    /* renamed from: a */
    public boolean mo68568a(Thread thread, Throwable th) throws Throwable {
        return m74003a(th);
    }
}
