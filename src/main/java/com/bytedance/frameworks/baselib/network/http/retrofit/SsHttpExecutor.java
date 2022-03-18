package com.bytedance.frameworks.baselib.network.http.retrofit;

import com.bytedance.frameworks.baselib.network.dispatcher.AbstractC13955c;
import com.bytedance.frameworks.baselib.network.dispatcher.C13953a;
import com.bytedance.frameworks.baselib.network.dispatcher.C13961e;
import com.bytedance.frameworks.baselib.network.dispatcher.C13962f;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;
import com.bytedance.retrofit2.AbstractRunnableC20652n;
import java.util.concurrent.Executor;

public class SsHttpExecutor implements Executor {
    private static volatile AbstractC13955c sRequestQueue;

    public static void setRequestQueue(C13961e eVar) {
        sRequestQueue = eVar;
    }

    public static void setThreadPoolConfig(C13962f fVar) {
        C13961e.m56472a(fVar);
    }

    public void execute(Runnable runnable) {
        int i;
        IRequest.Priority priority;
        IRequest.Priority priority2;
        if (runnable != null) {
            IRequest.Priority priority3 = IRequest.Priority.NORMAL;
            boolean z = false;
            if (runnable instanceof AbstractRunnableC20652n) {
                AbstractRunnableC20652n nVar = (AbstractRunnableC20652n) runnable;
                int a = nVar.mo69457a();
                if (a == 0) {
                    priority2 = IRequest.Priority.LOW;
                } else if (1 == a) {
                    priority2 = IRequest.Priority.NORMAL;
                } else if (2 == a) {
                    priority2 = IRequest.Priority.HIGH;
                } else if (3 == a) {
                    priority2 = IRequest.Priority.IMMEDIATE;
                } else {
                    priority2 = IRequest.Priority.NORMAL;
                }
                z = nVar.mo69458b();
                i = nVar.mo69459c();
                priority = priority2;
            } else {
                priority = priority3;
                i = 0;
            }
            if (sRequestQueue == null) {
                sRequestQueue = C13961e.m56474b();
            }
            C13953a aVar = new C13953a("NetExecutor", priority, i, runnable, z);
            if (z) {
                sRequestQueue.mo51329a(aVar);
            } else {
                sRequestQueue.mo51330b(aVar);
            }
        }
    }
}
