package com.bytedance.apm.impl;

import com.bytedance.apm.trace.C3088b;
import com.bytedance.services.apm.api.ILaunchTrace;

public class LaunchTraceImpl implements ILaunchTrace {
    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void cancelTrace() {
        C3088b.m12871b();
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void startTrace() {
        C3088b.m12865a();
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void endSpan(String str, String str2) {
        C3088b.m12872b(str, str2);
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void startSpan(String str, String str2) {
        C3088b.m12870a(str, str2);
    }

    @Override // com.bytedance.services.apm.api.ILaunchTrace
    public void endTrace(int i, String str, long j) {
        C3088b.m12867a(i, str, j);
    }
}
