package com.bytedance.ee.ref.card.p686a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.lynx.tasm.C26908k;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.ref.card.a.e */
public class C13512e {

    /* renamed from: a */
    private static Map<String, C26908k> f35597a = new HashMap(3);

    /* renamed from: a */
    public static C26908k m54910a(String str) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52830i("card_app_launch", "groupName is empty ,use default group!");
            str = "default";
        }
        C26908k kVar = f35597a.get(str);
        if (kVar != null) {
            return kVar;
        }
        C26908k a = C26908k.m97760a(str, new String[]{"assets://bd_core.js"});
        f35597a.put(str, a);
        return a;
    }

    /* renamed from: b */
    public static C26908k m54911b(String str) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52830i("card_app_launch", "groupName is empty ,use default group!");
            str = "blockit_default";
        }
        C26908k kVar = f35597a.get(str);
        if (kVar != null) {
            return kVar;
        }
        C26908k a = C26908k.m97759a(str, str, new String[]{"assets://bd_core.js", "assets://blockit_core.js"}, false, false);
        f35597a.put(str, a);
        return a;
    }
}
