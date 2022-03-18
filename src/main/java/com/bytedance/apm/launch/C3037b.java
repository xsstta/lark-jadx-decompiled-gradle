package com.bytedance.apm.launch;

import com.bytedance.apm.internal.C3009a;
import com.bytedance.apm.launch.C3042e;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.launch.b */
public class C3037b {

    /* renamed from: a */
    private static boolean f9771a;

    /* renamed from: a */
    public static C3042e.C3043a m12717a() {
        if (f9771a) {
            return null;
        }
        f9771a = true;
        if (C3024a.m12698a().mo12840b().mo12849a() && C3009a.m12648a(4)) {
            return C3042e.m12728a();
        }
        return null;
    }

    /* renamed from: a */
    public static JSONObject m12718a(C3042e.C3043a aVar) {
        if (aVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (aVar.mo12859b() != -1) {
                jSONObject2.put("launch_perf_gc_count", aVar.mo12859b());
            }
            if (aVar.mo12861c() != -1) {
                jSONObject2.put("launch_perf_gc_time", aVar.mo12861c());
            }
            if (aVar.mo12862d() != -1) {
                jSONObject2.put("launch_perf_block_gc_count", aVar.mo12862d());
            }
            if (aVar.mo12863e() != -1) {
                jSONObject2.put("launch_perf_block_gc_time", aVar.mo12863e());
            }
            if (aVar.mo12864f() != -1.0d) {
                jSONObject2.put("launch_perf_iowait_time", aVar.mo12864f());
            }
            if (aVar.mo12865g() != -1.0d) {
                jSONObject2.put("launch_perf_runnable_time", aVar.mo12865g());
            }
            if (aVar.mo12866h() != -1.0d) {
                jSONObject2.put("launch_perf_sleep_time", aVar.mo12866h());
            }
            if (aVar.mo12867i() != -1) {
                jSONObject2.put("launch_perf_minfor_fault", aVar.mo12867i());
            }
            if (aVar.mo12868j() != -1) {
                jSONObject2.put("launch_perf_major_fault", aVar.mo12868j());
            }
            if (aVar.mo12870l() != -1.0d) {
                jSONObject2.put("launch_perf_cpu_time", aVar.mo12870l());
            }
            if (aVar.mo12871m() != -1) {
                jSONObject2.put("launch_perf_voluntary_switches", aVar.mo12871m());
            }
            if (aVar.mo12872n() != -1) {
                jSONObject2.put("launch_perf_involuntary_switches", aVar.mo12872n());
            }
            if (aVar.mo12869k() != -1) {
                jSONObject2.put("launch_perf_all_thread_count", aVar.mo12869k());
            }
            if (aVar.mo12873o() != -1) {
                jSONObject2.put("launch_perf_lock_time", aVar.mo12873o());
            }
            if (aVar.mo12874p() != -1) {
                jSONObject2.put("launch_perf_binder_time", aVar.mo12874p());
            }
            jSONObject.put("list_data", jSONObject2);
            List<String> a = aVar.mo12857a();
            if (a != null && !a.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (String str : a) {
                    jSONArray.put(str);
                }
                jSONObject.put("current_thread_list", jSONArray);
            }
            C3024a a2 = C3024a.m12698a();
            a2.mo12841b("perf data: " + jSONObject);
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            C3024a.m12698a().mo12839a(th.getLocalizedMessage());
            return null;
        }
    }
}
