package com.bytedance.ee.larkbrand.p650e;

import com.tt.option.p3397r.C67671a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.larkbrand.e.v */
public class C13037v extends C67671a {

    /* renamed from: b */
    private static final Map<String, String> f34664b;

    static {
        HashMap hashMap = new HashMap();
        f34664b = hashMap;
        hashMap.put("back_mp", String.valueOf(1038));
        hashMap.put("in_mp", String.valueOf(1037));
    }

    @Override // com.tt.option.p3397r.AbstractC67672b, com.tt.option.p3397r.C67671a
    public String getScene(String str) {
        String str2 = f34664b.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
