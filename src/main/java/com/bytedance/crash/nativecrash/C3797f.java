package com.bytedance.crash.nativecrash;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.runtime.C3864m;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.C3968x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.nativecrash.f */
public class C3797f {
    /* renamed from: a */
    private static boolean m15752a(String str) {
        return str.contains("SIGABRT");
    }

    /* renamed from: a */
    private static boolean m15753a(JSONArray jSONArray) {
        if (!C3955q.m16452a(jSONArray, "[xcrash] enter") || C3955q.m16452a(jSONArray, "[xcrash] exit")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static String m15754b(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (optString.endsWith(")") && optString.contains("[xcrash] child terminated by a signal")) {
                return optString.substring(optString.lastIndexOf(40) + 1, optString.length() - 1);
            }
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m15755b(String str) {
        int i = 0;
        for (String str2 : str.split("\n")) {
            if (str2.trim().startsWith("#")) {
                i++;
            }
        }
        if (i <= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m15751a(C3818j jVar, JSONObject jSONObject) {
        String c = jVar.mo15344c();
        Pair<String, String> a = m15750a(jVar, jSONObject.optJSONArray("native_log"), jVar.mo15345d(), c, jVar.mo15346e());
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put((String) a.first, a.second);
            jSONObject2.put("signal", c);
            C3968x.m16530a((Object) ("native_crash_watch: " + ((String) a.first)));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C3742b.m15432a(jSONObject, "filters", "native_crash_watch", a.first);
        C3742b.m15432a(jSONObject, "filters", "native_crash_watch_value", String.valueOf(a.second));
        C3864m.m16007a("testEvent", jSONObject2, null);
    }

    /* renamed from: a */
    private static Pair<String, String> m15750a(C3818j jVar, JSONArray jSONArray, String str, String str2, String str3) {
        if (jSONArray == null) {
            return new Pair<>("unknown_err", "1");
        }
        if (jVar.mo15343b()) {
            return new Pair<>("normal", "1");
        }
        String b = m15754b(jSONArray);
        if (b != null) {
            return new Pair<>("xcrash_crash", b);
        }
        if (m15753a(jSONArray)) {
            return new Pair<>("xcrash_block", "1");
        }
        if (m15755b(str)) {
            return new Pair<>("backtrace_err", "1");
        }
        if (!m15752a(str2) || !TextUtils.isEmpty(str3)) {
            return new Pair<>("normal", "1");
        }
        return new Pair<>("abort_nomsg", "1");
    }
}
