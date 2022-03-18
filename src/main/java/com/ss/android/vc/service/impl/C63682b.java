package com.ss.android.vc.service.impl;

import com.bytedance.apm.ApmAgent;
import com.bytedance.apm.config.C2885c;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.AbstractC60888d;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.p3069b.C60685h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.service.impl.b */
public class C63682b {

    /* renamed from: com.ss.android.vc.service.impl.b$a */
    public static class C63684a {

        /* renamed from: a */
        private static long f160764a;

        /* renamed from: b */
        private static int f160765b;

        /* renamed from: c */
        private static int f160766c;

        /* renamed from: d */
        private static int f160767d;

        /* renamed from: e */
        private static int f160768e;

        /* renamed from: f */
        private static int f160769f;

        /* renamed from: g */
        private static int f160770g;

        /* renamed from: a */
        public static synchronized int m249649a() {
            int i;
            synchronized (C63684a.class) {
                i = f160770g;
                f160770g = 0;
            }
            return i;
        }

        /* renamed from: a */
        public static synchronized void m249650a(String str, JSONObject jSONObject) {
            synchronized (C63684a.class) {
                long currentTimeMillis = System.currentTimeMillis();
                int i = 0;
                if (currentTimeMillis - f160764a >= 60000) {
                    C60700b.m235851b("CommonLogStatistics", "[recordCommonLog]", "rtcApmLogSpeed = " + f160767d + "/minute, rtcApmLogSize = " + f160768e + "bytes, vcApmLogSpeed = " + f160765b + "/minute, vcApmLogSize = " + f160766c + "bytes");
                    f160764a = currentTimeMillis;
                    f160765b = 0;
                    f160766c = 0;
                    f160767d = 0;
                    f160768e = 0;
                }
                if (jSONObject != null && jSONObject.length() > 0) {
                    i = jSONObject.toString().getBytes().length;
                }
                String str2 = "-1";
                String str3 = "-1";
                if ("vc_monitor_log".equals(str)) {
                    f160765b++;
                    f160769f++;
                    f160766c += i;
                    if (jSONObject != null) {
                        str2 = jSONObject.optString("conference_id", "-1");
                        str3 = jSONObject.optString("action_name", "-1");
                    }
                } else if ("vc_live_webrtc_monitor_log".equals(str)) {
                    f160767d++;
                    f160770g++;
                    f160768e += i;
                    if (jSONObject != null) {
                        str2 = jSONObject.optString("room_id", "-1");
                        str3 = jSONObject.optString("event_key", "-1");
                    }
                }
                if (i > 100000) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("meeting_id", str2);
                        jSONObject2.put("event_key", str3);
                        jSONObject2.put("log_length", i);
                        jSONObject2.put("log_type", str);
                        jSONObject2.put("device_id", VideoChatModuleDependency.m236629b());
                        MonitorUtils.monitorEvent("vcex_commonlog_large_size", jSONObject2, null, null);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m249640a() {
        ApmAgent.setReportMode(C2885c.m12182a().mo12421a(1).mo12423b(200000).mo12422a());
    }

    /* renamed from: b */
    public static void m249645b() {
        ApmAgent.setReportMode(C2885c.m12182a().mo12421a(0).mo12422a());
    }

    /* renamed from: b */
    public static void m249646b(String str, JSONObject jSONObject) {
        if (C60685h.f151809a) {
            C63684a.m249650a(str, jSONObject);
        }
        MonitorUtils.monitorCommonLog(str, jSONObject, true);
    }

    /* renamed from: c */
    private static boolean m249647c(String str, JSONObject jSONObject) {
        String str2;
        if (jSONObject != null) {
            str2 = jSONObject.optString("action_name");
        } else {
            str2 = null;
        }
        if ((str.equals("vc_call_page_ringing") || str.equals("vc_meeting_page_ringing")) && "ringing".equals(str2)) {
            return true;
        }
        if ((!str.equals("vc_client_signal_info") || !"ring_pending".equals(str2)) && !str.equals("vc_ringing_push_notification") && !str.equals("vc_meeting_magic_share_init_track") && !str.equals("vc_meeting_magic_share_stat") && !str.equals("vc_meeting_page_onthecall") && !str.equals("vc_xiaomi_call_offline_push_click")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m249642a(final String str, final JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        AbstractC60888d appEnvDependency = VideoChatModuleDependency.getAppEnvDependency();
        if (!appEnvDependency.isProductionEnv() && !appEnvDependency.isPreReleaseEnv()) {
            try {
                jSONObject.put("_staging_flag", 1);
            } catch (JSONException e) {
                C60700b.m235864f("VideoConferenceStatistics", "sendEvent4", e.getMessage());
            }
        } else if (C26284k.m95185a(ar.m236694a())) {
            try {
                jSONObject.put("_env_type", "debug");
            } catch (JSONException e2) {
                C60700b.m235864f("VideoConferenceStatistics", "sendEvent3", e2.getMessage());
            }
        }
        final String jSONObject2 = jSONObject.toString();
        if (m249647c(str, jSONObject)) {
            VcBizService.entrustServerTrack(str, jSONObject2, new AbstractC63598b<Boolean>() {
                /* class com.ss.android.vc.service.impl.C63682b.C636831 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    C60700b.m235851b("VideoConferenceStatistics", "[sendEvent]", "entrustServerTrack success: " + str + ", params = " + jSONObject2);
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("VideoConferenceStatistics", "[sendEvent2]", "entrustServerTrack failure: " + str + ", params = " + jSONObject2);
                    Statistics.sendEvent(str, jSONObject);
                }
            });
        } else {
            Statistics.sendEvent(str, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m249641a(String str, int i, JSONObject jSONObject) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("serviceName = ");
        sb.append(str);
        sb.append(", status = ");
        sb.append(i);
        sb.append(", logExt = ");
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        } else {
            str2 = "null";
        }
        sb.append(str2);
        C60700b.m235851b("VideoConferenceStatistics", "[monitorStatusRate]", sb.toString());
        AbstractC60888d appEnvDependency = VideoChatModuleDependency.getAppEnvDependency();
        if (!C26284k.m95185a(ar.m236694a()) && appEnvDependency.isProductionEnv()) {
            MonitorUtils.monitorStatusRate(str, i, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m249643a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("serviceName = ");
        sb.append(str);
        sb.append(", duration = ");
        String str3 = "null";
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        } else {
            str2 = str3;
        }
        sb.append(str2);
        sb.append(", logExt = ");
        if (jSONObject2 != null) {
            str3 = jSONObject2.toString();
        }
        sb.append(str3);
        C60700b.m235851b("VideoConferenceStatistics", "[monitorDuration]", sb.toString());
        AbstractC60888d appEnvDependency = VideoChatModuleDependency.getAppEnvDependency();
        if (!C26284k.m95185a(ar.m236694a()) && appEnvDependency.isProductionEnv()) {
            MonitorUtils.monitorDuration(str, jSONObject, jSONObject2);
        }
    }

    /* renamed from: a */
    public static void m249644a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        AbstractC60888d appEnvDependency = VideoChatModuleDependency.getAppEnvDependency();
        if (!C26284k.m95185a(ar.m236694a()) && appEnvDependency != null && appEnvDependency.isProductionEnv()) {
            MonitorUtils.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
        }
    }
}
