package com.bytedance.platform.godzilla.p860a.p870d;

import com.bytedance.platform.godzilla.common.Logger;
import com.bytedance.platform.godzilla.plugin.AbstractC20331c;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bytedance.platform.godzilla.a.d.a */
public class C20282a extends AbstractC20331c {
    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: b */
    public String mo68532b() {
        return "FinalizeTimeoutPlugin";
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20331c
    /* renamed from: c */
    public boolean mo68569c() {
        return true;
    }

    @Override // com.bytedance.platform.godzilla.plugin.AbstractC20331c, com.bytedance.platform.godzilla.plugin.AbstractC20329a
    /* renamed from: a */
    public void mo68530a() {
        super.mo68530a();
    }

    @Override // com.bytedance.platform.godzilla.common.AbstractC20328h
    /* renamed from: a */
    public boolean mo68568a(Thread thread, Throwable th) throws Throwable {
        boolean b = m73991b(thread, th);
        if (b) {
            Logger.m74095a(mo68532b(), "Hint FinalizeTimeout case ,fix it.");
        }
        return b;
    }

    /* renamed from: b */
    private boolean m73991b(Thread thread, Throwable th) {
        if (thread == null || th == null || !thread.getName().equals("FinalizerWatchdogDaemon") || !(th instanceof TimeoutException)) {
            return false;
        }
        return true;
    }
}
