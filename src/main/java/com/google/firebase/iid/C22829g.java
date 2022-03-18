package com.google.firebase.iid;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.g */
public class C22829g {

    /* renamed from: a */
    private static final Executor f56445a = ExecutorC22830h.f56446a;

    /* renamed from: a */
    static Executor m82947a() {
        return f56445a;
    }

    /* renamed from: b */
    static ExecutorService m82948b() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
    }
}
