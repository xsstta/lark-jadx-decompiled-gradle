package com.ss.android.openbusiness.p3006c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.larkbrand.utils.C13360l;
import com.google.gson.Gson;
import com.huawei.hms.actions.SearchIntents;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.openbusiness.C59480b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.openbusiness.c.a */
public class C59539a extends C59540b {

    /* renamed from: a */
    private static Gson f147799a = new Gson();

    /* renamed from: b */
    private static Map<String, Object> m231027b() {
        return m231019a((Context) null);
    }

    /* renamed from: a */
    public static void m231020a() {
        m231026a("groupbot_click_addbot_search", f147799a.toJson(m231027b()));
    }

    /* renamed from: a */
    public static void m231021a(int i) {
        Map<String, Object> b = m231027b();
        b.put("botsNum", Integer.valueOf(i));
        m231026a("groupbot_visit_botlist", f147799a.toJson(b));
    }

    /* renamed from: a */
    private static Map<String, Object> m231019a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("tenant_id", C13360l.m54356a(C59480b.m230865a().mo144881g()));
        hashMap.put("user_id", C13360l.m54356a(C59480b.m230865a().mo144867a()));
        if (context != null) {
            hashMap.put("platform", "android");
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m231024a(String str) {
        Map<String, Object> b = m231027b();
        b.put("appId", str);
        m231026a("groupbot_addbot_success", f147799a.toJson(b));
    }

    /* renamed from: a */
    public static void m231022a(int i, int i2) {
        Map<String, Object> b = m231027b();
        b.put("botsNum", Integer.valueOf(i));
        b.put("recommendBotsNum", Integer.valueOf(i2));
        m231026a("groupbot_visit_addbot", f147799a.toJson(b));
    }

    /* renamed from: a */
    private static void m231026a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            try {
                Statistics.sendEvent(str, new JSONObject(str2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m231028b(int i, String str, String str2) {
        Map<String, Object> b = m231027b();
        b.put("botType", Integer.valueOf(i));
        b.put("appId", str);
        b.put("appname", str2);
        m231026a("groupbot_click_addbot_get", f147799a.toJson(b));
    }

    /* renamed from: a */
    public static void m231023a(int i, String str, String str2) {
        Map<String, Object> b = m231027b();
        b.put("botType", Integer.valueOf(i));
        b.put("appId", str);
        b.put("appname", str2);
        m231026a("groupbot_visit_detail", f147799a.toJson(b));
    }

    /* renamed from: a */
    public static void m231025a(String str, int i, int i2) {
        Map<String, Object> b = m231027b();
        b.put(SearchIntents.EXTRA_QUERY, str);
        b.put("recommendBotsNum", Integer.valueOf(i));
        b.put("botsNum", Integer.valueOf(i2));
        m231026a("groupbot_vist_searchresult", f147799a.toJson(b));
    }
}
