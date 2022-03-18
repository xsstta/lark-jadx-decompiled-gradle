package com.bytedance.ee.bear.wiki.common.p580b;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.wiki.common.b.b */
public class C11933b {
    /* renamed from: a */
    public static void m49482a(String str, String str2, int i, int i2, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put("module", str2);
        if (i != -1) {
            hashMap.put("file_type", C8275a.m34050a(i));
        }
        if (i2 >= 0) {
            hashMap.put("count", Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            hashMap.put("index_id", Integer.valueOf(i3));
        }
        C13479a.m54772d("WikiReport", "client_wiki_home_workspace_operation" + hashMap);
        C5234y.m21391b().mo21079a("client_wiki_home_workspace_operation", hashMap);
    }

    /* renamed from: a */
    public static void m49480a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121868c, str);
        C13479a.m54772d("WikiReport", "client_enter_wiki" + hashMap);
        C5234y.m21391b().mo21079a("client_enter_wiki", hashMap);
    }

    /* renamed from: a */
    public static void m49483a(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("module", "wiki");
        hashMap.put("sub_module", str);
        hashMap.put("group", "wiki");
        hashMap.put(ShareHitPoint.f121868c, str2);
        hashMap.put("action", str3);
        C13479a.m54772d("WikiReport", "wiki_click_search" + hashMap);
        C5234y.m21391b().mo21079a("wiki_click_search", hashMap);
    }

    /* renamed from: a */
    public static String m49472a(BearUrl bearUrl) {
        if (bearUrl == null || TextUtils.isEmpty(bearUrl.f17453h)) {
            return "";
        }
        String str = bearUrl.f17453h;
        str.hashCode();
        if (!str.equals("tab_home")) {
            return bearUrl.f17453h;
        }
        return "recents";
    }

    /* renamed from: a */
    public static void m49473a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("module", "wiki");
        hashMap.put("sequence_num", Integer.valueOf(i));
        hashMap.put("file_id", str);
        C13479a.m54772d("WikiReport", "wiki_click_search_item" + hashMap);
        C5234y.m21391b().mo21079a("wiki_click_search_item", hashMap);
    }

    /* renamed from: a */
    public static void m49481a(String str, String str2, int i, int i2) {
        m49482a(str, str2, -1, i, i2);
    }

    /* renamed from: a */
    public static void m49474a(C10917c cVar, String str, String str2, String str3) {
        m49476a(cVar, str, str2, str3, -1, 0, false, null);
    }

    /* renamed from: a */
    public static void m49475a(C10917c cVar, String str, String str2, String str3, int i) {
        m49476a(cVar, str, str2, str3, -1, i, false, null);
    }

    /* renamed from: a */
    public static void m49478a(C10917c cVar, String str, String str2, String str3, String str4) {
        m49476a(cVar, str, str2, str3, -1, 0, false, str4);
    }

    /* renamed from: a */
    public static void m49479a(C10917c cVar, String str, String str2, String str3, boolean z) {
        m49476a(cVar, str, str2, str3, -1, 0, z, null);
    }

    /* renamed from: a */
    public static void m49477a(C10917c cVar, String str, String str2, String str3, int i, boolean z, String str4) {
        m49476a(cVar, str, str2, str3, -1, i, z, str4);
    }

    /* renamed from: a */
    public static void m49476a(C10917c cVar, String str, String str2, String str3, int i, int i2, boolean z, String str4) {
        String str5;
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put("module", "wiki");
        if (i != -1) {
            str5 = C8275a.m34050a(i);
        } else {
            str5 = "";
        }
        hashMap.put("file_type", str5);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("file_id", C13598b.m55197d(str2));
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("target_file_id", C13598b.m55197d(str3));
        }
        if (TextUtils.equals(str, "switch_page")) {
            hashMap.put("file_is_have_edit", Boolean.valueOf(z));
        }
        if (TextUtils.equals(str, "node_expand_change")) {
            hashMap.put("expand_node_level", Integer.valueOf(i2));
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("children_file_type", str4);
        }
        C13479a.m54772d("WikiReport", "client_wiki_pages_operation" + hashMap);
        C5234y.m21391b().mo21079a("client_wiki_pages_operation", hashMap);
    }
}
