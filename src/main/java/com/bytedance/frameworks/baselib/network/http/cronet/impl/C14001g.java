package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.g */
public class C14001g extends Observable {

    /* renamed from: a */
    private static volatile C14001g f36691a;

    /* renamed from: a */
    public static C14001g m56679a() {
        if (f36691a == null) {
            synchronized (C14001g.class) {
                if (f36691a == null) {
                    f36691a = new C14001g();
                }
            }
        }
        return f36691a;
    }

    /* renamed from: a */
    private void m56680a(Map<String, Object> map) {
        setChanged();
        notifyObservers(map);
    }

    /* renamed from: a */
    public void mo51563a(String str, long j, long j2, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("sent_bytes", Long.valueOf(j));
        hashMap.put("received_bytes", Long.valueOf(j2));
        hashMap.put("content_type", str2);
        hashMap.put("request_log", str3);
        m56680a(hashMap);
    }
}
