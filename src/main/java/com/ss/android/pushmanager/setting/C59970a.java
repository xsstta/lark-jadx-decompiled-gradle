package com.ss.android.pushmanager.setting;

import com.bytedance.common.utility.StringUtils;
import com.bytedance.push.utils.C20552c;
import com.ss.android.message.AppProvider;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.pushmanager.setting.a */
public class C59970a {

    /* renamed from: a */
    private static C59970a f149501a;

    /* renamed from: b */
    private PushMultiProcessSharedProvider.C59969b f149502b = PushMultiProcessSharedProvider.m232710a(AppProvider.getApp());

    private C59970a() {
    }

    /* renamed from: b */
    public String mo204199b() {
        return this.f149502b.mo204197a("ssids", "");
    }

    /* renamed from: a */
    public static synchronized C59970a m232723a() {
        C59970a aVar;
        synchronized (C59970a.class) {
            if (f149501a == null) {
                synchronized (C59970a.class) {
                    if (f149501a == null) {
                        f149501a = new C59970a();
                    }
                }
            }
            aVar = f149501a;
        }
        return aVar;
    }

    /* renamed from: c */
    public String mo204201c() {
        HashMap hashMap = new HashMap();
        mo204200b(hashMap);
        return hashMap.get("device_id");
    }

    /* renamed from: b */
    public void mo204200b(Map<String, String> map) {
        if (map != null) {
            if (C20552c.m74848a()) {
                C20552c.m74845a("PushService", "getSSIDs start");
            }
            try {
                String b = mo204199b();
                if (!StringUtils.isEmpty(b)) {
                    StringUtils.stringToMap(b, map);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo204198a(Map<String, String> map) {
        if (map != null) {
            if (C20552c.m74848a()) {
                C20552c.m74845a("PushService", "saveSSIDs start");
            }
            try {
                this.f149502b.mo204196a().mo204194a("ssids", StringUtils.mapToString(map)).mo204195a();
            } catch (Exception unused) {
            }
        }
    }
}
