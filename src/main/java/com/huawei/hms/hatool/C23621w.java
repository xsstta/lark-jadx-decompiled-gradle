package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.huawei.hms.hatool.w */
public class C23621w {
    /* renamed from: a */
    public static Map<String, List<C23615q>> m85938a(Context context, String str) {
        if (context == null) {
            return null;
        }
        Map<String, ?> a = g0.m85720a(context, str);
        m85944b(a);
        return m85940a(a);
    }

    /* renamed from: a */
    public static Map<String, List<C23615q>> m85939a(Context context, String str, String str2) {
        Map<String, List<C23615q>> map;
        Map<String, List<C23615q>> map2;
        if ("alltype".equals(str2) || TextUtils.isEmpty(str)) {
            C23625y.m85977c("hmsSdk", "read all event records");
            map = m85938a(context, "stat_v2_1");
            map2 = m85938a(context, "cached_v2_1");
        } else {
            String a = s0.m85914a(str, str2);
            map = m85943b(context, "stat_v2_1", a);
            map2 = m85943b(context, "cached_v2_1", a);
        }
        return m85941a(map, map2);
    }

    /* renamed from: a */
    public static Map<String, List<C23615q>> m85940a(Map<String, ?> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue() instanceof String) {
                m85942a(key, (String) entry.getValue(), hashMap);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, List<C23615q>> m85941a(Map<String, List<C23615q>> map, Map<String, List<C23615q>> map2) {
        if (map.size() == 0 && map2.size() == 0) {
            return new HashMap();
        }
        if (map.size() == 0) {
            return map2;
        }
        if (map2.size() == 0) {
            return map;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<C23615q>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<C23615q> value = entry.getValue();
            List<C23615q> list = map2.get(key);
            if (list != null && list.size() > 0) {
                value.addAll(list);
            }
            hashMap.put(key, value);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m85942a(String str, String str2, Map<String, List<C23615q>> map) {
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str2)) {
                JSONArray jSONArray = new JSONArray(str2);
                if (jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        C23615q qVar = new C23615q();
                        try {
                            qVar.mo83142a(jSONArray.getJSONObject(i));
                            arrayList.add(qVar);
                        } catch (JSONException unused) {
                            C23625y.m85981e("hmsSdk", "JSON Exception happened when create data for report - readDataToRecord");
                        }
                    }
                    map.put(str, arrayList);
                }
            }
        } catch (JSONException unused2) {
            C23625y.m85981e("hmsSdk", "When events turn to JSONArray,JSON Exception has happened");
        }
    }

    /* renamed from: b */
    public static Map<String, List<C23615q>> m85943b(Context context, String str, String str2) {
        String a = g0.m85719a(context, str, str2, "");
        HashMap hashMap = new HashMap();
        m85942a(str2, a, hashMap);
        return hashMap;
    }

    /* renamed from: b */
    public static void m85944b(Map<String, ?> map) {
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        Set<String> a = s0.m85916a(AbstractC23596b.m85611a());
        while (it.hasNext()) {
            if (!a.contains(it.next().getKey())) {
                it.remove();
            }
        }
    }
}
