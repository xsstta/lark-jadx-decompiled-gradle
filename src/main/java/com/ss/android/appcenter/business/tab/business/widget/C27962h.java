package com.ss.android.appcenter.business.tab.business.widget;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.appcenter.C27528a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28186i;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.tt.miniapp.util.ACache;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.appcenter.business.tab.business.widget.h */
public class C27962h {

    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.h$a */
    interface AbstractC27964a {
        /* renamed from: a */
        void mo99682a(ConcurrentHashMap<String, WidgetData> concurrentHashMap);
    }

    /* renamed from: a */
    private static String m102100a() {
        return "GetWidgetContent";
    }

    /* renamed from: b */
    private static String m102103b() {
        return C28186i.m103256a(C27548m.m100547m().mo98221e().mo98213b());
    }

    /* renamed from: a */
    public static void m102102a(ConcurrentHashMap<String, WidgetData> concurrentHashMap) {
        String json = new Gson().toJson(concurrentHashMap);
        synchronized (C27962h.class) {
            try {
                ACache.m261150a(C27528a.m100471a().mo98143b(), m102100a()).mo233095a(m102103b(), json);
                C28184h.m103250d("WidgetCacheSource", "update Widget cache success");
            } catch (Exception e) {
                C28184h.m103247a("WidgetCacheSource", "update Widget cache exception:", e);
            }
        }
    }

    /* renamed from: a */
    public static void m102101a(AbstractC27964a aVar) {
        try {
            ConcurrentHashMap<String, WidgetData> concurrentHashMap = (ConcurrentHashMap) new Gson().fromJson(ACache.m261150a(C27528a.m100471a().mo98143b(), m102100a()).mo233093a(m102103b()), new TypeToken<ConcurrentHashMap<String, WidgetData>>() {
                /* class com.ss.android.appcenter.business.tab.business.widget.C27962h.C279631 */
            }.getType());
            if (concurrentHashMap != null) {
                C28184h.m103250d("WidgetCacheSource", "get Widget cache success. cache widget key:" + concurrentHashMap.keySet());
                aVar.mo99682a(concurrentHashMap);
                return;
            }
            C28184h.m103250d("WidgetCacheSource", "get Widget cache empty");
        } catch (Exception e) {
            C28184h.m103247a("WidgetCacheSource", "get Widget cache exception", e);
        }
    }
}
