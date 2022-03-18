package com.ss.android.lark.main.statistics;

import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.sdk.C53241h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.main.statistics.a */
public class C44524a {

    /* renamed from: a */
    private static final Map<String, String> f112887a = new HashMap() {
        /* class com.ss.android.lark.main.statistics.C44524a.C445251 */

        {
            put("conversation", "tab_customize_messenger");
            put("calendar", "tab_customize_calendar");
            put("appCenter", "tab_customize_appcenter");
            put("space", "tab_customize_docs");
            put("contact", "tab_customize_contacts");
            put("mail", "tab_customize_mail");
            put("wiki", "tab_customize_Wiki");
            put("group", "tab_customize_group");
            put("pin", "tab_customize_Pin");
            put("videochat", "tab_customize_meeting");
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.main.statistics.a$a */
    public static class C44526a {

        /* renamed from: a */
        public static C44524a f112888a = new C44524a();
    }

    /* renamed from: a */
    public static C44524a m176678a() {
        return C44526a.f112888a;
    }

    /* renamed from: b */
    public void mo157984b(int i, String str, TabType tabType, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("click", "application");
            jSONObject.put("target", "none");
            jSONObject.put("key", str);
            if (tabType == TabType.Main) {
                jSONObject.put("location", "primary");
            } else {
                jSONObject.put("location", "quick");
            }
            jSONObject.put("order", String.valueOf(i2));
            if (i == 1) {
                jSONObject.put("click_type", "left_click");
            } else if (i == 2) {
                jSONObject.put("click_type", "double_click");
            } else {
                C53241h.m205900d("MainModule_TabStatistical", "unknown click type for statistics; name = " + str + ", click type = " + i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C44134a.m174959a().mo133222a("navigation_main_click", jSONObject);
    }

    /* renamed from: a */
    public void mo157983a(int i, String str, TabType tabType, int i2) {
        JSONObject jSONObject = new JSONObject();
        if (i == 1) {
            try {
                jSONObject.put("clickType", "click");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i == 2) {
            jSONObject.put("clickType", "double_click");
        } else {
            C53241h.m205900d("MainModule_TabStatistical", "unknown click type for statistics; name = " + str + ", click type = " + i);
        }
        if (tabType == TabType.Main) {
            jSONObject.put("location", "primary");
        } else if (tabType == TabType.Navigation) {
            jSONObject.put("location", "quick");
        } else {
            C53241h.m205900d("MainModule_TabStatistical", "unknown tab type for statistics; name = " + str + ", tab type = " + tabType);
        }
        jSONObject.put("order", i2);
        jSONObject.put("application", str);
        C44134a.m174959a().mo133222a("nav_application_click", jSONObject);
    }
}
