package com.ss.android.lark.platform.batterymonitor.p2480d;

import android.content.Context;
import com.bytedance.apm.C2734a;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.frameworks.baselib.network.http.AbstractC13978a;
import com.bytedance.frameworks.baselib.network.http.ok3.C14018a;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.C14055o;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.batterymonitor.ConditionState;
import com.ss.android.lark.platform.batterymonitor.dozeipc.C51750a;
import com.ss.android.lark.platform.p2482c.C51791b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.platform.batterymonitor.d.e */
public class C51741e extends AbstractC51736a {

    /* renamed from: f */
    public C51750a f128646f;

    /* renamed from: g */
    private C51744g f128647g;

    /* renamed from: h */
    private boolean f128648h = true;

    /* renamed from: h */
    private boolean m200625h() {
        return true;
    }

    /* renamed from: g */
    private boolean m200624g() {
        if (!RomUtils.m94933a() || !C37239a.m146648b().mo136954b("byteview.callmeeting.android.huawei.push")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: e */
    public void mo177853e() {
        synchronized (this) {
            if (!mo177848a()) {
                Log.m165389i("BatteryMonitor", "removeDozeState, found doze is not");
                return;
            }
            mo177851c();
            this.f128634b = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo177858f() {
        CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
            /* class com.ss.android.lark.platform.batterymonitor.p2480d.C51741e.RunnableC517421 */

            public void run() {
                Log.m165389i("BatteryMonitor", "begin deal Main proc first excute battery check");
                C51741e.this.f128646f.mo177869a(false);
            }
        }, 15, TimeUnit.SECONDS);
    }

    /* renamed from: i */
    private boolean m200626i() {
        boolean a = C36083a.m141486a().getVideoConferenceDependency().mo133138a();
        Log.m165389i("BatteryMonitor", "shouldSetRustDoze called. is voip in using :" + a);
        return a;
    }

    /* renamed from: j */
    private boolean m200627j() {
        boolean a = C36083a.m141486a().getMinutesDependency().mo132983a();
        Log.m165389i("BatteryMonitor", "shouldSetRustDoze called. is recording in using :" + a);
        return a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: b */
    public void mo177850b() {
        Log.m165389i("BatteryMonitor", "main process ipc wschannel deal doze state change to true");
        this.f128646f.mo177869a(true);
        if (m200624g()) {
            AbstractC13978a a = C14018a.m56755a(this.f128635c, "");
            if (a instanceof C14055o) {
                ((C14055o) a).mo51723a(false).connectionPool().evictAll();
            }
        }
        m200623b(true);
        Log.m165389i("BatteryMonitor", "main process set rustsdk  Doze(true)");
        m200622a(true);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: c */
    public void mo177851c() {
        m200623b(false);
        Log.m165389i("BatteryMonitor", "main process set rustsdk  Doze(false)");
        Log.m165389i("BatteryMonitor", "main process ipc wschannel deal doze state change to false");
        this.f128646f.mo177869a(false);
        m200622a(false);
        if (this.f128637e != null) {
            Log.m165389i("BatteryMonitor", "call mRecycleProc.cannelRecycleProcess()");
            this.f128637e.mo177840c();
        }
    }

    /* renamed from: b */
    private void m200623b(boolean z) {
        C51791b.m200791a().mo103630a().mo103636b(z);
    }

    public C51741e(Context context) {
        this.f128635c = context;
        this.f128646f = new C51750a();
        this.f128647g = new C51744g();
    }

    /* renamed from: a */
    private void m200622a(boolean z) {
        if (!m200625h()) {
            Log.m165389i("BatteryMonitor", "main fixApmWhenDozeChange...shouldEnableApm is false");
        } else if (z) {
            Log.m165379d("BatteryMonitor", "main fixApmWhenDozeChange pause apm function because doze is true");
            if (m200624g()) {
                ApmDelegate.m12591a().mo12796i();
            } else {
                C2734a.m11611a().mo11778b();
            }
        } else {
            Log.m165379d("BatteryMonitor", "main fixApmWhenDozeChange resume apm function because doze is false");
            if (m200624g()) {
                ApmDelegate.m12591a().mo12797j();
            } else {
                C2734a.m11611a().mo11780c();
            }
        }
    }

    @Override // com.ss.android.lark.platform.batterymonitor.p2480d.AbstractC51736a
    /* renamed from: a */
    public void mo177847a(ConditionState conditionState) {
        synchronized (this) {
            this.f128647g.mo177861a(conditionState);
            if (this.f128648h) {
                this.f128648h = false;
                Log.m165389i("BatteryMonitor", "main process first execute battery policy，need tell wschannel!");
                mo177858f();
            }
            int b = mo177849b(conditionState);
            Log.m165389i("BatteryMonitor", "main process new  battery strategy is " + b);
            if (b == this.f128634b) {
                Log.m165389i("BatteryMonitor", "main process battery strategy equals lastStrategy, so do noting.");
                return;
            }
            if (b == 2) {
                if (m200626i()) {
                    Log.m165389i("BatteryMonitor", "main process not set doze because voip in using ");
                    return;
                } else if (m200627j()) {
                    Log.m165389i("BatteryMonitor", "main process not set doze because mmRecording in using ");
                    return;
                } else {
                    mo177850b();
                }
            } else if (this.f128634b == 2) {
                mo177851c();
            }
            this.f128634b = b;
        }
    }
}
