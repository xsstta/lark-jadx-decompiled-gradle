package com.bytedance.ee.eenet.httpclient.rust.p602b;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.ee.eenet.httpclient.rust.C12630a;
import okhttp3.Dispatcher;

/* renamed from: com.bytedance.ee.eenet.httpclient.rust.b.b */
public class C12638b {
    /* renamed from: a */
    public static C12630a m52409a(Dispatcher dispatcher) {
        C12630a aVar = new C12630a(dispatcher.executorService());
        aVar.mo47957a(dispatcher.getMaxRequests());
        aVar.mo47962b(dispatcher.getMaxRequestsPerHost());
        aVar.mo47960a((Runnable) Reflect.on(dispatcher).get("idleCallback", Runnable.class));
        return aVar;
    }
}
