package com.bytedance.monitor.collector;

import android.util.Pair;

/* renamed from: com.bytedance.monitor.collector.b */
public class C20127b extends AbsMonitor {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: b */
    public void mo68214b(int i) {
    }

    /* renamed from: e */
    private String m73458e() {
        if (!C20152k.f49237a) {
            return null;
        }
        return MonitorJni.doDumpAtrace();
    }

    /* renamed from: d */
    public void mo68234d() {
        try {
            if (C20152k.f49237a) {
                MonitorJni.doEnableLock();
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: c */
    public Pair<String, ?> mo68215c() {
        try {
            if (!C20152k.f49237a) {
                return null;
            }
            return new Pair<>(this.f49088a, m73458e());
        } catch (Throwable unused) {
            return null;
        }
    }

    public C20127b(int i) {
        super(i, "atrace_event");
    }

    /* renamed from: a */
    public void mo68233a(long j) {
        try {
            if (C20152k.f49237a) {
                MonitorJni.doEnableAtrace(this.f49090c, j);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private String m73457b(long j, long j2) {
        if (!C20152k.f49237a) {
            return null;
        }
        return MonitorJni.doDumpAtraceRange(j, j2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.monitor.collector.AbsMonitor
    /* renamed from: a */
    public Pair<String, ?> mo68210a(long j, long j2) {
        try {
            if (!C20152k.f49237a) {
                return null;
            }
            return new Pair<>(this.f49088a, m73457b(j, j2));
        } catch (Throwable unused) {
            return null;
        }
    }
}
