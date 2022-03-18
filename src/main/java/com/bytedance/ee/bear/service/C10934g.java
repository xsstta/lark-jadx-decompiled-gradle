package com.bytedance.ee.bear.service;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.ee.log.C13479a;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.ee.bear.service.g */
public class C10934g {

    /* renamed from: a */
    private static Handler f29421a;

    /* renamed from: b */
    private static AtomicBoolean f29422b = new AtomicBoolean(false);

    /* renamed from: com.bytedance.ee.bear.service.g$a */
    public interface AbstractC10936a {
        void onQuery();
    }

    /* renamed from: a */
    public static HandlerThread m45447a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: a */
    public static void m45448a() {
        Handler handler = f29421a;
        if (handler != null) {
            handler.removeMessages(1);
            f29421a.sendEmptyMessageDelayed(1, 500);
        }
    }

    /* renamed from: a */
    public static void m45449a(final AbstractC10936a aVar) {
        if (!f29422b.get()) {
            f29422b.set(true);
            C13479a.m54764b("TokenCenterMonitor", "init TokenCenterMonitor by OnTokenCenterMonitor=" + aVar);
            HandlerThread a = m45447a("TokenCenterMonitor");
            a.start();
            f29421a = new Handler(a.getLooper()) {
                /* class com.bytedance.ee.bear.service.C10934g.HandlerC109351 */

                public void handleMessage(Message message) {
                    AbstractC10936a aVar;
                    if (message.what == 1 && (aVar = aVar) != null) {
                        aVar.onQuery();
                    }
                }
            };
        }
    }
}
