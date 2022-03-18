package com.ss.android.lark.platform.batterymonitor.p2480d;

import android.content.Context;
import com.bytedance.apm.C2734a;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.batterymonitor.ConditionState;
import com.ss.android.lark.platform.p2482c.C51791b;

/* renamed from: com.ss.android.lark.platform.batterymonitor.d.c */
public class C51739c extends AbstractC51736a {

    /* renamed from: f */
    private final boolean f128639f;

    /* renamed from: g */
    private C51740d f128640g;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: d */
    public void mo177852d() {
        super.mo177852d();
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: b */
    public void mo177850b() {
        m200610b(true);
        C36083a.m141486a().getCCMDependency().mo132708a(true);
        Log.m165389i("BatteryMonitor", "DocEditor.getInstance().setIsDoze(true)");
        m200609a(true);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: c */
    public void mo177851c() {
        m200610b(false);
        C36083a.m141486a().getCCMDependency().mo132708a(false);
        Log.m165389i("BatteryMonitor", "DocEditor.getInstance().setIsDoze(false)");
        m200609a(false);
    }

    /* renamed from: f */
    private boolean m200611f() {
        Log.m165389i("BatteryMonitor", "shouldFixApmWhenDozeChange apm enable: " + true + ", isInP0Process:" + this.f128639f);
        if (this.f128639f) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m200612g() {
        boolean a = C36083a.m141486a().getVideoConferenceDependency().mo133138a();
        Log.m165389i("BatteryMonitor", "shouldSetRustDoze called. is voip in using :" + a);
        return a;
    }

    /* renamed from: b */
    private void m200610b(boolean z) {
        if (this.f128639f) {
            C51791b.m200791a().mo103630a().mo103636b(z);
        }
    }

    /* renamed from: a */
    private void m200609a(boolean z) {
        if (m200611f()) {
            if (z) {
                Log.m165379d("BatteryMonitor", "p0 fixApmWhenDozeChange pause apm function because doze is true");
                C2734a.m11611a().mo11778b();
                return;
            }
            Log.m165379d("BatteryMonitor", "p0 fixApmWhenDozeChange resume apm function because doze is false");
            C2734a.m11611a().mo11780c();
        }
    }

    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: a */
    public void mo177847a(ConditionState conditionState) {
        this.f128640g.mo177857a(conditionState);
        int b = mo177849b(conditionState);
        Log.m165389i("BatteryMonitor", "docs process new battery strategy is " + b);
        if (b == this.f128634b) {
            Log.m165389i("BatteryMonitor", "docs process battery strategy equals lastStrategy, so do noting.");
            return;
        }
        if (b == 2) {
            if (m200612g()) {
                Log.m165389i("BatteryMonitor", "docs process not set doze because voip in using ");
                return;
            }
            mo177850b();
        } else if (this.f128634b == 2) {
            mo177851c();
        }
        this.f128634b = b;
    }

    C51739c(Context context, boolean z) {
        this.f128635c = context;
        this.f128639f = z;
        this.f128640g = new C51740d(context);
    }
}
