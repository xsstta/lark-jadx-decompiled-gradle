package com.ss.android.lark.platform.batterymonitor.p2480d;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.batterymonitor.ConditionState;
import com.ss.android.lark.platform.batterymonitor.p2477a.C51719a;
import com.ss.android.lark.platform.batterymonitor.p2479c.C51733b;
import com.ss.android.lark.platform.p2482c.C51791b;

/* renamed from: com.ss.android.lark.platform.batterymonitor.d.f */
public class C51743f extends AbstractC51736a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: d */
    public void mo177852d() {
        super.mo177852d();
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: c */
    public void mo177851c() {
        m200633a(false);
        Log.m165389i("BatteryMonitor", "miniapp process set rustsdk  Doze(false)");
        if (this.f128637e != null) {
            Log.m165389i("BatteryMonitor", "call mRecycleProc.cannelRecycleProcess()");
            this.f128637e.mo177840c();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: b */
    public void mo177850b() {
        m200633a(true);
        Log.m165389i("BatteryMonitor", "miniapp process set rustsdk  Doze(true)");
        if (this.f128637e != null) {
            Log.m165389i("BatteryMonitor", "call mRecycleProc.recycleProcess()");
            this.f128637e.mo177841c(C51719a.m200550g().mo177822k());
        }
    }

    public C51743f(Context context) {
        this.f128635c = context;
        this.f128637e = new C51733b();
    }

    /* renamed from: a */
    private void m200633a(boolean z) {
        C51791b.m200791a().mo103630a().mo103636b(z);
    }

    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: a */
    public void mo177847a(ConditionState conditionState) {
        int b = mo177849b(conditionState);
        Log.m165389i("BatteryMonitor", "miniapp process new battery strategy is " + b);
        if (b == this.f128634b) {
            Log.m165389i("BatteryMonitor", "miniapp process battery strategy equals lastStrategy, so do noting.");
            return;
        }
        if (b == 2) {
            mo177850b();
        } else if (this.f128634b == 2) {
            mo177851c();
        }
        this.f128634b = b;
    }
}
