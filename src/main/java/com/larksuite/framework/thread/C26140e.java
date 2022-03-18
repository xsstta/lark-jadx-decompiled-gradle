package com.larksuite.framework.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.framework.thread.e */
public class C26140e extends C26155n {

    /* renamed from: a */
    private static final int f64547a;

    /* renamed from: b */
    private static final int f64548b;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f64547a = availableProcessors;
        f64548b = Math.max(availableProcessors * 8, 64);
    }

    public static C26155n d_(String str) {
        return new C26140e(str, new SynchronousQueue(), new ThreadFactoryC26153m("lk-io", 1, false));
    }

    private C26140e(String str, BlockingQueue<Runnable> blockingQueue, ThreadFactoryC26153m mVar) {
        super(str, 1, f64548b, 30, blockingQueue, mVar);
        this.f64604g = this.f64603f + "-IOExecutor";
    }
}
