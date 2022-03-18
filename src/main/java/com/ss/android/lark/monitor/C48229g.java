package com.ss.android.lark.monitor;

import com.facebook.battery.metrics.cpu.CpuMetrics;
import com.facebook.battery.p951a.p953b.AbstractC20990a;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.monitor.g */
public class C48229g implements AbstractC20990a<CpuThreadMetrics> {

    /* renamed from: a */
    int f121412a;

    public C48229g(int i) {
        this.f121412a = i;
    }

    /* renamed from: a */
    public void mo71087a(CpuThreadMetrics cpuThreadMetrics, AbstractC20990a.AbstractC20991a aVar) {
        if (aVar instanceof AbstractC48252t) {
            for (Map.Entry<String, CpuMetrics> entry : cpuThreadMetrics.getTopThreadMetrics(this.f121412a)) {
                CpuMetrics value = entry.getValue();
                ((AbstractC48252t) aVar).mo168814a("top_thread_cpu", entry.getKey(), value.systemTimeS + value.userTimeS);
            }
        }
    }
}
