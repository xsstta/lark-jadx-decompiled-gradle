package com.bytedance.apm.launch.p151a;

import com.bytedance.apm.C2785b;
import com.bytedance.apm.internal.C3009a;
import com.bytedance.apm.launch.C3024a;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p124a.p126b.C2751d;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3138u;
import com.bytedance.apm6.p184h.p185a.C3331c;
import com.bytedance.monitor.collector.BinderMonitor;
import com.bytedance.monitor.collector.C20152k;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.launch.a.a */
public class C3027a {
    /* renamed from: a */
    public static long m12704a() {
        long j = 0;
        if (C3024a.m12698a().mo12842c().mo12967b() && C3009a.m12648a(2)) {
            List<BinderMonitor.C20114a> j2 = C20152k.m73538a().mo68302j();
            if (j2 != null && !j2.isEmpty()) {
                for (BinderMonitor.C20114a aVar : j2) {
                    long b = aVar.mo68220b() - aVar.mo68219a();
                    j += b;
                    m12705a(b, m12706a(aVar.mo68221c()));
                }
            }
            C3024a a = C3024a.m12698a();
            a.mo12841b("binder cost when launch: " + j);
        }
        return j;
    }

    /* renamed from: a */
    private static StackTraceElement[] m12706a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return stackTraceElementArr;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= stackTraceElementArr.length) {
                break;
            } else if ("saveBinderInfo".equals(stackTraceElementArr[i2].getMethodName())) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        int i3 = i + 1;
        if (i3 <= stackTraceElementArr.length) {
            return (StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr, i3, stackTraceElementArr.length);
        }
        return stackTraceElementArr;
    }

    /* renamed from: a */
    private static void m12705a(final long j, final StackTraceElement[] stackTraceElementArr) {
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.launch.p151a.C3027a.RunnableC30281 */

            public void run() {
                try {
                    String a = C3138u.m13078a(stackTraceElementArr);
                    if (j == 0) {
                        return;
                    }
                    if (!a.isEmpty()) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("timestamp", System.currentTimeMillis());
                        jSONObject.put("crash_time", System.currentTimeMillis());
                        jSONObject.put("is_main_process", C2785b.m11761e());
                        jSONObject.put("process_name", C2785b.m11756d());
                        jSONObject.put("block_duration", j);
                        jSONObject.put("stack", "BinderInfo:\n" + "-Binder Time " + j + "ms\n" + "-Binder Stack\n" + a + "\n");
                        jSONObject.put("event_type", "lag");
                        JSONObject c = C3331c.m13887a().mo13569c();
                        c.put("block_stack_type", "stack");
                        c.put("is_launch_binder", "true");
                        jSONObject.put("filters", c);
                        C3024a a2 = C3024a.m12698a();
                        a2.mo12841b("binder report json: " + jSONObject);
                        C2741a.m11630c().mo11785a(new C2751d("block_monitor", jSONObject));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
