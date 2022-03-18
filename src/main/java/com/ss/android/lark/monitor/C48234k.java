package com.ss.android.lark.monitor;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import com.facebook.battery.metrics.core.AbstractC20997b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.monitor.k */
public class C48234k extends AbstractC20997b<C48233j> {

    /* renamed from: a */
    private Context f121413a;

    /* renamed from: a */
    public C48233j mo71110b() {
        return new C48233j();
    }

    public C48234k(Context context) {
        this.f121413a = context;
    }

    /* renamed from: a */
    public boolean mo71109a(C48233j jVar) {
        Debug.MemoryInfo memoryInfo;
        Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) this.f121413a.getSystemService("activity")).getProcessMemoryInfo(new int[]{Process.myPid()});
        if (processMemoryInfo == null || processMemoryInfo.length <= 0 || (memoryInfo = processMemoryInfo[0]) == null) {
            return false;
        }
        jVar.nativeHeapMB = (memoryInfo.nativePss + memoryInfo.nativeSharedDirty) / 1024;
        jVar.javaHeapMB = (memoryInfo.dalvikPss + memoryInfo.dalvikPrivateDirty) / 1024;
        jVar.maxMemMB = (int) (Runtime.getRuntime().maxMemory() / 1048576);
        jVar.totalMemMB = memoryInfo.getTotalPss() / 1024;
        return true;
    }
}
