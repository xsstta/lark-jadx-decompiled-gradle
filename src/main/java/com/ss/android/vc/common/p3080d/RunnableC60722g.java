package com.ss.android.vc.common.p3080d;

import com.larksuite.framework.utils.C26284k;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;

/* renamed from: com.ss.android.vc.common.d.g */
public class RunnableC60722g implements Runnable {

    /* renamed from: a */
    private Runnable f151879a;

    public void run() {
        try {
            this.f151879a.run();
        } catch (Exception e) {
            if (!C26284k.m95185a(ar.m236694a())) {
                C60700b.m235864f("SafeRunnable", "[run]", e.getLocalizedMessage());
                return;
            }
            throw e;
        }
    }

    public RunnableC60722g(Runnable runnable) {
        this.f151879a = runnable;
    }
}
