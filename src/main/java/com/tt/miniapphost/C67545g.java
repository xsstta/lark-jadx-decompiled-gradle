package com.tt.miniapphost;

import com.tt.miniapphost.data.ContextSingletonInstance;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tt.miniapphost.g */
public class C67545g {

    /* renamed from: com.tt.miniapphost.g$a */
    public static class C67546a {

        /* renamed from: a */
        public AtomicInteger f170354a = new AtomicInteger(0);
    }

    /* renamed from: a */
    public static int m262705a() {
        return ContextSingletonInstance.getInstance().idCreateInstance.f170354a.incrementAndGet();
    }
}
