package com.bytedance.ee.bear.contract;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.p277a.AbstractC5079a;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p701d.C13616d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.contract.y */
public class C5234y implements AbstractC5233x {

    /* renamed from: a */
    public static String f14976a = "enable_statistics";

    /* renamed from: b */
    protected Application f14977b;

    /* renamed from: c */
    public PersistenceSharedPreference f14978c;

    /* renamed from: d */
    public Boolean f14979d;

    /* renamed from: e */
    private final HashMap<String, HashMap<String, Object>> f14980e;

    /* renamed from: f */
    private SharedPreferences$OnSharedPreferenceChangeListenerC5237b f14981f;

    /* renamed from: g */
    private boolean f14982g;

    /* renamed from: h */
    private boolean f14983h;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.contract.y$a */
    public static class C5236a {

        /* renamed from: a */
        public static final AbstractC5233x f14984a = new C5234y();
    }

    /* renamed from: b */
    public static AbstractC5233x m21391b() {
        return C5236a.f14984a;
    }

    /* renamed from: c */
    private void m21393c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enter_type", "click_icon");
            mo21080a("launch_app", jSONObject);
        } catch (JSONException e) {
            C13479a.m54759a("AnalyticServiceImp", "reportLaunchApp(): ", e);
        }
    }

    private C5234y() {
        this.f14980e = new HashMap<>();
        C13479a.m54772d("AnalyticServiceImp", "init: ");
        Application application = C13615c.f35773a;
        this.f14977b = application;
        this.f14982g = C13616d.m55262a(application);
        this.f14978c = new PersistenceSharedPreference("debug_config");
        SharedPreferences$OnSharedPreferenceChangeListenerC5237b bVar = new SharedPreferences$OnSharedPreferenceChangeListenerC5237b();
        this.f14981f = bVar;
        this.f14978c.registerOnSharedPreferenceChangeListener(bVar);
        this.f14979d = (Boolean) this.f14978c.mo34038b(f14976a, Boolean.FALSE);
        m21393c();
        this.f14983h = !TextUtils.isEmpty((String) new PersistenceSharedPreference("debug_config").mo34038b("ip_proxy", ""));
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5233x
    /* renamed from: a */
    public void mo21076a() {
        C13479a.m54764b("AnalyticServiceImp", "reportLaunchActive(): ");
        mo21080a("launch_active", new JSONObject());
    }

    /* renamed from: com.bytedance.ee.bear.contract.y$b */
    public class SharedPreferences$OnSharedPreferenceChangeListenerC5237b implements SharedPreferences.OnSharedPreferenceChangeListener {
        public SharedPreferences$OnSharedPreferenceChangeListenerC5237b() {
        }

        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            C13479a.m54772d("AnalyticServiceImp", "onSharedPreferenceChanged: key=" + str);
            if (str.equals(C5234y.f14976a)) {
                C5234y yVar = C5234y.this;
                yVar.f14979d = (Boolean) yVar.f14978c.mo34038b(C5234y.f14976a, Boolean.FALSE);
                C13479a.m54772d("AnalyticServiceImp", "onSharedPreferenceChanged: mEnableStatistics=" + C5234y.this.f14979d);
            }
        }
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5233x
    /* renamed from: a */
    public void mo21077a(String str) {
        this.f14980e.remove(str);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5233x
    /* renamed from: d */
    public void mo21087d(String str) {
        this.f14980e.remove(str);
    }

    /* renamed from: a */
    public static JSONObject m21390a(Map map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                try {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                } catch (JSONException e) {
                    C13479a.m54759a("AnalyticServiceImp", "convertMap2JSON(): ", e);
                }
            }
        }
        return jSONObject;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5233x
    /* renamed from: b */
    public HashMap<String, String> mo21083b(String str) {
        String str2;
        HashMap<String, Object> hashMap = this.f14980e.get(str);
        HashMap<String, String> hashMap2 = new HashMap<>();
        if (hashMap != null) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                if (entry.getValue() != null) {
                    str2 = entry.getValue().toString();
                } else {
                    str2 = "";
                }
                hashMap2.put(entry.getKey(), str2);
            }
        }
        return hashMap2;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5233x
    /* renamed from: c */
    public HashMap<String, Object> mo21086c(String str) {
        HashMap<String, Object> hashMap = this.f14980e.get(str);
        if (hashMap != null) {
            return hashMap;
        }
        return new HashMap<>();
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5233x
    /* renamed from: b */
    public void mo21084b(String str, Map map) {
        mo21085b(str, m21390a(map));
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5233x
    /* renamed from: a */
    public void mo21079a(String str, Map map) {
        mo21080a(str, m21390a(map));
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5233x
    /* renamed from: b */
    public void mo21085b(String str, JSONObject jSONObject) {
        mo21081a(str, jSONObject, "");
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5233x
    /* renamed from: a */
    public String mo21075a(String str, String str2) {
        HashMap<String, Object> hashMap = this.f14980e.get(str);
        if (hashMap == null) {
            return null;
        }
        Object obj = hashMap.get(str2);
        if (obj != null) {
            return obj.toString();
        }
        return "";
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5233x
    /* renamed from: b */
    public Object mo21082b(String str, String str2) {
        HashMap<String, Object> hashMap = this.f14980e.get(str);
        if (hashMap != null) {
            return hashMap.get(str2);
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5233x
    /* renamed from: a */
    public void mo21080a(String str, JSONObject jSONObject) {
        if (str.startsWith("docs_")) {
            mo21081a(str, jSONObject, "");
        } else {
            mo21081a(str, jSONObject, "docs_");
        }
    }

    /* renamed from: b */
    public static void m21392b(String str, JSONObject jSONObject, String str2) {
        AbstractC5079a aVar = (AbstractC5079a) KoinJavaComponent.m268610a(AbstractC5079a.class);
        if (aVar != null) {
            C13479a.m54772d("AnalyticServiceImp", "trackEvent:  event = " + str + "   param = " + jSONObject.toString());
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            aVar.mo20175a(sb.toString(), jSONObject);
            return;
        }
        C13479a.m54775e("AnalyticServiceImp", "trackEventExt: AppLogAgent is null");
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5233x
    /* renamed from: a */
    public void mo21078a(String str, String str2, Object obj) {
        HashMap<String, Object> hashMap = this.f14980e.get(str);
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.put(str2, obj);
        this.f14980e.put(str, hashMap);
    }

    @Override // com.bytedance.ee.bear.contract.AbstractC5233x
    /* renamed from: a */
    public void mo21081a(String str, JSONObject jSONObject, String str2) {
        if (!this.f14979d.booleanValue()) {
            if (!this.f14982g) {
                if (this.f14983h) {
                    C13479a.m54772d("AnalyticServiceImp", "trackEventExt: You have set proxy, exit report");
                    return;
                }
            } else {
                return;
            }
        }
        m21392b(str, jSONObject, str2);
    }
}
