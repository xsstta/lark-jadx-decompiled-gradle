package com.bytedance.apm.trace.model;

import android.os.Process;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.launch.C3024a;
import com.bytedance.apm.trace.api.AbstractC3082a;
import com.bytedance.apm.trace.api.AbstractC3084c;
import com.bytedance.apm.trace.api.C3085d;
import com.bytedance.tracing.p908a.C20715c;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.trace.model.a */
public abstract class AbstractC3103a {

    /* renamed from: a */
    protected long f9980a;

    /* renamed from: b */
    protected Map<String, String> f9981b = new ConcurrentHashMap();

    /* renamed from: c */
    protected C3085d f9982c;

    /* renamed from: d */
    protected List<String> f9983d = new CopyOnWriteArrayList();

    /* renamed from: a */
    public abstract void mo12999a(long j, JSONObject jSONObject, boolean z);

    /* renamed from: b */
    public abstract void mo13001b(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12997a() {
        if (C2785b.m11769j()) {
            for (String str : this.f9983d) {
                if (this.f9981b.containsKey(str)) {
                    C3024a a = C3024a.m12698a();
                    a.mo12839a("span's tag key can't be same as trace's tag key: " + str);
                    Process.killProcess(Process.myPid());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo12998a(long j) {
        this.f9980a = j;
    }

    /* renamed from: a */
    public AbstractC3082a mo12995a(String str) {
        return new C3105c(str, "tracer_span", this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo13002b(String str) {
        if (!this.f9983d.contains(str)) {
            this.f9983d.add(str);
        }
    }

    public AbstractC3103a(C3085d dVar) {
        this.f9982c = dVar;
    }

    /* renamed from: a */
    public AbstractC3084c mo12996a(String str, long j) {
        return new C3105c(str, "tracer_window_span", this, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13000a(JSONObject jSONObject, boolean z) throws JSONException {
        jSONObject.put("service", this.f9982c.mo12962c());
        jSONObject.put("trace_id", this.f9982c.mo12963d() + "");
        if (this.f9982c.mo12964e()) {
            jSONObject.put("hit_rules", 1);
            jSONObject.put("sample_rate", 1);
            return;
        }
        jSONObject.put("hit_rules", C20715c.m75506a().mo69951a(z, this.f9982c.mo12962c()));
        jSONObject.put("sample_rate", C20715c.m75506a().mo69950a(this.f9982c.mo12962c()));
    }
}
