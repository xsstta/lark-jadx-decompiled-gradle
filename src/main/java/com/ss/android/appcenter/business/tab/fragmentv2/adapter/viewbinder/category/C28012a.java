package com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28186i;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.tt.miniapp.util.ACache;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.a */
public class C28012a {

    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.a$a */
    public interface AbstractC28014a {
        /* renamed from: a */
        void mo99744a(Map<Integer, List<ItemInfo>> map);
    }

    /* renamed from: a */
    private static String m102376a() {
        return "GetWorkplaceSubTagItemInfo";
    }

    /* renamed from: b */
    private static String m102379b() {
        return C28186i.m103256a(C27548m.m100547m().mo98221e().mo98213b());
    }

    /* renamed from: a */
    public static void m102378a(Map<Integer, List<ItemInfo>> map) {
        String json = new Gson().toJson(map);
        synchronized (C28012a.class) {
            try {
                ACache.m261150a(C27528a.m100471a().mo98143b(), m102376a()).mo233095a(m102379b(), json);
                C28184h.m103250d("CategoryCacheData", "update category cache success");
            } catch (Exception e) {
                C28184h.m103247a("CategoryCacheData", "update category cache exception:", e);
            }
        }
    }

    /* renamed from: a */
    public static void m102377a(AbstractC28014a aVar) {
        try {
            Map<Integer, List<ItemInfo>> map = (Map) new Gson().fromJson(ACache.m261150a(C27528a.m100471a().mo98143b(), m102376a()).mo233093a(m102379b()), new TypeToken<Map<Integer, List<ItemInfo>>>() {
                /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.C28012a.C280131 */
            }.getType());
            if (map != null) {
                C28184h.m103250d("CategoryCacheData", "get category cache success. cache category key:" + map.keySet());
                aVar.mo99744a(map);
                return;
            }
            C28184h.m103250d("CategoryCacheData", "get category cache empty");
        } catch (Exception e) {
            C28184h.m103247a("CategoryCacheData", "get category cache exception", e);
        }
    }
}
