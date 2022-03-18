package com.tt.miniapphost.util;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapphost.util.d */
public class C67587d {

    /* renamed from: a */
    private JSONObject f170417a;

    /* renamed from: b */
    private Map<String, Object> f170418b;

    public String toString() {
        return mo234784a().toString();
    }

    public C67587d() {
        this.f170418b = new ArrayMap();
        this.f170417a = new JSONObject();
    }

    /* renamed from: a */
    public JSONObject mo234784a() {
        try {
            for (Map.Entry<String, Object> entry : this.f170418b.entrySet()) {
                this.f170417a.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "JsonBuilder", e.getStackTrace());
        }
        return this.f170417a;
    }

    public C67587d(String str) {
        this.f170418b = new ArrayMap();
        try {
            if (TextUtils.isEmpty(str)) {
                this.f170417a = new JSONObject();
            } else {
                this.f170417a = new JSONObject(str);
            }
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "JsonBuilder", e.getStackTrace());
            this.f170417a = new JSONObject();
        }
    }

    /* renamed from: a */
    public C67587d mo234783a(String str, Object obj) {
        this.f170418b.put(str, obj);
        return this;
    }
}
