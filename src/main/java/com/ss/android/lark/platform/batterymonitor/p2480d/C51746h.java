package com.ss.android.lark.platform.batterymonitor.p2480d;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.ah.C51702c;
import com.ss.android.lark.platform.batterymonitor.ConditionState;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.platform.batterymonitor.d.h */
public class C51746h extends AbstractC51736a {

    /* renamed from: f */
    private PowerManager f128655f;

    /* renamed from: g */
    private String f128656g;

    /* renamed from: h */
    private boolean f128657h = true;

    /* renamed from: f */
    private boolean m200641f() {
        if (m200642g()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: c */
    public void mo177851c() {
        Log.m165389i("BatteryMonitor", "wschannel process Doze(false)");
        C51702c.m200484a().mo201589a(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: d */
    public void mo177852d() {
        this.f128633a = new HashMap<String, Integer>(25) {
            /* class com.ss.android.lark.platform.batterymonitor.p2480d.C51746h.C517471 */

            {
                put("1000", 1);
                put("1001", 1);
                put("1002", 1);
                put("1010", 1);
                put("1011", 1);
                put("1012", 1);
                put("1100", 1);
                put("1101", 1);
                put("1102", 2);
                put("1110", 1);
                put("1111", 1);
                put("1112", 2);
                put("2000", 1);
                put("2001", 1);
                put("2002", 1);
                put("2010", 1);
                put("2011", 1);
                put("2012", 1);
                put("2100", 1);
                put("2101", 1);
                put("2102", 2);
                put("2110", 1);
                put("2111", 1);
                put("2112", 2);
            }
        };
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: b */
    public void mo177850b() {
        Log.m165389i("BatteryMonitor", "wschannel process Doze(true)");
        C51702c.m200484a().mo201589a(true);
    }

    /* renamed from: g */
    private boolean m200642g() {
        if (this.f128655f == null) {
            Log.m165383e("BatteryMonitor", getClass().getSimpleName() + " updateAndroidDozeState pm is null");
            return false;
        } else if (Build.VERSION.SDK_INT < 23) {
            return false;
        } else {
            boolean isIgnoringBatteryOptimizations = this.f128655f.isIgnoringBatteryOptimizations(this.f128656g);
            Log.m165389i("BatteryMonitor", getClass().getSimpleName() + " packagename: " + this.f128656g + " in power whitelist " + isIgnoringBatteryOptimizations);
            return isIgnoringBatteryOptimizations;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: b */
    public int mo177849b(ConditionState conditionState) {
        if (m200641f()) {
            return 0;
        }
        return super.mo177849b(conditionState);
    }

    public C51746h(Context context) {
        this.f128635c = context;
        this.f128655f = (PowerManager) context.getSystemService("power");
        this.f128656g = context.getPackageName();
        this.f128637e = null;
    }

    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: a */
    public void mo177847a(ConditionState conditionState) {
        if (this.f128657h) {
            this.f128657h = false;
            Log.m165389i("BatteryMonitor", "wschannel process first execute battery policy!");
            mo177851c();
        }
        int b = mo177849b(conditionState);
        Log.m165389i("BatteryMonitor", "wschannel process new battery strategy is " + b);
        if (b == this.f128634b) {
            Log.m165389i("BatteryMonitor", "wschannel process battery strategy equals lastStrategy, so do noting.");
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
