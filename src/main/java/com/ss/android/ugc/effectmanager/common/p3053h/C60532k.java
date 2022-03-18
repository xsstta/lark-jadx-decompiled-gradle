package com.ss.android.ugc.effectmanager.common.p3053h;

import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.k */
public class C60532k {

    /* renamed from: a */
    private HashMap<String, Object> f151341a = new HashMap<>();

    /* renamed from: a */
    private static void m235272a(Object obj) {
    }

    /* renamed from: a */
    public static C60532k m235271a() {
        return new C60532k();
    }

    /* renamed from: b */
    public synchronized JSONObject mo207243b() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return new JSONObject(this.f151341a);
    }

    /* renamed from: a */
    public C60532k mo207239a(String str, Integer num) {
        m235272a(this.f151341a.put(str, num));
        return this;
    }

    /* renamed from: a */
    public C60532k mo207240a(String str, Long l) {
        m235272a(this.f151341a.put(str, l));
        return this;
    }

    /* renamed from: a */
    public C60532k mo207241a(String str, String str2) {
        m235272a(this.f151341a.put(str, str2));
        return this;
    }

    /* renamed from: a */
    public C60532k mo207242a(String str, List<String> list) {
        m235272a(this.f151341a.put(str, list));
        return this;
    }
}
