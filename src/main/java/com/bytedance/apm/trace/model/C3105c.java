package com.bytedance.apm.trace.model;

import android.text.TextUtils;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.trace.api.AbstractC3082a;
import com.bytedance.apm.trace.api.AbstractC3084c;
import com.bytedance.apm.util.C3122i;
import com.bytedance.tracing.p908a.C20714b;
import com.bytedance.tracing.p908a.p909a.C20712a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.trace.model.c */
public class C3105c implements AbstractC3082a, AbstractC3084c {

    /* renamed from: a */
    public final long f9987a;

    /* renamed from: b */
    public final AbstractC3103a f9988b;

    /* renamed from: c */
    public boolean f9989c;

    /* renamed from: d */
    private final String f9990d;

    /* renamed from: e */
    private final String f9991e;

    /* renamed from: f */
    private long f9992f;

    /* renamed from: g */
    private long f9993g;

    /* renamed from: h */
    private String f9994h;

    /* renamed from: i */
    private Map<String, String> f9995i;

    /* renamed from: j */
    private List<C20714b> f9996j;

    /* renamed from: k */
    private long f9997k;

    /* renamed from: l */
    private long f9998l;

    @Override // com.bytedance.apm.trace.api.AbstractC3083b
    /* renamed from: c */
    public long mo12955c() {
        return this.f9987a;
    }

    @Override // com.bytedance.apm.trace.api.AbstractC3082a
    /* renamed from: a */
    public void mo12948a() {
        this.f9997k = System.currentTimeMillis();
    }

    @Override // com.bytedance.apm.trace.api.AbstractC3082a
    /* renamed from: b */
    public void mo12949b() {
        String str = this.f9994h;
        if (str == null || str.isEmpty()) {
            this.f9994h = Thread.currentThread().getName();
        }
        this.f9998l = System.currentTimeMillis();
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.trace.model.C3105c.RunnableC31072 */

            public void run() {
                C3105c.this.f9988b.mo12999a(C3105c.this.f9987a, C3105c.this.mo13003d(), C3105c.this.f9989c);
            }
        });
    }

    /* renamed from: d */
    public JSONObject mo13003d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", this.f9991e);
            jSONObject.put("span_id", this.f9987a + "");
            jSONObject.put("operation_name", this.f9990d);
            if (this.f9992f != 0) {
                jSONObject.put("parent_id", this.f9992f + "");
            }
            if (this.f9993g != 0) {
                jSONObject.put("reference_id", this.f9993g + "");
            }
            jSONObject.put("start_timestamp", this.f9997k);
            jSONObject.put("finish_timestamp", this.f9998l);
            Map<String, String> map = this.f9995i;
            if (map != null && !map.isEmpty()) {
                jSONObject.put("tags", new JSONObject(this.f9995i));
            }
            if (!C3122i.m13009a(this.f9996j)) {
                JSONArray jSONArray = new JSONArray();
                for (C20714b bVar : this.f9996j) {
                    jSONArray.put(bVar.mo69949a());
                }
                jSONObject.put("logs", jSONArray);
            }
            jSONObject.put("thread_id", this.f9994h);
            jSONObject.put("is_finished", 1);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm.trace.api.AbstractC3083b
    /* renamed from: a */
    public AbstractC3082a mo12950a(long j) {
        this.f9992f = j;
        return this;
    }

    @Override // com.bytedance.apm.trace.api.AbstractC3083b
    /* renamed from: b */
    public AbstractC3082a mo12953b(long j) {
        this.f9993g = j;
        return this;
    }

    @Override // com.bytedance.apm.trace.api.AbstractC3083b
    /* renamed from: a */
    public AbstractC3082a mo12951a(String str) {
        this.f9994h = str;
        return this;
    }

    @Override // com.bytedance.apm.trace.api.AbstractC3083b
    /* renamed from: b */
    public AbstractC3082a mo12954b(String str) {
        if (str == null) {
            return this;
        }
        if (this.f9996j == null) {
            this.f9996j = new LinkedList();
        }
        this.f9996j.add(new C20714b(System.currentTimeMillis(), str, null));
        return this;
    }

    @Override // com.bytedance.apm.trace.api.AbstractC3083b
    /* renamed from: a */
    public AbstractC3082a mo12952a(String str, String str2) {
        this.f9988b.mo13002b(str);
        if (this.f9995i == null) {
            this.f9995i = new HashMap();
        }
        if (TextUtils.equals(str, "error")) {
            this.f9989c = true;
        }
        this.f9995i.put(str, str2);
        return this;
    }

    @Override // com.bytedance.apm.trace.api.AbstractC3084c
    /* renamed from: a */
    public void mo12956a(long j, long j2) {
        String str = this.f9994h;
        if (str == null || str.isEmpty()) {
            this.f9994h = Thread.currentThread().getName();
        }
        this.f9997k = j;
        this.f9998l = j2;
        C3047b.m12756a().mo12886a(new Runnable() {
            /* class com.bytedance.apm.trace.model.C3105c.RunnableC31061 */

            public void run() {
                C3105c.this.f9988b.mo12999a(C3105c.this.f9987a, C3105c.this.mo13003d(), C3105c.this.f9989c);
            }
        });
    }

    C3105c(String str, String str2, AbstractC3103a aVar) {
        this(str, str2, aVar, C20712a.m75502a());
    }

    C3105c(String str, String str2, AbstractC3103a aVar, long j) {
        this.f9990d = str;
        this.f9988b = aVar;
        this.f9991e = str2;
        this.f9987a = j;
    }
}
