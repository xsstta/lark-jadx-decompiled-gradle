package com.facebook.battery.p951a.p954c;

import com.facebook.battery.metrics.cpu.CpuMetrics;
import com.facebook.battery.p951a.p953b.AbstractC20990a;

/* renamed from: com.facebook.battery.a.c.a */
public class C20992a implements AbstractC20990a<CpuMetrics> {
    /* renamed from: a */
    public void mo71087a(CpuMetrics cpuMetrics, AbstractC20990a.AbstractC20991a aVar) {
        if (cpuMetrics.userTimeS != 0.0d) {
            aVar.mo71088a("cpu_user_time_s", cpuMetrics.userTimeS);
        }
        if (cpuMetrics.systemTimeS != 0.0d) {
            aVar.mo71088a("cpu_system_time_s", cpuMetrics.systemTimeS);
        }
        if (cpuMetrics.childUserTimeS != 0.0d) {
            aVar.mo71088a("child_cpu_user_time_s", cpuMetrics.childUserTimeS);
        }
        if (cpuMetrics.childSystemTimeS != 0.0d) {
            aVar.mo71088a("child_cpu_system_time_s", cpuMetrics.childSystemTimeS);
        }
    }
}
