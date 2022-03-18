package com.larksuite.component.dynamicresources;

import android.view.View;
import com.larksuite.component.dynamicresources.C24308i;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.larksuite.component.dynamicresources.a */
public class C24284a {
    /* renamed from: a */
    protected static String m88672a(String str, String str2) {
        return str + "-" + str2;
    }

    /* renamed from: com.larksuite.component.dynamicresources.a$a */
    protected static class C24285a {

        /* renamed from: a */
        String f59947a;

        /* renamed from: b */
        String f59948b;

        /* renamed from: c */
        String f59949c;

        public C24285a(String str, String str2, String str3) {
            this.f59947a = str;
            this.f59948b = str2;
            this.f59949c = str3;
        }
    }

    /* renamed from: a */
    protected static <T extends View> void m88673a(Map<String, Map<String, C24308i.AbstractC24310a>> map, C24285a aVar, C24308i.AbstractC24310a<T> aVar2) {
        String str = aVar.f59947a;
        String str2 = aVar.f59948b;
        String str3 = aVar.f59949c;
        Map<String, C24308i.AbstractC24310a> map2 = map.get(str);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        map2.put(m88672a(str2, str3), aVar2);
        map.put(str, map2);
    }
}
