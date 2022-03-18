package com.bytedance.crash.runtime;

import android.text.TextUtils;
import com.bytedance.crash.util.C3968x;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.runtime.a */
public class C3823a {

    /* renamed from: a */
    static String f11741a = "https://mon-va.tiktokv.com";

    /* renamed from: a */
    public static void m15813a(String str, JSONArray jSONArray) {
        if (TextUtils.isEmpty(str) || jSONArray == null || jSONArray.length() == 0) {
            C3968x.m16530a((Object) "setDomainName: invalid param");
        } else if (str.equals(f11741a)) {
            C3968x.m16530a((Object) "setDomainName: same domain");
        } else {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    break;
                } else if (str.equals(jSONArray.optString(0))) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                C3968x.m16530a((Object) "setDomainName: check valid fail");
                return;
            }
            C3968x.m16530a((Object) ("setDomainName:" + str));
            f11741a = str;
        }
    }
}
