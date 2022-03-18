package com.bytedance.monitor.collector;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Choreographer;
import com.bytedance.monitor.collector.p852a.C20123a;
import com.bytedance.monitor.util.p854b.C20171b;

/* renamed from: com.bytedance.monitor.collector.c */
public class C20128c {

    /* renamed from: a */
    public static Handler f49128a;

    /* renamed from: b */
    public static Object f49129b = null;

    /* renamed from: c */
    public static volatile boolean f49130c = false;

    /* renamed from: d */
    public static int f49131d = 0;

    /* renamed from: e */
    public static int f49132e = 1;

    /* renamed from: f */
    private static volatile boolean f49133f;

    /* renamed from: g */
    private static final HandlerC20129a f49134g = new HandlerC20129a(Looper.getMainLooper());

    /* renamed from: com.bytedance.monitor.collector.c$a */
    private static class HandlerC20129a extends Handler {
        public HandlerC20129a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C20128c.f49128a.handleMessage(message);
        }

        public boolean sendMessageAtTime(Message message, long j) {
            if (message.getCallback() != C20128c.f49129b || !C20128c.f49130c) {
                return super.sendMessageAtTime(message, j);
            }
            if (C20128c.f49132e == 0) {
                return sendMessageAtFrontOfQueue(message);
            }
            Message a = C20149i.m73521a(C20149i.m73522a());
            if (a == null) {
                return sendMessageAtFrontOfQueue(message);
            }
            return super.sendMessageAtTime(message, Math.min(a.getWhen() + ((long) C20128c.f49131d), j));
        }
    }

    /* renamed from: a */
    public static void m73464a(int i) {
        f49132e = i;
    }

    /* renamed from: a */
    public static void m73466a(boolean z) {
        f49130c = z;
    }

    /* renamed from: a */
    public static synchronized void m73465a(Choreographer choreographer) {
        synchronized (C20128c.class) {
            if (!f49133f) {
                try {
                    f49128a = (Handler) C20123a.m73446a(choreographer, "mHandler");
                    f49129b = C20123a.m73446a(choreographer, "mDisplayEventReceiver");
                    C20171b.m73612a(choreographer, C20171b.m73613a(C20123a.m73449b(Choreographer.class, "mHandler")), f49134g);
                    Log.i("doFrameBooster", "hack Choreographer Success");
                    f49133f = true;
                } catch (Exception e) {
                    Log.e("doFrameBooster", "hack Choreographer Error", e);
                }
            }
        }
    }
}
