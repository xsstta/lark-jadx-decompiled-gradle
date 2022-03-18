package com.ss.android.vc.p3069b;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import com.ss.android.vc.dependency.ar;

/* renamed from: com.ss.android.vc.b.g */
public class C60684g implements AbstractC60659a {

    /* renamed from: a */
    private VCApmSampleMemInfo f151806a = new VCApmSampleMemInfo();

    /* renamed from: b */
    private int f151807b;

    /* renamed from: c */
    private ActivityManager f151808c;

    /* renamed from: d */
    public VCApmSampleMemInfo mo208204b() {
        return this.f151806a.mo208227a(this.f151807b);
    }

    /* renamed from: c */
    public VCApmSampleMemInfo mo208203a() {
        VCApmSampleMemInfo e = m235792e();
        if (e != null) {
            this.f151806a.mo208243a(e);
            this.f151807b++;
        }
        return e;
    }

    /* renamed from: e */
    private VCApmSampleMemInfo m235792e() {
        if (this.f151808c == null) {
            this.f151808c = (ActivityManager) ar.m236694a().getSystemService("activity");
        }
        Debug.MemoryInfo memoryInfo = this.f151808c.getProcessMemoryInfo(new int[]{Process.myPid()})[0];
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        double parseInt = (double) (((float) Integer.parseInt(memoryInfo.getMemoryStat("summary.java-heap"))) / 1024.0f);
        double parseInt2 = (double) (((float) Integer.parseInt(memoryInfo.getMemoryStat("summary.native-heap"))) / 1024.0f);
        double parseInt3 = (double) (((float) Integer.parseInt(memoryInfo.getMemoryStat("summary.code"))) / 1024.0f);
        return new VCApmSampleMemInfo((double) (((float) memoryInfo.getTotalPss()) / 1024.0f), parseInt, parseInt2, (double) (((float) Integer.parseInt(memoryInfo.getMemoryStat("summary.graphics"))) / 1024.0f), parseInt3);
    }
}
