package com.ss.android.vc.statistics.p3180a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60745ag;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import java.util.concurrent.atomic.AtomicBoolean;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.statistics.a.f */
public class C63694f {

    /* renamed from: a */
    public static long f160790a;

    /* renamed from: b */
    private static double f160791b;

    /* renamed from: c */
    private static AtomicBoolean f160792c = new AtomicBoolean(false);

    /* renamed from: d */
    private static boolean f160793d = false;

    /* renamed from: e */
    private static final BroadcastReceiver f160794e = new BroadcastReceiver() {
        /* class com.ss.android.vc.statistics.p3180a.C63694f.C636951 */

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getIntExtra(UpdateKey.STATUS, -1) == 2) {
                C63694f.f160790a = 0;
            }
        }
    };

    /* renamed from: f */
    private static C60745ag.C60746a f160795f;

    /* renamed from: c */
    private static double m249702c() {
        return ((double) ((BatteryManager) ar.m236694a().getSystemService("batterymanager")).getIntProperty(4)) / 100.0d;
    }

    /* renamed from: a */
    public static void m249695a() {
        boolean z = false;
        if (f160792c.compareAndSet(false, true)) {
            Intent a = m249694a(ar.m236694a(), f160794e, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (a != null) {
                z = true;
            }
            f160793d = z;
            if (z) {
                if (a.getIntExtra(UpdateKey.STATUS, -1) == 2) {
                    f160790a = 0;
                    f160791b = m249702c();
                } else {
                    f160790a = System.currentTimeMillis();
                    f160791b = m249702c();
                }
                f160795f = C60745ag.m236065b(new Runnable() {
                    /* class com.ss.android.vc.statistics.p3180a.C63694f.RunnableC636962 */

                    public void run() {
                        C63694f.m249699b();
                    }
                }, 60000, 60000);
            }
        }
    }

    /* renamed from: b */
    public static void m249699b() {
        boolean z;
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211906j();
        if (kVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("power_level", m249702c());
                if (f160790a == 0) {
                    z = true;
                } else {
                    z = false;
                }
                jSONObject.put("is_plugging", z);
                C63686a.m249664b("vc_perf_power_realtime", jSONObject, kVar.mo212056e());
            } catch (JSONException e) {
                C60700b.m235864f("PerfAppreciable", "[sendPerfPowerRealtime]", e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m249700b(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            C63686a.m249664b("vc_tab_load_more_time", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("PerfAppreciable", "[sendLoadMoreConsume]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m249696a(long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            C63686a.m249664b("vc_tab_pull_time", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("PerfAppreciable", "[sendPullToRefreshConsume]", e.getMessage());
        }
    }

    /* renamed from: b */
    private static void m249701b(VideoChat videoChat) {
        if (f160790a == 0) {
            C60700b.m235851b("PerfAppreciable", "[sendPerfPowerConsume]", "return, is charging");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f160790a;
        if (currentTimeMillis < 600000) {
            C60700b.m235851b("PerfAppreciable", "[sendPerfPowerConsume2]", "return, duration short");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start_level", f160791b);
            jSONObject.put("end_level", m249702c());
            jSONObject.put("duration", currentTimeMillis);
            C63686a.m249664b("vc_perf_power_consume", jSONObject, videoChat);
        } catch (JSONException e) {
            C60700b.m235864f("PerfAppreciable", "[sendPerfPowerConsume3]", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m249698a(VideoChat videoChat) {
        if (f160792c.compareAndSet(true, false) && f160793d) {
            ar.m236694a().unregisterReceiver(f160794e);
            m249701b(videoChat);
            C60745ag.C60746a aVar = f160795f;
            if (aVar != null) {
                aVar.mo208366a(false);
            }
        }
    }

    /* renamed from: a */
    public static void m249697a(long j, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j);
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, str);
            C63686a.m249664b("vc_rtc_init_time", jSONObject, (VideoChat) null);
        } catch (JSONException e) {
            C60700b.m235864f("PerfAppreciable", "[sendRtcInitConsume]", e.getMessage());
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m249694a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
