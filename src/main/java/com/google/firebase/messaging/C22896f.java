package com.google.firebase.messaging;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.p979b.C21884a;
import com.google.android.gms.internal.p979b.C21889f;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.f */
public class C22896f {
    /* renamed from: a */
    static Executor m83168a() {
        return m83169a("Firebase-Messaging-Trigger-Topics-Io");
    }

    /* renamed from: b */
    static ScheduledExecutorService m83170b() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
    }

    /* renamed from: c */
    static ExecutorService m83171c() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
    }

    /* renamed from: d */
    static ExecutorService m83172d() {
        return C21884a.m79195a().mo73995a(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"), C21889f.f53298b);
    }

    /* renamed from: a */
    private static Executor m83169a(String str) {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }
}
