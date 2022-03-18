package com.bytedance.apm.launch;

import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.apm.launch.e */
public class C3042e {

    /* renamed from: com.bytedance.apm.launch.e$a */
    public static class C3043a {

        /* renamed from: a */
        public long f9794a = -1;

        /* renamed from: b */
        public long f9795b = -1;

        /* renamed from: c */
        public long f9796c = -1;

        /* renamed from: d */
        public long f9797d = -1;

        /* renamed from: e */
        public double f9798e = -1.0d;

        /* renamed from: f */
        public long f9799f = -1;

        /* renamed from: g */
        public long f9800g = -1;

        /* renamed from: h */
        public double f9801h = -1.0d;

        /* renamed from: i */
        public double f9802i = -1.0d;

        /* renamed from: j */
        public double f9803j = -1.0d;

        /* renamed from: k */
        public long f9804k = -1;

        /* renamed from: l */
        public long f9805l = -1;

        /* renamed from: m */
        public long f9806m = -1;

        /* renamed from: n */
        public List<String> f9807n;

        /* renamed from: o */
        private long f9808o = -1;

        /* renamed from: p */
        private long f9809p = -1;

        /* renamed from: a */
        public List<String> mo12857a() {
            return this.f9807n;
        }

        /* renamed from: b */
        public long mo12859b() {
            return this.f9794a;
        }

        /* renamed from: c */
        public long mo12861c() {
            return this.f9795b;
        }

        /* renamed from: d */
        public long mo12862d() {
            return this.f9796c;
        }

        /* renamed from: e */
        public long mo12863e() {
            return this.f9797d;
        }

        /* renamed from: f */
        public double mo12864f() {
            return this.f9801h;
        }

        /* renamed from: g */
        public double mo12865g() {
            return this.f9802i;
        }

        /* renamed from: h */
        public double mo12866h() {
            return this.f9803j;
        }

        /* renamed from: i */
        public long mo12867i() {
            return this.f9804k;
        }

        /* renamed from: j */
        public long mo12868j() {
            return this.f9805l;
        }

        /* renamed from: k */
        public long mo12869k() {
            return this.f9806m;
        }

        /* renamed from: l */
        public double mo12870l() {
            return this.f9798e;
        }

        /* renamed from: m */
        public long mo12871m() {
            return this.f9799f;
        }

        /* renamed from: n */
        public long mo12872n() {
            return this.f9800g;
        }

        /* renamed from: o */
        public long mo12873o() {
            return this.f9808o;
        }

        /* renamed from: p */
        public long mo12874p() {
            return this.f9809p;
        }

        public String toString() {
            return "LaunchTraceData{gcCount=" + this.f9794a + ", gcTime=" + this.f9795b + ", blockGcCount=" + this.f9796c + ", blockGcTime=" + this.f9797d + ", cpuTime=" + this.f9798e + ", voluntarySwitches=" + this.f9799f + ", inVoluntarySwitches=" + this.f9800g + ", iowaitTime=" + this.f9801h + ", runnableTime=" + this.f9802i + ", sleepTime=" + this.f9803j + ", minorFault=" + this.f9804k + ", majorFault=" + this.f9805l + ", allThreadCount=" + this.f9806m + ", javaThreadNameList=" + this.f9807n + ", lockTime=" + this.f9808o + ", binderTime=" + this.f9809p + '}';
        }

        /* renamed from: a */
        public void mo12858a(long j) {
            this.f9808o = j;
        }

        /* renamed from: b */
        public void mo12860b(long j) {
            this.f9809p = j;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|3|(3:4|5|(4:6|7|(3:9|(2:11|57)(2:12|(2:14|58)(2:15|(2:17|59)(2:18|(2:20|60)(2:21|(2:23|61)(2:24|(2:26|63)(1:62))))))|56)(0)|31))|32|(2:33|34)|39|40|(1:42)|43|44|(2:47|48)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x014f */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011f A[Catch:{ all -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0156 A[SYNTHETIC, Splitter:B:47:0x0156] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.apm.launch.C3042e.C3043a m12728a() {
        /*
        // Method dump skipped, instructions count: 378
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.launch.C3042e.m12728a():com.bytedance.apm.launch.e$a");
    }

    /* renamed from: a */
    private static void m12729a(C3043a aVar) {
        int i;
        ThreadGroup threadGroup;
        try {
            i = new File("/proc/self/task/").listFiles().length;
        } catch (Throwable unused) {
            i = 0;
        }
        if (!(i == 0 || (threadGroup = Looper.getMainLooper().getThread().getThreadGroup()) == null)) {
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
            int activeCount = threadGroup.activeCount();
            Thread[] threadArr = new Thread[(activeCount + (activeCount / 2))];
            int enumerate = threadGroup.enumerate(threadArr);
            LinkedList linkedList = new LinkedList();
            for (int i2 = 0; i2 < enumerate; i2++) {
                String name = threadArr[i2].getName();
                if (!TextUtils.isEmpty(name)) {
                    linkedList.add(name);
                }
            }
            aVar.f9806m = (long) i;
            aVar.f9807n = linkedList;
        }
    }
}
