package com.bytedance.ee.bear.p522q;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.samskivert.mustache.C27035d;
import com.samskivert.mustache.C27059e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.q.a */
public class C10539a {

    /* renamed from: a */
    private static Map<String, C27059e> f28287a = new HashMap();

    /* renamed from: a */
    private static C27059e m43638a(String str) {
        C27059e eVar = f28287a.get(str);
        if (eVar != null) {
            return eVar;
        }
        C27059e a = C27035d.m98270a().mo96184a(false).mo96186a(str);
        f28287a.put(str, a);
        return a;
    }

    /* renamed from: a */
    public static String m43640a(Context context, int i, Map<String, String> map) {
        String string = context.getString(i);
        if (!TextUtils.isEmpty(string) && map != null && !map.isEmpty()) {
            try {
                return m43638a(string).mo96212a(map);
            } catch (Exception e) {
                C13479a.m54761a("UIHelper", e);
            }
        }
        return string;
    }

    /* renamed from: a */
    public static String m43639a(Context context, int i, String str, String str2) {
        String string = context.getString(i);
        if (!(str == null || str2 == null)) {
            HashMap hashMap = new HashMap(1);
            hashMap.put(str, str2);
            try {
                return m43638a(string).mo96212a(hashMap);
            } catch (Exception e) {
                C13479a.m54761a("UIHelper", e);
            }
        }
        return string;
    }
}
