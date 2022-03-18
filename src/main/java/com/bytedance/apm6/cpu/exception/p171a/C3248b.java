package com.bytedance.apm6.cpu.exception.p171a;

import android.util.Log;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.p143i.C2992h;
import com.bytedance.apm6.cpu.exception.C3267i;
import com.bytedance.apm6.p183g.AbstractC3326b;
import com.bytedance.apm6.util.p195b.C3350b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.cpu.exception.a.b */
public class C3248b implements AbstractC3326b {

    /* renamed from: a */
    private double f10409a;

    /* renamed from: b */
    private double f10410b;

    /* renamed from: c */
    private String f10411c;

    /* renamed from: d */
    private boolean f10412d;

    /* renamed from: e */
    private List<C3267i> f10413e;

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: g */
    public String mo13105g() {
        return "cpu_exception_trace";
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: h */
    public boolean mo13106h() {
        List<C3267i> list = this.f10413e;
        if (list == null || list.isEmpty() || this.f10409a <= 0.0d || this.f10410b <= 0.0d) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.apm6.p183g.AbstractC3326b
    /* renamed from: i */
    public JSONObject mo13107i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event_type", "cpu_exception_trace");
            jSONObject.put("log_type", "cpu_exception_trace");
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("crash_time", System.currentTimeMillis());
            jSONObject.put("is_main_process", C2785b.m11761e());
            jSONObject.put("process_name", C2785b.m11756d());
            if (this.f10412d) {
                jSONObject.put("data_type", "back");
            } else {
                jSONObject.put("data_type", "front");
            }
            jSONObject.put("scene", this.f10411c);
            jSONObject.put("report_scene", this.f10411c);
            if (C2785b.m11778s() > C2785b.m11767h() || C2785b.m11778s() == 0) {
                jSONObject.put("app_launch_start_time", C2785b.m11767h());
            } else {
                jSONObject.put("app_launch_start_time", C2785b.m11778s());
            }
            jSONObject.put("process_speed_avg", this.f10409a);
            jSONObject.put("process_speed_max", this.f10410b);
            jSONObject.put("battery_temperature", (double) C2992h.m12578a().mo12743c());
            jSONObject.put("battery_recharge_state", C2992h.m12578a().mo12745e());
            JSONArray jSONArray = new JSONArray();
            for (C3267i iVar : this.f10413e) {
                if (iVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("nice", iVar.mo13449a());
                    jSONObject2.put("weight", Double.valueOf(iVar.mo13454b()));
                    jSONObject2.put("cpu_usage", iVar.mo13461e());
                    jSONObject2.put("thread_name", iVar.mo13464g());
                    jSONObject2.put("thread_back_trace", iVar.mo13460d());
                    jSONObject2.put("thread_id", iVar.mo13463f());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("threads_info", jSONArray);
        } catch (Throwable th) {
            C3350b.m13935b("APM-CPU", "cpu_exception_data_assemble", th);
        }
        Log.i("APM-CPU", "exception data: " + jSONObject);
        return jSONObject;
    }

    public C3248b(double d, double d2, List<C3267i> list, String str, boolean z) {
        this.f10409a = d;
        this.f10410b = d2;
        this.f10411c = str;
        this.f10412d = z;
        this.f10413e = new ArrayList(list);
    }
}
