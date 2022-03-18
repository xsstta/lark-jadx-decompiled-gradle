package com.ss.android.appcenter.business.net;

import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28196n;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.appcenter.business.net.b */
public class C27718b {

    /* renamed from: a */
    private static Map<String, Queue<Runnable>> f69284a;

    /* renamed from: a */
    private static void m101364a() {
        if (f69284a == null) {
            f69284a = new HashMap();
        }
    }

    /* renamed from: a */
    public static synchronized void m101365a(String str) {
        synchronized (C27718b.class) {
            m101364a();
            Queue<Runnable> queue = f69284a.get(str);
            if (queue != null) {
                if (queue.size() == 0) {
                    f69284a.remove(str);
                } else if (queue.size() > 0) {
                    final Runnable poll = queue.poll();
                    C28196n.m103273a(new C28196n.AbstractC28200a<Object>() {
                        /* class com.ss.android.appcenter.business.net.C27718b.C277191 */

                        @Override // com.ss.android.appcenter.common.util.C28196n.AbstractRunnableC28201b
                        /* renamed from: b */
                        public Object mo98233b() throws Throwable {
                            return null;
                        }

                        @Override // com.ss.android.appcenter.common.util.C28196n.AbstractRunnableC28201b
                        /* renamed from: a */
                        public void mo98231a(Object obj) {
                            poll.run();
                        }
                    }, 500, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m101366a(String str, Runnable runnable) {
        synchronized (C27718b.class) {
            m101364a();
            Queue<Runnable> queue = f69284a.get(str);
            if (queue == null) {
                f69284a.put(str, new ArrayDeque());
                runnable.run();
            } else if (queue.size() < 5) {
                queue.add(runnable);
            } else {
                C28184h.m103250d("RequestQueue", "skip this request. identifier:" + str);
            }
        }
    }
}
