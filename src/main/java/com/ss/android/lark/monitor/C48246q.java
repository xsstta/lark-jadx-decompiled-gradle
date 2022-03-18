package com.ss.android.lark.monitor;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.C48237n;
import com.ss.android.lark.monitor.app.AppMonitorController;
import com.ss.android.lark.monitor.app.NativeMonitor;
import java.util.Set;

/* renamed from: com.ss.android.lark.monitor.q */
public class C48246q {

    /* renamed from: a */
    private volatile AbstractC48230h f121462a;

    /* renamed from: b */
    private AppMonitorController f121463b;

    /* renamed from: com.ss.android.lark.monitor.q$a */
    public interface AbstractC48247a {
        /* renamed from: a */
        void mo103071a(float f);
    }

    /* renamed from: a */
    public AbstractC48230h mo168805a() {
        return this.f121462a;
    }

    /* renamed from: a */
    public static void m190373a(AbstractC48247a aVar) {
        NativeMonitor.addAppCpuChangeListener(aVar);
    }

    public C48246q(AbstractC48230h hVar) {
        this.f121462a = hVar;
    }

    /* renamed from: b */
    public static void m190374b(boolean z) {
        NativeMonitor.getInstance().setEnableAppCpuChangeMonitor(z);
    }

    /* renamed from: a */
    public C48237n.C48239a mo168806a(Context context) {
        return C48237n.m190350a(context);
    }

    /* renamed from: a */
    public void mo168808a(C48237n nVar) {
        LarkMetrics.m190223a().mo168670a(nVar);
        boolean b = this.f121462a.mo168769b("lark.android.app.monitor");
        Log.m165379d("AppMonitorController", "MonitorModule isAppMonitorEnable " + b);
        if (this.f121463b == null && b) {
            AppMonitorController aVar = new AppMonitorController(nVar.f121416a, nVar.f121418c, nVar.f121427l);
            this.f121463b = aVar;
            aVar.mo168722a(this.f121462a.mo168772d(), (String) null, (String) null);
            long[] e = this.f121462a.mo168773e();
            if (e != null && e.length == 3) {
                this.f121463b.mo168720a(e[0], e[1], e[2]);
            }
            this.f121462a.mo168770c();
        }
    }

    /* renamed from: a */
    public void mo168810a(boolean z) {
        AppMonitorController aVar = this.f121463b;
        if (aVar != null) {
            aVar.mo168721a(z);
        }
    }

    /* renamed from: a */
    public void mo168807a(long j, long j2, long j3) {
        AppMonitorController aVar = this.f121463b;
        if (aVar != null) {
            aVar.mo168720a(j, j2, j3);
        }
    }

    /* renamed from: a */
    public void mo168811a(boolean z, String str, String str2) {
        LarkMetrics.m190223a().mo168674a(z, str, str2);
        AppMonitorController aVar = this.f121463b;
        if (aVar != null) {
            aVar.mo168722a(z, str, str2);
        }
    }

    /* renamed from: a */
    public void mo168809a(String str, long j, long j2, Set<String> set) {
        LarkMetrics.m190223a().mo168673a(str, j, j2, set);
    }
}
