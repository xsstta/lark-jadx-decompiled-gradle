package com.ss.android.lark.ccm_api.p1592a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.ccm_api.a.a */
public class C32804a {

    /* renamed from: a */
    private String f84176a = "lark_other";

    /* renamed from: b */
    private boolean f84177b;

    /* renamed from: c */
    private boolean f84178c;

    /* renamed from: d */
    private boolean f84179d;

    /* renamed from: e */
    private String f84180e;

    /* renamed from: a */
    public Map<String, String> mo120925a() {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = "single";
        if (this.f84178c) {
            str2 = "meeting";
        } else {
            boolean z = this.f84179d;
        }
        m125884a(hashMap, "from", this.f84176a);
        m125884a(hashMap, "chat_type", str2);
        if (this.f84177b) {
            str = "richtext";
        } else {
            str = "text";
        }
        m125884a(hashMap, "message_type", str);
        m125884a(hashMap, "botId", this.f84180e);
        return hashMap;
    }

    /* renamed from: a */
    public C32804a mo120923a(String str) {
        this.f84176a = str;
        return this;
    }

    /* renamed from: b */
    public C32804a mo120926b(String str) {
        this.f84180e = str;
        return this;
    }

    /* renamed from: c */
    public C32804a mo120928c(boolean z) {
        this.f84177b = z;
        return this;
    }

    /* renamed from: a */
    public C32804a mo120924a(boolean z) {
        this.f84178c = z;
        return this;
    }

    /* renamed from: b */
    public C32804a mo120927b(boolean z) {
        this.f84179d = z;
        return this;
    }

    /* renamed from: a */
    private static void m125884a(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}
