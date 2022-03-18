package com.bytedance.ee.bear.thread;

import com.larksuite.framework.thread.CoreThreadPool;
import io.reactivex.Scheduler;
import io.reactivex.internal.schedulers.C68934d;

/* renamed from: com.bytedance.ee.bear.thread.b */
public class C11678b {

    /* renamed from: a */
    private static Scheduler f31459a;

    /* renamed from: b */
    private static Scheduler f31460b;

    /* renamed from: c */
    private static Scheduler f31461c;

    /* renamed from: d */
    private static Scheduler f31462d;

    /* renamed from: f */
    public static Scheduler m48482f() {
        if (f31462d == null) {
            f31462d = new C11679c();
        }
        return f31462d;
    }

    /* renamed from: a */
    public static Scheduler m48477a() {
        if (f31460b == null) {
            f31460b = new C68934d(CoreThreadPool.getDefault().getCachedThreadPool());
        }
        if (f31460b == null) {
            f31460b = new C68934d(BearExecutors.m48469d());
        }
        return f31460b;
    }

    /* renamed from: b */
    public static Scheduler m48478b() {
        if (f31460b == null) {
            f31460b = new C68934d(CoreThreadPool.getDefault().getCachedThreadPool());
        }
        if (f31460b == null) {
            f31460b = new C68934d(BearExecutors.m48469d());
        }
        return f31460b;
    }

    /* renamed from: c */
    public static Scheduler m48479c() {
        if (f31460b == null) {
            f31460b = new C68934d(CoreThreadPool.getDefault().getCachedThreadPool());
        }
        if (f31460b == null) {
            f31460b = new C68934d(BearExecutors.m48469d());
        }
        return f31460b;
    }

    /* renamed from: d */
    public static Scheduler m48480d() {
        if (f31459a == null) {
            f31459a = new C68934d(CoreThreadPool.getDefault().getFixedThreadPool());
        }
        if (f31459a == null) {
            f31459a = new C68934d(BearExecutors.m48466a());
        }
        return f31459a;
    }

    /* renamed from: e */
    public static Scheduler m48481e() {
        if (f31461c == null) {
            f31461c = new C68934d(CoreThreadPool.getDefault().getUIExecutor());
        }
        if (f31461c == null) {
            f31461c = new C68934d(BearExecutors.m48468c());
        }
        return f31461c;
    }
}
