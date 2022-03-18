package com.bytedance.frameworks.baselib.network.p740a;

import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.a.d */
class C13941d extends AbstractC13938b {

    /* renamed from: a */
    private static final String f36452a = "d";

    /* renamed from: b */
    private List<String> f36453b = new ArrayList();

    /* renamed from: c */
    private List<String> f36454c = new ArrayList();

    /* renamed from: d */
    private boolean f36455d = false;

    public C13941d(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.frameworks.baselib.network.p740a.AbstractC13938b
    /* renamed from: a */
    public void mo51293a(JSONObject jSONObject) {
        mo51297b(jSONObject);
        m56430a(jSONObject.optJSONArray("keep_list"), this.f36453b);
        m56430a(jSONObject.optJSONArray("remove_list"), this.f36454c);
        if (!this.f36453b.isEmpty() && !this.f36454c.isEmpty()) {
            this.f36455d = true;
        }
    }

    /* renamed from: a */
    private void m56430a(JSONArray jSONArray, List<String> list) {
        if (!(jSONArray == null || list == null)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        list.add(string);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.frameworks.baselib.network.p740a.AbstractC13938b
    /* renamed from: a */
    public boolean mo51295a(Request request, Map<String, List<String>> map) {
        if (this.f36455d || !mo51294a(request)) {
            return false;
        }
        if (!this.f36453b.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f36453b) {
                if (map.containsKey(str)) {
                    linkedHashMap.put(str, map.get(str));
                }
            }
            map.clear();
            map.putAll(linkedHashMap);
            return true;
        } else if (this.f36454c.isEmpty()) {
            return true;
        } else {
            for (String str2 : this.f36454c) {
                map.remove(str2);
            }
            return true;
        }
    }
}
