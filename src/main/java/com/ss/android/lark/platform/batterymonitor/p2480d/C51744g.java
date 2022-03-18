package com.ss.android.lark.platform.batterymonitor.p2480d;

import com.bytedance.apm.ApmAgent;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.diskmanage.CleanResult;
import com.ss.android.lark.diskmanage.RemoteConfig;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.batterymonitor.ConditionState;
import com.ss.android.lark.platform.diskmanage.DiskManageProvider;
import com.ss.android.lark.platform.diskmanage.RustCleanTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.batterymonitor.d.g */
public class C51744g {

    /* renamed from: a */
    public static String f128650a = "TaskLaunchStrategy";

    /* renamed from: d */
    private static String f128651d = "lark_background_rust_clean";

    /* renamed from: b */
    private long f128652b;

    /* renamed from: c */
    private long f128653c = 1200000;

    /* renamed from: a */
    private void m200638a() {
        CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
            /* class com.ss.android.lark.platform.batterymonitor.p2480d.C51744g.RunnableC517451 */

            public void run() {
                Log.m165389i(C51744g.f128650a, "begin execute rust clean task on condition backgroud + plugin");
                RemoteConfig b = DiskManageProvider.m200842c().mo177934b();
                long currentTimeMillis = System.currentTimeMillis();
                CleanResult a = new RustCleanTask().mo135616a(b);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str = C51744g.f128650a;
                Log.m165389i(str, "end  execute rust clean task costtime is" + currentTimeMillis2 + "clean size is " + a.mo135504b());
                C51744g.this.mo177860a(currentTimeMillis2, a);
            }
        }, 30, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public void mo177861a(ConditionState conditionState) {
        if (!conditionState.mo177804e() && conditionState.mo177805f()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f128652b >= this.f128653c) {
                this.f128652b = currentTimeMillis;
                m200638a();
            }
        }
    }

    /* renamed from: a */
    public void mo177860a(long j, CleanResult aVar) {
        try {
            Log.m165389i(f128650a, "send lark_background_rust_clean event to slardar");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("costTime", j);
            jSONObject.put("cleanSize", aVar.mo135504b());
            ApmAgent.monitorEvent(f128651d, null, jSONObject, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
