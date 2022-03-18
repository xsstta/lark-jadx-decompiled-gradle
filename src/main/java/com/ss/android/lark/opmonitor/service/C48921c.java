package com.ss.android.lark.opmonitor.service;

import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.gson.Gson;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.api.AbstractC48904a;
import com.ss.android.lark.opmonitor.config.OPMonitorHeartBeatConfig;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorHeartBeatMonitorData;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.optrace.dependency.ECOProbeSDKDepMgr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.opmonitor.service.c */
public class C48921c {

    /* renamed from: d */
    private static C48921c f122901d;

    /* renamed from: e */
    private static boolean f122902e;

    /* renamed from: a */
    public OPMonitorHeartBeatConfig f122903a;

    /* renamed from: b */
    public final ConcurrentHashMap<String, OPMonitorHeartBeatMonitorData> f122904b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public final ConcurrentHashMap<String, AbstractC48904a> f122905c = new ConcurrentHashMap<>();

    /* renamed from: f */
    private OPMonitorCode f122906f;

    /* renamed from: g */
    private TimerTask f122907g;

    /* renamed from: h */
    private ThreadFactory f122908h;

    /* renamed from: i */
    private ScheduledExecutorService f122909i;

    private C48921c() {
        mo170856b();
    }

    /* renamed from: a */
    public static C48921c m192733a() {
        if (f122901d == null) {
            synchronized (C48921c.class) {
                if (f122901d == null) {
                    f122901d = new C48921c();
                }
            }
        }
        return f122901d;
    }

    /* renamed from: f */
    private void m192736f() {
        Log.m165389i("OPMonitorHeartBeatManager", "stopTimer");
        ScheduledExecutorService scheduledExecutorService = this.f122909i;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.f122909i.shutdownNow();
        }
    }

    /* renamed from: d */
    private synchronized void m192734d() {
        Log.m165389i("OPMonitorHeartBeatManager", "startTimer");
        int a = this.f122903a.mo170755a();
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, this.f122908h);
        this.f122909i = newScheduledThreadPool;
        try {
            long j = (long) a;
            newScheduledThreadPool.scheduleWithFixedDelay(this.f122907g, j, j, TimeUnit.SECONDS);
        } catch (RejectedExecutionException e) {
            Log.m165384e("OPMonitorHeartBeatManager", "scheduleWithFixedDelay is exception", e);
        }
    }

    /* renamed from: e */
    private synchronized void m192735e() {
        ScheduledExecutorService scheduledExecutorService = this.f122909i;
        if (scheduledExecutorService == null || !scheduledExecutorService.isShutdown()) {
            Log.m165389i("OPMonitorHeartBeatManager", "reStartTimer fail, last timer not shutdown");
        } else {
            int a = this.f122903a.mo170755a();
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, this.f122908h);
            this.f122909i = newScheduledThreadPool;
            try {
                long j = (long) a;
                newScheduledThreadPool.scheduleWithFixedDelay(this.f122907g, j, j, TimeUnit.SECONDS);
            } catch (RejectedExecutionException e) {
                Log.m165384e("OPMonitorHeartBeatManager", "scheduleWithFixedDelay is exception", e);
            }
        }
    }

    /* renamed from: c */
    public void mo170857c() {
        if (this.f122904b.size() == 0) {
            this.f122905c.clear();
            return;
        }
        Iterator<Map.Entry<String, OPMonitorHeartBeatMonitorData>> it = this.f122904b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, OPMonitorHeartBeatMonitorData> next = it.next();
            if (next.getValue() == null || next.getValue().mo170786c() == 0) {
                it.remove();
                this.f122905c.remove(next.getKey());
            }
        }
    }

    /* renamed from: b */
    public void mo170856b() {
        if (!f122902e) {
            f122902e = true;
            OPMonitorHeartBeatConfig oPMonitorHeartBeatConfig = new OPMonitorHeartBeatConfig();
            this.f122903a = oPMonitorHeartBeatConfig;
            oPMonitorHeartBeatConfig.mo170757a(ECOProbeSDKDepMgr.f122918a.mo170892a().mo144738b("ecosystem.monitor.heartbeat.enable"));
            try {
                JSONObject jSONObject = new JSONObject(ECOProbeSDKDepMgr.f122918a.mo170892a().mo144737a("opmonitor_heartbeat_conifg"));
                this.f122903a.mo170758b(jSONObject.getInt("maxReportCount"));
                this.f122903a.mo170756a(jSONObject.getInt("heartBeatInterval"));
            } catch (JSONException e) {
                Log.m165384e("OPMonitorHeartBeatManager", "heartbeat settings parse is exception", e);
            }
            if (!this.f122903a.mo170759b()) {
                this.f122904b.clear();
                this.f122905c.clear();
                return;
            }
            C48919b a = C48924d.f122912a.mo170860a();
            if (a != null) {
                this.f122906f = a.mo170810d();
            } else {
                this.f122906f = new OPMonitorCode("monitor.base.heartbeat", HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "heartbeat_report");
            }
            this.f122907g = new TimerTask() {
                /* class com.ss.android.lark.opmonitor.service.C48921c.C489221 */

                public void run() {
                    Log.m165389i("OPMonitorHeartBeatManager", "heart upload start upload size: " + C48921c.this.f122904b.size());
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry<String, OPMonitorHeartBeatMonitorData> entry : C48921c.this.f122904b.entrySet()) {
                        OPMonitorHeartBeatMonitorData value = entry.getValue();
                        AbstractC48904a aVar = C48921c.this.f122905c.get(entry.getKey());
                        if (value != null) {
                            arrayList.add(value.mo170783a());
                            value.mo170787d();
                            if (value.mo170786c() == 1 && aVar != null) {
                                value.mo170784a(aVar.getCurrentHeartBeatStatus(entry.getKey()));
                            } else if (aVar == null) {
                                value.mo170784a(0);
                            }
                            if (value.mo170789e() > C48921c.this.f122903a.mo170760c()) {
                                Log.m165389i("OPMonitorHeartBeatManager", "data max upload count heartBeatID:" + value.mo170785b());
                                value.mo170784a(0);
                            }
                        }
                    }
                    C48921c.this.mo170854a(arrayList);
                    Log.m165389i("OPMonitorHeartBeatManager", "heart upload end upload");
                    C48921c.this.mo170857c();
                    Log.m165389i("OPMonitorHeartBeatManager", "clear data is done after size:" + C48921c.this.f122904b.size());
                }
            };
            this.f122908h = new ThreadFactory() {
                /* class com.ss.android.lark.opmonitor.service.C48921c.ThreadFactoryC489232 */

                /* renamed from: a */
                public static Thread m192743a(Thread thread) {
                    return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
                }

                public Thread newThread(Runnable runnable) {
                    return m192743a(new Thread(runnable, "HeartBeatThread"));
                }
            };
            m192734d();
            Log.m165389i("OPMonitorHeartBeatManager", "OPMonitorHeartBeatManager is done config" + this.f122903a);
            Log.m165389i("OPMonitorHeartBeatManager", "OPMonitorHeartBeatManager is done batchMonitorCode:" + this.f122906f);
        }
    }

    /* renamed from: a */
    public void mo170853a(String str) {
        OPMonitorHeartBeatConfig oPMonitorHeartBeatConfig;
        if (!TextUtils.isEmpty(str) && (oPMonitorHeartBeatConfig = this.f122903a) != null && oPMonitorHeartBeatConfig.mo170759b()) {
            OPMonitorHeartBeatMonitorData oPMonitorHeartBeatMonitorData = this.f122904b.get(str);
            if (oPMonitorHeartBeatMonitorData == null) {
                this.f122905c.remove(str);
                return;
            }
            oPMonitorHeartBeatMonitorData.mo170784a(0);
            this.f122905c.remove(str);
        }
    }

    /* renamed from: a */
    public void mo170854a(List<String> list) {
        if (list.size() == 0) {
            Log.m165389i("OPMonitorHeartBeatManager", "uploadData size = 0");
        } else {
            new OPMonitor("openplatform_ecosystem_monitor_report_heartbeat", this.f122906f).addCategoryValue("active_ids", new Gson().toJson(list)).reportPlatform(4).flush();
        }
    }

    /* renamed from: a */
    public synchronized void mo170855a(boolean z) {
        OPMonitorHeartBeatConfig oPMonitorHeartBeatConfig = this.f122903a;
        if (oPMonitorHeartBeatConfig != null && oPMonitorHeartBeatConfig.mo170759b()) {
            Log.m165389i("OPMonitorHeartBeatManager", "lark status is change isLarkForeground: " + z);
            if (z) {
                m192735e();
            } else {
                m192736f();
            }
        }
    }

    /* renamed from: a */
    public void mo170852a(OPMonitorHeartBeatMonitorData oPMonitorHeartBeatMonitorData, AbstractC48904a aVar) {
        OPMonitorHeartBeatConfig oPMonitorHeartBeatConfig = this.f122903a;
        if (oPMonitorHeartBeatConfig != null && oPMonitorHeartBeatConfig.mo170759b()) {
            this.f122904b.put(oPMonitorHeartBeatMonitorData.mo170785b(), oPMonitorHeartBeatMonitorData);
            this.f122905c.put(oPMonitorHeartBeatMonitorData.mo170785b(), aVar);
        }
    }
}
