package com.bytedance.ee.bear.sheet.common;

import android.util.Log;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.sheet.common.b */
public class C11090b {
    /* renamed from: a */
    public static void m46143a() {
        m46145a("ccm_sheet_search_replace_view", new HashMap());
    }

    /* renamed from: b */
    public static void m46148b() {
        m46145a("ccm_sheet_create_tab_view", new HashMap());
    }

    /* renamed from: e */
    public static void m46152e() {
        m46145a("ccm_space_docs_topbar_view", new HashMap());
    }

    /* renamed from: c */
    public static void m46150c() {
        HashMap hashMap = new HashMap();
        hashMap.put("click", "insert_mention");
        hashMap.put("target", "ccm_mention_panel_view");
        m46145a("ccm_sheet_content_page_click", hashMap);
    }

    /* renamed from: d */
    public static void m46151d() {
        HashMap hashMap = new HashMap();
        hashMap.put("click", "smart_screencapture");
        hashMap.put("target", "none");
        m46145a("ccm_sheet_content_page_click", hashMap);
    }

    /* renamed from: f */
    public static void m46153f() {
        HashMap hashMap = new HashMap();
        hashMap.put("click", "close");
        hashMap.put("target", "none");
        m46145a("ccm_space_docs_topbar_click", hashMap);
    }

    /* renamed from: b */
    public static void m46149b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("click", "smart_screencapture_click");
        hashMap.put("target", "none");
        hashMap.put("sub_click", str);
        m46145a("ccm_sheet_content_page_click", hashMap);
    }

    /* renamed from: a */
    public static void m46144a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("click", "find_value");
        hashMap.put("target", "none");
        hashMap.put("find_area", "current_sheet");
        hashMap.put("action_type", str);
        m46145a("ccm_sheet_search_replace_click", hashMap);
    }

    /* renamed from: a */
    public static void m46146a(boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("click", "close_toolbox");
        hashMap.put("target", "none");
        if (z) {
            str = "drag_to_close";
        } else {
            str = "other";
        }
        hashMap.put("action_type", str);
        m46145a("ccm_sheet_content_page_click", hashMap);
    }

    /* renamed from: a */
    private static void m46145a(String str, Map<String, Object> map) {
        AbstractC5233x b = C5234y.m21391b();
        HashMap hashMap = new HashMap();
        hashMap.putAll(b.mo21086c("docCommonParams"));
        hashMap.putAll(b.mo21083b("sheetCommonParams"));
        map.putAll(hashMap);
        Log.d("SheetAnalyticV2", "reportEvent, event = " + str + ", params = " + map);
        C5234y.m21391b().mo21085b(str, new JSONObject(map));
    }

    /* renamed from: a */
    public static void m46147a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        HashMap hashMap = new HashMap();
        hashMap.put("click", "edit_reminder");
        hashMap.put("target", "none");
        hashMap.put("is_edit_original_time", String.valueOf(z));
        hashMap.put("is_open_time", String.valueOf(z2));
        hashMap.put("is_open_reminder", String.valueOf(z3));
        hashMap.put("is_edit_mention", String.valueOf(z4));
        hashMap.put("is_edit_remark", String.valueOf(z5));
        m46145a("ccm_sheet_content_page_click", hashMap);
    }
}
