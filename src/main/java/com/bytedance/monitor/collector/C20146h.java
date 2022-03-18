package com.bytedance.monitor.collector;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.common.utility.LooperPrinterUtils;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.monitor.collector.h */
public class C20146h {

    /* renamed from: a */
    private static volatile boolean f49212a;

    /* renamed from: b */
    private static Printer f49213b;

    /* renamed from: c */
    private static final CopyOnWriteArrayList<AbstractC20122a> f49214c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    private static AbstractC20122a f49215d;

    /* renamed from: e */
    private static volatile AbstractC20148a f49216e;

    /* renamed from: f */
    private static volatile boolean f49217f = false;

    /* renamed from: g */
    private static long f49218g = 0;

    /* renamed from: h */
    private static int f49219h = 0;

    /* renamed from: com.bytedance.monitor.collector.h$a */
    public interface AbstractC20148a {
        /* renamed from: a */
        void mo12529a(long j);
    }

    /* renamed from: a */
    public static void m73512a() {
        if (!C20163o.f49270a && !f49212a) {
            f49212a = true;
            f49213b = new Printer() {
                /* class com.bytedance.monitor.collector.C20146h.C201471 */

                public void println(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        if (str.charAt(0) == '>') {
                            C20146h.m73516a(true, str);
                        } else if (str.charAt(0) == '<') {
                            C20146h.m73516a(false, str);
                        }
                    }
                }
            };
            LooperPrinterUtils.init();
            LooperPrinterUtils.addMessageLogging(f49213b);
        }
    }

    /* renamed from: a */
    public static void m73513a(AbstractC20122a aVar) {
        f49215d = aVar;
    }

    /* renamed from: a */
    public static void m73514a(AbstractC20148a aVar) {
        f49216e = aVar;
    }

    /* renamed from: a */
    public static void m73515a(boolean z) {
        f49217f = z;
    }

    /* renamed from: b */
    public static void m73517b(AbstractC20122a aVar) {
        CopyOnWriteArrayList<AbstractC20122a> copyOnWriteArrayList = f49214c;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(aVar);
        }
    }

    /* renamed from: c */
    public static void m73518c(AbstractC20122a aVar) {
        if (aVar != null) {
            CopyOnWriteArrayList<AbstractC20122a> copyOnWriteArrayList = f49214c;
            synchronized (copyOnWriteArrayList) {
                copyOnWriteArrayList.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    public static void m73516a(boolean z, String str) {
        AbstractC20122a aVar;
        AbstractC20122a aVar2;
        long nanoTime = System.nanoTime();
        AbstractC20122a.f49109b = nanoTime / 1000000;
        AbstractC20122a.f49110c = SystemClock.currentThreadTimeMillis();
        if (z && (aVar2 = f49215d) != null && aVar2.mo12256a()) {
            f49215d.mo12255a(str);
        }
        CopyOnWriteArrayList<AbstractC20122a> copyOnWriteArrayList = f49214c;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            AbstractC20122a aVar3 = copyOnWriteArrayList.get(i);
            if (aVar3 == null || !aVar3.mo12256a()) {
                if (!z && aVar3.f49111d) {
                    aVar3.mo12257b("");
                }
            } else if (z) {
                if (!aVar3.f49111d) {
                    aVar3.mo12255a(str);
                }
            } else if (aVar3.f49111d) {
                aVar3.mo12257b(str);
            }
        }
        if (!z && (aVar = f49215d) != null && aVar.mo12256a()) {
            f49215d.mo12257b("");
        }
        if (f49217f) {
            f49218g += System.nanoTime() - nanoTime;
            int i2 = f49219h;
            f49219h = i2 + 1;
            if (i2 >= 1000) {
                if (f49216e != null) {
                    f49216e.mo12529a(f49218g);
                }
                f49219h = 0;
                f49218g = 0;
                f49217f = false;
            }
        }
    }
}
