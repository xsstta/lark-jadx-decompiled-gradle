package com.bytedance.apm.block.p136a;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.monitor.collector.AbstractC20122a;
import com.bytedance.monitor.collector.C20146h;
import com.bytedance.p230d.p231a.C3971a;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.apm.block.a.g */
public class C2854g {

    /* renamed from: a */
    public static volatile int f9105a;

    /* renamed from: b */
    public static volatile boolean f9106b;

    /* renamed from: c */
    public static final Object f9107c;

    /* renamed from: d */
    public static long[] f9108d = new long[600000];

    /* renamed from: e */
    public static volatile long f9109e = m12036f();

    /* renamed from: f */
    public static volatile long f9110f = f9109e;

    /* renamed from: g */
    public static volatile Runnable f9111g = null;

    /* renamed from: h */
    public static HandlerThread f9112h = m12040k();

    /* renamed from: i */
    public static Handler f9113i = new Handler(f9112h.getLooper());

    /* renamed from: j */
    public static Object f9114j = new Object();

    /* renamed from: k */
    public static boolean f9115k = false;

    /* renamed from: l */
    public static AbstractC20122a f9116l = new AbstractC20122a() {
        /* class com.bytedance.apm.block.p136a.C2854g.C28551 */

        @Override // com.bytedance.monitor.collector.AbstractC20122a
        /* renamed from: a */
        public boolean mo12256a() {
            if (C2854g.f9111g != null) {
                C2854g.f9111g.run();
                C2854g.f9111g = null;
            }
            if (C2854g.f9105a >= 1) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.monitor.collector.AbstractC20122a
        /* renamed from: a */
        public void mo12255a(String str) {
            super.mo12255a(str);
            C2854g.m12037g();
        }

        @Override // com.bytedance.monitor.collector.AbstractC20122a
        /* renamed from: b */
        public void mo12257b(String str) {
            super.mo12257b(str);
            C2854g.m12038h();
        }
    };

    /* renamed from: m */
    private static C2854g f9117m = new C2854g();

    /* renamed from: n */
    private static int f9118n = 0;

    /* renamed from: o */
    private static int f9119o = -1;

    /* renamed from: p */
    private static boolean f9120p = false;

    /* renamed from: q */
    private static Thread f9121q = Looper.getMainLooper().getThread();

    /* renamed from: r */
    private static Runnable f9122r = null;

    /* renamed from: s */
    private static Runnable f9123s = new Runnable() {
        /* class com.bytedance.apm.block.p136a.C2854g.RunnableC28562 */

        public void run() {
            while (true) {
                try {
                    if (C2854g.f9115k || C2854g.f9105a <= -1) {
                        synchronized (C2854g.f9114j) {
                            C2854g.f9114j.wait();
                        }
                    } else {
                        C2854g.f9109e = C2854g.m12036f() - C2854g.f9110f;
                        C2854g.f9109e &= 8796093022207L;
                        SystemClock.sleep(5);
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    };

    /* renamed from: t */
    private static C2860a f9124t;

    /* renamed from: u */
    private static C2860a f9125u;

    /* renamed from: a */
    public static HandlerThread m12029a(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* renamed from: h */
    public static void m12038h() {
        f9115k = true;
    }

    /* renamed from: a */
    public static C2854g m12031a() {
        return f9117m;
    }

    /* renamed from: j */
    public static long m12039j() {
        return f9110f;
    }

    /* renamed from: f */
    public static long m12036f() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: k */
    private static HandlerThread m12040k() {
        HandlerThread a = m12029a("trace_time_update_thread");
        a.start();
        return a;
    }

    /* renamed from: d */
    public boolean mo12270d() {
        if (f9105a >= 2) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static void m12037g() {
        f9109e = AbstractC20122a.f49109b - f9110f;
        f9115k = false;
        synchronized (f9114j) {
            f9114j.notify();
        }
    }

    /* renamed from: c */
    public void mo12269c() {
        synchronized (f9107c) {
            if (f9105a == 2) {
                f9105a = -1;
                f9106b = true;
            }
        }
    }

    /* renamed from: com.bytedance.apm.block.a.g$a */
    public static final class C2860a {

        /* renamed from: a */
        public int f9126a;

        /* renamed from: b */
        int f9127b;

        /* renamed from: c */
        public C2860a f9128c;

        /* renamed from: d */
        public C2860a f9129d;

        /* renamed from: e */
        boolean f9130e = true;

        /* renamed from: f */
        public String f9131f;

        /* renamed from: g */
        public long f9132g;

        public String toString() {
            return "index:" + this.f9126a + ",\tisValid:" + this.f9130e + " source:" + this.f9131f;
        }

        public C2860a(int i) {
            this.f9126a = i;
        }
    }

    /* renamed from: e */
    public static void m12035e() {
        synchronized (f9107c) {
            if (f9105a == Integer.MAX_VALUE || f9105a == -4) {
                f9105a = -3;
                f9106b = true;
                f9111g = new Runnable() {
                    /* class com.bytedance.apm.block.p136a.C2854g.RunnableC28584 */

                    public void run() {
                        C2854g.f9113i.removeCallbacksAndMessages(null);
                        C20146h.m73518c(C2854g.f9116l);
                        C2854g.f9112h.quit();
                        C2854g.f9108d = null;
                    }
                };
            }
        }
    }

    /* renamed from: l */
    private static void m12041l() {
        f9109e = m12036f() - f9110f;
        f9113i.removeCallbacksAndMessages(null);
        f9113i.postDelayed(f9123s, 5);
        Handler handler = f9113i;
        RunnableC28595 r1 = new Runnable() {
            /* class com.bytedance.apm.block.p136a.C2854g.RunnableC28595 */

            public void run() {
                synchronized (C2854g.f9107c) {
                    if (C2854g.f9105a == Integer.MAX_VALUE || C2854g.f9105a == 1) {
                        C2854g.f9105a = -2;
                        C2854g.f9106b = true;
                    }
                }
            }
        };
        f9122r = r1;
        handler.postDelayed(r1, 15000);
        C20146h.m73517b(f9116l);
    }

    /* renamed from: i */
    public long[] mo12271i() {
        C2860a aVar;
        int i;
        try {
            C2860a aVar2 = f9124t;
            if (aVar2 == null || (aVar = f9125u) == null) {
                return null;
            }
            if (aVar2 == aVar) {
                return null;
            }
            if (aVar2.f9127b == 0) {
                i = f9118n - 1;
            } else {
                i = f9124t.f9127b;
            }
            return mo12265a(f9125u.f9126a, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        f9105a = Integer.MAX_VALUE;
        f9106b = false;
        Object obj = new Object();
        f9107c = obj;
        if (Build.VERSION.SDK_INT < 24) {
            f9105a = -4;
            f9106b = true;
        } else {
            if (f9105a == Integer.MAX_VALUE) {
                synchronized (obj) {
                    if (f9105a == Integer.MAX_VALUE) {
                        m12041l();
                        f9105a = 1;
                    }
                }
            }
            m12032a(1048574, 0L);
            m12030a("EvilMethodTracer#message_0", AbstractC20122a.f49109b);
        }
        f9113i.postDelayed(new Runnable() {
            /* class com.bytedance.apm.block.p136a.C2854g.RunnableC28573 */

            public void run() {
                C2854g.m12035e();
            }
        }, 15000);
    }

    /* renamed from: b */
    public void mo12268b() {
        synchronized (f9107c) {
            if (f9105a < 2 && f9105a >= -2) {
                f9113i.removeCallbacks(f9122r);
                if (f9108d != null) {
                    f9105a = 2;
                    f9106b = false;
                } else {
                    throw new RuntimeException("MethodCollector sBuffer == null");
                }
            }
        }
    }

    /* renamed from: a */
    public long[] mo12266a(C2860a aVar) {
        return mo12267a(aVar, new C2860a(f9118n - 1));
    }

    /* renamed from: a */
    public String mo12263a(long j, long j2) {
        return mo12264a(m12034b(j, j2), SystemClock.uptimeMillis());
    }

    /* renamed from: b */
    private long[] m12034b(long j, long j2) {
        C2860a aVar;
        int i;
        C2860a aVar2 = f9124t;
        if (aVar2 == null || (aVar = f9125u) == null) {
            return null;
        }
        while (aVar2 != aVar) {
            if (aVar2.f9128c.f9132g <= j2) {
                if (aVar.f9129d.f9132g >= j) {
                    break;
                }
                aVar = aVar.f9129d;
            } else {
                aVar2 = aVar2.f9128c;
            }
        }
        if (aVar2.f9127b == 0) {
            i = f9118n - 1;
        } else {
            i = aVar2.f9127b;
        }
        return mo12265a(aVar.f9126a, i);
    }

    /* renamed from: a */
    public String mo12264a(long[] jArr, long j) {
        if (jArr == null) {
            return "";
        }
        LinkedList linkedList = new LinkedList();
        C3971a.m16570a(jArr, linkedList, true, j);
        C3971a.m16568a((List<C2861h>) linkedList, 1);
        StringBuilder sb = new StringBuilder();
        C3971a.m16564a(linkedList, sb);
        return sb.toString();
    }

    /* renamed from: a */
    public static C2860a m12030a(String str, long j) {
        if (f9124t == null) {
            C2860a aVar = new C2860a(f9118n);
            f9124t = aVar;
            if (j <= 0) {
                j = SystemClock.uptimeMillis();
            }
            aVar.f9132g = j;
            f9124t.f9131f = str;
            C2860a aVar2 = f9124t;
            f9125u = aVar2;
            return aVar2;
        }
        C2860a aVar3 = new C2860a(f9118n);
        if (j <= 0) {
            j = SystemClock.uptimeMillis();
        }
        aVar3.f9132g = j;
        aVar3.f9131f = str;
        aVar3.f9128c = f9124t;
        f9124t.f9127b = aVar3.f9126a - 1;
        f9124t.f9129d = aVar3;
        f9124t = aVar3;
        return aVar3;
    }

    /* renamed from: b */
    public static void m12033b(int i, long j) {
        if (!f9106b && i < 1048575 && Thread.currentThread() == f9121q) {
            if (j != 0) {
                f9109e = j - f9110f;
                f9109e &= 8796093022207L;
            }
            long j2 = (((long) i) << 43) | 0 | f9109e;
            long[] jArr = f9108d;
            int i2 = f9118n;
            jArr[i2] = j2;
            int i3 = i2 + 1;
            f9118n = i3;
            if (i3 == 600000) {
                f9118n = 0;
            }
            C2860a aVar = f9125u;
            if (aVar != null && aVar.f9126a == f9118n) {
                C2860a aVar2 = f9125u.f9129d;
                f9125u = aVar2;
                if (aVar2 != null) {
                    aVar2.f9128c = null;
                } else {
                    f9124t = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m12032a(int i, long j) {
        if (!f9106b && i < 1048575 && Thread.currentThread() == f9121q && !f9120p) {
            f9120p = true;
            if (j != 0) {
                f9109e = j - f9110f;
                f9109e &= 8796093022207L;
            }
            long j2 = (((long) i) << 43) | Long.MIN_VALUE | f9109e;
            long[] jArr = f9108d;
            int i2 = f9118n;
            jArr[i2] = j2;
            int i3 = i2 + 1;
            f9118n = i3;
            if (i3 == 600000) {
                f9118n = 0;
            }
            f9120p = false;
            C2860a aVar = f9125u;
            if (aVar != null && aVar.f9126a == f9118n) {
                C2860a aVar2 = f9125u.f9129d;
                f9125u = aVar2;
                if (aVar2 != null) {
                    aVar2.f9128c = null;
                } else {
                    f9124t = null;
                }
            }
        }
    }

    /* renamed from: a */
    public long[] mo12265a(int i, int i2) {
        long[] jArr = new long[0];
        int max = Math.max(0, i);
        int max2 = Math.max(0, i2);
        if (max2 > max) {
            int i3 = (max2 - max) + 1;
            long[] jArr2 = new long[i3];
            System.arraycopy(f9108d, max, jArr2, 0, i3);
            return jArr2;
        } else if (max2 >= max) {
            return jArr;
        } else {
            int i4 = max2 + 1;
            long[] jArr3 = f9108d;
            long[] jArr4 = new long[((jArr3.length - max) + i4)];
            System.arraycopy(jArr3, max, jArr4, 0, jArr3.length - max);
            long[] jArr5 = f9108d;
            System.arraycopy(jArr5, 0, jArr4, jArr5.length - max, i4);
            return jArr4;
        }
    }

    /* renamed from: a */
    public long[] mo12267a(C2860a aVar, C2860a aVar2) {
        if (f9105a == -3) {
            return null;
        }
        long[] jArr = new long[0];
        try {
            if (aVar.f9130e && aVar2.f9130e) {
                return mo12265a(aVar.f9126a - 1, aVar2.f9126a);
            }
        } catch (OutOfMemoryError unused) {
        }
        return jArr;
    }
}
