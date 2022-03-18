package com.ss.android.lark.mail.impl.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.lark.log.Log;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.lark.mail.impl.utils.u */
public final class C43849u {

    /* renamed from: a */
    private static Handler f111284a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private static Handler f111285b;

    /* renamed from: a */
    public static HandlerThread m173825a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: com.ss.android.lark.mail.impl.utils.u$a */
    public static class C43850a {

        /* renamed from: a */
        public final ReentrantLock f111286a = new ReentrantLock();

        /* renamed from: b */
        public final String f111287b;

        /* renamed from: c */
        public long f111288c;

        /* renamed from: d */
        public RunnableC43852a f111289d;

        /* renamed from: e */
        public Runnable f111290e;

        /* renamed from: f */
        private final int f111291f;

        /* renamed from: a */
        public long mo156221a() {
            return this.f111288c;
        }

        /* renamed from: b */
        private boolean m173831b() {
            if (this.f111290e != null || System.currentTimeMillis() - this.f111288c < ((long) this.f111291f)) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private int m173832c() {
            if (this.f111288c > 0) {
                return (int) (((long) this.f111291f) - (System.currentTimeMillis() - this.f111288c));
            }
            return this.f111291f;
        }

        /* renamed from: com.ss.android.lark.mail.impl.utils.u$a$a */
        public class RunnableC43852a implements Runnable {

            /* renamed from: a */
            Handler f111294a;

            /* renamed from: b */
            Runnable f111295b;

            public void run() {
                Log.m165389i(C43850a.this.f111287b, "execute waiting task");
                C43850a.this.f111286a.lock();
                C43850a.this.f111288c = System.currentTimeMillis();
                C43850a.this.f111289d = null;
                C43850a.this.f111286a.unlock();
                this.f111295b.run();
            }

            /* renamed from: a */
            public void mo156224a(Runnable runnable) {
                C43850a.this.f111286a.lock();
                this.f111295b = runnable;
                C43850a.this.f111286a.unlock();
            }

            public RunnableC43852a(Handler handler, Runnable runnable) {
                this.f111294a = handler;
                this.f111295b = runnable;
            }
        }

        /* renamed from: a */
        public void mo156222a(boolean z) {
            RunnableC43852a aVar;
            Log.m165389i(this.f111287b, "reset");
            this.f111286a.lock();
            this.f111288c = 0;
            this.f111290e = null;
            if (!(!z || (aVar = this.f111289d) == null || aVar.f111294a == null)) {
                this.f111289d.f111294a.removeCallbacks(this.f111289d);
                this.f111289d.f111294a.post(this.f111289d);
                this.f111289d.run();
            }
            this.f111289d = null;
            this.f111286a.unlock();
        }

        public C43850a(String str, int i) {
            this.f111287b = str;
            this.f111291f = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo156220a(Handler handler, final Runnable runnable, long j) {
            int i;
            Log.m165389i(this.f111287b, "postRunnableLimit");
            this.f111286a.lock();
            if (!m173831b()) {
                Log.m165389i(this.f111287b, "add current task");
                Runnable r0 = new Runnable() {
                    /* class com.ss.android.lark.mail.impl.utils.C43849u.C43850a.RunnableC438511 */

                    public void run() {
                        C43850a.this.f111286a.lock();
                        C43850a.this.f111288c = System.currentTimeMillis();
                        C43850a.this.f111290e = null;
                        C43850a.this.f111286a.unlock();
                        Log.m165389i(C43850a.this.f111287b, "execute current task");
                        runnable.run();
                    }
                };
                this.f111290e = r0;
                if (j > 0) {
                    handler.postDelayed(r0, j);
                } else {
                    handler.post(r0);
                }
                i = 0;
            } else if (this.f111289d == null) {
                String str = this.f111287b;
                Log.m165389i(str, "add waiting task, delay " + m173832c());
                RunnableC43852a aVar = new RunnableC43852a(handler, runnable);
                this.f111289d = aVar;
                handler.postDelayed(aVar, (long) m173832c());
                i = 1;
            } else {
                Log.m165389i(this.f111287b, "replace waiting task");
                this.f111289d.mo156224a(runnable);
                i = 2;
            }
            this.f111286a.unlock();
            return i;
        }
    }

    /* renamed from: a */
    public static Handler m173824a() {
        return f111284a;
    }

    /* renamed from: c */
    public static boolean m173830c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Handler m173828b() {
        if (f111285b == null) {
            synchronized (C43849u.class) {
                if (f111285b == null) {
                    HandlerThread a = m173825a("mail_work_thread");
                    a.start();
                    f111285b = new Handler(a.getLooper());
                }
            }
        }
        return f111285b;
    }

    /* renamed from: b */
    public static void m173829b(Runnable runnable) {
        f111284a.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public static void m173826a(Runnable runnable) {
        Log.m165389i("ThreadUtil", "postOnMainThread");
        f111284a.post(runnable);
    }

    /* renamed from: a */
    public static int m173823a(C43850a aVar, Runnable runnable) {
        return m173822a(aVar, f111284a, runnable, 0);
    }

    /* renamed from: a */
    public static void m173827a(Runnable runnable, long j) {
        Log.m165389i("ThreadUtil", "postOnMainThread");
        f111284a.postDelayed(runnable, j);
    }

    /* renamed from: a */
    public static int m173821a(C43850a aVar, Handler handler, Runnable runnable) {
        return m173822a(aVar, handler, runnable, 0);
    }

    /* renamed from: a */
    public static int m173822a(C43850a aVar, Handler handler, Runnable runnable, long j) {
        return aVar.mo156220a(handler, runnable, j);
    }
}
