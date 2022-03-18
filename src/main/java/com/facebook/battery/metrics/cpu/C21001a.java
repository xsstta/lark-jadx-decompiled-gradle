package com.facebook.battery.metrics.cpu;

import com.facebook.battery.metrics.core.AbstractC20997b;
import com.facebook.battery.metrics.core.AbstractC21000d;
import com.facebook.battery.metrics.core.C20998c;

/* renamed from: com.facebook.battery.metrics.cpu.a */
public class C21001a extends AbstractC20997b<CpuMetrics> {

    /* renamed from: a */
    private final ThreadLocal<CpuMetrics> f51385a = new ThreadLocal<>();

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.battery.metrics.cpu.a$a */
    public static class C21002a {

        /* renamed from: a */
        static final long f51386a = C21003b.m76517a(100);
    }

    /* renamed from: d */
    static long m76511d() {
        return C21002a.f51386a;
    }

    /* renamed from: a */
    public CpuMetrics mo71110b() {
        return new CpuMetrics();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028 A[SYNTHETIC, Splitter:B:15:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0032 A[SYNTHETIC, Splitter:B:23:0x0032] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo71126c() {
        /*
            r6 = this;
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x002f, all -> 0x0022 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ IOException -> 0x002f, all -> 0x0022 }
            java.lang.String r4 = "/proc/self/stat"
            r3.<init>(r4)     // Catch:{ IOException -> 0x002f, all -> 0x0022 }
            r4 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r4)     // Catch:{ IOException -> 0x002f, all -> 0x0022 }
            java.lang.String r1 = r2.readLine()     // Catch:{ IOException -> 0x0020, all -> 0x001e }
            r2.close()     // Catch:{ IOException -> 0x001a }
        L_0x001a:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L_0x001e:
            r1 = move-exception
            goto L_0x0026
        L_0x0020:
            goto L_0x0030
        L_0x0022:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L_0x0026:
            if (r2 == 0) goto L_0x002b
            r2.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
        L_0x002f:
            r2 = r1
        L_0x0030:
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.battery.metrics.cpu.C21001a.mo71126c():java.lang.String");
    }

    /* renamed from: a */
    private static double m76510a(String str) throws NumberFormatException {
        return (((double) Long.parseLong(str)) * 1.0d) / ((double) m76511d());
    }

    /* renamed from: a */
    public boolean mo71109a(CpuMetrics cpuMetrics) {
        String[] strArr;
        AbstractC21000d.m76507a(cpuMetrics, "Null value passed to getSnapshot!");
        String c = mo71126c();
        if (c != null) {
            strArr = c.split(" ", 18);
        } else {
            strArr = null;
        }
        if (strArr != null && strArr.length >= 17) {
            try {
                cpuMetrics.userTimeS = m76510a(strArr[13]);
                cpuMetrics.systemTimeS = m76510a(strArr[14]);
                cpuMetrics.childUserTimeS = m76510a(strArr[15]);
                cpuMetrics.childSystemTimeS = m76510a(strArr[16]);
                if (this.f51385a.get() == null) {
                    this.f51385a.set(new CpuMetrics());
                }
                CpuMetrics cpuMetrics2 = this.f51385a.get();
                if (Double.compare(cpuMetrics.userTimeS, cpuMetrics2.userTimeS) < 0 || Double.compare(cpuMetrics.systemTimeS, cpuMetrics2.systemTimeS) < 0 || Double.compare(cpuMetrics.childUserTimeS, cpuMetrics2.childUserTimeS) < 0 || Double.compare(cpuMetrics.childSystemTimeS, cpuMetrics2.childSystemTimeS) < 0) {
                    C20998c.m76504a("CpuMetricsCollector", "Cpu Time Decreased from " + cpuMetrics2.toString() + " to " + cpuMetrics.toString());
                    return false;
                }
                cpuMetrics2.set(cpuMetrics);
                return true;
            } catch (NumberFormatException e) {
                C20998c.m76505a("CpuMetricsCollector", "Unable to parse CPU time field", e);
            }
        }
        return false;
    }
}
