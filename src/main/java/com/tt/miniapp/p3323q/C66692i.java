package com.tt.miniapp.p3323q;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.data.C67485a;
import java.util.LinkedList;

/* renamed from: com.tt.miniapp.q.i */
public class C66692i {

    /* renamed from: com.tt.miniapp.q.i$a */
    public static class C66693a {

        /* renamed from: a */
        public final LinkedList<Long> f168354a = new LinkedList<>();

        /* renamed from: b */
        public String f168355b = null;

        /* renamed from: c */
        public long f168356c = -1;

        /* renamed from: d */
        public long f168357d = -1;

        /* renamed from: e */
        public long f168358e = -1;
    }

    /* renamed from: c */
    public static synchronized long m260477c(IAppContext iAppContext) {
        long j;
        synchronized (C66692i.class) {
            j = m260478d(iAppContext).f168357d;
        }
        return j;
    }

    /* renamed from: d */
    private static C66693a m260478d(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234280a().f170178e;
    }

    /* renamed from: a */
    public static synchronized void m260473a(IAppContext iAppContext) {
        synchronized (C66692i.class) {
            m260478d(iAppContext).f168358e = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public static synchronized long m260475b(IAppContext iAppContext) {
        synchronized (C66692i.class) {
            C66693a d = m260478d(iAppContext);
            long j = 0;
            if (d.f168354a.size() == 0) {
                return 0;
            }
            for (int i = 0; i < d.f168354a.size(); i++) {
                j += d.f168354a.get(i).longValue();
            }
            long size = j / ((long) d.f168354a.size());
            d.f168354a.clear();
            return size;
        }
    }

    /* renamed from: a */
    public static synchronized void m260474a(String str, IAppContext iAppContext) {
        synchronized (C66692i.class) {
            C66693a d = m260478d(iAppContext);
            d.f168355b = str;
            d.f168356c = System.currentTimeMillis();
            AppBrandLogger.m52828d("tma_RouterMonitorTask", "startPageRouter " + str);
        }
    }

    /* renamed from: b */
    public static synchronized void m260476b(String str, IAppContext iAppContext) {
        synchronized (C66692i.class) {
            C66693a d = m260478d(iAppContext);
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - d.f168356c;
            long j2 = currentTimeMillis - d.f168358e;
            AppBrandLogger.m52828d("tma_RouterMonitorTask", "completedPageRouter ", str, " ", Long.valueOf(j));
            if (str.equals(d.f168355b)) {
                d.f168354a.offer(Long.valueOf(j));
                d.f168357d = j;
                C66683f.m260438b(j2, iAppContext);
                if (d.f168354a.size() > 10) {
                    d.f168354a.pollFirst();
                }
            }
            d.f168355b = null;
        }
    }
}
