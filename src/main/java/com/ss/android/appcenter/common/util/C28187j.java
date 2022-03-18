package com.ss.android.appcenter.common.util;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.appcenter.common.util.j */
public class C28187j {

    /* renamed from: a */
    private ThreadPoolExecutor f70686a;

    /* renamed from: com.ss.android.appcenter.common.util.j$a */
    public static class C28189a {

        /* renamed from: a */
        public static final C28187j f70687a = new C28187j();
    }

    /* renamed from: a */
    public static C28187j m103257a() {
        return C28189a.f70687a;
    }

    private C28187j() {
        this.f70686a = new ThreadPoolExecutor(3, 3, 60, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    /* renamed from: a */
    public void mo100400a(Runnable runnable) {
        this.f70686a.execute(runnable);
    }
}
