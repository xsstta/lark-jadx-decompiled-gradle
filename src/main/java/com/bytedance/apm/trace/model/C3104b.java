package com.bytedance.apm.trace.model;

import android.util.Log;
import com.bytedance.apm.launch.C3024a;
import com.bytedance.apm.p124a.AbstractC2747b;
import com.bytedance.apm.p124a.p125a.C2741a;
import com.bytedance.apm.p139e.C2925e;
import com.bytedance.apm.trace.api.C3085d;
import com.bytedance.tracing.p908a.C20711a;
import com.bytedance.tracing.p908a.C20715c;
import com.bytedance.tracing.p908a.C20716d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.trace.model.b */
public class C3104b extends AbstractC3103a {

    /* renamed from: e */
    private List<JSONObject> f9984e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private List<Long> f9985f = new CopyOnWriteArrayList();

    /* renamed from: g */
    private AtomicBoolean f9986g = new AtomicBoolean(false);

    public C3104b(C3085d dVar) {
        super(dVar);
    }

    @Override // com.bytedance.apm.trace.model.AbstractC3103a
    /* renamed from: b */
    public void mo13001b(long j) {
        if (!this.f9986g.get()) {
            this.f9986g.set(true);
            try {
                mo12997a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("start_timestamp", this.f9980a);
                jSONObject.put("finish_timestamp", j);
                jSONObject.put("is_finished", 1);
                jSONObject.put("report_mode", 1);
                jSONObject.put("insert_mode", 2);
                jSONObject.put("log_type", "tracer");
                mo13000a(jSONObject, false);
                if (this.f9981b != null && !this.f9981b.isEmpty()) {
                    jSONObject.put("tags", new JSONObject(this.f9981b));
                }
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                for (JSONObject jSONObject2 : this.f9984e) {
                    jSONArray.put(jSONObject2);
                }
                C3024a a = C3024a.m12698a();
                a.mo12841b(C20711a.m75501a(jSONArray) + "");
                C2741a.m11630c().mo11785a((AbstractC2747b) new C20716d(C20711a.m75501a(jSONArray), this.f9982c.mo12962c(), false, "batch_tracing"));
            } catch (JSONException e) {
                C2925e.m12372a("TracingData", "error when BatchTracing end trace: " + e.getLocalizedMessage());
            } catch (Throwable th) {
                this.f9984e.clear();
                throw th;
            }
            this.f9984e.clear();
        }
    }

    @Override // com.bytedance.apm.trace.model.AbstractC3103a
    /* renamed from: a */
    public void mo12999a(long j, JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            if (this.f9986g.get()) {
                C3024a a = C3024a.m12698a();
                a.mo12839a(jSONObject + " is end after Trace finish not Trace not being !!!!!, it will be ignore!!!!");
            } else if (!this.f9985f.contains(Long.valueOf(j))) {
                try {
                    if (this.f9982c.mo12964e() || C20715c.m75506a().mo69951a(z, this.f9982c.mo12962c()) != 0) {
                        mo13000a(jSONObject, z);
                        this.f9984e.add(jSONObject);
                        this.f9985f.add(Long.valueOf(j));
                    }
                } catch (Throwable th) {
                    Log.e("TracingData", "error: " + th.getLocalizedMessage());
                }
            }
        }
    }
}
