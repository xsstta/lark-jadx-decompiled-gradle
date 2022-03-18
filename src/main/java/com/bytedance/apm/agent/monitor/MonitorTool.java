package com.bytedance.apm.agent.monitor;

import com.bytedance.apm.p124a.AbstractC2747b;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p125a.C2744d;
import com.bytedance.apm.p124a.p126b.C2748a;
import com.bytedance.apm.p124a.p126b.C2753f;
import com.bytedance.apm.p124a.p126b.C2754g;
import com.bytedance.apm.p153n.C3047b;
import org.json.JSONObject;

public class MonitorTool {
    public static void monitorUIAction(final String str, final String str2, final JSONObject jSONObject) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.agent.monitor.MonitorTool.RunnableC27631 */

            public void run() {
                C2741a.m11630c().mo11785a(new C2754g(str, str2, jSONObject, null));
            }
        });
    }

    public static void reportTraceTime(final String str, final String str2, final long j) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.agent.monitor.MonitorTool.RunnableC27675 */

            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str2, j);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("scene", str);
                    C2741a.m11630c().mo11785a(new C2753f("page_load", "page_load", jSONObject, jSONObject2, null));
                } catch (Exception unused) {
                }
            }
        });
    }

    public static void monitorStart(String str, long j, long j2) {
        if (j2 > j) {
            try {
                final JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, j2 - j);
                final JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("begin_time", j);
                jSONObject2.put("end_time", j2);
                C3047b.m12756a().mo12886a(new Runnable() {
                    /* class com.bytedance.apm.agent.monitor.MonitorTool.RunnableC27664 */

                    public void run() {
                        C2741a.m11630c().mo11785a(new C2753f("start", "", jSONObject, null, jSONObject2));
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void monitorStart(final JSONObject jSONObject, long j, long j2) {
        try {
            final JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("begin_time", j);
            jSONObject2.put("end_time", j2);
            jSONObject2.put("from", "monitor-plugin");
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.agent.monitor.MonitorTool.RunnableC27653 */

                public void run() {
                    C2741a.m11630c().mo11785a(new C2753f("start", "", jSONObject, null, jSONObject2));
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void monitorPerformance(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.agent.monitor.MonitorTool.RunnableC27642 */

            public void run() {
                C2741a.m11630c().mo11785a(new C2753f(str, "", jSONObject, jSONObject2, jSONObject3));
            }
        });
    }

    public static void monitorSLA(final long j, final long j2, final String str, final String str2, final String str3, final int i, final JSONObject jSONObject) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.agent.monitor.MonitorTool.RunnableC27686 */

            public void run() {
                C2744d.m11644c().mo11785a((AbstractC2747b) new C2748a("api_all", j, j2, str, str2, str3, i, jSONObject));
            }
        });
    }
}
