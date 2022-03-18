package com.bytedance.ee.bear.guide.p395a;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.log.C13479a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.guide.a.a */
public class C7810a {
    /* renamed from: a */
    private static String m31290a(List<String> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m31296b(AbstractC5233x xVar, String str) {
        m31299c(xVar, "trigger", str);
    }

    /* renamed from: c */
    public static void m31298c(AbstractC5233x xVar, String str) {
        m31299c(xVar, "close", str);
    }

    /* renamed from: a */
    public static void m31292a(AbstractC5233x xVar, String str) {
        m31295a(xVar, m31291a("skip", str, null, null));
    }

    /* renamed from: a */
    private static void m31295a(AbstractC5233x xVar, Map<String, String> map) {
        if (xVar != null) {
            xVar.mo21079a("onboarding_option_research", map);
            C13479a.m54772d("OnBoardingAnalytic", "report: event = onboarding_option_research, params = " + map);
        }
    }

    /* renamed from: b */
    public static void m31297b(AbstractC5233x xVar, String str, String str2) {
        m31295a(xVar, m31291a("unselect", str, str2, null));
    }

    /* renamed from: a */
    public static void m31293a(AbstractC5233x xVar, String str, String str2) {
        m31295a(xVar, m31291a("select", str, str2, null));
    }

    /* renamed from: c */
    private static void m31299c(AbstractC5233x xVar, String str, String str2) {
        if (xVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("action", str);
            hashMap.put("file_type", str2);
            xVar.mo21079a("onboarding_share", hashMap);
            C13479a.m54772d("OnBoardingAnalytic", "report: event = onboarding_share, params = " + hashMap);
        }
    }

    /* renamed from: a */
    public static void m31294a(AbstractC5233x xVar, String str, List<String> list) {
        m31295a(xVar, m31291a("confirm", str, null, m31290a(list)));
    }

    /* renamed from: a */
    private static Map<String, String> m31291a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("option_step", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("select_option", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("confirm_option", str4);
        }
        return hashMap;
    }
}
