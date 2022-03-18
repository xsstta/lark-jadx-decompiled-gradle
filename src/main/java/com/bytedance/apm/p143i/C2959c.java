package com.bytedance.apm.p143i;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import com.bytedance.apm.p143i.p144a.C2947a;
import com.bytedance.apm.p143i.p144a.C2948b;
import com.bytedance.apm.util.C3112b;

/* renamed from: com.bytedance.apm.i.c */
public class C2959c {
    /* renamed from: a */
    public static C2947a m12446a() {
        long j;
        C2947a aVar = new C2947a();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long e = C3112b.m12951e();
            double d = 0.0d;
            boolean a = C3112b.m12944a();
            if (a) {
                j = C3112b.m12945b();
            } else {
                j = 0;
            }
            try {
                Thread.sleep(360);
            } catch (InterruptedException unused) {
            }
            long e2 = C3112b.m12951e();
            if (a) {
                long b = C3112b.m12945b() - j;
                if (b > 0) {
                    d = (double) ((((float) e2) - ((float) e)) / ((float) b));
                }
            }
            aVar.f9461a = d;
            aVar.f9462b = (((((double) e2) - ((double) e)) * 1000.0d) / ((double) (System.currentTimeMillis() - currentTimeMillis))) / ((double) C3112b.m12938a(100));
        } catch (Exception unused2) {
        }
        return aVar;
    }

    /* renamed from: a */
    public static C2948b m12447a(Context context) {
        C2948b bVar = new C2948b();
        try {
            long j = Runtime.getRuntime().totalMemory();
            long freeMemory = Runtime.getRuntime().freeMemory();
            bVar.f9463a = j;
            bVar.f9464b = freeMemory;
            bVar.f9465c = j - freeMemory;
            Debug.MemoryInfo a = C3112b.m12941a(Process.myPid(), context);
            if (a != null) {
                int i = a.dalvikPss;
                int i2 = a.nativePss;
                int totalPss = a.getTotalPss();
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        bVar.f9469g = ((long) Integer.parseInt(a.getMemoryStat("summary.graphics"))) * 1024;
                        bVar.f9481s = ((long) Integer.parseInt(a.getMemoryStat("summary.java-heap"))) * 1024;
                        bVar.f9482t = ((long) Integer.parseInt(a.getMemoryStat("summary.native-heap"))) * 1024;
                        bVar.f9483u = ((long) Integer.parseInt(a.getMemoryStat("summary.code"))) * 1024;
                        bVar.f9484v = ((long) Integer.parseInt(a.getMemoryStat("summary.stack"))) * 1024;
                        bVar.f9485w = ((long) Integer.parseInt(a.getMemoryStat("summary.private-other"))) * 1024;
                        bVar.f9486x = ((long) Integer.parseInt(a.getMemoryStat("summary.system"))) * 1024;
                        bVar.f9480r = ((long) Integer.parseInt(a.getMemoryStat("summary.total-pss"))) * 1024;
                        bVar.f9479q = ((long) Integer.parseInt(a.getMemoryStat("summary.total-swap"))) * 1024;
                    } catch (Exception unused) {
                    }
                }
                bVar.f9466d = ((long) i) * 1024;
                bVar.f9467e = ((long) i2) * 1024;
                bVar.f9468f = ((long) totalPss) * 1024;
                bVar.f9471i = ((long) a.dalvikPrivateDirty) * 1024;
                bVar.f9472j = ((long) a.dalvikSharedDirty) * 1024;
                bVar.f9473k = ((long) a.otherPss) * 1024;
                bVar.f9474l = ((long) a.otherPrivateDirty) * 1024;
                bVar.f9475m = ((long) a.otherSharedDirty) * 1024;
                bVar.f9476n = ((long) a.getTotalSwappablePss()) * 1024;
                bVar.f9477o = ((long) a.getTotalPrivateDirty()) * 1024;
                bVar.f9478p = ((long) a.getTotalSharedClean()) * 1024;
            }
            bVar.f9470h = C3112b.m12953g() * 1024;
        } catch (Exception unused2) {
        }
        return bVar;
    }
}
