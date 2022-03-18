package com.tt.miniapp.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.tt.miniapp.util.C67061t;
import com.tt.miniapphost.AppbrandContext;
import java.util.LinkedHashMap;

/* renamed from: com.tt.miniapp.util.s */
public class C67056s {

    /* renamed from: a */
    private C67061t f169030a;

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.util.s$a */
    public static class C67060a {

        /* renamed from: a */
        public static C67056s f169034a = new C67056s();
    }

    /* renamed from: a */
    public static C67056s m261344a() {
        return C67060a.f169034a;
    }

    private C67056s() {
        m261345b();
    }

    /* renamed from: b */
    private void m261345b() {
        String string = C12899a.m53203a(AppbrandContext.getInst().getApplicationContext(), "PRE_RENDER_SP").getString("CACHE_KEYS", "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(16, 0.75f, true);
        int i = 0;
        if (!TextUtils.isEmpty(string)) {
            try {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) JSON.parseObject(string, new TypeReference<LinkedHashMap<String, Integer>>() {
                    /* class com.tt.miniapp.util.C67056s.C670571 */
                }, Feature.OrderedField);
                for (Integer num : linkedHashMap2.values()) {
                    i += num.intValue();
                }
                linkedHashMap.putAll(linkedHashMap2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C670582 r0 = new C67061t<String, Integer>(524288, i, linkedHashMap) {
            /* class com.tt.miniapp.util.C67056s.C670582 */

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo233161a(String str, Integer num) {
                return num.intValue();
            }
        };
        this.f169030a = r0;
        r0.mo233167a((C67061t.AbstractC67062a) new C67061t.AbstractC67062a<String, Integer>() {
            /* class com.tt.miniapp.util.C67056s.C670593 */

            /* renamed from: a */
            public void mo233163a(String str, Integer num) {
                C67056s.this.mo233159a(str, num);
            }
        });
    }

    /* renamed from: a */
    public String mo233158a(String str) {
        String string = C12899a.m53203a(AppbrandContext.getInst().getApplicationContext(), "PRE_RENDER_SP").getString(str, "");
        AppBrandLogger.m52828d("PreRenderCacheManager", "getRenderCache key:" + str + " size:" + string.length());
        return string;
    }

    /* renamed from: a */
    public void mo233159a(String str, Integer num) {
        C12899a.m53203a(AppbrandContext.getInst().getApplicationContext(), "PRE_RENDER_SP").edit().remove(str);
        this.f169030a.mo233165a(str);
        AppBrandLogger.m52828d("PreRenderCacheManager", "delete:" + str + " size:" + num + " currentSize:");
    }

    /* renamed from: b */
    private void m261346b(String str, String str2) {
        try {
            AppBrandLogger.m52828d("PreRenderCacheManager", "updateCacheKeys key:" + str + " size:" + str2.length());
            this.f169030a.mo233168b(str, Integer.valueOf(str2.length()));
            C12899a.m53203a(AppbrandContext.getInst().getApplicationContext(), "PRE_RENDER_SP").edit().putString("CACHE_KEYS", JSON.toJSONString(this.f169030a.mo233166a())).commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo233160a(String str, String str2) {
        C12899a.m53203a(AppbrandContext.getInst().getApplicationContext(), "PRE_RENDER_SP").edit().putString(str, str2).commit();
        m261346b(str, str2);
        AppBrandLogger.m52828d("PreRenderCacheManager", "storageCache key:" + str + " size:" + str2.length());
    }
}
