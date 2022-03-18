package com.bytedance.ee.bear.wikiv2.p589c;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.wikiv2.c.b */
public class C12237b {
    /* renamed from: a */
    public static String m50895a(BearUrl bearUrl) {
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
    public static void m50897a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121868c, str);
        C13479a.m54772d("WikiReport", "client_enter_wiki" + hashMap);
        C5234y.m21391b().mo21079a("client_enter_wiki", hashMap);
    }

    /* renamed from: a */
    public static void m50896a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("module", "wiki");
        hashMap.put("sequence_num", Integer.valueOf(i));
        hashMap.put("file_id", str);
        C13479a.m54772d("WikiReport", "wiki_click_search_item" + hashMap);
        C5234y.m21391b().mo21079a("wiki_click_search_item", hashMap);
    }

    /* renamed from: a */
    public static void m50900a(String str, String str2, String str3) {
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
    public static void m50898a(String str, String str2, int i, int i2) {
        m50899a(str, str2, -1, i, i2);
    }

    /* renamed from: a */
    public static void m50899a(String str, String str2, int i, int i2, int i3) {
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
}
