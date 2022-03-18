package com.bytedance.apm6.p160b.p161a.p165d;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p160b.p161a.C3159a;
import com.bytedance.apm6.util.p195b.C3350b;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.apm6.b.a.d.b */
public class C3187b {

    /* renamed from: a */
    private SharedPreferences f10206a;

    /* renamed from: b */
    private JSONArray f10207b = new JSONArray();

    /* renamed from: c */
    private volatile boolean f10208c;

    /* renamed from: d */
    private String f10209d;

    /* renamed from: e */
    private long f10210e;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm6.b.a.d.b$a */
    public static final class C3188a {

        /* renamed from: a */
        public static final C3187b f10211a = new C3187b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.apm6.b.a.d.b$b */
    public enum EnumC3189b {
        SERVER_DROP("server drop message"),
        FULL_DISK("disk is full");
        
        private String reason;

        public String toString() {
            return this.reason;
        }

        private EnumC3189b(String str) {
            this.reason = str;
        }
    }

    /* renamed from: a */
    static C3187b m13320a() {
        return C3188a.f10211a;
    }

    C3187b() {
    }

    /* renamed from: c */
    private synchronized void m13321c() {
        if (!this.f10208c) {
            this.f10208c = true;
            Application w = C3318a.m13917w();
            SharedPreferences sharedPreferences = w.getSharedPreferences(C3318a.m13828f() + "_" + "drop_message", 0);
            this.f10206a = sharedPreferences;
            String string = sharedPreferences.getString("drop_data_items", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f10207b = new JSONArray(string);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public JSONArray mo13248b() {
        m13321c();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < this.f10207b.length(); i++) {
            try {
                if (i < 10) {
                    jSONArray.put(this.f10207b.get(i));
                } else {
                    jSONArray2.put(this.f10207b.get(i));
                }
            } catch (Exception unused) {
            }
        }
        this.f10207b = jSONArray2;
        this.f10206a.edit().putString("drop_data_items", this.f10207b.toString()).commit();
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13245a(long j) {
        this.f10210e = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13247a(String str) {
        this.f10209d = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13246a(long j, long j2, long j3, EnumC3189b bVar) {
        m13321c();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log_type", "server_drop_data");
            jSONObject.put("timestamp", j3);
            jSONObject.put("drop_data_count", j);
            jSONObject.put("drop_data_bytes", j2);
            if (bVar == EnumC3189b.SERVER_DROP) {
                jSONObject.put("x-tt-logid", this.f10209d);
                jSONObject.put("drop_timestamp", this.f10210e);
            }
            if (bVar != null) {
                jSONObject.put("drop_reason", bVar);
            }
            this.f10207b.put(jSONObject);
            if (C3318a.m13915u()) {
                String str = C3159a.f10110a;
                C3350b.m13932a(str, "monitorDropLog:" + this.f10207b.toString());
            }
            this.f10206a.edit().putString("drop_data_items", this.f10207b.toString()).commit();
        } catch (Exception e) {
            C3350b.m13935b(C3159a.f10110a, "monitorDropLog:", e);
        }
    }
}
