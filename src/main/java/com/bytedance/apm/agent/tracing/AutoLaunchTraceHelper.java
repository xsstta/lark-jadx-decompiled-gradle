package com.bytedance.apm.agent.tracing;

import com.bytedance.apm.C2785b;
import com.bytedance.apm.launch.C3024a;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p153n.C3047b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AutoLaunchTraceHelper {
    private static long sAttachBaseContextEndTime = 0;
    private static long sAttachBaseContextStartTime = 0;
    private static long sConstructorEndTime = 0;
    private static long sConstructorStartTime = 0;
    private static boolean sIsValid = false;
    private static long sLauncherActivityCreateEndTime = 0;
    private static long sLauncherActivityCreateStartTime = 0;
    public static String sLauncherActivityName = null;
    private static long sLauncherActivityOnWindowFocusChangedTime = 0;
    private static long sLauncherActivityResumeEndTime = 0;
    private static long sLauncherActivityResumeStartTime = 0;
    private static long sLauncherActivityStartEndTime = 0;
    private static long sLauncherActivityStartStartTime = 0;
    private static long sMaxValidTimeMs = 15000;
    private static long sOnCreateEndTime;
    private static long sOnCreateStartTime;

    public static void launcherActivityOnCreateEnd() {
        C3024a a = C3024a.m12698a();
        a.mo12841b("onCreateEnd " + sLauncherActivityCreateStartTime + " " + sLauncherActivityCreateEndTime);
        if (sLauncherActivityCreateEndTime == 0 && sIsValid) {
            sLauncherActivityCreateEndTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnResumeEnd() {
        C3024a a = C3024a.m12698a();
        a.mo12841b("onResumeEnd " + sLauncherActivityResumeStartTime + " " + sLauncherActivityResumeEndTime);
        if (sLauncherActivityResumeEndTime == 0 && sIsValid) {
            sLauncherActivityResumeEndTime = System.currentTimeMillis();
        }
    }

    public static JSONArray assemblySpan() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module_name", "base");
        jSONObject.put("span_name", "app_constructor");
        jSONObject.put("start", sConstructorStartTime);
        jSONObject.put("end", sConstructorEndTime);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("module_name", "base");
        jSONObject2.put("span_name", "app_attachBaseContext");
        jSONObject2.put("start", sAttachBaseContextStartTime);
        jSONObject2.put("end", sAttachBaseContextEndTime);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("module_name", "base");
        jSONObject3.put("span_name", "app_onCreate");
        jSONObject3.put("start", sOnCreateStartTime);
        jSONObject3.put("end", sOnCreateEndTime);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("module_name", "base");
        jSONObject4.put("span_name", "activity_onCreate");
        jSONObject4.put("start", sLauncherActivityCreateStartTime);
        jSONObject4.put("end", sLauncherActivityCreateEndTime);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("module_name", "base");
        jSONObject5.put("span_name", "activity_onResume");
        jSONObject5.put("start", sLauncherActivityResumeStartTime);
        jSONObject5.put("end", sLauncherActivityResumeEndTime);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("module_name", "base");
        jSONObject6.put("span_name", "activity_onStart");
        jSONObject6.put("start", sLauncherActivityStartStartTime);
        jSONObject6.put("end", sLauncherActivityStartEndTime);
        if (sLauncherActivityOnWindowFocusChangedTime > 0) {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("module_name", "base");
            jSONObject7.put("span_name", "activity_onWindowFocusChanged");
            jSONObject7.put("start", sLauncherActivityOnWindowFocusChangedTime);
            jSONArray.put(jSONObject7);
        }
        jSONArray.put(jSONObject);
        jSONArray.put(jSONObject2);
        jSONArray.put(jSONObject3);
        jSONArray.put(jSONObject4);
        jSONArray.put(jSONObject5);
        jSONArray.put(jSONObject6);
        return jSONArray;
    }

    public static void reportStats() {
        try {
            if (C2785b.m11768i() == -1) {
                C3024a.m12698a().mo12841b("auto launch mode not init");
                return;
            }
            long j = sLauncherActivityOnWindowFocusChangedTime - sConstructorStartTime;
            if (j <= 0) {
                return;
            }
            if (j <= sMaxValidTimeMs) {
                JSONArray assemblySpan = assemblySpan();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", "launch_stats");
                jSONObject.put("start", sConstructorStartTime);
                jSONObject.put("end", sLauncherActivityOnWindowFocusChangedTime);
                jSONObject.put("spans", assemblySpan);
                jSONObject.put("collect_from", 1);
                jSONObject.put("page_name", sLauncherActivityName);
                jSONObject.put("launch_mode", C2785b.m11768i());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("trace", jSONObject);
                if (C2785b.m11769j()) {
                    C3024a a = C3024a.m12698a();
                    a.mo12841b("auto span: " + jSONObject);
                }
                C2741a.m11630c().mo11785a(new C2753f("start_trace", "", null, null, jSONObject2));
            }
        } catch (JSONException unused) {
        }
    }

    public static void setMaxValidTimeMs(long j) {
        sMaxValidTimeMs = j;
    }

    public static void launcherActivityOnResumeStart(String str) {
        C3024a a = C3024a.m12698a();
        a.mo12841b(str + " onResume " + sLauncherActivityResumeStartTime);
        if (sLauncherActivityResumeStartTime == 0 && sIsValid) {
            sLauncherActivityResumeStartTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnStartEnd(String str) {
        C3024a a = C3024a.m12698a();
        a.mo12841b("onStartEnd " + sLauncherActivityStartStartTime + " " + sLauncherActivityStartEndTime);
        if (sLauncherActivityStartEndTime == 0 && sIsValid) {
            sLauncherActivityStartEndTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnStartStart(String str) {
        C3024a a = C3024a.m12698a();
        a.mo12841b(str + " onStart " + sLauncherActivityStartStartTime);
        if (sLauncherActivityStartStartTime == 0 && sIsValid) {
            sLauncherActivityStartStartTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnWindowFocusChangedStart(String str) {
        C3024a a = C3024a.m12698a();
        a.mo12841b("OnWindowFocusChanged " + str + " " + sLauncherActivityOnWindowFocusChangedTime + " " + sOnCreateStartTime + " " + sIsValid);
        if (sLauncherActivityOnWindowFocusChangedTime == 0 && sOnCreateStartTime > 0 && sIsValid) {
            sLauncherActivityOnWindowFocusChangedTime = System.currentTimeMillis();
            sLauncherActivityName = str;
            sIsValid = false;
        }
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper.RunnableC27691 */

            public void run() {
                AutoLaunchTraceHelper.reportStats();
            }
        });
    }

    public static void launcherActivityOnCreateStart(String str) {
        boolean z;
        C3024a a = C3024a.m12698a();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" onCreateStart ");
        sb.append(sLauncherActivityCreateStartTime);
        sb.append(" ");
        boolean z2 = false;
        if (sLauncherActivityCreateStartTime - sOnCreateEndTime < 800) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        a.mo12841b(sb.toString());
        if (sLauncherActivityCreateStartTime == 0) {
            sLauncherActivityCreateStartTime = System.currentTimeMillis();
            C3024a a2 = C3024a.m12698a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" onCreateStart ");
            sb2.append(sLauncherActivityCreateStartTime);
            sb2.append("  ");
            sb2.append(sOnCreateEndTime);
            sb2.append(" ");
            if (sLauncherActivityCreateStartTime - sOnCreateEndTime < 800) {
                z2 = true;
            }
            sb2.append(z2);
            a2.mo12841b(sb2.toString());
            if (sLauncherActivityCreateStartTime - sOnCreateEndTime < 800) {
                sIsValid = true;
                sLauncherActivityName = str;
            }
        }
    }

    public static void assignAppTime(long j, long j2, long j3, long j4, long j5, long j6) {
        C3024a a = C3024a.m12698a();
        a.mo12841b("assignAppTime: " + sOnCreateEndTime);
        sConstructorStartTime = j;
        sConstructorEndTime = j2;
        sAttachBaseContextStartTime = j3;
        sAttachBaseContextEndTime = j4;
        sOnCreateStartTime = j5;
        sOnCreateEndTime = j6;
        C2785b.m11765g(j);
    }
}
