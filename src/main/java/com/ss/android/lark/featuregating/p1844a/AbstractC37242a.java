package com.ss.android.lark.featuregating.p1844a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.featuregating.a.a */
public interface AbstractC37242a {

    /* renamed from: com.ss.android.lark.featuregating.a.a$a */
    public static class C37243a {

        /* renamed from: a */
        private static final Map<String, Boolean> f95640a;

        /* renamed from: b */
        private List<String> f95641b = new ArrayList();

        /* renamed from: b */
        public List<String> mo136940b() {
            return this.f95641b;
        }

        /* renamed from: a */
        public C37243a mo136939a() {
            this.f95641b = new ArrayList(f95640a.keySet());
            return this;
        }

        static {
            HashMap hashMap = new HashMap();
            f95640a = hashMap;
            hashMap.put("japan_lang", false);
        }

        /* renamed from: a */
        public static boolean m146656a(String str) {
            Boolean bool = f95640a.get(str);
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }
    }
}
