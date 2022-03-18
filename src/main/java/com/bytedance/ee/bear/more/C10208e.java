package com.bytedance.ee.bear.more;

import android.text.TextUtils;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.more.e */
public class C10208e {

    /* renamed from: a */
    private static String f27541a = "moreNewItems";

    /* renamed from: b */
    public static void m42527b(String str) {
        new PersistenceSharedPreference(f27541a).mo34037a(str, false);
    }

    /* renamed from: a */
    public static boolean m42526a(String str) {
        return ((Boolean) new PersistenceSharedPreference(f27541a).mo34038b(str, true)).booleanValue();
    }

    /* renamed from: c */
    public static boolean m42528c(String str) {
        String str2 = (String) C4211a.m17514a().mo16533a("more_new_items", "{}");
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        try {
            return new JSONObject(str2).optBoolean(str, true);
        } catch (Exception e) {
            C13479a.m54759a("MoreNewItemUtils", "getNewSwitch() error", e);
            return true;
        }
    }
}
