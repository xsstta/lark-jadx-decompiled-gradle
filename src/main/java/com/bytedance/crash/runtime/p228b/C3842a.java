package com.bytedance.crash.runtime.p228b;

import android.text.TextUtils;
import com.bytedance.crash.entity.C3743c;
import com.bytedance.crash.entity.C3746e;
import com.bytedance.crash.runtime.C3851e;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.C3968x;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.b.a */
public class C3842a {

    /* renamed from: a */
    protected static HashMap<String, C3842a> f11799a = new HashMap<>();

    /* renamed from: b */
    protected JSONObject f11800b;

    /* renamed from: c */
    protected boolean f11801c;

    /* renamed from: d */
    private JSONObject f11802d;

    /* renamed from: e */
    private JSONObject f11803e;

    /* renamed from: f */
    private JSONObject f11804f;

    /* renamed from: g */
    private final String f11805g;

    /* renamed from: b */
    public JSONObject mo15434b() {
        return this.f11800b;
    }

    /* renamed from: c */
    public static JSONArray m15914c() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, C3842a> entry : f11799a.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            C3955q.m16447a(jSONObject, entry.getKey(), entry.getValue().mo15434b());
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public long mo15431a() {
        return Long.decode(C3955q.m16456b(mo15434b(), "over_all", "get_settings_interval")).longValue() * 1000;
    }

    /* renamed from: a */
    public static C3842a m15911a(Object obj) {
        return m15918g(C3743c.m15479d(obj));
    }

    /* renamed from: b */
    private void m15913b(JSONObject jSONObject) {
        this.f11800b = jSONObject;
        this.f11801c = mo15433a(jSONObject);
    }

    /* renamed from: d */
    public static boolean m15915d(String str) {
        if (f11799a.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static JSONObject m15916e(String str) {
        C3842a aVar = f11799a.get(str);
        if (aVar != null) {
            return aVar.mo15434b();
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m15917f(String str) {
        C3842a aVar = f11799a.get(str);
        if (aVar == null || aVar.f11801c) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static C3842a m15918g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f11799a.get(str);
    }

    /* renamed from: h */
    public static long m15919h(String str) {
        C3842a aVar = f11799a.get(str);
        if (aVar == null) {
            return 3600000;
        }
        try {
            return aVar.mo15431a();
        } catch (Throwable unused) {
            return 3600000;
        }
    }

    /* renamed from: b */
    public boolean mo15435b(String str) {
        if (C3746e.m15490c()) {
            return true;
        }
        JSONObject jSONObject = this.f11800b;
        if (jSONObject == null) {
            return false;
        }
        if (this.f11803e == null) {
            JSONObject c = C3955q.m16459c(jSONObject, "exception_modules", ApiHandler.API_CALLBACK_EXCEPTION, "metric_sampling", "test");
            this.f11803e = c;
            if (c == null) {
                this.f11803e = new JSONObject();
            }
        }
        if (Math.random() <= this.f11803e.optDouble(str, 1.0d)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo15432a(String str) {
        JSONObject jSONObject = this.f11800b;
        if (jSONObject == null) {
            return false;
        }
        if (this.f11804f == null) {
            JSONObject c = C3955q.m16459c(jSONObject, "custom_event_settings", "allow_service_name", "test");
            this.f11804f = c;
            if (c == null) {
                this.f11804f = new JSONObject();
            }
        }
        if (this.f11804f.optInt(str) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo15436c(String str) {
        if (C3746e.m15490c()) {
            return true;
        }
        if (this.f11800b == null) {
            return false;
        }
        if (TextUtils.equals(str, "block_monitor")) {
            str = "caton_monitor";
        }
        if (TextUtils.equals(str, "core_exception_monitor")) {
            return this.f11801c;
        }
        if (this.f11802d == null) {
            JSONObject c = C3955q.m16459c(this.f11800b, "custom_event_settings", "allow_log_type", "test");
            this.f11802d = c;
            if (c == null) {
                this.f11802d = new JSONObject();
            }
        }
        if (this.f11802d.optInt(str) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo15433a(JSONObject jSONObject) {
        if (jSONObject == null || C3955q.m16443a(jSONObject, 0, "exception_modules", ApiHandler.API_CALLBACK_EXCEPTION, "enable_upload") != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m15912a(String str, JSONObject jSONObject) {
        C3842a aVar = f11799a.get(str);
        if (aVar != null) {
            aVar.m15913b(jSONObject);
        } else {
            new C3851e(jSONObject, str);
        }
    }

    public C3842a(JSONObject jSONObject, String str) {
        this.f11805g = str;
        m15913b(jSONObject);
        f11799a.put(str, this);
        C3968x.m16530a((Object) ("after update aid " + str));
    }
}
