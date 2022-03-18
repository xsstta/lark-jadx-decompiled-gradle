package com.bytedance.ee.bear.middleground.record;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.middleground.record.a */
public class C10115a {
    /* renamed from: a */
    public static void m42131a() {
        m42134a("ccm_space_docs_details_setting_view", new HashMap());
    }

    /* renamed from: b */
    public static void m42135b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121869d, str);
        m42134a("ccm_space_docs_details_record_view", hashMap);
    }

    /* renamed from: a */
    public static void m42132a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("click", str);
        if (str.equals("record")) {
            hashMap.put("target", "ccm_space_docs_details_record_view");
        } else if (str.equals("basic")) {
            hashMap.put("target", "ccm_space_docs_details_view");
        } else {
            hashMap.put("target", "none");
        }
        m42134a("ccm_space_docs_details_setting_click", hashMap);
    }

    /* renamed from: a */
    public static void m42133a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("click", str);
        hashMap.put("target", str2);
        m42134a("ccm_space_docs_details_record_click", hashMap);
    }

    /* renamed from: b */
    public static void m42136b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("click", str);
        hashMap.put("target", str2);
        m42134a("ccm_space_docs_details_click", hashMap);
    }

    /* renamed from: a */
    private static void m42134a(String str, Map<String, Object> map) {
        AbstractC5233x b = C5234y.m21391b();
        HashMap hashMap = new HashMap();
        hashMap.putAll(b.mo21086c("docCommonParams"));
        map.putAll(hashMap);
        C13479a.m54772d("RecordAnalytic", "reportEvent, event = " + str + ", params = " + map);
        C5234y.m21391b().mo21085b(str, new JSONObject(map));
    }
}
