package com.larksuite.component.dynamicresources;

import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.larksuite.component.dynamicresources.h */
public class C24305h {

    /* renamed from: a */
    private static volatile AbstractC24307a f59983a = new AbstractC24307a() {
        /* class com.larksuite.component.dynamicresources.C24305h.C243061 */

        /* renamed from: a */
        private Map<String, Long> f59984a = new ConcurrentHashMap();

        /* renamed from: b */
        private boolean f59985b = false;

        @Override // com.larksuite.component.dynamicresources.C24305h.AbstractC24307a
        /* renamed from: a */
        public void mo87004a(String str, String str2) {
            if (this.f59985b) {
                this.f59984a.put(str, Long.valueOf(System.nanoTime()));
            }
        }

        @Override // com.larksuite.component.dynamicresources.C24305h.AbstractC24307a
        /* renamed from: b */
        public void mo87005b(String str, String str2) {
            if (this.f59985b) {
                long nanoTime = System.nanoTime();
                Long l = this.f59984a.get(str);
                if (l == null) {
                    l = Long.valueOf(nanoTime - 1);
                }
                this.f59984a.remove(str);
                Log.m165379d("DynamicResourcesPerfLog_" + str, str + "  spend time : " + (((float) (nanoTime - l.longValue())) / 1000000.0f) + " ms");
            }
        }
    };

    /* renamed from: com.larksuite.component.dynamicresources.h$a */
    public interface AbstractC24307a {
        /* renamed from: a */
        void mo87004a(String str, String str2);

        /* renamed from: b */
        void mo87005b(String str, String str2);
    }

    /* renamed from: a */
    public static void m88729a(String str, String str2) {
        f59983a.mo87004a(str, str2);
    }

    /* renamed from: b */
    public static void m88730b(String str, String str2) {
        f59983a.mo87005b(str, str2);
    }
}
